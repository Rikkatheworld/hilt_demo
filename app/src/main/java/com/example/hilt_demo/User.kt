package com.example.hilt_demo

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
data class User(var id: Int, var name: String, var mood: String) {
    @Inject constructor() : this(1, "Rikka", "不好")

    class Builder(var id: Int = 1, var name: String = "", var mood: String = "") {
        fun id(newId: Int): Builder {
            id = newId
            return this
        }

        fun name(newName: String): Builder {
            name = newName
            return this
        }

        fun mood(newMood: String): Builder {
            mood = newMood
            return this
        }

        fun build(): User {
            return User(id, name, mood)
        }
    }
}