package robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Client {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter your Boundary x and y:");
		Robot robot = initRobot(br);

        System.out.println("Enter your robot initial x,y and direstion:");
        initPosition(br, robot);

        while(true){
            System.out.println("Enter your Robot orders:");
            String orderString = br.readLine();
            System.out.println(robot.run(orderString));
        }
        
	}

    private static void initPosition(BufferedReader br, Robot robot) throws IOException {
        String strInitPos = null;
        strInitPos = br.readLine();
        String[] initPos=strInitPos.split(" ");

        robot.x=Integer.parseInt(initPos[0]);
        robot.y=Integer.parseInt(initPos[1]);
        robot.direction=Character.toUpperCase(initPos[2].charAt(0));
    }

    private static Robot initRobot(BufferedReader br) throws IOException {
        Robot robot = new Robot();

        String strBoundary = br.readLine();
        String[] boundaryArr=strBoundary.split(" ");
        if(!idDigit(boundaryArr[0]) || !idDigit(boundaryArr[1])){
        	System.out.println("Boundary x and y are must be digit,and input them again:");
        }
        robot.x_bound=Integer.parseInt(boundaryArr[0]);
        robot.y_bound=Integer.parseInt(boundaryArr[1]);

        return robot;

    }

    public static boolean idDigit(String str){
		Pattern pattern = Pattern.compile("[0-9]*");
	    return pattern.matcher(str).matches();
	}
}
