//to make the code align .. alt+shift+f

public class JavaApplication1 {

    public static void main(String[] args) {
        
        int[] arr1 = {2, 2, 4, 5, 1, 7};
        int[][] arr2 = {{2, 1, 4, 0}, {3, 0, 6, 2}, {3, 4, 6, 0}};
        //max for 1d array
        int max1 = arr1[0];
        for (int i = 0; i < 6; i++) {
            if (arr1[i] > max1) {
                max1 = arr1[i];}
        }
        System.out.println("Max in arr1: " + max1);
        
        //min for 1d array
        int min1 = arr1[0];
        for (int i = 0; i < 6; i++) {
            if (arr1[i] < min1) {
                min1 = arr1[i];}
        }
        System.out.println("Min in arr1: " + min1);
        
        //max for 2d array
        int max2 = arr2[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr2[i][j] > max2) {
                    max2 = arr2[i][j];}
            }
        }
        System.out.println("\nMax in arr2: " + max2);
        
        //min for 2d array
        int min2 = arr2[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr2[i][j] < min2) {
                    min2 = arr2[i][j];}
            }
        }
        System.out.println("Min in arr2: " + min2);
        
        //sum and average for 1d array
        int sum1 = 0;
        double avg1;
        for (int i = 0; i < 6; i++) {
            sum1 += arr1[i];
        }
        avg1 = sum1 / 6.0;
        System.out.println("\nSum in arr1: " + sum1 + " Avg: " + avg1);
        
        //sum and average for 2d array
        int sum2 = 0;
        double avg2;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sum2 += arr2[i][j];}
        }
        avg2 = sum2 / 12.0;
        System.out.println("Sum in arr2: " + sum2 + " Avg: " + avg2);
        
        //even numbers in 1d array
        System.out.println("\nEven numbers in arr1:");
        for (int i = 0; i < 6; i++) {
            if (arr1[i] % 2 == 0) {
                System.out.print(arr1[i] + " ");}
        }
        
        //odd numbers in 1d array
        System.out.println("\nOdd numbers in arr1:");
        for (int i = 0; i < 6; i++) {
            if (arr1[i] % 2 != 0) {
                System.out.print(arr1[i] + " ");}
        }
        
        //even numbers in 2d array
        System.out.println("\n\nEven numbers in arr2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr2[i][j] % 2 == 0) {
                    System.out.print(arr2[i][j] + " ");}
            }
        }
        
        //odd numbers in 2d array
        System.out.println("\nOdd numbers in arr2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr2[i][j] % 2 != 0) {
                    System.out.print(arr2[i][j] + " ");}
            }
        }
        
        //square in 1d array
        System.out.println("\n\nSquare of numbers in arr1:");
        for (int i = 0; i < 6; i++) {
            System.out.print(arr1[i] * arr1[i] + " ");
        }
        
        //square in 2d array
        System.out.println("\nSquare of numbers in arr2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print((arr2[i][j] * arr2[i][j]) + "\t");
            }// the \t to make it look like a 2d array
            System.out.println();
        }
        
        //ADDITION of arr1 and arr3 (1d array)
        int[] arr3 = {10, 5, 20, 5, 100, 20};
        int[] arr4 = new int[6];
        for (int i = 0; i < 6; i++) {
            arr4[i] = arr1[i] + arr3[i];
        }
        System.out.println("\nArr4: ADDITION of arr1 and arr3. ");
        for (int i = 0; i < 6; i++) {
            System.out.println("Index"+ (i+1)+ ": " + arr4[i]);
        }
        
        //MULTIPLICATION of arr2 and arr5 (2d array)
        int[][] arr5 = {{1, 0, 2}, {2, 5, 3}, {5, 5, 5}, {3, 0, 1}};
        int[][] arr6 = new int[3][3];
        System.out.println("\nArr6: MULTIPLICATION of arr2 and arr5");
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {
                
                //third loop to add the results in
                for (int i = 0; i < 4; i++) {
                    arr6[k][j] = arr6[k][j] + arr2[k][i] * arr5[i][j];}
            }
        }
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr6[k][j] + "\t");
            }
            System.out.println();}
    } //close main
} //close main class
    