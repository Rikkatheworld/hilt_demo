package com.example.hilt_demo

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyTextView(context: Context?, attrs: AttributeSet?) : TextView(context, attrs) {

    @Inject
    lateinit var user: User

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        text = user.name
    }
}