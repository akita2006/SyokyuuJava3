
public class RectLoop extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x=30;
		int y=60;
		int a=20;
		int b=20;
		for(int i=0; i<9; i++) {
			System.out.println(x);				
			fillRect(x,y,a,b);	
			x+=a;
			y+=a;
			a+=10;
			b+=10;
			
		}
		 
	}

}
