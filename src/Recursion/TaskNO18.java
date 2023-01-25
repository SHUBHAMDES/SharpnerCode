package Recursion;

public class TaskNO18 {
    public static void main(String[] args) {
        count(1);

    }
       static void  count(int i){
        if(i==6)return ;

         count(i+1);
           System.out.println(i);
    }
}
