package com.app.mypagination

import android.view.View
import android.widget.ImageView
import coil.load


fun View.visible(isVisible: Boolean) {
    visibility = if (isVisible) View.VISIBLE else View.GONE
}

fun ImageView.loadImage(url: String) {
    this.load(url)
}