//Example:
//
//Input: [1,8,6,2,5,4,8,3,7]
//Output: 49

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxContain = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int contain = height[i] > height[j] ? height[j] * (j - i) : height[i] * (j - i);
                if (contain > maxContain) {
                    maxContain = contain;
                }
            }
        }
        return maxContain;
    }

    public int maxArea2(int[] height) {
        int maxContain = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int contain = height[i] > height[j] ? height[j] * (j - i) : height[i] * (j - i);
                if (contain > maxContain) {
                    maxContain = contain;
                }
            }
        }
        return maxContain;
    }
}
