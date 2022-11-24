package com.celvine.deb.esail.bby.ui.screen

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.data.CourseData
import com.celvine.deb.esail.bby.models.CourseModel
import com.celvine.deb.esail.bby.ui.components.SearchField
import com.celvine.deb.esail.bby.ui.components.SimpleCardCourse
import com.celvine.deb.esail.bby.ui.theme.SoftGray2
import com.celvine.deb.esail.bby.ui.theme.White2


@Composable
fun SearchScreen(navController: NavController) {
    val searchText = remember {
        mutableStateOf("")
    }
    val result = remember {
        mutableStateOf(listOf<CourseModel>())
    }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White2)
    ) {
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(0.9f)
                ) {
                    SearchField(
                        placeholder = "Jetpack Compose, Flutter, Vue Js",
                        value = searchText,
                        callBack = {
                            result.value = filterData(query = searchText.value)
                        })
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(0.1f), horizontalAlignment = Alignment.End
                ) {
                    val context = LocalContext.current
                    IconButton(onClick = {
                        Toast.makeText(context, "In Development Feature", Toast.LENGTH_SHORT).show()
                    }) {
                        Icon(
                            modifier = Modifier.width(24.dp),
                            painter = painterResource(id = R.drawable.filter_list),
                            contentDescription = "Filter",
                            tint = SoftGray2
                        )
                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
            ) {
                result.value.forEachIndexed { _, courseModel ->
                    SimpleCardCourse(item = courseModel)
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }
        }
    }
}

fun filterData(query: String): List<CourseModel> {
    val data = CourseData.data.filter { it.title.contains(query, ignoreCase = true) }
    if (data.isEmpty()) {
        return CourseData.data
    }
    return data
}
