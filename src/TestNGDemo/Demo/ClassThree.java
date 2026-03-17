package TestNGDemo.Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassThree {

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("afterTest");
    }
    @Test
    public void classThreeTest1() {
        System.out.println("classThreeTest1");
    }

    @Test
    public void classThreeTest2() {
        System.out.println("classThreeTest2");
    }

    @Test
    public void classThreeTest3() {
        System.out.println("classThreeTest3");
    }

    @Test
    public void classThreeTest4() {
        System.out.println("classThreeTest4");
    }

    @Test
    public void classThreeTest5() {
        System.out.println("classThreeTest5");
    }

    @Test
    public void classThreeTest6() {
        System.out.println("classThreeTest6");
    }

    @Test
    public void classThreeTest7() {
        System.out.println("classThreeTest7");
    }

    @Test
    public void classThreeTest8() {
        System.out.println("classThreeTest8");
    }

    @Test
    public void classThreeTest9() {
        System.out.println("classThreeTest9");
    }

    @Test
    public void classThreeTest10() {
        System.out.println("classThreeTest10");
    }
}
