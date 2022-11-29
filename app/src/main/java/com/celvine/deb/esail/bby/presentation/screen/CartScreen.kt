package com.celvine.deb.esail.bby.presentation.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.common.FormatIDR
import com.celvine.deb.esail.bby.common.UiState
import com.celvine.deb.esail.bby.common.theme.*
import com.celvine.deb.esail.bby.data.model.CartModel
import com.celvine.deb.esail.bby.data.model.CourseModel
import com.celvine.deb.esail.bby.data.viewmodels.*
import com.celvine.deb.esail.bby.di.Injection
import com.celvine.deb.esail.bby.presentation.components.PrimaryButton
import com.celvine.deb.esail.bby.presentation.components.SimpleCardCourse
import com.celvine.deb.esail.bby.presentation.components.TopBar
import com.celvine.deb.esail.bby.route.Routes

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
    myCourseViewModel: MyCoursesViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelMyCoursesFactory(
            Injection.provideMyCoursesRepository(),
            Injection.provideCartRepository()
        )
    ),
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopBar(title = "Cart", icon = R.drawable.search_icon, onClick = {
                navController.navigate(Routes.Search.routes)
            })
        },
        bottomBar = {
            BottomCart(
                navController = navController,
                viewModel = viewModel,
                myCourseViewModel = myCourseViewModel
            )
        },
        content = { paddingValues: PaddingValues ->
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
                                    .fillMaxHeight()
                                    .padding(
                                        top = paddingValues.calculateTopPadding() + 5.dp,
                                        start = 16.dp,
                                        end = 16.dp,
                                        bottom = paddingValues.calculateBottomPadding()
                                    ),
                                verticalArrangement = Arrangement.spacedBy(10.dp)
                            ) {
                                items(uiState.data.cartList.size, key = { it }) {
                                    CartListItem(
                                        detailViewModel = detailViewModel,
                                        navController = navController,
                                        cart = uiState.data.cartList[it]
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
    cart: CartModel
) {
    val item: CourseModel = detailViewModel.getDataById(cart.Id)
    SimpleCardCourse(item = item, navController = navController)
}

@Composable
fun BottomCart(
    navController: NavController,
    viewModel: CartViewModel,
    myCourseViewModel: MyCoursesViewModel
) {
    viewModel.getCheckout()
    val checkout = viewModel.checkout.collectAsState()
    Column(
        modifier = Modifier
            .background(color = White)
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = White),
            border = BorderStroke(2.dp, SolidColor(SoftGray))
        ) {
            Column(modifier = Modifier.padding(10.dp)) {
                Text(
                    text = "Price Detail",
                    style = MaterialTheme.typography.labelMedium.copy(
                        color = Dark,
                        fontWeight = FontWeight.SemiBold
                    )
                )

                Spacer(modifier = Modifier.height(5.dp))

                Column(modifier = Modifier.padding(10.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Sub Total",
                            style = MaterialTheme.typography.labelMedium.copy(
                                color = SoftGray2,
                                fontWeight = FontWeight.SemiBold
                            )
                        )
                        Text(
                            text = "${FormatIDR(checkout.value.subTotal)}",
                            style = MaterialTheme.typography.labelMedium.copy(
                                color = SoftGray2,
                                fontWeight = FontWeight.SemiBold
                            )
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Discount",
                            style = MaterialTheme.typography.labelMedium.copy(
                                color = SoftGray2,
                                fontWeight = FontWeight.SemiBold
                            )
                        )
                        Text(
                            text = "-${FormatIDR(checkout.value.discount)}",
                            style = MaterialTheme.typography.labelMedium.copy(
                                color = Ruby,
                                fontWeight = FontWeight.SemiBold
                            )
                        )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Total",
                            style = MaterialTheme.typography.labelMedium.copy(
                                color = SoftGray2,
                                fontWeight = FontWeight.SemiBold
                            )
                        )
                        Text(
                            text = "${FormatIDR(checkout.value.total)}",
                            style = MaterialTheme.typography.labelMedium.copy(
                                color = Green,
                                fontWeight = FontWeight.SemiBold
                            )
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        PrimaryButton(text = "Checkout Order", onClick = {
            myCourseViewModel.enroll(id = 1)
            navController.navigate(Routes.MyCourse.routes) {
                popUpTo(Routes.Home.routes) {
                    inclusive = true
                }
            }
        })
    }
}