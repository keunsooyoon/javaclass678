package am;

import java.util.HashMap;

public class ExamMap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();

		map.put("title","게시물 제목입니다");
		map.put("content","게시물 내용입니다");
		map.put("writer","홍길동");
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("writer"));
	}

}
