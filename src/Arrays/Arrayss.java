package Arrays;

import java.util.Scanner;

public class Arrayss {
    Scanner scanner = new Scanner(System.in);


   /* public void input(int[] a) {
        System.out.println("Please enter " + a.length + " elements:");
        for (int i = 0; i < a.length; i++)
            a[i] = scanner.nextInt();
    }
*/
    public void Traversal(int[] a) {
        System.out.println("****** The elements are:");
        for (int i = 0; i < a.length; i++)
            System.out.println("index[" + i + "] = " + a[i]);
    }

    public void update(int[] a, int index, int nvalue) {
        if (index < 0 || index >= a.length)
            System.out.println("Index not found");
        else
            a[index] = nvalue;
    }

    public void update(int[] a, int index) {
        if (index < 0 || index >= a.length)
            System.out.println("Index not found");
        else
            a[index] = 0;
    }
    public void shiftLeft_delete(int[] a, int index) {
        if (index < 0 || index >= a.length) {
            System.out.println("Index not found");
            return;
        }

        for (int i = index; i < a.length - 1; i++)
            a[i] = a[i + 1];

        a[a.length - 1] = Integer.MIN_VALUE;
    }

}
