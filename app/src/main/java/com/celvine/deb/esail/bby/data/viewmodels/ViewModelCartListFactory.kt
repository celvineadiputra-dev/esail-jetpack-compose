package com.celvine.deb.esail.bby.data.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.celvine.deb.esail.bby.data.repositories.CartRepository

class ViewModelCartListFactory(private val repository: CartRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CartViewModel::class.java)) {
            return CartViewModel(repository) as T
        }
        throw  java.lang.IllegalArgumentException("Unknown View Model")
    }
}