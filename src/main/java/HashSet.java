import java.util.*;

public class HashSet<T> implements Set<T> {

    private static final Boolean EXIST = true;

    private final Map<T, Boolean> elements = new HashMap<>();

    @Override
    public int size() {
        // BEGIN (write your solution here)
        return this.elements.size();
        // END
    }

    @Override
    public boolean isEmpty() {
        // BEGIN (write your solution here)
        return this.elements.size()==0;
        // END
    }

    @Override
    public boolean contains(Object o) {
        // BEGIN (write your solution here)
        return this.elements.containsKey(o);
        // END
    }

    @Override
    public Iterator<T> iterator() {
        // BEGIN (write your solution here)
        return this.elements.keySet().iterator();
        // END
    }

    @Override
    public Object[] toArray() {
        // BEGIN (write your solution here)
        return this.elements.keySet().toArray();
        // END
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        // BEGIN (write your solution here)
        return this.elements.keySet().toArray(a);
        // END
    }

    @Override
    public boolean add(T t) {
        // BEGIN (write your solution here)
        return this.elements.put(t,EXIST);
        // END
    }

    @Override
    public boolean remove(Object o) {
        // BEGIN (write your solution here)
        return this.elements.remove(o);
        // END
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // BEGIN (write your solution here)

        // END
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        // BEGIN (write your solution here)

        // END
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // BEGIN (write your solution here)

        // END
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // BEGIN (write your solution here)

        // END
    }

    @Override
    public void clear() {
        // BEGIN (write your solution here)
        this.elements.clear();
        // END
    }

}

