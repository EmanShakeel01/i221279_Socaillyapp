package com.emanshakeel.i221279

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.assignment1.test.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class Test {

    @get:Rule
    var activityRule = ActivityScenarioRule(login2::class.java)


    @Test
    fun loginButtonNavigatesToHomepage() {
        onView(withId(R.id.loginButton)).perform(click())
        onView(withId(R.id.title))
            .check(matches(isDisplayed()))
    }


    @Test
    fun navigateToSearchBarPage() {
        // First go to homepage after login
        onView(withId(R.id.loginButton)).perform(click())

        // Click search button in bottom nav
        onView(withId(R.id.nav_search)).perform(click())

        // Verify that search bar EditText is displayed in searchbar page
        onView(withId(R.id.searchEdit))
            .check(matches(isDisplayed()))
    }
}
