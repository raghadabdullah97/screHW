package com.example.screhw

import androidx.lifecycle.ViewModel




class teamData : ViewModel() {
    // TODO: Implement the ViewModel
    private var _score: Int = 0
    val score: Int
        get() = _score


    fun sum1(): Int {
        return score + 1
    }


    fun subtract(): Int {


        return score - 1
    }


    fun sum4(): Int {


        return score + 4
    }

}