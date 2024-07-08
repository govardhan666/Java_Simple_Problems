
package javaapplication1;

import java.util.Scanner;
class MinBoxes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int c = sc.nextInt();
        int sum = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum == c){
                count++;
                sum = 0;
            }
            if(sum>c){
                count++;
                sum = arr[i];
            }
        }
        if(sum !=0 && sum<c){
            count++;
        }
        System.out.println(count);
    }
}
