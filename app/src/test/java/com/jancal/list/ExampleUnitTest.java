package com.jancal.list;

import android.support.annotation.NonNull;

import junit.framework.Assert;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(6, 2 + 2);
    }

    @Test
    public void test() throws Exception {
        ExampleUnitTest test = new ExampleUnitTest();
        String str = null;
        test.testNotNUll(str);
    }

    public void testNotNUll(@NonNull String str) {
        Assert.assertNotNull(str);
        System.out.println(str);
    }

}