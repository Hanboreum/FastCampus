package fc.java.model2;
// generic 코드의 유연성, 재사용성, 타입의 안전성을 보장
public class Pair <K, V>{
    private K key;
    private V value; //타입 아직 결정 안됨

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
        //초기화
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
