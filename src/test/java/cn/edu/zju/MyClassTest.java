package cn.edu.zju;

import junit.framework.TestCase;

/**
 * Created by I337169 on 5/12/2017.
 */
public class MyClassTest extends TestCase {

    public void testTestHello() throws Exception {
        MyClass test = new MyClass();
        assertEquals(0,test.testHello("a"));
	    assertEquals(1,test.testHello("b"));
//	    assertEquals(2,test.testHello("b"));
    }

}
