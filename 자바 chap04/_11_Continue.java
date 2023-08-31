package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 통오리 주문 손님중에 노쇼 손님이 있다고 가정
        // For
        int max = 20; // 최대 통오리 판매 수량
        int sold = 0; // 현재 통오리 판매 수량
        int noshow = 17; // 대기번호 17번 손님이 노쇼
        for (int i = 1; i < 50; i++) {
            System.out.println(i + " 번 손님, 주문하신 통오리 나왔습니다");

            // 손님이 없다면? (noshow)
            if (i == noshow) {
                System.out.println(i + " 번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }

            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println(" _-------------------");


        // While 문
        int index = 1; // 손님번호
        while (index <= 50) {
            System.out.println(index + " 번 손님 , 주문하신 통오리 나왔습니다.");

            // 손님이 없다면 (noshow)
            if (index == noshow) {
                System.out.println(index + " 번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                index++;
                continue;
            }


            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진 되었습니다");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
