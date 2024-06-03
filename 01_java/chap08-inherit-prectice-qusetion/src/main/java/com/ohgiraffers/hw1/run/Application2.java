package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeementDTO;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        EmployeementDTO[] employeementdto = new EmployeementDTO[10];

        // 사원들의 정보를 키보드로 입력 받고 (while)
        System.out.println("사원들의 정보를 입력하세요 : ");

        Scanner sc = new Scanner(System.in);
        String write = sc.next();
        String enter = sc.next();

        while(true){

            // 계속 추가할 것인지 물어보고, 대소문자 상관없이 'y'이면 계속 객체 추가
            System.out.println("계속 추가할 것인가요? : " + enter);

            if(enter.equals("y")){
                // 계속 추가할 것인지 물어보고, 대소문자 상관없이 'y'이면 계속 객체 추가
                System.out.println("계속 추가할 것인가요? : " + enter);
                System.out.println(employeementdto);
                // 한 명씩 추가 될 때 마다 카운트함

            } else if(enter.equals("n")){
                break;
            }
        }

        // 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
        employeementdto[0] = new EmployeementDTO("박보검",26,180.3,72.0,10000000,"영업부");
        employeementdto[1] = new EmployeementDTO("강동원",38,182.0,76.0,20000000,"기획부");
        // 현재 기록된 사원들의 정보를 모두 출력
        System.out.println("사원들의 정보 출력 : " + Arrays.toString(employeementdto));
    }
}
