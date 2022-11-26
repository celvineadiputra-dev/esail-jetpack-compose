package com.celvine.deb.esail.bby.data.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.celvine.deb.esail.bby.common.UiState
import com.celvine.deb.esail.bby.data.model.ContentModel
import com.celvine.deb.esail.bby.data.repositories.ContentRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class ContentViewModel(private val repository: ContentRepository) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<List<ContentModel>>> =
        MutableStateFlow(UiState.Loading)

    val uiState: StateFlow<UiState<List<ContentModel>>> get() = _uiState

    private val _openId = MutableStateFlow(0)
    val openId: StateFlow<Int> get() = _openId

    fun getContent(id: Int) {
        viewModelScope.launch {
            repository.getContent(id).catch {
                _uiState.value = UiState.Error(it.message.toString())
            }.collect { content ->
                _uiState.value = UiState.Success(content)
            }
        }
    }

    fun setOpenId(id: Int) {
        Log.i("TX", id.toString())
        if (_openId.value == id) {
            _openId.value = 0
        } else {
            _openId.value = id
        }
    }
}