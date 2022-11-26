package com.celvine.deb.esail.bby.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.celvine.deb.esail.bby.common.UiState
import com.celvine.deb.esail.bby.common.theme.White2
import com.celvine.deb.esail.bby.data.viewmodels.CoursesViewModel
import com.celvine.deb.esail.bby.data.viewmodels.FlashSaleCoursesViewModel
import com.celvine.deb.esail.bby.data.viewmodels.PopularCourseViewModel
import com.celvine.deb.esail.bby.data.viewmodels.ViewModelCoursesFactory
import com.celvine.deb.esail.bby.di.Injection
import com.celvine.deb.esail.bby.presentation.components.*
import com.celvine.deb.esail.bby.route.Routes
import com.celvine.deb.esail.bby.presentation.components.BannerDiscount

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    flashSaletViewModel: FlashSaleCoursesViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelCoursesFactory(
            Injection.provideCourseRepository()
        )
    ),
    popularViewModel: PopularCourseViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelCoursesFactory(
            Injection.provideCourseRepository()
        )
    )
) {
    Scaffold { paddingValues ->
        val padding = paddingValues
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = White2)
        ) {
            item {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    GreetingBar()
                    Spacer(modifier = Modifier.height(15.dp))
                    SearchField("Jetpack Compose Beginner", enable = false, onClick = {
                        navController.navigate(Routes.Search.routes) {
                            popUpTo(Routes.Home.routes) {
                                inclusive = true
                            }
                        }
                    }, value = "")
                    Spacer(modifier = Modifier.height(15.dp))
                    BannerDiscount()
                    Spacer(modifier = Modifier.height(15.dp))
                    CourseCategory()
                }
                Column(modifier = Modifier.padding(start = 16.dp, end = 0.dp)) {
                    Spacer(modifier = Modifier.height(20.dp))
                    popularViewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
                        when (uiState) {
                            is UiState.Loading -> {
                                popularViewModel.getPopular()
                            }
                            is UiState.Success -> {
                                PopularCourse(navController = navController, courses = uiState.data)
                            }
                            is UiState.Error -> {}
                        }
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                }
            }
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp)
                ) {
                    flashSaletViewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
                        when (uiState) {
                            is UiState.Loading -> {
                                flashSaletViewModel.getFlashSale()
                            }
                            is UiState.Success -> {
                                FlashSale(navController = navController, courses = uiState.data)
                            }
                            is UiState.Error -> {}
                        }
                    }
                    Spacer(modifier = Modifier.height(80.dp))
                }
            }
        }
    }
}