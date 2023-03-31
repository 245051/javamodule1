package structural.adapter.wrap;

import structural.adapter.phoneifaces.LightiningPhone;
import structural.adapter.phoneifaces.MicroUsbPhone;

public class LightiningToMicroUsbAdapter implements MicroUsbPhone {
	private final LightiningPhone lightningPhone;

    public LightiningToMicroUsbAdapter(LightiningPhone lightningPhone) {
        this.lightningPhone = lightningPhone;
    }

    @Override
    public void useMicroUsb() {
        System.out.println("MicroUsb connected");
        lightningPhone.useLightning();
    }

    @Override
    public void recharge() {
        lightningPhone.recharge();
    }

	

}
