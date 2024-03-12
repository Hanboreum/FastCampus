package fc.java.model2;

@FunctionalInterface
public interface Convert <F, T> {
    T convert(F from);
}
