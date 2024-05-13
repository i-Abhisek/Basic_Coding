import java.util.*;
/**
 * Sum_First_N_NaturalNos
 */
public class Sum_First_N_NaturalNos {

    public static void main(String[] args) {
        int n =10;
        System.out.println(n * (n + 1) /2 );
    }
}

//Using Recursion
/*
 import java.util.*;
 public class Sum_First_N_NaturalNos
 {
    public static void main(String[] args)  {
        int n;
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        numbers = sc.next();
        System.out.println("Sum of Natural Nodes:"+ Sum(n));
    }

    public static int Sum(int value) {
        if(value==0) 
        return 0;
        return value + Sum(value-1);
    }
 }
 */