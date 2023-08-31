package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        // 포함관계
        System.out.println(s.contains("Java")); // 포함된다면 true/ 안되면 false

        System.out.println(s.contains("c#")); // 포함되지 않는다면 false
        System.out.println(s.indexOf("Java")); // 위치정보 7
        System.out.println(s.indexOf("c#")); // 포함되지 않는다면 -1
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치 정보
        System.out.println(s.lastIndexOf("and")); // 마지막에 일치하는 일치 정보
        System.out.println(s.startsWith("I like")); // 이 문자열로 실작하면 true 아니면 false
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true 아니면 false

    }
}
