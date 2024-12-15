/**
 * 题目：盛最多水的容器
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 返回容器可以储存的最大水量。
 * 说明：你不能倾斜容器。
 * <p>
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 * 解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 * <p>
 * 输入：height = [1,1]
 * 输出：1
 */
public class MaxArea {
    public static void main(String[] args) {
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {1, 1};

        System.out.println(maxArea(height1));
        System.out.println(maxArea(height2));

    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxVolume = 0;
        while (left < right) {
            int currentVolume = (right - left) * Math.min(height[left], height[right]);
            maxVolume = Math.max(currentVolume, maxVolume);
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxVolume;
    }
}
