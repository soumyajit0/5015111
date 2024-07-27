package logger;

public class Logger {
  private static Logger loggerInstance = null;
  public String body = "";

  private Logger() {
  }

  public static Logger getInstance() {
    if (loggerInstance != null) {
      return loggerInstance;
    }
    return loggerInstance = new Logger();
  }
}
