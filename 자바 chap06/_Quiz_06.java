package chap_06;


// 힌트
// substring
// length()


public class _Quiz_06 {
    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0,index); // 제갈준 -> 제
        //for (int i = index; i < data.length(); i ++)
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*"; // 제**
        }
        return hiddenData;
    }


    public static void main(String[] args) {
        String name = "제갈준";
        String id = "040321-1234567";
        String phone = "010-2931-7777";

        System.out.println("이름 :" + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
