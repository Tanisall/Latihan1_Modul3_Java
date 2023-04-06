package Modul3;

import java.util.Arrays;

public class StackWithoutLib {
    private static String[] stackArray;
    private int top;

    public StackWithoutLib(int maxSize){
        stackArray = new String[maxSize];
        top = -1;
    }

    public void data(){
        for (int i = 0; i < stackArray.length; i++)
            System.out.println("Element at index " + i
                    + " : " + stackArray[i]);
    }

    public void push(String j){
        stackArray[++top] = j;
    }
    public String pop(){
        return stackArray[top--];
    }
    public String peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public static String[] reverse() {
        StringBuilder reversed = new StringBuilder();
        for (int i = stackArray.length; i > 0; i--) {
            reversed.append(stackArray[i - 1]).append(" ");
        };
        String[] reversedArray = reversed.toString().split(" ");
        return reversedArray;
    }
    public int search(String j){
        int found = Arrays.asList(reverse()).indexOf(j);
       return found+1;
    }
}
