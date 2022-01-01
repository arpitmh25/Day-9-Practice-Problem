package com.bridgelabz.day13;

public class MaximumThree {
    public static void main(String[] args) {
        System.out.println("Will find Maximum Among three Numbers");
        Integer n1 = 10, n2 = 20, n3 = 30;
        System.out.println(findMaxAmongThree(n1, n2, n3));
    }

    private static <T extends Comparable<T>> T findMaxAmongThree(T n1, T n2, T n3) {
        if (n1.compareTo(n2) > 0 && (n1.compareTo(n3) > 0)) {
            return n1;
        } else if (n2.compareTo(n3) > 0 && (n2.compareTo(n1) > 0)) {
            return n2;
        } else {
            return n3;
        }
    }
}
