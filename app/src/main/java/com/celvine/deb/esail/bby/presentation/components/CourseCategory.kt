package com.celvine.deb.esail.bby.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.data.sources.CategoryCourseData
import com.celvine.deb.esail.bby.common.theme.Dark
import com.celvine.deb.esail.bby.common.theme.White

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
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Bold
                )
            )
            Icon(painter = painterResource(id = R.drawable.more_icon), contentDescription = "more")
        }
        Spacer(modifier = Modifier.height(10.dp))
        LazyRow(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
        ) {
            items(CategoryCourseData.data, key = { it.id }) { item ->
                ItemCategory(icon = item.icon, label = item.label, color = item.color)
            }
        }
    }
}

@Composable
fun ItemCategory(icon: Int, label: String, color: Color) {
    val interactionSource = remember { MutableInteractionSource() }
    Column(
        modifier = Modifier.clickable(
            interactionSource = interactionSource,
            indication = null
        ) { }, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            shape = RoundedCornerShape(percent = 100),
            colors = CardDefaults.cardColors(containerColor = White)
        ) {
            Icon(
                modifier = Modifier
                    .padding(20.dp)
                    .width(25.dp)
                    .height(25.dp),
                painter = painterResource(id = icon),
                contentDescription = "",
                tint = color
            )
        }
        Spacer(modifier = Modifier.height(7.dp))
        Text(
            text = label, style = MaterialTheme.typography.labelSmall.copy(
                color = Dark, fontWeight = FontWeight.SemiBold, fontSize = 11.sp
            )
        )
    }
}