package lld.adapter.adaptee;

public class WeightMachineImpl implements WeightMachine {
    @Override
    public double getWeightInPounds() {
        int weight = 55;
//        System.out.println("weight in pounds:: " + weight);
        return weight;
    }
}
