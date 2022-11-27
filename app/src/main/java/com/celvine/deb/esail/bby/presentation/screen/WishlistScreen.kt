package com.celvine.deb.esail.bby.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.common.UiState
import com.celvine.deb.esail.bby.common.theme.Dark
import com.celvine.deb.esail.bby.common.theme.White
import com.celvine.deb.esail.bby.common.theme.White2
import com.celvine.deb.esail.bby.data.model.CourseModel
import com.celvine.deb.esail.bby.data.model.WishlistModel
import com.celvine.deb.esail.bby.data.viewmodels.*
import com.celvine.deb.esail.bby.di.Injection
import com.celvine.deb.esail.bby.presentation.components.SimpleCardCourse

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WishlistScreen(
    navController: NavController,
    viewModel: WishlistViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelWishListFactory(
            Injection.provideWishlistRepository()
        )
    ),
    detailViewModel: DetailViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelDetailFactory(
            Injection.provideDetailRepository()
        )
    ),
) {
    Column {
        TopBar()
        viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
            when (uiState) {
                is UiState.Loading -> {
                    viewModel.getAddedWishlist()
                }
                is UiState.Success -> {
                    if (uiState.data.wishlist.isNotEmpty()) {
                        LazyColumn(
                            modifier = Modifier
                                .background(color = White2)
                                .padding(horizontal = 16.dp, vertical = 10.dp)
                        ) {
                            item {
                                WishListItem(
                                    detailViewModel = detailViewModel,
                                    navController = navController,
                                    list = uiState.data.wishlist
                                )

                                Spacer(modifier = Modifier.height(90.dp))
                            }
                        }
                    }
                }
                is UiState.Error -> {

                }
            }
        }

    }
}

@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = White)
            .padding(horizontal = 16.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Wishlist",
            style = MaterialTheme.typography.labelMedium.copy(
                color = Dark,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
        )
        IconButton(
            modifier = Modifier.width(18.dp), onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.cart_shopping),
                contentDescription = "Cart", tint = Dark
            )
        }
    }
}


@Composable
fun WishListItem(
    detailViewModel: DetailViewModel,
    navController: NavController,
    list: List<WishlistModel>
) {
    list.forEach {
        val item: CourseModel = detailViewModel.getDataById(it.Id)
        SimpleCardCourse(item = item, navController = navController)
        Spacer(modifier = Modifier.height(10.dp))
    }
}