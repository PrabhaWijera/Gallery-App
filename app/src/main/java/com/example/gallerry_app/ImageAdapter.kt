package com.example.gallerry_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ImageAdapter (private var context:Context,private var imagesList: AbstractList<Image>): RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {





    class ImageViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){

        var image:ImageView?=null

        init {
            image=itemView.findViewById(R.id.row_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
         val inflater=LayoutInflater.from(parent.context)
        val view =inflater.inflate(R.layout.row_custom_recycler_item,parent,false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
    val curreentImage=imagesList[position]
        Glide.with(context).load(curreentImage.imagePath)
            .apply(RequestOptions().centerCrop())
            .into(holder.image!!)


    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}