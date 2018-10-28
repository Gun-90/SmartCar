package MiniProject2.Vo;

public class ComSeekVO extends SeekerVO {
	/**
	 * 회사이름
	 */
	private String c_name;
	/**
	 * 모집분야
	 */
	private String c_field;
	/**
	 * 직무소개
	 */
	private String c_intro;
	/**
	 * 모집시기 시작일
	 */
	private String c_recruitment_start;
	/**
	 * 모집시기 종료일
	 */
	private String c_recruitment_end;
	/**
	 * 지원자격 및 우대사항
	 */
	private String c_qualification;
	/**
	 * 근무지역
	 */
	private String c_area;
	/**
	 * 회사 인재상
	 */
	private String c_talent;

	public ComSeekVO() {
	}

	public ComSeekVO(String c_name, String c_field, String c_intro, String c_recruitment_start,
			String c_recruitment_end, String c_qualification, String c_area, String c_talent) {
		this.c_name = c_name;
		this.c_field = c_field;
		this.c_intro = c_intro;
		this.c_recruitment_start = c_recruitment_start;
		this.c_recruitment_end = c_recruitment_end;
		this.c_qualification = c_qualification;
		this.c_area = c_area;
		this.c_talent = c_talent;
	}

	public ComSeekVO(String c_name, String c_field, String c_intro, String c_recruitment_start,
			String c_recruitment_end, String c_qualification, String c_area, String c_talent, String s_id, String s_pw,
			String s_final_edu, int s_age, String s_field, String s_area, int s_belong) {
		super(s_id, s_pw, s_final_edu, s_age, s_field, s_area, s_belong);
		this.c_name = c_name;
		this.c_field = c_field;
		this.c_intro = c_intro;
		this.c_recruitment_start = c_recruitment_start;
		this.c_recruitment_end = c_recruitment_end;
		this.c_qualification = c_qualification;
		this.c_area = c_area;
		this.c_talent = c_talent;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_field() {
		return c_field;
	}

	public void setC_field(String c_field) {
		this.c_field = c_field;
	}

	public String getC_intro() {
		return c_intro;
	}

	public void setC_intro(String c_intro) {
		this.c_intro = c_intro;
	}

	public String getC_recruitment_start() {
		return c_recruitment_start;
	}

	public void setC_recruitment_start(String c_recruitment_start) {
		this.c_recruitment_start = c_recruitment_start;
	}

	public String getC_recruitment_end() {
		return c_recruitment_end;
	}

	public void setC_recruitment_end(String c_recruitment_end) {
		this.c_recruitment_end = c_recruitment_end;
	}

	public String getC_qualification() {
		return c_qualification;
	}

	public void setC_qualification(String c_qualification) {
		this.c_qualification = c_qualification;
	}

	public String getC_area() {
		return c_area;
	}

	public void setC_area(String c_area) {
		this.c_area = c_area;
	}

	public String getC_talent() {
		return c_talent;
	}

	public void setC_talent(String c_talent) {
		this.c_talent = c_talent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((c_area == null) ? 0 : c_area.hashCode());
		result = prime * result + ((c_field == null) ? 0 : c_field.hashCode());
		result = prime * result + ((c_intro == null) ? 0 : c_intro.hashCode());
		result = prime * result + ((c_name == null) ? 0 : c_name.hashCode());
		result = prime * result + ((c_qualification == null) ? 0 : c_qualification.hashCode());
		result = prime * result + ((c_recruitment_end == null) ? 0 : c_recruitment_end.hashCode());
		result = prime * result + ((c_recruitment_start == null) ? 0 : c_recruitment_start.hashCode());
		result = prime * result + ((c_talent == null) ? 0 : c_talent.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComSeekVO other = (ComSeekVO) obj;
		if (c_area == null) {
			if (other.c_area != null)
				return false;
		} else if (!c_area.equals(other.c_area))
			return false;
		if (c_field == null) {
			if (other.c_field != null)
				return false;
		} else if (!c_field.equals(other.c_field))
			return false;
		if (c_intro == null) {
			if (other.c_intro != null)
				return false;
		} else if (!c_intro.equals(other.c_intro))
			return false;
		if (c_name == null) {
			if (other.c_name != null)
				return false;
		} else if (!c_name.equals(other.c_name))
			return false;
		if (c_qualification == null) {
			if (other.c_qualification != null)
				return false;
		} else if (!c_qualification.equals(other.c_qualification))
			return false;
		if (c_recruitment_end == null) {
			if (other.c_recruitment_end != null)
				return false;
		} else if (!c_recruitment_end.equals(other.c_recruitment_end))
			return false;
		if (c_recruitment_start == null) {
			if (other.c_recruitment_start != null)
				return false;
		} else if (!c_recruitment_start.equals(other.c_recruitment_start))
			return false;
		if (c_talent == null) {
			if (other.c_talent != null)
				return false;
		} else if (!c_talent.equals(other.c_talent))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ComSeekVO [c_name=" + c_name + ", c_field=" + c_field + ", c_intro=" + c_intro
				+ ", c_recruitment_start=" + c_recruitment_start + ", c_recruitment_end=" + c_recruitment_end
				+ ", c_qualification=" + c_qualification + ", c_area=" + c_area + ", c_talent=" + c_talent + "]";
	}

}
