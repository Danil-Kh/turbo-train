import java.util.Arrays;

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}
class TargetFinder{
    public int[] findTarget(int[] aiCoords, int[][] targets){
        int sum = Arrays.stream(aiCoords).sum();
        int sum2 = targets[0][0] + targets[0][1];
        int[] vivod = new int[2];

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length; j =+ 2) {

                if (targets[i][j] + targets[i][j+1] < sum2){
                    sum2 = targets[i][j] + targets[i][j+1];
                }
                if (targets[i][j] + targets[i][j+1] == sum2) {
                    vivod = new int[]{targets[i][j], targets[i][j + 1]};

                }
            }
        }
        return vivod;
    }
}