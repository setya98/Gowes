package com.example.bike.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.util.*


@Parcelize
data class Event(
    @SerializedName("productId")
    var productId: String = "",
    @SerializedName("imageUrl")
    var imageUrl: String ="",
    @SerializedName("imageName")
    val imageName: String = "",
    @SerializedName("title")
    val title: String ="",
    @SerializedName("price")
    val price: String ="",
    @SerializedName("stock")
    val stock: String = "",
    val createdOn: Date = Calendar.getInstance().time
) : Parcelable
