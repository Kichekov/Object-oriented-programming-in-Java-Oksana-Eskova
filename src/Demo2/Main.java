package Demo2;

import Library2.Bridge;
import Library2.SuspensionBridge;
import Library2.WaterBridge;

public class Main {
    public static void main(String[] args) {
        Bridge bridge = new SuspensionBridge();
        Bridge bridge2 = new WaterBridge();

        println(bridge);
        println(bridge2);


    }
    public static void println(Bridge bridge){
        System.out.println(bridge.getCarsCount());

    }

}
