package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.StudentDTO;

public class Application1 {
    public static void main(String[] args) {
        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
        StudentDTO[] stduentdto = new StudentDTO[3];

        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        stduentdto[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        stduentdto[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        stduentdto[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        // 위의 학생 정보 모두 출력 (향상된 for문 )
        for (Object obj : stduentdto) {
            System.out.println("학생의 정보: " + obj);
        }

    }
}
