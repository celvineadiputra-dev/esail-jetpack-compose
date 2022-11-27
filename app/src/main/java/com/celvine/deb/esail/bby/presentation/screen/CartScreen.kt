package com.celvine.deb.esail.bby.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.common.UiState
import com.celvine.deb.esail.bby.common.theme.Ruby
import com.celvine.deb.esail.bby.common.theme.White2
import com.celvine.deb.esail.bby.data.model.CartModel
import com.celvine.deb.esail.bby.data.model.CourseModel
import com.celvine.deb.esail.bby.data.viewmodels.CartViewModel
import com.celvine.deb.esail.bby.data.viewmodels.DetailViewModel
import com.celvine.deb.esail.bby.data.viewmodels.ViewModelCartListFactory
import com.celvine.deb.esail.bby.data.viewmodels.ViewModelDetailFactory
import com.celvine.deb.esail.bby.di.Injection
import com.celvine.deb.esail.bby.presentation.components.PrimaryButton
import com.celvine.deb.esail.bby.presentation.components.SimpleCardCourse
import com.celvine.deb.esail.bby.presentation.components.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CartScreen(
    navController: NavController,
    viewModel: CartViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelCartListFactory(
            Injection.provideCartRepository()
        )
    ),
    detailViewModel: DetailViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelDetailFactory(
            Injection.provideDetailRepository()
        )
    ),
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopBar(title = "Cart", icon = R.drawable.search_icon) },
        bottomBar = { BottomCart() }, content = { paddingValues: PaddingValues ->
            viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
                when (uiState) {
                    is UiState.Loading -> {
                        viewModel.getAddedCartList()
                    }
                    is UiState.Success -> {
                        if (uiState.data.cartList.isNotEmpty()) {
                            LazyColumn(
                                modifier = Modifier
                                    .background(color = White2)
                                    .padding(
                                        top = paddingValues.calculateTopPadding() + 5.dp,
                                        start = 16.dp,
                                        end = 16.dp
                                    ),
                                verticalArrangement = Arrangement.spacedBy(10.dp),
                            ) {
                                item {
                                    CartListItem(
                                        detailViewModel = detailViewModel,
                                        navController = navController,
                                        list = uiState.data.cartList
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(90.dp))
                        }
                    }
                    is UiState.Error -> {}
                }
            }
        })
}

@Composable
fun CartListItem(
    detailViewModel: DetailViewModel,
    navController: NavController,
    list: List<CartModel>
) {
    list.forEach {
        val item: CourseModel = detailViewModel.getDataById(it.Id)
        SimpleCardCourse(item = item, navController = navController)
        Spacer(modifier = Modifier.height(10.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun BottomCart() {
    Row(
        modifier = Modifier
            .background(color = Ruby)
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        PrimaryButton(text = "Checkout Order - Rp. 130.500", onClick = {})
    }
}