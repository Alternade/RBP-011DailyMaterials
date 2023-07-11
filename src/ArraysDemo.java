public class ArraysDemo {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 10;
        arr[1] = 190;
        arr[2] = 190;
        arr[3] = 130;
        arr[4] = 140;
        arr[5] = 150;
        arr[6] = 160;
        arr[7] = 170;
        arr[8] = 180;
        arr[9] = 120;

        //2d array
        int arr2[][] = new int[3][3];
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;
        arr2[1][0] = 4;
        arr2[1][1] = 5;
        arr2[1][2] = 6;
        arr2[2][0] = 7;
        arr2[2][1] = 8;
        arr2[2][2] = 9;
        //first loop is for row and 2nd is for column
        for (int i= 0 ; i<3 ;i++ ){
            for (int j = 0;j<3; j++){
                System.out.print(arr2[i][j] +"\t");
            }
            System.out.println();
        }


    }
}


