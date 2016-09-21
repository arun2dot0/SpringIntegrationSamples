package model;


public class DeliveryPreference {

	String addressLineOne,
	city,
	countryCode,
	postalCode,
	firstName,
	middleInitial,
	suffix,
	lastName,
	businessName,
	phoneNumber,
	phoneNumberType,
	additionalPhoneNumber,
	additionalPhoneNumberType,
	isDefault,
	addressId,
	shippingAddressType,
	state;

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumberType() {
		return phoneNumberType.toUpperCase();
	}

	public void setPhoneNumberType(String phoneNumberType) {
		this.phoneNumberType = phoneNumberType;
	}

	public String getAdditionalPhoneNumber() {
		return additionalPhoneNumber;
	}

	public void setAdditionalPhoneNumber(String additionalPhoneNumber) {
		this.additionalPhoneNumber = additionalPhoneNumber;
	}

	public String getAdditionalPhoneNumberType() {
		return additionalPhoneNumberType;
	}

	public void setAdditionalPhoneNumberType(String additionalPhoneNumberType) {
		this.additionalPhoneNumberType = additionalPhoneNumberType;
	}

	public String getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getShippingAddressType() {
		return shippingAddressType;
	}

	public void setShippingAddressType(String shippingAddressType) {
		this.shippingAddressType = shippingAddressType;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "DeliveryPreference [addressLineOne=" + addressLineOne + ", city=" + city + ", countryCode="
				+ countryCode + ", postalCode=" + postalCode + ", firstName=" + firstName + ", middleInitial="
				+ middleInitial + ", suffix=" + suffix + ", lastName=" + lastName + ", businessName=" + businessName
				+ ", phoneNumber=" + phoneNumber + ", phoneNumberType=" + phoneNumberType + ", additionalPhoneNumber="
				+ additionalPhoneNumber + ", additionalPhoneNumberType=" + additionalPhoneNumberType + ", isDefault="
				+ isDefault + ", addressId=" + addressId + ", shippingAddressType=" + shippingAddressType + ", state="
				+ state + "]";
	}
	
}
