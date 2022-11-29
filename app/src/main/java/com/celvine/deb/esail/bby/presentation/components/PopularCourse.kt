package com.celvine.deb.esail.bby.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.common.theme.Green
import com.celvine.deb.esail.bby.common.theme.Ruby
import com.celvine.deb.esail.bby.data.model.CourseModel
import com.celvine.deb.esail.bby.route.Routes


@Composable
fun PopularCourse(
    courses: List<CourseModel>,
    navController: NavController
) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Popular Courses",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Bold
                )
            )
            Icon(painter = painterResource(id = R.drawable.more_icon), contentDescription = "more")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier.fillMaxWidth()) {
            BoxWithConstraints(modifier = Modifier.fillMaxWidth()) {
                LazyRow(modifier = Modifier.fillMaxWidth(), state = rememberLazyListState()) {
                    items(courses, key = { it.id }) { item ->
                        CardCourse(modifier = Modifier
                            .width(280.dp), item = item, onClick = {
                            navController.navigate(Routes.Detail.createRoute(item.id))
                        })
                        Spacer(modifier = Modifier.width(10.dp))
                    }
                }
            }
        }
    }
}


@Composable
fun Price(isFree: Boolean = false, price: String = "0") {
    if (isFree) {
        Text(
            text = "Free",
            style = MaterialTheme.typography.bodySmall.copy(
                color = Ruby,
                fontWeight = FontWeight.SemiBold,
                fontSize = 12.sp,
            )
        )
    } else {
        Text(
            text = "Rp. $price",
            style = MaterialTheme.typography.bodySmall.copy(
                color = Green,
                fontWeight = FontWeight.SemiBold,
                fontSize = 12.sp
            )
        )
    }
}