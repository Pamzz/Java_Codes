public class Array2D {
    public static void main(String[] args) {

        int[][] ar = new int[5][];
        for(int i=0;i<ar.length;i++){
//            System.out.println(ar[i]+" -> "+ar[i].length);//Null pointer exception
            System.out.println(ar[i]);
        }

        System.out.println("----------------------------------------------");

        //sub array with same sizes
        int[][] arr = new int[5][6];
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] +" -> " + arr[i].length);
        }

        System.out.println("---------------------------------------------");

        //we can create subarray with different sizes
        int[][] arr1 = new int[5][];
        arr1[0] = new int[5];
        arr1[1] = new int[10];
        arr1[2] = new int[15];
        arr1[3] = new int[20];
        arr1[4] = new int[25];
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" -> "+arr1[i].length);
            System.out.println();
        }


        System.out.println("---------------------------------------------");
        //2DArray Traversal with same col and same row size
        char[][] arr2 = {{'a','b','c','d'},
                         {'e','f','g','h'},
                         {'i','j','k','l'},
                         {'m','n','o','p'},
                         {'q','r','s','t'}};
        rowwise(arr2);
        colwise(arr2);
        spiralrowwise(arr2);
        spiralcolwise(arr2);

    }

    public static void rowwise(char[][] arr){
        System.out.println("Rowwise");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }


    public static void colwise(char[][] arr){
        System.out.println("---------------------------------------------");
        System.out.println("Colwise");
        for(int i=0;i<arr[i].length;i++){
            for( int j=0;j<arr.length;j++){
                System.out.print(arr[j][i] +" ");
            }
            System.out.println();
        }
    }

    public static void spiralrowwise(char[][] arr){
        System.out.println("---------------------------------------------");
        int oe = 0;
        int n = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(oe%2 == 0){
                    System.out.print(arr[i][n]+" ");
                    n++;

                }
                else{
                    n--;
                    System.out.print(arr[i][n]+" ");

                }

            }
            System.out.println();
            oe++;
        }

    }


    public static void spiralcolwise(char[][] arr){
        System.out.println("---------------------------------------------");
        int oe= 0;
        int n = 0;
        for(int i=0;i<arr[i].length;i++){
            for(int j=0;j<arr.length;j++){
                if(oe%2 == 0){
                    System.out.print(arr[n][i]+" ");
                    n++;
                }
                else{
                    n--;
                    System.out.print(arr[n][i]+" ");
                }
            }
            System.out.println();
            oe++;
        }

    }
}
