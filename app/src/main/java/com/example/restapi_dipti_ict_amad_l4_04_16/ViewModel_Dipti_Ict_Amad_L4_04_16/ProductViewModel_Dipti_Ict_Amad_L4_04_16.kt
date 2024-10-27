package com.example.restapi_dipti_ict_amad_l4_04_16.ViewModel_Dipti_Ict_Amad_L4_04_16

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restapi_dipti_ict_amad_l4_04_16.ApiInterface_Dipti_Ict_Amad_L4_04_16.apiService
import com.example.restapi_dipti_ict_amad_l4_04_16.Product_Dipti_Ict_Amad_L4_04_16
import kotlinx.coroutines.launch

class ProductViewModel_Dipti_Ict_Amad_L4_04_16 : ViewModel() {
    private val _product = MutableLiveData<List<Product_Dipti_Ict_Amad_L4_04_16>>()
    val product: LiveData<List<Product_Dipti_Ict_Amad_L4_04_16>> get() = _product

    init {
        viewModelScope.launch {
            fetchProducts()
        }
    }

    private suspend fun fetchProducts() {
        try {
            val response = apiService.getProducts()
            _product.postValue(response)
        } catch (e: Exception) {

        }
    }
}