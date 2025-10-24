package DesignPatterns.adapter;

import DesignPatterns.adapter.adaptee.WeightMachineImpl;
import DesignPatterns.adapter.adapter.WeightMachineAdapter;
import DesignPatterns.adapter.adapter.WeightMachineAdapterImpl;

public class Client {
    public static void main(String[] args) {
        WeightMachineAdapter adapter = new WeightMachineAdapterImpl(new WeightMachineImpl());
        System.out.println(adapter.getWeightInKg());
    }
}
