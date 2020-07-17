package com.example.firstaidkit;

import android.app.Activity;
import android.app.Instrumentation;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.*;

public class homeTest {
    @Rule
    public ActivityTestRule<home>mActivityTestRule = new ActivityTestRule<home>(home.class);
    private home mActivity =null;
    Instrumentation.ActivityMonitor monitor = getInstrumentation().addMonitor(cpr.class.getName(),null,false);

    @Before
    public void setUp() throws Exception {
        mActivity=mActivityTestRule.getActivity();
    }
    @Test
    public void testLaunchOfcprOnButtonClick()
    {
        assertNotNull(mActivity.findViewById(R.id.btn));
        onView(withId(R.id.btn)).perform(click());
        Activity cpr = getInstrumentation().waitForMonitorWithTimeout(monitor,5000);
        assertNotNull(cpr);
        cpr.finish();

    }

    @After
    public void tearDown() throws Exception {
        mActivity=null;
    }
}