
public class RectLoop extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x=20 ;
		int y=50 ;
		int a=10;
		int b=10;
		for(int i=0; i<15; i++) {
			System.out.println(x);
			fillRect(x,y,a,b);	
			x+=a;
			y+=a;
			a+=10;
			b+=20;
		}
		
	}

}
