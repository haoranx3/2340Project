package com.example.a2340project;

import android.app.Application;

import com.example.a2340project.entity.Player;
import com.example.a2340project.entity.Ship;
import com.example.a2340project.entity.ShipEnum;
import com.example.a2340project.views.createPlayerActivity;

import android.app.Instrumentation;
import android.support.test.espresso.web.proto.sugar.WebSugar;
import android.support.test.rule.ActivityTestRule;
import android.widget.Button;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JerryTest {

    @Rule
    public ActivityTestRule<createPlayerActivity> createPlayerActivityActivityTestRule = new ActivityTestRule<>(createPlayerActivity.class);


    private createPlayerActivity activity = null;

    @Before
    public void setUp() throws Exception {
        activity = createPlayerActivityActivityTestRule.getActivity();
    }


    @Test
    public void testSailorPlus1() {
        assertNotNull(activity.findViewById(R.id.sailorPlus));
        onView(withId(R.id.sailorPlus)).perform(click());
        onView(withId(R.id.sailorPoints)).check(matches(withText("1")));
    }

    @Test
    public void testSailorPlus2() {
        for (int i = 0; i < 16; i++) {
            onView(withId(R.id.sailorPlus)).perform(click());
        }
        onView(withId(R.id.sailorPlus)).perform(click());
        onView(withId(R.id.sailorPoints)).check(matches(withText("16")));
    }

    @Test
    public void testSailorMinus1() {
        onView(withId(R.id.sailorMinus)).perform(click());
        onView(withId(R.id.sailorPoints)).check(matches((withText("0"))));
    }

    @Test
    public void testSailorMinus2() {
        onView(withId(R.id.sailorPlus)).perform(click());
        onView(withId(R.id.sailorPlus)).perform(click());
        onView(withId(R.id.sailorMinus)).perform(click());
        onView(withId(R.id.sailorPoints)).check(matches(withText("1")));
    }
}
