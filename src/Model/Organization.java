package Model;

import java.util.Arrays;

public class Organization {
	private String name;
	private PhoneNumber phoneNumber;
	private String contactInfo;
	private User[] staff;
	private Auction[] auctions;
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber.toString();
	}
	
	public String getContactInfo() {
		return contactInfo;
	}
	
	public User[] getStaff() {
		return Arrays.copyOf(staff, staff.length);
	}
	
	public Auction[] getAuctions() {
		return Arrays.copyOf(auctions, auctions.length);
	}
}