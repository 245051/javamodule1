package structural.adapter.phone.impl;

import structural.adapter.phoneifaces.MicroUsbPhone;

public class Android implements MicroUsbPhone {
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
	public void useMicroUsb() {
		connector = true;
		System.out.println("MicroUsb connected");
		
		
	}

}
