
public class RectLoop extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x=30 ;
		int y=60 ;
		int z=10 ;
		for(int i=0; i<9; i++) {
			System.out.println(x);
			fillRect(x,y,10,z);	
			x+=20;			
			z+=20;
		}
		 
	}

}
