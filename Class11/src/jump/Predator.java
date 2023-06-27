package jump;

abstract class Predator extends Animal {

	abstract String getFood();
	
	void printFood() {  // default 를 제거한다.
        System.out.printf("my food is %s\n", getFood());
    }
	
    static int LEG_COUNT = 4;  // 추상 클래스의 상수는 static 선언이 필요하다.
    
    static int speed() {
        return LEG_COUNT * 30;
    }
    
}
