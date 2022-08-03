package de.tum.in.ase.eist;

public class ThermoAdapter implements ThermoInterface {
    private FahrenheitThermo thermo;

    public ThermoAdapter() {
        thermo = new FahrenheitThermo();
    }

    public double getTempC() {
        return (thermo.getFahrenheitTemperature() - 32.0) * (5.0 / 9.0);
    }
//仍然继承interface保证实现了功能，但是内部实现是delegation
}
