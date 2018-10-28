package MiniProject2.Vo;

public class SeekerVO {
	/**
	 * User_ID
	 */
	private String seeker_id;
	/**
	 * User_Pw
	 */
	private String seeker_pw;
	/**
	 * User 학력
	 */
	private String seeker_final_edu;
	/**
	 * User 나이
	 */
	private int seeker_age;
	/**
	 * User 관심분야
	 */
	private String seeker_field;
	/**
	 * User 주소
	 */
	private String seeker_area;

	/**
	 * 유저인지 기업사람인지 체크
	 */
	private int seeker_blong;

	public SeekerVO() {
	}

	public SeekerVO(String seeker_id, String seeker_pw, String seeker_final_edu, int seeker_age, String seeker_field,
			String seeker_area, int seeker_blong) {
		super();
		this.seeker_id = seeker_id;
		this.seeker_pw = seeker_pw;
		this.seeker_final_edu = seeker_final_edu;
		this.seeker_age = seeker_age;
		this.seeker_field = seeker_field;
		this.seeker_area = seeker_area;
		this.seeker_blong = seeker_blong;
	}

	public String getSeeker_id() {
		return seeker_id;
	}

	public void setSeeker_id(String seeker_id) {
		this.seeker_id = seeker_id;
	}

	public String getSeeker_pw() {
		return seeker_pw;
	}

	public void setSeeker_pw(String seeker_pw) {
		this.seeker_pw = seeker_pw;
	}

	public String getSeeker_final_edu() {
		return seeker_final_edu;
	}

	public void setSeeker_final_edu(String seeker_final_edu) {
		this.seeker_final_edu = seeker_final_edu;
	}

	public int getSeeker_age() {
		return seeker_age;
	}

	public void setSeeker_age(int seeker_age) {
		this.seeker_age = seeker_age;
	}

	public String getSeeker_field() {
		return seeker_field;
	}

	public void setSeeker_field(String seeker_field) {
		this.seeker_field = seeker_field;
	}

	public String getSeeker_area() {
		return seeker_area;
	}

	public void setSeeker_area(String seeker_area) {
		this.seeker_area = seeker_area;
	}

	public int getSeeker_blong() {
		return seeker_blong;
	}

	public void setSeeker_blong(int seeker_blong) {
		this.seeker_blong = seeker_blong;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + seeker_age;
		result = prime * result + ((seeker_area == null) ? 0 : seeker_area.hashCode());
		result = prime * result + seeker_blong;
		result = prime * result + ((seeker_field == null) ? 0 : seeker_field.hashCode());
		result = prime * result + ((seeker_final_edu == null) ? 0 : seeker_final_edu.hashCode());
		result = prime * result + ((seeker_id == null) ? 0 : seeker_id.hashCode());
		result = prime * result + ((seeker_pw == null) ? 0 : seeker_pw.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeekerVO other = (SeekerVO) obj;
		if (seeker_age != other.seeker_age)
			return false;
		if (seeker_area == null) {
			if (other.seeker_area != null)
				return false;
		} else if (!seeker_area.equals(other.seeker_area))
			return false;
		if (seeker_blong != other.seeker_blong)
			return false;
		if (seeker_field == null) {
			if (other.seeker_field != null)
				return false;
		} else if (!seeker_field.equals(other.seeker_field))
			return false;
		if (seeker_final_edu == null) {
			if (other.seeker_final_edu != null)
				return false;
		} else if (!seeker_final_edu.equals(other.seeker_final_edu))
			return false;
		if (seeker_id == null) {
			if (other.seeker_id != null)
				return false;
		} else if (!seeker_id.equals(other.seeker_id))
			return false;
		if (seeker_pw == null) {
			if (other.seeker_pw != null)
				return false;
		} else if (!seeker_pw.equals(other.seeker_pw))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SeekerVO [seeker_id=" + seeker_id + ", seeker_pw=" + seeker_pw + ", seeker_final_edu="
				+ seeker_final_edu + ", seeker_age=" + seeker_age + ", seeker_field=" + seeker_field + ", seeker_area="
				+ seeker_area + ", seeker_blong=" + seeker_blong + "]";
	}

}
