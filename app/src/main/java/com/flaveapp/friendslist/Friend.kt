package com.flaveapp.friendslist

import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import java.util.Date

/**
 * An object representing a Friend
 */
data class Friend(
    val firstName: String,
    val lastName: String,
    val birthday: Date,
    @ColorInt val favoriteColor: Int,
    @DrawableRes val profileImg: Int
)