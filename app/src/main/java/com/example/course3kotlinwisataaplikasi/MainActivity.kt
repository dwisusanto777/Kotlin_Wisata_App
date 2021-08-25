package com.example.course3kotlinwisataaplikasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.course3kotlinwisataaplikasi.adapter.WisataAdapter
import com.example.course3kotlinwisataaplikasi.pojojson.getAllData.DataItem
import com.example.course3kotlinwisataaplikasi.pojojson.getAllData.ResponseAllData
import com.example.course3kotlinwisataaplikasi.retrofitconfig.RetrofitInstance
import com.example.course3kotlinwisataaplikasi.retrofitconfig.WisataService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("LOG_DWI = Sukses ", "Data masuk siini")
        RetrofitInstance.getInstance("https://www.udacoding.com/").
            create(WisataService::class.java).getDataWisata().enqueue(object : Callback<ResponseAllData> {
            override fun onResponse(
                call: Call<ResponseAllData>,
                response: Response<ResponseAllData>
            ) {
                Log.d("LOG_DWI = Sukses ", response.message())
                if(response.isSuccessful){
                    val status = response.body()?.status_code
                    if(status==200){
                        val data = response.body()?.data
                        showData(data)
                    }
                }
            }

            override fun onFailure(call: Call<ResponseAllData>, t: Throwable) {
                Log.d("LOG_DWI = Error ", ""+t.message)
            }

        })

    }

    private fun showData(data: List<DataItem?>?) {
        WisataAdapter(data)
    }
}