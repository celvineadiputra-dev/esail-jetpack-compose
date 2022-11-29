package com.celvine.deb.esail.bby.presentation.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavController
import com.celvine.deb.esail.bby.common.UiState
import com.celvine.deb.esail.bby.data.model.CourseModel
import com.celvine.deb.esail.bby.data.viewmodels.*
import com.celvine.deb.esail.bby.di.Injection
import com.celvine.deb.esail.bby.presentation.components.CardCourse

@Composable
fun MyCoursesScreen(
    navController: NavController,
    detailViewModel: DetailViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelDetailFactory(
            Injection.provideDetailRepository()
        )
    ),
    myCourseViewModel: MyCoursesViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelMyCoursesFactory(
            Injection.provideMyCoursesRepository(),
            Injection.provideCartRepository()
        )
    ),
) {
    myCourseViewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> {
                myCourseViewModel.getMyCourses()
            }
            is UiState.Success -> {
                LazyColumn(content = {
                    items(uiState.data.myCoursesList.size, key = { it }) {
                        val data: CourseModel =
                            detailViewModel.getDataById(uiState.data.myCoursesList[it].Id)
                        CardCourse(item = data, onClick = {})
                    }
                })
            }
        }
    }
}