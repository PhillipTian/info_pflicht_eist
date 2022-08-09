package de.tum.in.ase.eist;

import java.util.List;

public class UserAccount {

	private final String name;
	private List<ChargingMethod> chargingMethods;

	public UserAccount(String name) {
		this.name = name;
	}

	public boolean chargeFor(Claim claim) {
		for (ChargingMethod method : chargingMethods) {
			if (method.charge(claim)) {
				return true;
			}
		}
		return false;
	}

	public List<ChargingMethod> getChargingMethods() {
		return chargingMethods;
	}

	public void setChargingMethods(List<ChargingMethod> chargingMethods) {
		this.chargingMethods = chargingMethods;
	}

}
