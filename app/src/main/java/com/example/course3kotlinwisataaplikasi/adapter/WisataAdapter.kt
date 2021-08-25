package com.example.course3kotlinwisataaplikasi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.course3kotlinwisataaplikasi.R
import com.example.course3kotlinwisataaplikasi.pojojson.getAllData.DataItem
import kotlinx.android.synthetic.main.item_wisata.view.*

class WisataAdapter(var data: List<DataItem?>?) : RecyclerView.Adapter<WisataAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img = itemView.imgWisata
        val textName = itemView.tvNamaLokasi
        val textTempat = itemView.tvNamaTempat

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WisataAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_wisata, parent, false)
        val holder = MyViewHolder(view)
        return  holder
    }

    override fun onBindViewHolder(holder: WisataAdapter.MyViewHolder, position: Int) {
        val item = data?.get(position)
        holder.textName.text = item?.lokasi
        holder.textTempat.text = item?.nama_tempat
        
    }

    override fun getItemCount(): Int {
        return data?.size ?:0
    }

}