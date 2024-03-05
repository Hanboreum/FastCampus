package fc.java.poly;

public class Tv implements RemoCon{
    @Override
    public void chUp() {
        System.out.println("Tv: ch up");
    }

    @Override
    public void chDown() {
        System.out.println("Tv: ch wodn");
    }

    @Override
    public void voUp() {
        System.out.println("tv: volup");
    }

    @Override
    public void volDown() {
        System.out.println("tv: voldown");
    }

    @Override
    public void internet() {

        System.out.println("[internet] Tv is available ");
    }
    //chUp(), chDow(), volUp,volDown

}
