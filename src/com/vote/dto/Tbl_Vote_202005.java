package com.vote.dto;

public class Tbl_Vote_202005 {
	String v_jumin;
	String v_name;
	String m_no;
	String v_time;
	String v_area;
	String v_confirm;
	public String getV_jumin() {
		return v_jumin;
	}
	public void setV_jumin(String v_jumin) {
		this.v_jumin = v_jumin;
	}
	public String getV_name() {
		return v_name;
	}
	public void setV_name(String v_name) {
		this.v_name = v_name;
	}
	public String getV_no() {
		return m_no;
	}
	public void setV_no(String v_no) {
		this.m_no = v_no;
	}
	public String getV_time() {
		return v_time;
	}
	public void setV_time(String v_time) {
		this.v_time = v_time;
	}
	public String getV_area() {
		return v_area;
	}
	public void setV_area(String v_area) {
		this.v_area = v_area;
	}
	public String getConfirm() {
		return v_confirm;
	}
	public void setConfirm(String confirm) {
		this.v_confirm = confirm;
	}
	@Override
	public String toString() {
		return "Tbl_Vote_202005 [v_jumin=" + v_jumin + ", v_name=" + v_name
				+ ", v_no=" + m_no + ", v_time=" + v_time + ", v_area="
				+ v_area + ", confirm=" + v_confirm + "]";
	}
	public Tbl_Vote_202005(String v_jumin, String v_name, String v_no,
			String v_time, String v_area, String confirm) {
		super();
		this.v_jumin = v_jumin;
		this.v_name = v_name;
		this.m_no = v_no;
		this.v_time = v_time;
		this.v_area = v_area;
		this.v_confirm = confirm;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((v_confirm == null) ? 0 : v_confirm.hashCode());
		result = prime * result + ((v_area == null) ? 0 : v_area.hashCode());
		result = prime * result + ((v_jumin == null) ? 0 : v_jumin.hashCode());
		result = prime * result + ((v_name == null) ? 0 : v_name.hashCode());
		result = prime * result + ((m_no == null) ? 0 : m_no.hashCode());
		result = prime * result + ((v_time == null) ? 0 : v_time.hashCode());
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
		Tbl_Vote_202005 other = (Tbl_Vote_202005) obj;
		if (v_confirm == null) {
			if (other.v_confirm != null)
				return false;
		} else if (!v_confirm.equals(other.v_confirm))
			return false;
		if (v_area == null) {
			if (other.v_area != null)
				return false;
		} else if (!v_area.equals(other.v_area))
			return false;
		if (v_jumin == null) {
			if (other.v_jumin != null)
				return false;
		} else if (!v_jumin.equals(other.v_jumin))
			return false;
		if (v_name == null) {
			if (other.v_name != null)
				return false;
		} else if (!v_name.equals(other.v_name))
			return false;
		if (m_no == null) {
			if (other.m_no != null)
				return false;
		} else if (!m_no.equals(other.m_no))
			return false;
		if (v_time == null) {
			if (other.v_time != null)
				return false;
		} else if (!v_time.equals(other.v_time))
			return false;
		return true;
	}
	
}
