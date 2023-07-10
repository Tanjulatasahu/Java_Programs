package array_Program;
// In matrix multiplication that is matrix1=r1*c1     matrix2=r2*c2
//  c1==r2  and the resultant matrix should be    r1*c2

import java.util.Scanner;


public class Mul_Matrix {
    public  static int[][] mulMatrix(int[][] m1,int r1,int c1, int[][] m2,int r2,int c2){
        int[][] mulNum=new int[r1][c2];
        for(int i=0; i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    mulNum[i][j]+= m1[i][k]*m2[k][j];
                }
            }
        }
         return mulNum;
    }

    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimension of matrix 1");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] matrix1=new int[r1][c1];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }

        System.out.println();

        System.out.println("Enter the dimension of matrix 2");

        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] matrix2=new int[r2][c2];

        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }

        int[][] mul=mulMatrix(matrix1,r1,c1,matrix2,r2,c2);
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(mul[i][j]+ " ");
            }
            System.out.println();
        }

    }

}
