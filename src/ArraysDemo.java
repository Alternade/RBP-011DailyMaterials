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
        for (int i : arr){
            System.out.println(i);
        }

        //2d array
        int arr2[][][] = new int[3][3][3];
        arr2[0][0][0] = 1;
        arr2[0][0][1] = 2;
        arr2[0][0][2] = 3;
        arr2[0][1][0] = 4;
        arr2[0][1][1] = 5;
        arr2[0][1][2] = 6;
        arr2[0][2][0] = 7;
        arr2[0][2][1] = 8;
        arr2[0][2][2] = 9;
        arr2[1][0][0] = 10;
        arr2[1][0][1] = 11;
        arr2[1][0][2] = 12;
        arr2[1][1][0] = 13;
        arr2[1][1][1] = 14;
        arr2[1][1][2] = 15;
        arr2[1][2][0] = 16;
        arr2[1][2][1] = 17;
        arr2[1][2][2] = 18;
        arr2[2][0][0] = 19;
        arr2[2][0][1] = 20;
        arr2[2][0][2] = 21;
        arr2[2][1][0] = 22;
        arr2[2][1][1] = 23;
        arr2[2][1][2] = 24;
        arr2[2][2][0] = 25;
        arr2[2][2][1] = 26;
        arr2[2][2][2] = 27;

        //first loop is for row and 2nd is for column
        for (int[][] i : arr2 ){
            for(int j[] : i){
                for(int k : j){
                    System.out.print(k+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}


