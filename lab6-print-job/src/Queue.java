public interface Queue<E> {

    public void add(E e);
    public E remove();
    public E peek();
}