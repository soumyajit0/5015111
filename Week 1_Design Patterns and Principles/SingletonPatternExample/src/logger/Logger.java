package logger;

// Logger is a Singleton class that allows only one instance to be created
public class Logger {
  // Holds the single instance of the Logger class
  private static Logger loggerInstance = null;

  // Public field for demonstration
  public String body = "";

  // Private constructor to prevent multiple instances
  private Logger() {
  }

  // Returns the single instance of Logger
  public static Logger getInstance() {
    if (loggerInstance != null) {
      return loggerInstance;
    }
    // Creates the instance if it doesn't exist
    return loggerInstance = new Logger();
  }
}
