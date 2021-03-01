# Flave Android Coding Challenge


The purpose of this technical challenge is to get an idea of the depth of android knowledge for a candidate. There is no specific right answer or approach. There is no specific amount of time that this challenge requires to complete. The requirements laid out below will be high-level and it is up to the candidate to decide what concepts, tools and approaches they want to take to meet the minimum requirements. Please feel free to spend as much time as you’d like crafting your solution and we hope you have fun along the way

# Android Coding Challenge: Build a Friend List!

Your challenge is to build a vertically scrolling list which displays some metadata about a friend. There is no real webservice or backend that is serving this data, there will be a method that you can invoke which will return a list of dummy data - more info below!

# Requirements

1. You MUST use a [RecyclerView](https://developer.android.com/reference/kotlin/androidx/recyclerview/widget/RecyclerView) for your list view/component. Here's some additional [documentation](https://developer.android.com/guide/topics/ui/layout/recyclerview)
2. You MUST use [ConstraintLayout](https://developer.android.com/reference/androidx/constraintlayout/widget/ConstraintLayout) in at least one of your layouts. Here's some additional [documentation](https://developer.android.com/training/constraint-layout)
3. At minimum, a friend's first name, last name, birthday and profile image must be displayed in each list item. You can decide how the UI should look
4. A friend object has a field called `favoriteColor`. This should be used as the color of the corresponding list item.
5. Tapping a row in the row in the list will display an [AlertDialog](https://developer.android.com/reference/android/app/AlertDialog), [Toast](https://developer.android.com/reference/android/widget/Toast), [Snackbar](https://developer.android.com/reference/com/google/android/material/snackbar/Snackbar) or some other similar component of your choice with the following message: "Hello ${firstName} ${lastName}"

# Optional Requirements

1. Use the skeleton [MainViewModel](https://github.com/flaveapp/flave-android-challenge/blob/main/app/src/main/java/com/flaveapp/friendslist/MainViewModel.kt) with an Observable data holder pattern of your choice for passing data to the view. 
2. Fetch the dummy friend list data asynchronously, in order to prevent blocking the UI thread
3. Handle saving/restoring the ui state to avoid unneccessarily re-loading the friend list if the app goes to background (recents) or gets destroyed/recreated by the system 
4. The list is displayed in sorted order by the `favoriteColor`. e.g. If there is a total of 3 Friend objects and 2 of them have the same `favoriteColor`, they will be displayed in positions 1 and 2 (the order in the group is not important), and in position 3 will be the friend with a different color. How you choose which color has precedence is not important, only that the items are displayed in order by "group" based on `favoriteColor`

# Notes

* The [MainRepository](https://github.com/flaveapp/flave-android-challenge/blob/main/app/src/main/java/com/flaveapp/friendslist/MainRepository.kt) has a public method that can be used to simulate fetching a list of friends. 
* You are free to leverage and use any 3rd party library in order to solve the project requirements - just keep in mind you may be asked questions about these libraries
* You don't need to concern yourself with styles, themes, etc. If you would like to put in the extra effort for an elegant UI feel free to do so, but this is not an expectation of this coding challenge
* You DO NOT need to write any Unit Tests. However the testability of your code will be taken into consideration. More on this below
* Please push your work to GitHub or BitBucket and provide us with the link so we can clone your submission for code review and to test via a debug build

# Considerations

In addition to being elavuated on meeting the minimum requirements above, we will also be taking into consideration the follow:

1. Application Architecture
2. Android coding conventions
3. Knowledge of Android SDK and libraries
4. Comments and documentation
5. Design decisions and implementation detail
6. Unit testability of your code
7. Your android project should compile and we should be able to clone your project and run directly from Android Studio with no problems.

We encourage you to have fun with this challenege and feel free to add in your own "flavor" or humor wherever you can!

GOOD LUCK!!!
