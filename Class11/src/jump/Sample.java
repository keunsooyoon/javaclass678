package jump;

public class Sample {

	public static void main(String[] args) {
       
		ZooKeeper zooKeeper = new ZooKeeper();
//        Tiger tiger = new Tiger();
//        Lion lion = new Lion();
//        Croc croc = new Croc();
		
//      Predator tiger = new Tiger();
//      Predator lion = new Lion();
//        zooKeeper.feed(tiger); 
//        zooKeeper.feed(lion);  
//      Predator croc = new Croc();
//      	zooKeeper.feed(croc);
      	
		
        Barkable tiger = new Tiger();
        Barkable lion = new Lion();
      	Bouncer bouncer = new Bouncer();
      	bouncer.barkAnimal(tiger);
      	bouncer.barkAnimal(lion);
	}

}
