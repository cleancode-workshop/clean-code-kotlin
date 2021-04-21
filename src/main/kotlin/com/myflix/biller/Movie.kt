package com.myflix.biller

class Movie(val title: String, var priceCode: Int) {

    companion object {
        const val CHILDRENS = 2
        const val REGULAR = 0
        const val NEW_RELEASE = 1
    }
}