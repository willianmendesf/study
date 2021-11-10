package br.com.willianmendesf.javastore.model;

public class Client {
	private Integer id;
	private String name;
	private String email;
	private String CPF;
	private String RG;
	private String mobile;
	private String phone;

	private Integer CEP;
	private String address;
	private Integer addressNum;
	private String district;
	private String city;
	private String complement;
	private String UF;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() { return CPF; }
	public void setCPF(String CPF) { this.CPF = CPF; }

	public String getRG() {
		return RG;
	}
	public void setRG(String RG) {
		this.RG = RG;
	}

	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getCEP() {
		return CEP;
	}
	public void setCEP(Integer CEP) {
		this.CEP = CEP;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAddressNum() { return addressNum; }
	public void setAddressNum(Integer addressNum) {
		this.addressNum = addressNum;
	}

	public String getDistrict() { return district; }
	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getUF() {
		return UF;
	}
	public void setUF(String UF) {
		this.UF = UF;
	}
}
