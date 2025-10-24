package DesignPatterns.ChainOfResponsibility;

public class DebugLogProcessor extends LogProcessor {

    public DebugLogProcessor(int level, LogProcessor nextLogProcessor) {
        this.level = level;
        this.nextLogProcessor = nextLogProcessor;
    }

    @Override
    public void write(String message) {
        System.out.println("DEBUG:: " + message);
    }
}
