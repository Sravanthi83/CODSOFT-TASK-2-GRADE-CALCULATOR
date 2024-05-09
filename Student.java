package Codsoft;
import java.util.*;
public class Student {
    public static void main(String args[]){
        @SuppressWarnings({ "resource" })
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter total no. of subjects:\n");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the marks secured in each subject:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int total = 0;
        for(int i=0;i<n;i++){
            total = total+arr[i];
        }
        System.out.println("total marks obtained="+total);
        float per;
        per = (total/(float)n);
        System.out.println("Total percetnage="+per+"%");
        if(per>90){
            System.out.println("Garde A");
        }
        else if(per>80 && per<90){
            System.out.println("Grade B");
        }
        else if(per>70 && per<80){
            System.out.println("Grade C");
        }
        else if(per>60 && per<70){
            System.out.println("Grade D");
        }
        else{
            System.out.println("fail");
        }
    }
    
}
