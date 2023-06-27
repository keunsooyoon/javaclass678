package am;

class FoolException extends Exception {
}

public class Sample3 {
    public void sayNick(String nick) throws FoolException {
//        try {
            if("fool".equals(nick)) {
                throw new FoolException();
            }
             System.out.println("당신의 별명은 "+nick+" 입니다.");
//        }catch(FoolException e) {
//            System.err.println("FoolException이 발생했습니다.");
//        }
    }

    public static void main(String[] args) {
        Sample3 sample = new Sample3();
        
        try {
	       // sample.sayNick("fool");
	        sample.sayNick("genious");
        }catch(FoolException e) {
        	System.err.println("FoolException이 발생했습니다.");
        }
    }
}