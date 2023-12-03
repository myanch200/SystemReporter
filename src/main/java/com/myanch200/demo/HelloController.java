package com.myanch200.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.hardware.Sensors;
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        Sensors sensors = hal.getSensors();
        double cpuTemperature = sensors.getCpuTemperature();
        welcomeText.setText("CPU Temperature: " + cpuTemperature + "°C");
    }
}