package chap06sjw.src.a.b.c.c;

import java.sql.Date;

// 우리가 만드는 사이트에 회원가입하면 그 정보가 객체로 만들어져서 
// 서버의 데이타베이스 저장되게 하기위하여 중간매체로 사용할 수 있게
// 클래스를 모델링 해 봅니다. 
// 데이타베이스 한 레코드의 정보를 객체로 만들기위한 틀 ====> VO 라고 한다.
// VO(Value Object), DTO(Data Transfer Object), Bean 
public class Member {
	// 멤버필드를 private으로 접근을 제한한다.
	private String name;
	private String phone;
	private String email;
	private String id;
	private String password;
	private String address; 
	private Date joinDate;
	private boolean isActive;
	// 생성메소드 를 만들지 않는다 ===> 기본 생성자만 사용하겠다. 
	// 값을 얻어 오게 하는 메소드 ===> getter메소드 
	// 값을 넣기 위한 메소드 ===> setter메소드 
	// 각각의 필드에 getter 와 setter를 만들어야 한다. 
	// getters & setters
	// name의 getter 
	public String getName() {
		return this.name;
	} 
	
	// name의 setter 
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		// 아무나 못 가져 가게 비즈니스 로직을 형편에 맞게
		// 추가 한다.
		return password;
	}

	public void setPassword(String password) {
		// 아무나 세팅 못하게끔 지즈니스 로직을 형편에 맞게
		// 추가 한다.
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		// 엉터리 주소로 세팅시키려 할 때에
		// 거부하는 혹은 에러를 알려주는 메시지를 내보내는
		// 비즈니스 로직을 추가할 수 있다.
		this.address = address;
	}

	public Date getJoinDate() {
		return joinDate;
	}
	//--------------- 메소드의 오버로딩(overloading) ---------
	// 관리자용 메소드
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	// 가입자용 메소드 
	public void setJoinDate() {
		// 컴퓨터의 현재 시각을 기준으로 Date객체를 만드는 방식 
		Date date = new Date(System.currentTimeMillis());
		this.joinDate = date;
	}
	//----------------------------------------------------
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	// 객체의 표현 양식 (방식) 

	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + ", email=" + email + ", id=" + id + ", address=" + address
				+ ", joinDate=" + joinDate + ", isActive=" + isActive + "]";
	}

}
