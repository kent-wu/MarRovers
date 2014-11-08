package robot;

public class Robot {
	public static int x_bound;
	public static int y_bound;
	public int x;
	public int y;
	public char direction;

	public String run(String orderString){
		char[] orders=orderString.toCharArray();
		for(char order : orders){
			order=Character.toUpperCase(order);
			if(order == 'L' || order == 'R'){
				this.turn(order);
			}else{
				this.move(order);
				if(this.checkError()){
					return "RIP";
				}
			}
		}
		return this.x+" "+this.y+" "+this.direction;
	}

	private void turn(char change){
		if(change=='L'){
            turnLeft();
        }else{
            turnRight();
        }
	}

    private void turnRight() {
        if(this.direction =='N'){
            this.direction ='E';
        }else if(this.direction =='S'){
            this.direction ='W';
        }else if(this.direction =='W'){
            this.direction ='N';
        }else if(this.direction =='E'){
            this.direction ='S';
        }
    }

    private void turnLeft() {
        if(this.direction =='N'){
            this.direction ='W';
        }else if(this.direction =='S'){
            this.direction ='E';
        }else if(this.direction =='W'){
            this.direction ='S';
        }else if(this.direction =='E'){
            this.direction ='N';
        }
    }

    private void move(char des){
        if(des == 'M'){
            moveForward();
        }else{
            moveBack();
        }
	}

    private void moveBack() {
        if(this.direction =='N'){
            this.y-=1;
        }else if(this.direction =='S'){
            this.y+=1;
        }else if(this.direction =='W'){
            this.x+=1;
        }else if(this.direction =='E'){
            this.x-=1;
        }
    }

    private void moveForward() {
        if(this.direction =='N'){
            this.y+=1;
        }else if(this.direction =='S'){
            this.y-=1;
        }else if(this.direction =='W'){
            this.x-=1;
        }else if(this.direction =='E'){
            this.x+=1;
        }
    }

    private boolean checkError(){
		if(this.x> x_bound || this.x<0 || this.y> y_bound || this.y<0){
			return true;
		}
		return false;
	}
}
