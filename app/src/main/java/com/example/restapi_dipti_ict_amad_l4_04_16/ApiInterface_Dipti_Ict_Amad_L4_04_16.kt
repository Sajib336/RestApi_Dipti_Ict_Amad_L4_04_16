package com.example.restapi_dipti_ict_amad_l4_04_16

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiInterface_Dipti_Ict_Amad_L4_04_16  {
    val retroFit = Retrofit.Builder()
        .baseUrl("https://api.escuelajs.co/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retroFit.create(AptiService_Dipti_Ict_Amad_L4_04_16::class.java)
}