package utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtilities {
    public static Logger Log = LoggerFactory.getLogger(LogUtilities.class);

    //Info Level Logs
    public static void info (String message) {
        LogUtilities.info(message);
    }

    //Warn Level Logs
    public static void warn (String message) {
        LogUtilities.warn(message);
    }

    //Error Level Logs
    public static void error (String message) {
        LogUtilities.error(message);
    }

    //Fatal Level Logs
    public static void fatal (String message) {
        LogUtilities.error(message);
    }

    //Debug Level Logs
    public static void debug (String message) {
        LogUtilities.debug(message);
    }
}
