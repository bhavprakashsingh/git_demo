package com.school;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HelloWorld {
	List addressList;
	   Set  addressSet;
	   Map  addressMap;
	   public List getAddressList() {
		return addressList;
	}

	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}

	public Set getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}

	public Map getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}

	public Properties getAddressProp() {
		return addressProp;
	}

	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}

	public String getName() {
		return name;
	}

	Properties addressProp;

	private String name;
	

	public HelloWorld(String name) {
		 System.out.println("Inside TextEditor constructor." );
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Hello ! " + name);
	}
}
