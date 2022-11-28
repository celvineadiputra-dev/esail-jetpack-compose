package com.celvine.deb.esail.bby.data.repositories

import com.celvine.deb.esail.bby.data.model.CartModel
import com.celvine.deb.esail.bby.data.model.CheckoutModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class CartRepository {
    private val cartList = mutableListOf<CartModel>()
    private val checkout =
        mutableListOf<CheckoutModel>(CheckoutModel(subTotal = 0, total = 0, discount = 0))

    fun getAddedCartlist(): Flow<List<CartModel>> {
        return flowOf(cartList)
    }

    fun getCheckout(): Flow<List<CheckoutModel>> {
        return flowOf(checkout)
    }

    fun addToCart(id: Int, price: Int): Flow<Boolean> {
        cartList.add(cartList.size, CartModel(id))


        val subTotal = checkout[0].subTotal + price
        val discount = checkout[0].discount + 2000
        val total = subTotal - discount

        setCheckout(subTotal = subTotal, discount = discount, total = total)

        return flowOf(true)
    }

    fun setCheckout(subTotal: Int, discount: Int, total: Int) {
        checkout.add(
            0,
            CheckoutModel(
                subTotal = subTotal,
                discount = discount,
                total = total
            )
        )
    }

    fun removeFromCartList(id: Int, price: Int): Flow<Boolean> {
        val index = cartList.indexOfFirst { it.Id == id }

        cartList.removeAt(index)

        val subTotal = checkout[0].subTotal - price
        val discount = checkout[0].discount - 2000
        val total = checkout[0].total - (price + 2000)

        setCheckout(subTotal = subTotal, discount = discount, total = total)

        return flowOf(true)
    }

    fun isAdded(id: Int): Boolean {
        val result = cartList.indexOfFirst { it.Id == id }

        return result >= 0
    }

    companion object {
        @Volatile
        private var instance: CartRepository? = null

        fun getInstance(): CartRepository =
            instance ?: synchronized(this) {
                CartRepository().apply {
                    instance = this
                }
            }
    }
}