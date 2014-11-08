package robot;

import junit.framework.Assert;

/**
 * Created by twer on 11/8/14.
 */
public class RobotTest {
    @org.junit.Test
    public void testControlRight() throws Exception {
        Robot r=new Robot();
        r.x_bound =5;
        r.y_bound =5;
        r.x=1;
        r.y=2;
        r.direction ='N';


        String result=r.run("LMLMLMLMM");

        Assert.assertEquals("1 3 N", result);



    }

    @org.junit.Test
    public void testControlRightAnother() throws Exception {
        Robot r=new Robot();
        r.x_bound =5;
        r.y_bound =5;
        r.x=3;
        r.y=3;
        r.direction ='E';


        String result=r.run("MMRMMRMRRM");

        Assert.assertEquals("5 1 E", result);



    }

    @org.junit.Test
    public void testControlError() throws Exception {
        Robot r=new Robot();
        r.x_bound =5;
        r.y_bound =5;
        r.x=4;
        r.y=5;
        r.direction ='N';


        String result=r.run("MMM");

        Assert.assertEquals("RIP", result);



    }

    @org.junit.Test
    public void testControlBack() throws Exception {
        Robot r=new Robot();
        r.x_bound =5;
        r.y_bound =5;
        r.x=1;
        r.y=2;
        r.direction ='N';


        String result=r.run("MMB");

        Assert.assertEquals("1 3 N", result);



    }
}
