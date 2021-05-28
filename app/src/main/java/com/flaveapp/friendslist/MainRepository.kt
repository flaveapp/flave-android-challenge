package com.flaveapp.friendslist

import android.graphics.Color
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import java.util.Date

private const val MILLIS_IN_DAY = 24 * 60 * 60 * 1000L

private val COLORS = listOf(
    Color.BLUE,
    Color.CYAN,
    Color.GREEN,
    Color.RED,
    Color.GREEN,
    Color.YELLOW,
    Color.MAGENTA,
    Color.GRAY
)

private val PROFILE_ICONS = listOf(
    R.drawable.ic_baseline_android_24,
    R.drawable.ic_baseline_face_24,
    R.drawable.ic_baseline_person_24,
    R.drawable.ic_baseline_pets_24
)

/**
 * Black box DataSource for loading and returning friend list data
 */
class MainRepository {

    /** Loads and returns a list of friends */
    fun loadFriendsList(size: Int = 50): List<Friend> {

        val friends = mutableListOf<Friend>()

        for (i in 0 until size) {
            friends.add(
                createDummyFriend(
                    i,
                    COLORS[(COLORS.indices).random()],
                    PROFILE_ICONS[(PROFILE_ICONS.indices).random()]
                )
            )
        }

        return friends
    }
}

/** Creates a Friend object using dummy data */
private fun createDummyFriend(index: Int, @ColorInt color: Int, @DrawableRes icon: Int): Friend {
    return Friend(
        firstName = "FirstName $index",
        lastName = "LastName $index",
        birthday = Date(System.currentTimeMillis() + MILLIS_IN_DAY),
        favoriteColor = color,
        profileImg = icon
    )
}