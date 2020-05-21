package app.core.po;

import java.util.Date;

public class Grade {
    private Integer id;

    private String ygzh;

    private Double ygzxf;

    private Double ygbxxf;

    private Double ygxxxf;

    private Date ksdfsj;

    private Date mnkssj;

    private String bxzd1;

    private String bxzd2;

    private String bxzd3;

    private String bxzd4;
    
    // author by Jaylin-yang
    private Department department;

    private CourseOnsiteCredit courseOnsiteCredit;
    
    
    public CourseOnsiteCredit getCourseOnsiteCredit() {
		return courseOnsiteCredit;
	}

	public void setCourseOnsiteCredit(CourseOnsiteCredit courseOnsiteCredit) {
		this.courseOnsiteCredit = courseOnsiteCredit;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYgzh() {
        return ygzh;
    }

    public void setYgzh(String ygzh) {
        this.ygzh = ygzh == null ? null : ygzh.trim();
    }

    public Double getYgzxf() {
        return ygzxf;
    }

    public void setYgzxf(Double ygzxf) {
        this.ygzxf = ygzxf;
    }

    public Double getYgbxxf() {
        return ygbxxf;
    }

    public void setYgbxxf(Double ygbxxf) {
        this.ygbxxf = ygbxxf;
    }

    public Double getYgxxxf() {
        return ygxxxf;
    }

    public void setYgxxxf(Double ygxxxf) {
        this.ygxxxf = ygxxxf;
    }

    public Date getKsdfsj() {
        return ksdfsj;
    }

    public void setKsdfsj(Date ksdfsj) {
        this.ksdfsj = ksdfsj;
    }

    public Date getMnkssj() {
        return mnkssj;
    }

    public void setMnkssj(Date mnkssj) {
        this.mnkssj = mnkssj;
    }

    public String getBxzd1() {
        return bxzd1;
    }

    public void setBxzd1(String bxzd1) {
        this.bxzd1 = bxzd1 == null ? null : bxzd1.trim();
    }

    public String getBxzd2() {
        return bxzd2;
    }

    public void setBxzd2(String bxzd2) {
        this.bxzd2 = bxzd2 == null ? null : bxzd2.trim();
    }

    public String getBxzd3() {
        return bxzd3;
    }

    public void setBxzd3(String bxzd3) {
        this.bxzd3 = bxzd3 == null ? null : bxzd3.trim();
    }

    public String getBxzd4() {
        return bxzd4;
    }

    public void setBxzd4(String bxzd4) {
        this.bxzd4 = bxzd4 == null ? null : bxzd4.trim();
    }
}