package com.lemonsqueeze.data.model

import android.os.Parcel
import android.os.Parcelable

data class FollowingModel (
    val id: String?,
    val username: String?
    ): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(username)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<FollowingModel> {
        override fun createFromParcel(parcel: Parcel): FollowingModel {
            return FollowingModel(parcel)
        }

        override fun newArray(size: Int): Array<FollowingModel?> {
            return arrayOfNulls(size)
        }
    }
}