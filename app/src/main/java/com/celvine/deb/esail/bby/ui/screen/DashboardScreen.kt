package com.celvine.deb.esail.bby.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.celvine.deb.esail.bby.ui.components.BannerDiscount
import com.celvine.deb.esail.bby.ui.components.GreetingBar
import com.celvine.deb.esail.bby.ui.components.SearchField

@Composable
fun DashboardScreen(navController: NavController) {
    val scrollState = rememberScrollState()

    val searchText = remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .verticalScroll(scrollState)
            .padding(16.dp)
    ) {
        GreetingBar()
        Spacer(modifier = Modifier.height(15.dp))
        SearchField("Jetpack Compose Beginner", searchText)
        Spacer(modifier = Modifier.height(15.dp))
        BannerDiscount()
    }
}