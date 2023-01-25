package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Print_Permutation_of_String {
    static ArrayList<String> ans;

    public static void main(String[] args) {
        ans=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        f(str," ");
        System.out.println(ans);
    }
    public static void f(String init, String fin){
        if(init.length()==0){
            ans.add(fin);
            return;
        }
        for(int i=0;i<init.length();i++){
            String new_init=init.substring(0,i)+init.substring(i+1);
            String new_fin=new String(fin);
            new_fin=new_fin+init.charAt(i);
            f(new_init,new_fin);
        }
    }

}
