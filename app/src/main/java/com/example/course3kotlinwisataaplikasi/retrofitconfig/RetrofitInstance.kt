package com.example.course3kotlinwisataaplikasi.retrofitconfig

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {

    companion object{
        fun getInstance(url:String):Retrofit{
            val retrofit = Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create() )
//                .client(RetrofitSupportSsl.getSupportSSL().build())
                .build();
            //val service:WisataService = retrofit.create(WisataService::class.java)
            return retrofit;
        }
    }


}