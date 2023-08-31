package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {

        String id = "040321-1234567";
        System.out.println(id.substring(0,8)); // 결과 값 - 040321-1

        id = "041105-1234567";
        System.out.println(id.substring(0,id.indexOf("-")+2)); // 결과 값 - 041105-1



    }
}
