package com.example.restapi_dipti_ict_amad_l4_04_16

import retrofit2.http.GET

interface AptiService_Dipti_Ict_Amad_L4_04_16 {
    @GET("products")
    suspend fun getProducts(): List<Product_Dipti_Ict_Amad_L4_04_16>
}