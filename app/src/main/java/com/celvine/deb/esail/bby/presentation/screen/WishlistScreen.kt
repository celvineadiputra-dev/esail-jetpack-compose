package com.celvine.deb.esail.bby.presentation.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavController
import com.celvine.deb.esail.bby.common.UiState
import com.celvine.deb.esail.bby.di.Injection
import com.celvine.deb.esail.bby.data.viewmodels.*

@Composable
fun WishlistScreen(
    navController: NavController,
    viewModel: WishlistViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelWishListFactory(
            Injection.provideWishlistRepository()
        )
    ),
) {
    viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> {
                viewModel.getAddedWishlist()
            }
            is UiState.Success -> {
                Text(text = uiState.data.toString())
            }
            is UiState.Error -> {

            }
        }
    }
}