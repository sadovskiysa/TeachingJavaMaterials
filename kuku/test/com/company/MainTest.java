package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by cu on 30.10.2014.
 */
public class MainTest {
    private Main main;

    @Before
    public void juujgu() throws Exception {
        main = new Main();
    }

    @Test
    public void testDoJob() {
        assertEquals(20, main.doJob(10));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testDoJobThrowsException() {
        main.doJob(21);
    }
}
