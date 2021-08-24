//공간 복잡도가 O(1)

public class Array8_2{
    void setZeros(int[][] matrix){
        boolean rowHasZero = false;
        boolean colHasZero = false;
        
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[0][j] == 0){
                rowHasZero = true;
                break;
            }
        }
        
        for(int i = 0; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                colHasZero = true;
                break;
            }
        }
        
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j <matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for (int j = 1; j <matrix.length; j++){
            if(matrix[i][0] == 0){
                nullifyRow(matrix, i);
            }
        }
        
        for (int j = 1; j <matrix[0].length; j++){
            if(matrix[0][j] == 0){
                nullifyColumn(matrix, j);
            }
        }
        
        if(rowHasZero){
            nullifyRow(matrix, 0);
        }
        
        if(colHasZero){
            nullifyColumn(matrix, 0);
        }
    }
}