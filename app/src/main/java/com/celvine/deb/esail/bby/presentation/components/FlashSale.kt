package com.celvine.deb.esail.bby.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.data.repositories.CoursesRepository
import com.celvine.deb.esail.bby.data.viewmodels.CoursesViewModel
import com.celvine.deb.esail.bby.data.viewmodels.ViewModelFactory
import com.celvine.deb.esail.bby.route.Routes

@Composable
fun FlashSale(
    navController: NavController,
    viewModel: CoursesViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelFactory(
            CoursesRepository()
        )
    )
) {
    val courses by viewModel.courses.collectAsState()
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Flash Sales",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Bold
                )
            )
            Icon(painter = painterResource(id = R.drawable.more_icon), contentDescription = "more")
        }
        Spacer(modifier = Modifier.height(10.dp))
        courses.forEachIndexed { _, item ->
            if (item.isFlashSale) {
                SimpleCardCourse(item = item, onClick = {
                    navController.navigate(Routes.Detail.routes)
                })
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}
