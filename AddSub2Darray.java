import java.util.Scanner;
public class AddSub2Darray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter no. of columns: ");
        int columns = sc.nextInt();
        int a[][]= new int [rows][columns];
        int b[][]=new int[rows][columns];
        System.out.println("enter elements into first matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter elements into seond matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                b[i][j]=sc.nextInt();
            }
        }
        //addition
        int[][] x=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                x[i][j]=a[i][j]+b[i][j];
            }
        }
        //subtraction
        int[][] y=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                y[i][j]=a[i][j]-b[i][j];
            }
        }
        System.out.println("elements in first matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("elements in second matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(" sum of two matrices: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("subtraction of two matrices: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(y[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}