package com.example.marketproject.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.marketproject.data.model.StoreInfo
import com.example.marketproject.data.repositories.StoreRepository
import kotlinx.coroutines.launch

class StoreViewModel(private val repo: StoreRepository): ViewModel() {
    private var _info: MutableLiveData<StoreInfo> = MutableLiveData()
    val info: LiveData<StoreInfo> get() = _info

    fun loadInfo(){
        viewModelScope.launch {
            val result = repo.loadInfo()
            _info.postValue(result)
        }
    }
}