package Array.dsaQuestions.TrappingRainWater;

import java.util.*;

public class trappingRainWater {

    public static void main(String[] args) {

        int[] height = EnterBuildingNo.buildings();

        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        int waterTrapped = 0;

        while (left < right) {

            // Process the side with the smaller boundary
            if (height[left] <= height[right]) {

                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    waterTrapped += leftMax - height[left];
                }

                left++;

            } else {

                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    waterTrapped += rightMax - height[right];
                }

                right--;
            }
        }

        System.out.println("Total Water Trapped = " + waterTrapped);
    }
}

class EnterBuildingNo {

    public static int[] buildings() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of buildings: ");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter building heights:");

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        return height;
    }
}