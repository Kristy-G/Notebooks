package Lesson3;

public class MainDeque {
    public static void main(String[] args) {
        DequeClass<Integer> dc = new DequeClass<Integer>(10);
        dc.insertLeft(5);
        dc.insertRight(8);
        dc.insertRight(12);
        dc.insertLeft(7);
        dc.insertRight(3);
        dc.display();
        dc.removeLeft();
        dc.display();
        dc.removeRight();
        dc.display();
        System.out.println(dc.peekFront());
        System.out.println(dc.peekBack());
    }
}
