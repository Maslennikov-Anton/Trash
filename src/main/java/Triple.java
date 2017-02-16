

public class Triple<T1,T2,T3> extends Tuple<T1,T3> {

    private final T2 middle;

    public Triple(T1 left,T2 middle, T3 right ) {
        super(left, right);
        this.middle = middle;
    }

    public T2 getMiddle() {
        return middle;
    }
}
