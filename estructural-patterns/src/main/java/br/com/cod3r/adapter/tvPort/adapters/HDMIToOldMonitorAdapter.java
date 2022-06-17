package br.com.cod3r.adapter.tvPort.adapters;

import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.intefaces.HDMI;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

    public HDMIToOldMonitorAdapter() {
        System.out.println("Wrapping the VGA's OldMonitor's Interface with HDMI adapter.");
    }

    @Override
    public void setSound(String sound) {
        System.out.println("We don't work with sound");
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        super.setImage(image);
    }
}
