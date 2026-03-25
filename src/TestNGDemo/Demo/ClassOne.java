package TestNGDemo.Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassOne {

    @Test
    public void classOneTest1() {
        System.out.println("classOneTest1");
    }

    @Test
    public void classOneTest2() {
        System.out.println("classOneTest2");
    }

    @Test
    public void classOneTest3() {
        System.out.println("classOneTest3");
    }

    @Test
    public void classOneTest4() {
        System.out.println("classOneTest4");
        Assert.assertEquals(true,false,"This is failed");
    }

    @Test
    public void classOneTest5() {
        System.out.println("classOneTest5");
    }

    @Test
    public void classOneTest6() {
        System.out.println("classOneTest6");
    }

    @Test
    public void classOneTest7() {
        System.out.println("classOneTest7");
    }

    @Test
    public void classOneTest8() {
        System.out.println("classOneTest8");
    }

    @Test
    public void classOneTest9() {
        System.out.println("classOneTest9");
    }

    @Test
    public void classOneTest10() {
        System.out.println("classOneTest10");
    }
}
