import java.util.Vector;

 class DisplayCarVector extends MyFrame {

	public void run () {
		Vector<Car> cars=new Vector<Car>();
		cars.add(new Car(50,50,10,5));
		cars.add(new Car(200,100,-10,-5));
		
		for(int i=0;i<30;i++) {
			clear();
			for(int j=0;j<cars.size();j++) {
				cars.get(j).draw(this);
				cars.get(j).move();
			}
			sleep(0.1);
		}
	}
}
 