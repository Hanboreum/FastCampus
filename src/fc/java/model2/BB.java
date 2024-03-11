package fc.java.model2;
//bb는 노출하지 않는다.(BB>class)(BB.java X)
public class BB implements CC{

    @Override
    public void x() {
        System.out.println("x");
    }

    @Override
    public void y() {
        System.out.println("y");
    }

    @Override
    public void z() {
        System.out.println("z");
    }
}
