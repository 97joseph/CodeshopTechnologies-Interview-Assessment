import org.json.simple.JSONArray;

public class MatrixProcessor {

    public static String processMatrix(int[][] arr) {
        int diagonalSum = 0;
        int rowsWithRepeats = 0;
        int colsWithRepeats = 0;

        // Calculate diagonal sum
        for (int i = 0; i < arr.length; i++) {
            diagonalSum += arr[i][i];
        }

        // Count rows with repeats
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> rowSet = new HashSet<>();
            for (int j = 0; j < arr[i].length; j++) {
                if (!rowSet.add(arr[i][j])) {
                    rowsWithRepeats++;
                    break; // No need to check further in this row
                }
            }
        }

        // Count columns with repeats
        for (int j = 0; j < arr[0].length; j++) {
            Set<Integer> colSet = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                if (!colSet.add(arr[i][j])) {
                    colsWithRepeats++;
                    break; // No need to check further in this column
                }
            }
        }

        // Create JSON output
        JSONArray output = new JSONArray();
        output.add(diagonalSum);
        output.add(rowsWithRepeats);
        output.add(colsWithRepeats);

        return output.toJSONString();
    }
}
