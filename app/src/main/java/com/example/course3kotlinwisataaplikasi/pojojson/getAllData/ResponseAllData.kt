package com.example.course3kotlinwisataaplikasi.pojojson.getAllData

data class ResponseAllData(
	var status_code: Int? = null,
	var data: List<DataItem?>? = null,
	var message: String? = null
)

data class DataItem(
	var lokasi: String? = null,
	var id: String? = null,
	var deskripsi: String? = null,
	var nama_tempat: String? = null,
	var gambar: String? = null
)

