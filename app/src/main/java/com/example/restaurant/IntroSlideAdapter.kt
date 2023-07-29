package com.example.restaurant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class IntroSlideAdapter(private val IntroSlides: List<IntroSlides>) :
    RecyclerView.Adapter<IntroSlideAdapter.IntroSlideViewHolder>() {

    inner class IntroSlideViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroSlideViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.slide_item, parent, false)
        return IntroSlideViewHolder(view)

    }

    override fun onBindViewHolder(holder: IntroSlideViewHolder, position: Int) {
        val currentSlide = IntroSlides[position]

        holder.itemView.title.text.currentSlide.title
        holder.itemView.description.text.currentSlide.description
        holder.itemView.image.setImageResource(currentSlide.imageResource)
    }

    override fun getItemCount(): Int = IntroSlides.size
}

