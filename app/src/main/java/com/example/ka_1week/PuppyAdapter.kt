package com.example.ka_1week

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PuppyAdapter (private val context: Context) : RecyclerView.Adapter<PuppyViewHoler>(){
    var data = listOf<PuppyItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PuppyViewHoler {
        val view = LayoutInflater.from(context).inflate(R.layout.recyclerview_item, parent, false)

        return PuppyViewHoler(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: PuppyViewHoler, position: Int) {
        holder.bind(data[position])
    }
}