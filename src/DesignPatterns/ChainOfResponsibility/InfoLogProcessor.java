package DesignPatterns.ChainOfResponsibility;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(int level, LogProcessor nextLogProcessor) {
        this.level = level;
        this.nextLogProcessor = nextLogProcessor;
    }

    @Override
    public void write(String message) {
        System.out.println("INFO:: " + message);
    }
}
