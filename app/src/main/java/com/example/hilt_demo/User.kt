package com.example.hilt_demo

import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

class User @Inject constructor(var clothes: Clothes){
//    @Inject
//    constructor() : this("Rikka", 23)

    @BindProgrammer
    @Inject
    lateinit var profession: Profession

    fun showMyself() {
        profession.doJob()
    }
}