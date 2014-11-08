package robot;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Client {
	//����ָ��ʱ�������д����ĸ��Сд
	public static void main(String[] args) throws Exception {
		int initx=0;
		int inity=0;
		int boundaryX=0;
		int boundaryY=0;
		Robot r=new Robot();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String strBoundary = null; 
        System.out.println("Enter your Boundary x and y:"); 
        strBoundary = br.readLine();
        String[] boundaryArr=strBoundary.split(" ");
        if(!idDigit(boundaryArr[0]) || !idDigit(boundaryArr[1])){
        	System.out.println("Boundary x and y are must be digit,and input them again:"); 
        	//��������Ĵ���
        }
        //��ʼ���߽��
        Robot.X=Integer.parseInt(boundaryArr[0]);
        Robot.Y=Integer.parseInt(boundaryArr[1]);
        String strInitPos = null; 
        System.out.println("Enter your robot initial x,y and direstion:"); 
        strInitPos = br.readLine();
        String[] initPos=strInitPos.split(" ");
        //����������Ϸ��ԵĴ���
        
        //��ʼ����ǰRobot��λ��
        r.x=Integer.parseInt(initPos[0]);
        r.y=Integer.parseInt(initPos[1]);
        r.dir=Character.toUpperCase(initPos[2].charAt(0));
        //��ÿ��ƶ���
        String strOrder = null; 
        while(true){
        	
            System.out.println("Enter your Robot orders:"); 
            strOrder = br.readLine();
            //�����������Ϸ��Լ��
            String result=r.control(strOrder);
            System.out.println(result);
            if("RIP".equals(result)){
            	System.exit(0);
            }
        }
        
	}

	public static boolean idDigit(String str){
		Pattern pattern = Pattern.compile("[0-9]*");
	    return pattern.matcher(str).matches();
	}
}