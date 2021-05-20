package com.example.fruitlist

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize

data class ExampleItem(val imageResource: Int, var text1: String, var text2: String) : Parcelable