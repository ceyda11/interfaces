package interfaces;

public class Utils {
//araçlar demek 
	public static void runLogger(Logger[] loggers, String message) {
		for(Logger logger: loggers) {
			logger.log(message);
			
	}
	}
	
	
}
