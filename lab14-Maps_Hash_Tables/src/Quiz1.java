public class Quiz1 {
    public void main (String[] args) {

        //  Quiz 1
        UnsortedListMap list = new UnsortedListMap<>();
        // put(5, A) (Output: null)
        System.out.println(list.put(5, "A"));
        // put(7, B) (Output: null)
        System.out.println(list.put(7, "B"));
        // put(2, C) (Output: null)
        System.out.println(list.put(2, "C"));
        // put(2, E) (Output: C - demonstrates value replacement)
        System.out.println(list.put(2, "E"));

        // get(7) (Output: B)
        System.out.println(list.get(7));

        // remove(5) (Output: A)
        System.out.println(list.remove(5));

    }
}
