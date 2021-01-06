package java_ED_t4;

import java.util.Scanner;

public class vela_con_asteriscos {
	
 Scanner sc=new Scanner (System.in);

public static void main(String[] args) {
    
    
        int i,j,k;
    //i=1, comienza a contar desde 1, que i sea menor o igual, cada ciclo se le agrega 1.
    for (i=1;i<=5;i++){
        //Detro de este for, le damos valor a k
        //k=1
        for(j=1;j<=5-i;j++){
            System.out.print("");
        }
        for(k=1;k<=1+i-1;k++){
            System.out.print("*");
        }
            System.out.println("");
        
    }
}
}
//Merge 