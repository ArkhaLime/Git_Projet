package fr.iut.orderProvider.interfaces;

public interface ISignal {

	void signalNewOrder();
	
	void setOrderProvider(IVocalOrder orderProvider);
	
	IVocalOrder getOrderProvider();
	
}
