
public class College {

	private Integer collegeId;
	private String collegeName;
	private Address address;

	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public College(Integer collegeId, String collegeName, Address address) {
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.address = address;
	}

	public College() {
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", address=" + address + "]";
	}

}
