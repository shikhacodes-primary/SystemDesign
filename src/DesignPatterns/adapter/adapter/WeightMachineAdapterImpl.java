package DesignPatterns.adapter.adapter;

import DesignPatterns.adapter.adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPounds = weightMachine.getWeightInPounds();
        return 0.45*weightInPounds;
    }
}
