package com.celvine.deb.esail.bby.presentation.screen

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.common.UiState
import com.celvine.deb.esail.bby.common.theme.SoftGray2
import com.celvine.deb.esail.bby.common.theme.White2
import com.celvine.deb.esail.bby.data.viewmodels.CoursesViewModel
import com.celvine.deb.esail.bby.data.viewmodels.ViewModelCoursesFactory
import com.celvine.deb.esail.bby.di.Injection
import com.celvine.deb.esail.bby.presentation.components.SearchField
import com.celvine.deb.esail.bby.presentation.components.SimpleCardCourse


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(
    navController: NavController,
    viewModel: CoursesViewModel = viewModel(factory = ViewModelCoursesFactory(Injection.provideCourseRepository()))
) {
    val searchText = remember {
        mutableStateOf("")
    }
    val listState = rememberLazyListState()

    Scaffold(topBar = { SearchForm(viewModel = viewModel) }, content = { paddingValues ->
        viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
            when (uiState) {
                is UiState.Loading -> {
                    viewModel.getAll()
                }
                is UiState.Success -> {
                    if (uiState.data.isNotEmpty()) {
                        LazyColumn(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(color = White2)
                                .padding(top = paddingValues.calculateTopPadding()),
                            state = listState
                        ) {
                            items(uiState.data.size, key = { it }) {
                                SimpleCardCourse(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(start = 16.dp, end = 16.dp, top = 16.dp),
                                    item = uiState.data[it],
                                    navController = navController
                                )
                            }
                        }
                    } else {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(color = White2),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(text = "Not Found")
                        }
                    }
                }
                is UiState.Error -> {}
            }
        }
    })
}

@Composable
fun SearchForm(viewModel: CoursesViewModel) {
    val query by viewModel.query
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
                Toast.makeText(
                    context,
                    "In Development Feature",
                    Toast.LENGTH_SHORT
                ).show()
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
}