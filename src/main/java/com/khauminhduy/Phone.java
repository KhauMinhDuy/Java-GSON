package com.khauminhduy;

public class Phone {

	private long phoneId;
	private String phoneType;
	private String phoneNumber;

	public Phone() {
		super();
	}

	public Phone(long phoneId, String phoneType, String phoneNumber) {
		super();
		this.phoneId = phoneId;
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}

	public long getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phoneType=" + phoneType + ", phoneNumber=" + phoneNumber + "]";
	}

}
