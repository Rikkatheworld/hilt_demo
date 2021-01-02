package com.example.hilt_demo

import android.util.Log
import javax.inject.Inject

class Programmer @Inject constructor() : Profession{
    override fun doJob() {
        Log.d("Programmer", "programmer do job")
    }
}