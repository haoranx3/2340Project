package com.example.a2340project;

import android.arch.lifecycle.ViewModelProviders;
import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.rule.ActivityTestRule;
import com.example.a2340project.views.MainActivity;
import com.example.a2340project.views.createRegionActivity;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.AllOf.allOf;

import com.example.a2340project.viewmodels.CreatePlayerViewModel;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class HaoranTest{

    @Rule
    public ActivityTestRule<createRegionActivity> createRegionActivityActivityTestRule = new ActivityTestRule<>(createRegionActivity.class);

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testToggleBag() {
        onView(withId(R.id.sellButton)).perform(click()).check(matches(isDisplayed()));
        onView(allOf(withId(R.id.sellButton), withText("SHOP")));
        onView(withId(R.id.sellButton)).perform(click()).check(matches(isDisplayed()));
        onView(allOf(withId(R.id.sellButton), withText("BAG")));
    }

    @Test
    public void testTwoClick() {
        onView(withId(R.id.two)).perform(click());
        onView(allOf(withId(R.id.message), withText("Fresh Water")));
    }


}
