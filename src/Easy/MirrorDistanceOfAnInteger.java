package Easy;
//Task.3783

public class MirrorDistanceOfAnInteger {

    public static void main(String[] args) {
        System.out.println(mirrorDistance(13));
        System.out.println(mirrorDistance(52));
        System.out.println(mirrorDistance(10));
        System.out.println(mirrorDistance(7));
        System.out.println(mirrorDistance(278914569));
    }


    public static int mirrorDistance(int n) {
        char [] integ = String.valueOf(n).toCharArray();
        StringBuilder result = new StringBuilder();
        int lengthCH = integ.length;
        for (int i = 1; i <= lengthCH; i++) {
            result.append(integ[lengthCH - i]);
        }

        return Math.abs(Integer.parseInt(result.toString()) - n);
    }
}
