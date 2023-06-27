package am;


class FoolException extends Exception {
}

public class Sample2 {
    public static void sayNick(String nick) {
        if("fool".equals(nick)) {
        	throw new FoolException();
        	//throw 는 예외를 강제로 발생시킨다. 
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
        //Sample2 sample = new Sample2();
        sayNick("fool");
        sayNick("genious");
    }
}