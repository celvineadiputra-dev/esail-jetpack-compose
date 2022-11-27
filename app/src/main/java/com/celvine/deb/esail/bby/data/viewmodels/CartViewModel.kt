package com.celvine.deb.esail.bby.data.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.celvine.deb.esail.bby.common.CartState
import com.celvine.deb.esail.bby.common.UiState
import com.celvine.deb.esail.bby.data.repositories.CartRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class CartViewModel(private val repository: CartRepository) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<CartState>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<CartState>>
        get() = _uiState

    private val _inCartList: MutableStateFlow<Boolean> = MutableStateFlow(false)

    val inCartList: StateFlow<Boolean> get() = _inCartList


    fun getAddedCartList() {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            repository.getAddedCartlist().collect {
                _uiState.value = UiState.Success(CartState(it))
            }
        }
    }

    fun addToCartList(id: Int) {
        viewModelScope.launch {
            repository.addToCart(id = id)
            _inCartList.value = true
        }
    }

    fun removeFromCartList(id: Int) {
        viewModelScope.launch {
            repository.removeFromCartList(id = id)
            _inCartList.value = false
        }
    }

    fun isAdded(id: Int) {
        _inCartList.value = repository.isAdded(id = id)
    }
}