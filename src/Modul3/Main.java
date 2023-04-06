package Modul3;

public class Main {
    public static void main(String[] args) {
        StackWithoutLib stck = new StackWithoutLib(4);
        stck.push("Aku");
        stck.push("Anak");
        stck.push("Indonesia");

        System.out.println("Element top is: " + stck.peek());
        stck.push("Raya");
        System.out.println("Element removed is : " + stck.pop());
        stck.push("!");
        int count = stck.search("Aku");
        while (count != -1 && count > 1){
            stck.pop();
            count--;
        }
        System.out.println("Element removed is : " + stck.pop());
        System.out.println("Stack is empty: "+ stck.isEmpty());
    }
}
