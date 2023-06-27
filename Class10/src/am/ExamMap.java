package am;

import java.util.HashMap;

public class ExamMap {

	public static void main(String[] args) {
		// Map : 데이터를 키값과 밸류값 쌍으로 다루는 자료형이다. 
		//       타 언어의  JS 에서는 json, 파이썬에서는 딕셔너리라고 부른다. 
		
		//HsahMap
		
		//위쪽에서 임포트 후에 사용한다. 
		//import java.util.HashMap;
		
		HashMap<String, String> map = new HashMap<>();
		
		// 데이터 넣기 put
		
		map.put("제목", "환영합니다."); // map 데이터 넣기
		map.put("내용", "신입생 환영회"); // map 데이터 넣기
		map.put("작성자", "과대"); // map 데이터 넣기
		
		
		// 데이터 꺼내기 get
		
		System.out.println(map.get("제목"));
		System.out.println(map.get("내용"));
		System.out.println(map.get("작성자"));
		
		// 학생들의 점수를 맵으로 만들어 보세요
		// 홍길동 80, 이몽룡 75, 성춘향 95
		
		HashMap<String, Integer> score = new HashMap<>();
		score.put ("홍길동", 80);
		score.put ("이몽룡", 75);
		score.put ("성춘향", 95);
		
		System.out.println(score.get("홍길동"));
		

	}

}
