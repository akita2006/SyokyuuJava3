
public class DisplayFaceObject extends MyFrame{
	public void run() {
		Face face1 = new Face(50,50);
		
		face1.draw(this);
		
		Face face2 = new Face(200,100);
		
		face2.draw(this);
		
		for(int i=0; i<30;i++) {
			clear();
			face1.draw(this);
			face2.draw(this);
			face1.x+=10;
			face1.y+=5;
			face2.x-=10;
			face2.y-=5;
			sleep(0.1);
		}
	}

}
