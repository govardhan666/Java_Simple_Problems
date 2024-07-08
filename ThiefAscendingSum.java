/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
class ThiefAscendingSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int tempMax = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                tempMax +=arr[i];
            }else{
                tempMax = arr[i];
            }
            max = Math.max(tempMax,max);
        }
        System.out.println(max);
    }
}
