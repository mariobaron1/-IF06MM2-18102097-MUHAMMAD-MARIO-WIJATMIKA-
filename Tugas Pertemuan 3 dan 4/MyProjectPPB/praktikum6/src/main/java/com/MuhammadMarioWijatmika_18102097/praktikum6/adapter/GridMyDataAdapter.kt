package com.MuhammadMarioWijatmika_18102097.praktikum6.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.MuhammadMarioWijatmika_18102097.praktikum6.MyData
import com.MuhammadMarioWijatmika_18102097.praktikum6.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridMyDataAdapter (val listMyDatas: ArrayList<MyData>)  : RecyclerView.Adapter<GridMyDataAdapter.GridViewHolder>(){
    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMyDatas.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listMyDatas[position].photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
    }
}