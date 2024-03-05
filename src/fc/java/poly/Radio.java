package fc.java.poly;

public class Radio implements RemoCon{
    @Override
    public void chUp() {
        System.out.println("radio: ch up");
    }

    @Override
    public void chDown() {
        System.out.println("radio: ch down");
    }

    @Override
    public void voUp() {
        System.out.println("Radio: vol up");
    }

    @Override
    public void volDown() {
        System.out.println("radio: vol down");
    }

    @Override
    public void internet() {

        System.out.println("[internet] radio is not available ");
    }
    //chUp(), chDow(), volUp,volDown


}
