package fc.java.course2.part1;

public class StringCompare {
    public static void main(String[] args) {
        String str1 ="Hello";
        String str2 = "World";

        if(str1.equals(str2)){
            System.out.println("str1,str2는 같다");
        }else{
            System.out.println("같지 않음");
        }

        String str3 = "appple";
        String str4 ="banana";

        int result = str3.compareTo(str4); //0혹은 음수, 양수
        if(result == 0 ){
            System.out.println("str3, str4는 같다");
            }else if( result <0){
                System.out.println("음수, str3가 작다.");
        }else{
            System.out.println(" str3이 더 크다");
        }
    }
}
