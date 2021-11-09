package com.task;

public class Main {

    //Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
    //
    //Integers in each row are sorted from left to right.
    //The first integer of each row is greater than the last integer of the previous row.
    //
    //
    //Example 1:
    //Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
    //Output: true

    public static boolean searchMatrix(int[][] matrix, int target) {

        int row = 0;
        for(int i=0; i<matrix.length; i++)
        {
            if(target <= matrix[i][matrix[i].length -1])
            {
                row = i;
                break;
            }
        }
        int left = 0;
        int right = matrix[row].length -1;

        while(left <=right)
        {
            int mid = left + (right-left)/2;
            if(matrix[row][mid] == target)
            {
                return true;
            }

            if(matrix[row][mid] > target)
            {
                right = mid -1;
            }else
            {
                left = mid+1;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1},{3},},1));
    }
}
