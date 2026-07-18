package Easy;
//TASK.492
//A web developer needs to know how to design a web page's size. So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:
//
//The area of the rectangular web page you designed must equal to the given target area.
//The width W should not be larger than the length L, which means L >= W.
//The difference between length L and width W should be as small as possible.
//
//Return an array [L, W] where L and W are the length and width of the web page you designed in sequence.


public class ConstructTheRectangle {
    public static void main(String[] args) {
        printArray(constructRectangle(4));
        printArray(constructRectangle(37));
        printArray(constructRectangle(122122));
        printArray(constructRectangle(36));
    }

    private static int[] constructRectangle(int area) {
        int width = area;
        int height = 1;
        int temp = width;

        temp--;

        while(temp >= Math.sqrt(area)) {
            if(area%temp == 0) {
                width = temp;
                height = area / width;
            }
            temp--;
        }
        int[] result = {width, height};
        return result;
    }

    public static void printArray(int[] nums) {
        short i = 1;
        if(nums != null)
            System.out.print(nums[0]);
        while(i < nums.length) {
            System.out.print(";" + nums[i]);
            i++;
        }
        System.out.println();
    }
}
