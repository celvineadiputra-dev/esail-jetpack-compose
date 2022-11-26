package com.celvine.deb.esail.bby.presentation.screen

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.celvine.deb.esail.bby.R
import androidx.lifecycle.viewmodel.compose.viewModel
import com.celvine.deb.esail.bby.common.UiState
import com.celvine.deb.esail.bby.presentation.components.SearchField
import com.celvine.deb.esail.bby.presentation.components.SimpleCardCourse
import com.celvine.deb.esail.bby.common.theme.SoftGray2
import com.celvine.deb.esail.bby.common.theme.White2
import com.celvine.deb.esail.bby.data.viewmodels.CoursesViewModel
import com.celvine.deb.esail.bby.data.viewmodels.ViewModelCoursesFactory
import com.celvine.deb.esail.bby.di.Injection


@Composable
fun SearchScreen(
    navController: NavController,
    viewModel: CoursesViewModel = viewModel(factory = ViewModelCoursesFactory(Injection.provideCourseRepository()))
) {
    val searchText = remember {
        mutableStateOf("")
    }
    val listState = rememberLazyListState()
    val query by viewModel.query

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White2),
        state = listState
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
                        placeholder = "Jetpack Compose",
                        value = query,
                        onValueChange = viewModel::search,
                        onClear = viewModel::removeQuery
                    )
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


            viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
                when (uiState) {
                    is UiState.Loading -> {
                        viewModel.getAll()
                    }
                    is UiState.Success -> {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                        ) {
                            if (uiState.data.isNotEmpty()) {
                                uiState.data.forEachIndexed { _, item ->
                                    SimpleCardCourse(item = item, navController = navController)
                                    Spacer(modifier = Modifier.height(10.dp))
                                }
                            } else {
                                Text(text = "Not Found")
                            }
                        }
                    }
                    is UiState.Error -> {}
                }
            }
        }
    }
}