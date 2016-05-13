package fr.iut.orderProvider;

import fr.iut.orderProvider.interfaces.ISignal;
import fr.iut.orderProvider.interfaces.IVocalOrder;
import fr.iut.orderProvider.utils.ConfigPath;

/**
 * A little Simplifier which permit to remove words if the function is
 * activated</br>
 * If not activated, the Simplifier is used as an interface between
 * Voce/Sphinx4</br>
 * and a program that wish extends its controls with vocal orders
 * 
 * @author Michel
 * @see IVocalOrder
 *
 */
public class OrderProvider implements IVocalOrder {

	private ISignal userClass;
	private ConfigPath config;

	public OrderProvider() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(ConfigPath config) {
		this.config = config;
	}

	@Override
	public String getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRecognizerEnabled(boolean enable) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isRecognizerEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setPrintDebug(boolean printDebug) {
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setUserClass(ISignal userClass) {
		this.userClass = userClass;

	}

	@Override
	public ISignal getUserClass() {
		return this.userClass;
	}

}
