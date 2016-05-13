package fr.iut.orderProvider.utils;

public class Logger {

	private static boolean printDebug = false;

	/**
	 * A simple message logging function. The message type gets printed before
	 * the actual message.
	 * 
	 * @param msgType
	 *            the message type
	 * @param msg
	 *            the message to display
	 */
	static public void log(String msgType, String msg) {
		// If we're ignoring debug messages and this one is a debug
		// message, return.
		if (!printDebug && msgType.equals("debug")) {
			return;
		}

		String finalMessage = "[OrderProvider";

		if (!msgType.equals("")) {
			finalMessage = finalMessage + " " + msgType;
		}

		finalMessage = finalMessage + "] " + msg;
		System.out.println(finalMessage);
		System.out.flush();
	}

	/**
	 * Sets how much debug output to print ('true' prints debug and error
	 * messages; 'false' prints only error messages).
	 * 
	 * @param enablePrintDebug
	 */
	static public void setPrintDebug(boolean enablePrintDebug) {
		printDebug = enablePrintDebug;
	}

}
