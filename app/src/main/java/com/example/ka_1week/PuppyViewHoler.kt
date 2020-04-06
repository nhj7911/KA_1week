package com.example.ka_1week

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PuppyViewHoler(view: View) : RecyclerView.ViewHolder(view){

    val imgPuppy: ImageView = view.findViewById(R.id.imagepuppy)
    val txtPuppyName : TextView = view.findViewById(R.id.puppyname)
    val txtPuppyAge : TextView = view.findViewById(R.id.puppyagedata)
    val txtPuppyFeature : TextView = view.findViewById(R.id.puppyfeaturedata)
    val txtPuppyPlace : TextView = view.findViewById(R.id.puppyplacedata)

    fun bind(data: PuppyItem){
        // TDOD view 의 값이나 행동을 정한다.
        Glide.with(itemView)
            .load(data.puppy_img)
            .into(imgPuppy)
        txtPuppyName.text = data.puppy_name
        txtPuppyAge.text = data.puppy_age
        txtPuppyFeature.text = data.puppy_feature
        txtPuppyPlace.text = data.puppy_place
    }


}