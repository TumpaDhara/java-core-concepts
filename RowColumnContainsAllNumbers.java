class Solution {
    public boolean checkValid(int[][] matrix) {
        int row = matrix.length;
        for(int i =0;i<row;i++){
            HashSet<Integer> rowSet =new HashSet<>();
            HashSet<Integer> colSet = new HashSet<>();
            for(int j =0;j<row;j++){
                if(matrix[i][j]<1 || matrix[i][j]>row || !rowSet.add(matrix[i][j])){
                   return false;
                }
                 if(matrix[j][i]<1 || matrix[j][i]>row || !colSet.add(matrix[j][i])){
                   return false;
                }
            }
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of matrix (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Solution obj = new Solution();
        boolean result = obj.checkValid(matrix);

        System.out.println("Result: " + result);
    }
}
