package Example7;

import java.util.Scanner;

public class Ex7_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = {"가위", "바위", "보"};

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        while (true) {
            System.out.print("가위 바위 보! (종료하려면 '그만' 입력)>>");
            String option = sc.next();

            if (option.equals("그만")) {
                System.out.println("게임을 종료합니다.");
                break;
            }

            // 사용자의 선택과 컴퓨터1, 컴퓨터2의 선택
            int userIndex = getIndex(option);
            int computer1Index = (int) (Math.random() * 3);
            int computer2Index = (int) (Math.random() * 3);

            System.out.println("사용자 = " + option + ", 컴퓨터1 = " + str[computer1Index] + ", 컴퓨터2 = " + str[computer2Index]);

            // 승부 결정
            determineWinner(option, str[computer1Index], str[computer2Index]);
        }
        sc.close();
    }

    // 선택한 문자열에 대응하는 인덱스 반환
    public static int getIndex(String option) {
        switch (option) {
            case "가위":
                return 0;
            case "바위":
                return 1;
            case "보":
                return 2;
            default:
                return -1;
        }
    }

    // 승부 결정 및 출력
    public static void determineWinner(String userOption, String computer1Option, String computer2Option) {
        if (userOption.equals(computer1Option) && userOption.equals(computer2Option)) {
            System.out.println("비겼습니다.");
        } else if (!userOption.equals(computer1Option) && !userOption.equals(computer2Option) && !computer1Option.equals(computer2Option)) {
            System.out.println("비겼습니다.");
        } else if (!userOption.equals("가위") && !computer1Option.equals("가위") && !computer2Option.equals("가위")) {
            if (userOption.equals("보")) {
                System.out.println("사용자가 이겼습니다.");
            }
            if (computer1Option.equals("보")) {
                System.out.println("com1가 이겼습니다.");
            }
            if (computer2Option.equals("보")) {
                System.out.println("com2가 이겼습니다.");
            }
        } else if (!userOption.equals("바위") && !computer1Option.equals("바위") && !computer2Option.equals("바위")) {
            if (userOption.equals("가위")) {
                System.out.println("사용자가 이겼습니다.");
            }
            if (computer1Option.equals("가위")) {
                System.out.println("com1가 이겼습니다.");
            }
            if (computer2Option.equals("가위")) {
                System.out.println("com2가 이겼습니다.");
            }
        } else if (!userOption.equals("보") && !computer1Option.equals("보") && !computer2Option.equals("보")) {
            if (userOption.equals("바위")) {
                System.out.println("사용자가 이겼습니다.");
            }
            if (computer1Option.equals("바위")) {
                System.out.println("com1가 이겼습니다.");
            }
            if (computer2Option.equals("바위")) {
                System.out.println("com2가 이겼습니다.");
            }
        }
    }
}


/*

import static java.lang.System.out;
import static java.lang.Math.*;

class Ex7_06 {
    public static void main(String[] args){
        out.println(random());

        out.println("Math.PI :" + PI);
    }
}
*/