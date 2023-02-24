package com.github.ctaverni.bootcamp;

import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.runner.RunWith;

import org.junit.Test;
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> testRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testOne() {
        Intents.init();
        androidx.test.espresso.Espresso.onView(ViewMatchers.withId(R.id.greetingMessage));

        Intents.release();
    }
}
