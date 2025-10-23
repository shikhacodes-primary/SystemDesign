package LowLevelDesign.ChainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor {

    public ErrorLogProcessor(int level, LogProcessor nextLogProcessor) {
        this.level = level;
        this.nextLogProcessor = nextLogProcessor;
    }

    @Override
    public void write(String message) {
        System.out.println("ERROR:: " + message);
    }
}
