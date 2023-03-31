package structural.adapter.phone.impl;

import structural.adapter.phoneifaces.LightiningPhone;

public class Iphone implements LightiningPhone {
private boolean connector;
@Override
public void recharge() {
	if(connector) {
		System.out.println("Recharge Started");
		System.out.println("Recahrge finished");
	}
	else
	{
		System.out.println("Connect MicroUsb fo");
	}
	
}


	
	
	


@Override
public void useLightning() {
	connector = true;
	System.out.println("MicroUsb connected");
}
	// TODO Auto-generated method stub
	
}