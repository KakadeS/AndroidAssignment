package com.example.sayalikakade.testapplication3.view;

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.example.sayalikakade.testapplication3.R
import com.squareup.picasso.Picasso

class ImageBindingAdapter {

    @BindingAdapter("bind:imageHref")
    fun loadImage(imageView: ImageView, url: String) {
        if (url != "") {
            Picasso.with(imageView.getContext()).load(url).placeholder(R.drawable.loading).resize(200, 200).into(imageView)
        }
    }
}