
public class Car {
	int x,y,vx,vy;
	public Car(int x,int y) {
		this.x=x;
		this.y=y;
		
	}
	
	public void draw(MyFrame frame){
		frame.fillRect(x,y,40,30);		
		frame.fillRect(x-30,y+30,100,30);
		frame.fillOval(x-15,y+60,30,30);
		frame.fillOval(x+30,y+60,30,30);
		
	}
	
	public void move() {
		x+=10;
		
	}
	public void move2() {
		x-=10;
	}

}
