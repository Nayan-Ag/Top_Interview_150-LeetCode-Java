class Solution {
    public void rotate(int[][] matrix) {
        matrix = invert(matrix);
    }
    int[][] invert(int[][] matrix){
        int low = 0;
        int high = matrix.length-1;
        while(low<high){
            for(int i=0;i<matrix[low].length;i++){
                int temp = matrix[high][i];
                matrix[high][i] = matrix[low][i];
                matrix[low][i] = temp;
            }
            low++;
            high--;
        }
        return  (transpose(matrix));
    }
    int[][] transpose(int[][] matrix){
        for(int i=0 ; i<matrix.length;i++){
            for(int j=i ; j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
}