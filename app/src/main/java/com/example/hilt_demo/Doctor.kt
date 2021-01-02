package com.example.hilt_demo

import android.util.Log
import javax.inject.Inject

class Doctor @Inject constructor() : Profession{
    override fun doJob() {
        Log.d("Doctor", "doctor do job")
    }
}