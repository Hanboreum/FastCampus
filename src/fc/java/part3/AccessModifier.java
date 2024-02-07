package fc.java.part3;

import fc.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO dto =new MemberDTO();
        dto.name ="Lee";;
        dto.age = 32;
        dto.phone = "123456789";
        System.out.println(dto.name+"\t"+dto.age+"\t"+dto.phone);
        dto.play();
    }
}

