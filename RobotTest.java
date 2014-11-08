package robot;

import junit.framework.Assert;

/**
 * Created by twer on 11/8/14.
 */
public class RobotTest {
    @org.junit.Test
    public void testControlRight() throws Exception {
        Robot robot=new Robot();
        robot.x_bound =5;
        robot.y_bound =5;
        robot.x=1;
        robot.y=2;
        robot.direction ='N';
        char[] commands = "LMLMLMLMM".toCharArray();

        String result = Client.excuteCommand(robot, commands);

        Assert.assertEquals("1 3 N", result);



    }

    @org.junit.Test
    public void testControlRightAnother() throws Exception {
        Robot robot=new Robot();
        robot.x_bound =5;
        robot.y_bound =5;
        robot.x=3;
        robot.y=3;
        robot.direction ='E';
        char[] commands = "MMRMMRMRRM".toCharArray();

        String result = Client.excuteCommand(robot, commands);

        Assert.assertEquals("5 1 E", result);



    }

    @org.junit.Test
    public void testControlError() throws Exception {
        Robot robot=new Robot();
        robot.x_bound =5;
        robot.y_bound =5;
        robot.x=4;
        robot.y=5;
        robot.direction ='N';
        char[] commands = "MMM".toCharArray();

        String result = Client.excuteCommand(robot, commands);

        Assert.assertEquals("RIP", result);



    }

    @org.junit.Test
    public void testControlBack() throws Exception {
        Robot robot=new Robot();
        robot.x_bound =5;
        robot.y_bound =5;
        robot.x=1;
        robot.y=2;
        robot.direction ='N';
        char[] commands = "MMB".toCharArray();

        String result = Client.excuteCommand(robot, commands);

        Assert.assertEquals("1 3 N", result);



    }
}
