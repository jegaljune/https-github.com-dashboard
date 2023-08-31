package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "제갈 개발자";
        int hour = 15;



        System.out.println( name + "님, 배송이 시작됩니다. "+  hour  +"시에 방문 예정입니다");
        System.out.println( name + "님, 배송이 완료되었습니다.");


        double score = 90.5;
        char grade = 'A';
        name = "제갈준";


        System.out.println(name + "님의 평균 점수는" + score + "점 입니다");
        System.out.println("학점은" + grade + "입니다.");
        boolean pass = false;
        System.out.println("이번시험에 합격 했을까요?" + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000l;
        l = 1_0000_0000_0000l;
        System.out.println(l);

        // int , long, float, double, char, string, boolean 단어 중요
    }
}
