package com.mupper.myfirstkotlinandroidapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


/**
 * Created by jesus.medina on 07/2020.
 * Insulet Corporation
 * Andromeda
 */
class MediaAdapter(
    private val mediaItems: List<MediaItem>
) : RecyclerView.Adapter<MediaAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val v = layoutInflater.inflate(R.layout.item_image, parent, false)
        return ItemViewHolder(v)
    }

    override fun getItemCount(): Int {
        return mediaItems.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val mediaItem = mediaItems[position]
        holder.bind(mediaItem)
    }

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val imvPicture = view.findViewById<ImageView>(R.id.imvPicture)
        private val txvTitle = view.findViewById<TextView>(R.id.txvTitle)

        fun bind(mediaItem: MediaItem) {
            txvTitle.text = mediaItem.title
            Glide.with(imvPicture).load(mediaItem.imageUrl).into(imvPicture)
        }
    }
}