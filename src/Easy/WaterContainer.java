public class WaterContainer {
    public static void main(String[] args) {
        int [] height1 = {1,8,6,2,5,4,8,3,7};
        int [] height2 = {1,1};
        int [] height3 = {1,4,8,6,28,5,4,38,3,5,7};
        System.out.println(maxArea(height1));
        System.out.println(maxArea(height2));
        System.out.println(maxArea(height3));

        System.out.println(maxArea2(height1));
        System.out.println(maxArea2(height2));
        System.out.println(maxArea(height3));
    }

    public static int maxArea(int[] height) {
        int maximum = 0;
        int volume;
        for(int i = 0; i < height.length - 1; i++) {
            for(int j = i + 1; j < height.length; j++) {
                volume = Math.min(height[i], height[j]) * (j-i);
                if(volume > maximum) maximum = volume;
            }
        }
        return maximum;
    }

    public static int maxArea2(int[] height) {
        int maximum = 0;
        int left = 0;
        int right = height.length - 1;

        while (right > left) {
            if(height[left] < height[right]) {
                maximum = Math.max(maximum, height[left] * (right - left));
                left++;
            } else{
                maximum = Math.max(maximum, height[right] * (right - left));
                right--;
            }
        }
        return maximum;
    }
}
