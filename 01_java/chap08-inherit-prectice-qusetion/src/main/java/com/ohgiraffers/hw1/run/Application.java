package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeementDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
        StudentDTO[] stduentdto = new StudentDTO[3];

        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        stduentdto[0] = new StudentDTO("홍길동",20, 178.2, 70.0, 1, "정보시스템공학과");
        stduentdto[1] = new StudentDTO("김말똥",21, 187.3, 80.0, 2, "경영학과");
        stduentdto[2] = new StudentDTO("강개순",23, 167.0, 45.0, 4, "정보통신공학과");

        // 위의 학생 정보 모두 출력 (향상된 for문 )
        for(Object obj : stduentdto){
            System.out.println("학생의 정보: " + obj);
        }

        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        EmployeementDTO[] employeementdto = new EmployeementDTO[10];
        // 사원들의 정보를 키보드로 입력 받고 (while)

        Scanner sc = new Scanner(System.in);
        sc.next();

        while( ){
            System.out.println("사원들의 정보를 입력하세요 : " + employeementdto);
            // 계속 추가할 것인지 물어보고, 대소문자 상관없이 'y'이면 계속 객체 추가
            System.out.println("계속 추가할 것인가요? : " + enter);
            if(enter = 'y'){
                // 한 명씩 추가 될 때 마다 카운트함

            } else {
                return;
            }
        }

        // 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
        employeementdto[0] = new EmployeementDTO("박보검",26,180.3,72.0,10000000,"영업부");
        employeementdto[1] = new EmployeementDTO("강동원",38,182.0,76.0,20000000,"기획부");
        // 현재 기록된 사원들의 정보를 모두 출력
        System.out.println("사원들의 정보 출력 : " + employeementdto);
    }
}
