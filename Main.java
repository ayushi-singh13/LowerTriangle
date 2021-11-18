package com.thoughtworksProgram;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner=new Scanner(System.in);

        int row=scanner.nextInt();

        int[][] matrix=new int[row][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++)
                matrix[i][j]=scanner.nextInt();
        }
        boolean isAllZero=true;
        for(int i=0;i<row;i++){
            for(int j=i+1;j<row;j++){
                if(matrix[i][j]!=0){
                    isAllZero=false;
                    break;
                }
            }

        }
        if(isAllZero)
            System.out.println("yes");
        else
            System.out.println("no");

    }
}
