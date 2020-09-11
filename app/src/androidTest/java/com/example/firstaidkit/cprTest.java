package com.example.firstaidkit;

import android.app.Activity;
import android.app.Instrumentation;
import android.view.View;

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

public class cprTest {

    @Rule
    public ActivityTestRule<cpr> mActivityTestRule = new ActivityTestRule<cpr>(cpr.class);
    private  cpr cpr = null;

    @Before
    public void setUp() throws Exception {
        cpr = mActivityTestRule.getActivity();
    }
    @Test
    public  void testLaunch()
    {
        View view =cpr.findViewById(R.id.txt1);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        cpr=null;
    }
}