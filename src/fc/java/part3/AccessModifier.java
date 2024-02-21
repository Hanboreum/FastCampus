package fc.java.part3;

import fc.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
       MemberDTO dto = new MemberDTO();
       dto.name="kim";
       dto.phone="12340987";
       //dto.age =12 에러발생.
        System.out.println(dto.name+"\t"+dto.phone+"\t");
        dto.play();
    }
}

