package com.celvine.deb.esail.bby.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.data.model.CourseModel

@Composable
fun FlashSale(
    modifier: Modifier = Modifier,
    navController: NavController,
    courses: List<CourseModel>
) {
    Column(modifier = modifier) {
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
                SimpleCardCourse(item = item, navController = navController)
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}
