package fc.java.model;

public class CarDAO {
    //CRUD
    public void carInsert(CarDTO car){
        System.out.println("car 정보가 DB에 저장됨");
    }
    public void carSelect(){
        //db connected select sql
        System.out.println("db정보가 출력 됨");
    }
}
