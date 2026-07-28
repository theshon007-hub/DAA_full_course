import java.io.*;
import java.util.*;
class Experiment05_MatrixMutiplication{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] c = new int[2][2];
        System.out.println("Enter the elements of matrix A :");
        for(int i = 0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix B :");
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                b[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                c[i][j] = 0;
                for(int k = 0;k<2;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}