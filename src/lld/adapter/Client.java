package lld.adapter;

import lld.adapter.adaptee.WeightMachineImpl;
import lld.adapter.adapter.WeightMachineAdapter;
import lld.adapter.adapter.WeightMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {
        WeightMachineAdapter adapter = new WeightMachineAdapterImpl(new WeightMachineImpl());
        System.out.println(adapter.getWeightInKg());
    }
}
