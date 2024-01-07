import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates); // Sort candidates for easier backtracking
        backtrack(results, new ArrayList<>(), candidates, target, 0);
        return results;
    }

    private void backtrack(List<List<Integer>> results, List<Integer> current, int[] candidates, int remainingTarget, int start) {
        if (remainingTarget == 0) {
            results.add(new ArrayList<>(current)); // Add a copy of the combination
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (remainingTarget - candidates[i] >= 0) {
                current.add(candidates[i]);
                backtrack(results, current, candidates, remainingTarget - candidates[i], i); // Allow reusing the same element
                current.remove(current.size() - 1); // Backtrack
            } else {
                break; // Optimization: remaining candidates are too large
            }
        }
    }
}
