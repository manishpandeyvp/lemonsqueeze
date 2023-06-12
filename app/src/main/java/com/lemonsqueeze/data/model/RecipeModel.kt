package com.lemonsqueeze.data.model

import android.os.Parcel
import android.os.Parcelable

data class RecipeModel (
    val title: String?,
    val desc: String?,
    val ingredients: List<String>?,
    val steps: List<String>?,
    val tips: String?,
    val author: String?,
    val imgUrl: String?
    ): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.createStringArrayList(),
        parcel.createStringArrayList(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(desc)
        parcel.writeStringList(ingredients)
        parcel.writeStringList(steps)
        parcel.writeString(tips)
        parcel.writeString(author)
        parcel.writeString(imgUrl)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<RecipeModel> {
        override fun createFromParcel(parcel: Parcel): RecipeModel {
            return RecipeModel(parcel)
        }

        override fun newArray(size: Int): Array<RecipeModel?> {
            return arrayOfNulls(size)
        }
    }
}