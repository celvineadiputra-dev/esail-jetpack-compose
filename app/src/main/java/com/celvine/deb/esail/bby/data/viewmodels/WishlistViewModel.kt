package com.celvine.deb.esail.bby.data.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.celvine.deb.esail.bby.common.UiState
import com.celvine.deb.esail.bby.common.WishlistState
import com.celvine.deb.esail.bby.data.repositories.WishlistRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class WishlistViewModel(private val repository: WishlistRepository) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<WishlistState>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<WishlistState>>
        get() = _uiState


    private val _inWishlist: MutableStateFlow<Boolean> = MutableStateFlow(false)

    val inWishlist: StateFlow<Boolean> get() = _inWishlist

    fun getAddedWishlist() {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            repository.getAddedWishlist().collect {
                _uiState.value = UiState.Success(WishlistState(it))
            }
        }
    }

    fun addToWishlist(id: Int) {
        viewModelScope.launch {
            repository.addToWishlist(id = id)
            _inWishlist.value = true
        }
    }

    fun removeFromWishlist(id: Int) {
        viewModelScope.launch {
            repository.removeFromWishlist(id = id)
            _inWishlist.value = false
        }
    }

    fun isAdded(id: Int) {
        _inWishlist.value = repository.isAdded(id = id)
    }
}