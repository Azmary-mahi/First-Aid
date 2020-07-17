package com.example.firstaidkit;

import android.view.View;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class nosebleedTest {
    @Rule
    public ActivityTestRule<nosebleed> mActivityTestRule = new ActivityTestRule<nosebleed>(nosebleed.class);
    private  nosebleed nosebleed = null;

    @Before
    public void setUp() throws Exception {
        nosebleed = mActivityTestRule.getActivity();
    }
    @Test
    public  void testLaunch()
    {
        View view =nosebleed.findViewById(R.id.txt1);
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {
        nosebleed=null;
    }
}