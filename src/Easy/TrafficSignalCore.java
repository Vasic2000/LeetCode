package Easy;
//TASK.3894

public class TrafficSignalCore {
    public static void main(String[] args) {
        System.out.println("0 -> " + trafficSignal((short) 0));
        System.out.println("60 -> " + trafficSignal((short) 60));
        System.out.println("5 -> " + trafficSignal((short) 5));
        System.out.println("30 -> " + trafficSignal((short) 30));
        System.out.println("100 -> " + trafficSignal((short) 100));
    }

    private static String trafficSignal(Short timer) {
        if(timer == 0)
            return "Green";
        if(timer == 30)
            return "Orange";
        if((timer > 30) && (timer <= 90))
            return "Red";
        return "Invalid";
    }
}
