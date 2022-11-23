package com.celvine.deb.esail.bby.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.celvine.deb.esail.bby.ui.components.*
import com.celvine.deb.esail.bby.ui.theme.DodgerBlue

@Composable
fun DashboardScreen(navController: NavController) {
    val scrollState = rememberScrollState()

    val searchText = remember {
        mutableStateOf("")
    }

    Scaffold(bottomBar = { BottomNavigationBar(navController) }) { paddingValues ->
        val padding = paddingValues
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            item {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    GreetingBar()
                    Spacer(modifier = Modifier.height(15.dp))
                    SearchField("Jetpack Compose Beginner", searchText)
                    Spacer(modifier = Modifier.height(15.dp))
                    BannerDiscount()
                    Spacer(modifier = Modifier.height(15.dp))
                    CourseCategory()
                }
                Column(modifier = Modifier.padding(start = 16.dp, end = 0.dp)) {
                    Spacer(modifier = Modifier.height(20.dp))
                    PopularCourse()
                    Spacer(modifier = Modifier.height(20.dp))
                }
            }
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp)
                ) {
                    FlashSale()
                    Spacer(modifier = Modifier.height(80.dp))
                }
            }
        }
    }
}