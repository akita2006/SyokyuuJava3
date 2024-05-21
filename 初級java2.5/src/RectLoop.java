
public class RectLoop extends MyFrame{
	public void run() {
		int r=0;
		int g=0;
		int b=0;
		int x=30 ;	
		for(int i=0; i<9; i++) {
			System.out.println(x);			
			setColor(r,g,b);
			fillRect(x,60,10,100);	
			x+=20;
			r+=13;
			g+=13;
			b+=13;			
		}
		 
	}

}
