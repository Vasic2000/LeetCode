package Easy;

public class ConvertTheTemperature {
    public static void main(String[] args) {
        double[] result1 = convertTemperature(36.5);
        double[] result2 = convertTemperature(122.11);
        double[] result3 = convertTemperature(0.0);

        System.out.println(result1[0] + "," + result1[1]);
        System.out.println(result2[0] + "," + result2[1]);
        System.out.println(result3[0] + "," + result3[1]);
    }

    public static double[] convertTemperature(double celsius) {
        double[] result = new double[2];
        result[0] = celsius + 273.15;
        result[1] = celsius * 1.8 + 32;
        return result;
    }
}
