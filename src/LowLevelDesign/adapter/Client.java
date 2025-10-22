package LowLevelDesign.adapter;

import LowLevelDesign.adapter.adaptee.WeightMachineImpl;
import LowLevelDesign.adapter.adapter.WeightMachineAdapter;
import LowLevelDesign.adapter.adapter.WeightMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {
        WeightMachineAdapter adapter = new WeightMachineAdapterImpl(new WeightMachineImpl());
        System.out.println(adapter.getWeightInKg());
    }
}
