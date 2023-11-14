package Project2;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Microwave mw = new Microwave();
        int time;
        int watt;
        int select;
        while (true) {
            System.out.print("\n1. 계란찜, 2. 라면끓이기, 3. 감자삶기, 4. 시간(초) 설정, 5. 소비 전력(W) 설정, 6. 조리 시작, 기타. 종료\n메뉴 선택> ");
            select = sc.nextInt();
            switch (select) {
                case 1:
                case 2:
                case 3:
                    mw.setting(select);
                    break;
                case 4:
                    System.out.print("입력값 (1~900)> ");
                    time = sc.nextInt();
                    if (time < 1 || time > 900)
                        System.out.println("유효한 요리 시간(초)이 설정되어야 합니다.");
                    else
                        mw.setTime(time);
                    break;
                case 5:
                    System.out.print("입력값 (200, 500, 700, 1000 중 하나)> ");
                    watt = sc.nextInt();
                    if (watt == 200 || watt == 500 || watt == 700 || watt == 1000)
                        mw.setWatt(watt);
                    else
                        System.out.println("소비 전력(W)은 200, 500, 700, 1000만 지원합니다.");
                    break;
                case 6:
                    mw.start();
                    break;
                default:
                    mw.off();
                    break;
            }
        }
    }
}
