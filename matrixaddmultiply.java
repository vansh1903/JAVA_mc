import java.util.Scanner;
public class AdditionMatrix {

    public static void main(String[] args) {
        int [][] a = new int[3][3];
        int [][] b = new int[3][3];
        int i ,j,choice;
        Scanner sc = new Scanner(System.in);
        for(i = 0;i<3;i++){
            for(j = 0;j<3;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(i = 0;i<3;i++){
            for(j = 0;j<3;j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("1.Add\n2.Multiply\nEnter your choice:");
        choice = sc.nextInt();
        switch(choice){
            case 1: int [][] add = new int[3][3];
                    for(i = 0;i<3;i++){
                        for(j = 0;j<3;j++){
                            add[i][j] = a[i][j] + b[i][j];
                            System.out.print(add[i][j]+" ");
                        }
                    }
            case 2: int [][] multiply = new int[3][3];
                    for(i = 0;i<3;i++){
                        for(j = 0;j<3;j++){
                            for (int k=0;k<3;k++) {
                                multiply[i][j] = multiply[i][j] + (a[i][k] * b[k][j]);
                            }
                            System.out.print(multiply[i][j] + " ");
                        }
                    }
        }
    }
}
