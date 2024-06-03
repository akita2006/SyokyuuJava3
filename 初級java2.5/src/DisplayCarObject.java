
public class DisplayCarObject extends MyFrame{
	public void run() {
		Car[] cars=new Car[5];
		
		cars[0] = new Car(30,30,1,0);		
		cars[1] = new Car(30,120,2,0);
		cars[2] = new Car(30,210,3,0);
		cars[3] = new Car(30,300,4,0);
		cars[4] = new Car(30,390,5,0);
		
		
		for(int i=0; i<60;i++) {
			clear();
			
			for(int j=0; j<cars.length; j++) {
				cars[j].draw(this);
				cars[j].move();
			}			
			
			sleep(0.1);
			
		}
	}


}
