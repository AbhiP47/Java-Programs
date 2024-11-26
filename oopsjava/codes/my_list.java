/**
 * File: my_list.java
 * Created Time: 2022-11-25
 * Author: krahets (krahets@163.com)
 */

package oopsjava.codes;

import java.util.*;

/* List Class */
class MyList {
    private int[] arr; // Array (stores list elements)
    private int capacity = 10; // List capacity
    private int size = 0; // List length (current number of elements)
    private int extendRatio = 2; // Expansion ratio (multiplier for capacity increase)

    /* Constructor */
    public MyList() {
        arr = new int[capacity];
    }

    /* Get the list length (current number of elements) */
    public int size() {
        return size;
    }

    /* Get the list capacity */
    public int capacity() {
        return capacity;
    }

    /* Access element */
    public int get(int index) {
        // Throw an exception if the index is out of bounds
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds");
        return arr[index];
    }

    /* Update element */
    public void set(int index, int num) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds");
        arr[index] = num;
    }

    /* Add element at the end */
    public void add(int num) {
        // Trigger the expansion mechanism if the number of elements exceeds capacity
        if (size == capacity())
            extendCapacity();
        arr[size] = num;
        // Update the element count
        size++;
    }

    /* Insert element at a specific index */
    public void insert(int index, int num) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds");
        // Trigger the expansion mechanism if the number of elements exceeds capacity
        if (size == capacity())
            extendCapacity();
        // Move elements starting from index to the right by one position
        for (int j = size - 1; j >= index; j--) {
            arr[j + 1] = arr[j];
        }
        arr[index] = num;
        // Update the element count
        size++;
    }

    /* Remove element at a specific index */
    public int remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds");
        int num = arr[index];
        // Move elements after index one position to the left
        for (int j = index; j < size - 1; j++) {
            arr[j] = arr[j + 1];
        }
        // Update the element count
        size--;
        // Return the removed element
        return num;
    }

    /* List expansion mechanism */
    public void extendCapacity() {
        // Create a new array with a length that is extendRatio times the original array
        // Copy the original array to the new array
        arr = Arrays.copyOf(arr, capacity() * extendRatio);
        // Update the list capacity
        capacity = arr.length;
    }

    /* Convert the list to an array */
    public int[] toArray() {
        int size = size();
        // Convert only the valid range of elements
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = get(i);
        }
        return arr;
    }
}

public class my_list {
    /* Driver Code */
    public static void main(String[] args) {
        /* Initialize the list */
        MyList nums = new MyList();

        /* Add elements at the end */
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(5);
        nums.add(4);
        System.out.println("List nums = " + Arrays.toString(nums.toArray()) +
                " , Capacity = " + nums.capacity() + " , Length = " + nums.size());

        /* Insert element at a specific index */
        nums.insert(3, 6);
        System.out.println("Inserted number 6 at index 3, resulting in nums = " + Arrays.toString(nums.toArray()));

        /* Remove element */
        nums.remove(3);
        System.out.println("Removed element at index 3, resulting in nums = " + Arrays.toString(nums.toArray()));

        /* Access element */
        int num = nums.get(1);
        System.out.println("Accessed element at index 1, got num = " + num);

        /* Update element */
        nums.set(1, 0);
        System.out.println("Updated element at index 1 to 0, resulting in nums = " + Arrays.toString(nums.toArray()));

        /* Test the expansion mechanism */
        for (int i = 0; i < 10; i++) {
            // At i = 5, the list length will exceed capacity, triggering the expansion mechanism
            nums.add(i);
        }
        System.out.println("List after expansion nums = " + Arrays.toString(nums.toArray()) +
                " , Capacity = " + nums.capacity() + " , Length = " + nums.size());
    }
}
