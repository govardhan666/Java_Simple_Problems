/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
class OnlyCharacterSwap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(Character.isDigit(str.charAt(i))){
                i++;
                
            }else{
                while(Character.isDigit(str.charAt(j))){
                    j++;
                }
                sb.setCharAt(i,str.charAt(j));
                sb.setCharAt(j,str.charAt(i));
                i++;
                j++;
            }
        }
        String res = sb.toString();
        System.out.println(res);
    }
}
