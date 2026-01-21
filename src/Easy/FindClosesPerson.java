package Easy;

//Task.3516
//
//You are given three integers x, y, and z, representing the positions of three people on a number line:
//x is the position of Person 1.
//y is the position of Person 2.
//z is the position of Person 3, who does not move.
//Both Person 1 and Person 2 move toward Person 3 at the same speed.
//Determine which person reaches Person 3 first:
//Return 1 if Person 1 arrives first.
//Return 2 if Person 2 arrives first.
//Return 0 if both arrive at the same time.
//Return the result accordingly.

public class FindClosesPerson {
    public static void main(String[] args) {
        System.out.println(findClosest(2,7,4));
        System.out.println(findClosest(2,5,6));
        System.out.println(findClosest(1,5,3));
        System.out.println(findClosest(14,16,3));
    }
    public static int findClosest(int x, int y, int z) {
//        int a=Math.abs(z-x);
//        int b=Math.abs(z-y);
//        if(a>b){
//            return 2;
//        }else if (a==b){
//            return 0;
//        }else{
//            return 1;
//        }
        if(Math.abs(z-y) > Math.abs(z-x))
            return 1;
        else if(Math.abs(z-y) < Math.abs(z-x))
            return 2;
        else
            return 0;
    }
}
