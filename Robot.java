package robot;

public class Robot {
	public int x_bound;
	public int y_bound;
	public int x;
	public int y;
	public char direction;

    public void turnRight() {
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

    public void turnLeft() {
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

    public void moveBack() {
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

    public void moveForward() {
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

    public boolean checkError(){
		if(this.x> x_bound || this.x<0 || this.y> y_bound || this.y<0){
			return true;
		}
		return false;
	}
}
