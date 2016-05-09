package fr.iut.orderProvider.interfaces;

import fr.iut.orderProvider.utils.ConfigPath;

/**
 * The interface that is used to communicate with other program that wish extends its controls with vocal orders
 * @author Michel
 *
 */
public interface IVocalOrder {

	/**
	 * Initialize the Simplifier
	 * @param config 
	 * @see ConfigPath
	 */
	 void init(ConfigPath config);
	 
	 /**
	  * Get the vocal order say by the user</br>
	  * If the function is activated, the Simplifier will remove words in the order
	  * @return the user's vocal order
	  */
	 String getOrder();
	 
	 /**
	  * 
	  * @param enable
	  */
	 void setRecognizerEnabled(boolean enable);
	 
	 boolean isRecognizerEnabled();
	 
	 void setPrintDebug(boolean printDebug);
	 
	 void destroy();
	 
	 void setUserClass(ISignal userClass);
	 
	 ISignal getUserClass();
	
}
