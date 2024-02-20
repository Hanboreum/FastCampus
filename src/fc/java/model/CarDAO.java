package fc.java.model;

public class CarDAO {
    //CRUD 기능이 있는 곳
    public void carInsert(CarDTO car){
        //db얀결
        System.out.println("정보가 db에 연결됨");
    }
    public void carSelect(){
        //DB연결 가져오기 select
        System.out.println("car info print");
    }
    public void carDelete(){
        System.out.println("car info delete");
    }
}
