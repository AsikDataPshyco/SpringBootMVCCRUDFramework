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

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public int getAGE() {
		return AGE;
	}

	public void setAGE(int AGE) {
		this.AGE = AGE;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String ADDRESS) {
		this.ADDRESS = ADDRESS;
	}

	public float getSALARY() {
		return SALARY;
	}

	public void setSALARY(float SALARY) {
		this.SALARY = SALARY;
	}

	@Override
	public String toString() {
		return "saleDomainModelClass [ID=" + ID + ", NAME=" + NAME + ", AGE=" + AGE + ", ADDRESS=" + ADDRESS
				+ ", SALARY=" + SALARY + "]";
	}

}
