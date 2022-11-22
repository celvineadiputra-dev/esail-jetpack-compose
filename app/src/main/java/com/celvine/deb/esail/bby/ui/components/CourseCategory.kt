package com.celvine.deb.esail.bby.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.data.CategoryCourseData
import com.celvine.deb.esail.bby.ui.theme.Dark

@Composable
fun CourseCategory() {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Course Category",
                style = MaterialTheme.typography.h6.copy(fontSize = 16.sp)
            )
            Icon(painter = painterResource(id = R.drawable.more_icon), contentDescription = "more")
        }
        Spacer(modifier = Modifier.height(10.dp))
        LazyRow(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            items(CategoryCourseData.data, key = { it.id }) { item ->
                ItemCategory(icon = item.icon, label = item.label)
            }
        }
    }
}

@Composable
fun ItemCategory(icon: Int, label: String) {
    Column(modifier = Modifier.clickable { }, horizontalAlignment = Alignment.CenterHorizontally) {
        Card(shape = RoundedCornerShape(percent = 100)) {
            Icon(
                modifier = Modifier
                    .padding(20.dp)
                    .width(25.dp)
                    .height(25.dp),
                painter = painterResource(id = icon),
                contentDescription = ""
            )
        }
        Spacer(modifier = Modifier.height(7.dp))
        Text(
            text = label,
            style = MaterialTheme.typography.subtitle1.copy(
                color = Dark,
                fontWeight = FontWeight.SemiBold
            )
        )
    }
}