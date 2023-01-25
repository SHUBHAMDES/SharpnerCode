package Recursion;



public class TaskNo21 {
    public static void main(String[] args) {
        count(0);
    }
    static void count(int i){

        if(i==30)return;
        System.out.print(i+" ");
        count(i+5);

    }
}
