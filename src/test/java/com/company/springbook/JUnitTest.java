package com.company.springbook;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.sameInstance;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class JUnitTest {
    @Autowired
    ApplicationContext context;

    static Set<JUnitTest> testObject = new HashSet<JUnitTest>();
    static ApplicationContext contextObject = null;

    @Test
    public void test1() {
        assertThat(this, is(not(sameInstance(testObject))));
        testObject.add(this);

        assertThat(contextObject == null || contextObject == this.context, is(true));
        contextObject = this.context;
    }

    @Test
    public void test2() {
        assertThat(this, is(not(sameInstance(testObject))));
        testObject.add(this);

        assertThat(contextObject == null || contextObject == this.context, is(true));
        contextObject = this.context;
    }

    @Test
    public void test3() {
        assertThat(this, is(not(sameInstance(testObject))));
        testObject.add(this);

        assertThat(contextObject == null || contextObject == this.context, is(true));
        contextObject = this.context;
    }
}
