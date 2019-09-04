package leetcode.test1;
//搜索二维矩阵 II
public class Solution3 {
    public static void main(String[] args) {
        int[][] matrix ={
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(searchMatrix(matrix,1));

    }
    public static boolean searchMatrix(int[][] matrix, int target) {
            if(matrix.length > 0 && matrix[0].length > 0){
                int rows = matrix.length;
                int cols = matrix[0].length;
                int i = 0;
                int j = cols - 1;
                while(i >= 0 && i < rows && j >= 0 && j < cols){
                    if(matrix[i][j] == target){
                        return true;
                    }else if(matrix[i][j] < target) {
                        i++;
                    }else{
                        j --;
                    }
                }
                return false;
            }else {
                return false;
            }
    }

}
