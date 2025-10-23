package LowLevelDesign.ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        LogProcessor fatalLogProcessor = new FatalLogProcessor(LogProcessor.FATAL, null);
        LogProcessor errorLogProcessor = new ErrorLogProcessor(LogProcessor.ERROR, fatalLogProcessor);
        LogProcessor infoLogProcessor = new InfoLogProcessor(LogProcessor.INFO, errorLogProcessor);
        LogProcessor logger = new DebugLogProcessor(LogProcessor.DEBUG, infoLogProcessor);

        logger.logMessage(LogProcessor.INFO, "This is info log message");
        logger.logMessage(LogProcessor.DEBUG, "This is debug log message");
        logger.logMessage(LogProcessor.ERROR, "This is error log message");
        logger.logMessage(LogProcessor.FATAL, "This is fatal log message");
    }
}
