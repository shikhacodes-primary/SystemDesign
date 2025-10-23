package LowLevelDesign.ChainOfResponsibility;

public class FatalLogProcessor extends LogProcessor {

    public FatalLogProcessor(int level, LogProcessor nextLogProcessor) {
        this.level = level;
        this.nextLogProcessor = nextLogProcessor;
    }

    @Override
    public void write(String message) {
        System.out.println("FATAL:: " + message);
    }
}
