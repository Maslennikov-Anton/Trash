
import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.ListIterator;
import java.util.Iterator;

public class LinkedList<T> implements List<T> {

    private Item<T> first = null;

    private Item<T> last = null;

    private int size;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean contains(final Object o) {
        // BEGIN (write your solution here)
        if (o==null){
            for(Item<T> p =this.first;p!=null;p=p.next){
                if (p.getElement()==null){
                    return true;
                }
            }
        }else{
            for(Item<T> p =this.first;p!=null;p=p.next){
                if (o.equals(p.getElement())){
                    return true;
                }
            }
        }
        return false;
        // END
    }

    @Override
    public Iterator<T> iterator() {
        return new ElementsIterator();
    }

    @Override
    public Object[] toArray() {
        // BEGIN (write your solution here)
        Object[] a = new Object[this.size()];
        int w=0;

        for(Item<T> p =this.first;p!=null;p=p.next){
            a[w]=p;
            w++;
        }

        return a;
        // END
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        // BEGIN (write your solution here)
        T1[] b = (T1[]) new Object[this.size()];
        int w=0;

        for(Item<T> p =this.first;p!=null;p=p.next){
            b[w]=(T1)p.getElement();
            w++;
        }

        return b;
        // END
    }

    @Override
    public boolean add(final T t) {
        // BEGIN (write your solution here)
        Item<T> w=this.last;
        Item<T> newItem=new Item<T>(t,w,null);
        this.last=newItem;
        if (w==null){
            this.first=newItem;
        }else {
            w.next=newItem;
        }
        size++;

        return true;
        // END
    }

    @Override
    public boolean remove(final Object o) {
        // BEGIN (write your solution here)
        if (o==null) {
            for(Item<T> p =this.first;p!=null;p=p.next){
                if (p.getElement()==null){
                    Item<T> nextObj=p.getNext();
                    Item<T> prevObj=p.getPrev();

                    if (nextObj==null){
                        last=prevObj;
                        prevObj.next=null;
                        size--;
                        return true;
                    }
                    if (prevObj==null){
                        first=nextObj;
                        nextObj.prev=null;
                        size--;
                        return true;
                    }

                    nextObj.prev=prevObj;
                    prevObj.next=nextObj;
                    size--;
                    return true;
                }
            }
        } else {
            for(Item<T> p =this.first;p!=null;p=p.next){
                if (o.equals(p.getElement())){
                    Item<T> nextObj=p.getNext();
                    Item<T> prevObj=p.getPrev();

                    if (nextObj==null){
                        last=prevObj;
                        prevObj.next=null;
                        size--;
                        return true;
                    }
                    if (prevObj==null){
                        first=nextObj;
                        nextObj.prev=null;
                        size--;
                        return true;
                    }

                    nextObj.prev=prevObj;
                    prevObj.next=nextObj;
                    size--;
                    return true;
                }
            }
        }
        return false;
        // END
    }

    @Override
    public boolean containsAll(final Collection<?> c) {
        for (final Object item : c) {
            if (!this.contains(item)) return false;
        }
        return true;
    }

    @Override
    public boolean addAll(final Collection<? extends T> c) {
        for (final T item : c) {
            add(item);
        }
        return true;
    }

    @Override
    public boolean removeAll(final Collection<?> c) {
        for (final Object item : c) {
            remove(item);
        }
        return true;
    }

    @Override
    public boolean retainAll(final Collection<?> c) {
        for (final Object item : this) {
            if (!c.contains(item)) this.remove(item);
        }
        return true;
    }

    @Override
    public void clear() {
        // BEGIN (write your solution here)
        first = null;
        last = null;
        size=0;
        // END
    }

    @Override
    public T remove(final int index)  throws IndexOutOfBoundsException{
        // BEGIN (write your solution here)

        if (index<0 ||index>this.size()-1) throw new IndexOutOfBoundsException();

        int w=0;
        Item<T> p =this.first;

        for(;p!=null;p=p.next){
            if (index==w){
                Item<T> nextObj=p.getNext();
                Item<T> prevObj=p.getPrev();

                if (nextObj==null){
                    last=prevObj;
                    prevObj.next=null;
                    size--;
                    return p.getElement();
                }
                if (prevObj==null){
                    first=nextObj;
                    nextObj.prev=null;
                    size--;
                    return p.getElement();
                }

                nextObj.prev=prevObj;
                prevObj.next=nextObj;
                size--;
                return p.getElement();

            }
            w++;
        }
        return p.getElement();
        // END
    }

    // BEGIN (write your solution here)

    // END
    @Override
    public List<T> subList(final int start, final int end) {
        return null;
    }

    @Override
    public ListIterator listIterator() {
        return new ElementsIterator(0);
    }

    @Override
    public ListIterator listIterator(final int index) {
        return new ElementsIterator(index);
    }

    @Override
    public int lastIndexOf(final Object target) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(final Object target) {
        // BEGIN (write your solution here)
        int w=0;
        if (target==null){
            for (Item<T> p =this.first;p!=null;p=p.next){
                if (p.getElement()==null){
                    return w;
                }
                w++;
            }
        } else {
             for (Item<T> p =this.first;p!=null;p=p.next) {
                 if (target.equals(p.getElement())) {
                     return w;
                 }
                 w++;
             }
        }
        return -1;
        // END
    }

    @Override
    public void add(final int index, final T element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(final int index, final Collection elements) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T set(final int index, final T element) {
        // BEGIN (write your solution here)

        // END
    }

    @Override
    public T get(final int index) {
        // BEGIN (write your solution here)
        if (index<0 ||index>this.size()-1) throw new IndexOutOfBoundsException();

        int w=0;

        for (Item<T> p=first;p!=null;p=p.next){
            if (index==w){
                return p.getElement();
            }
            w++;
        }

        // END
    }

    // BEGIN (write your solution here)

    // END

    private class ElementsIterator implements ListIterator<T> {

        private Item<T> current;

        private Item<T> last;

        public ElementsIterator() {
            this(0);
        }

        public ElementsIterator(final int index) {
            // BEGIN (write your solution here)

            // END
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            // BEGIN (write your solution here)

            // END
        }

        @Override
        public void add(final T element) {
            LinkedList.this.add(element);
        }

        @Override
        public void set(final T element) {
            // BEGIN (write your solution here)

            // END
        }

        @Override
        public int previousIndex(){
            // BEGIN (write your solution here)

            // END
        }

        @Override
        public int nextIndex() {
            // BEGIN (write your solution here)

            // END
        }

        @Override
        public boolean hasPrevious() {
            // BEGIN (write your solution here)

            // END
        }

        @Override
        public T previous() {
            // BEGIN (write your solution here)

            // END
        }

        @Override
        public void remove() {
            // BEGIN (write your solution here)

            // END
        }

    }

    private static class Item<T> {

        private T element;

        private Item<T> next;

        private Item<T> prev;

        public Item(final T element, final Item<T> prev, final Item<T> next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public T getElement() {
            return element;
        }

        public Item<T> getNext() {
            return next;
        }

        public Item<T> getPrev() {
            return prev;
        }

    }

}
