package com.example.course3kotlinwisataaplikasi.retrofitconfig

import com.example.course3kotlinwisataaplikasi.pojojson.getAllData.ResponseAllData
import retrofit2.Call
import retrofit2.http.GET

interface WisataService {

    @GET(value = "api/?action=findAll")
    fun getDataWisata():Call<ResponseAllData>
}