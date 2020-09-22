package com.net.webApp;

public class saleDomainModelClass {

	private int ID;
	private String NAME;
	private int AGE;
	private String ADDRESS;
	private float SALARY;

	public saleDomainModelClass() {

	}

	public saleDomainModelClass(String NAME, int AGE, String ADDRESS, float SALARY) {
		super();
		this.NAME = NAME;
		this.AGE = AGE;
		this.ADDRESS = ADDRESS;
		this.SALARY = SALARY;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public int getAGE() {
		return AGE;
	}

	public void setAGE(int aGE) {
		AGE = aGE;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}

	public float getSALARY() {
		return SALARY;
	}

	public void setSALARY(float sALARY) {
		SALARY = sALARY;
	}

	@Override
	public String toString() {
		return "saleDomainModelClass [ID=" + ID + ", NAME=" + NAME + ", AGE=" + AGE + ", ADDRESS=" + ADDRESS
				+ ", SALARY=" + SALARY + "]";
	}

}
