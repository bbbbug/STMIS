package app.core.po;

public class CourseSelection {
    private Integer id;

    private String ygzh;

    private String kcbh;

    private Integer kcjd;

    private String fraction;

    private String bxzd2;

    private Integer threshold;
    //author by Jaylin-yang
    private CourseType courseType;
    
    public CourseType getCourseType() {
		return courseType;
	}

	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
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

    public String getKcbh() {
        return kcbh;
    }

    public void setKcbh(String kcbh) {
        this.kcbh = kcbh == null ? null : kcbh.trim();
    }

    public Integer getKcjd() {
        return kcjd;
    }

    public void setKcjd(Integer kcjd) {
        this.kcjd = kcjd;
    }

    public String getFraction() {
        return fraction;
    }

    public void setFraction(String fraction) {
        this.fraction = fraction == null ? null : fraction.trim();
    }

    public String getBxzd2() {
        return bxzd2;
    }

    public void setBxzd2(String bxzd2) {
        this.bxzd2 = bxzd2 == null ? null : bxzd2.trim();
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

	@Override
	public String toString() {
		return "CourseSelection [id=" + id + ", ygzh=" + ygzh + ", kcbh=" + kcbh + ", kcjd=" + kcjd + ", fraction="
				+ fraction + ", bxzd2=" + bxzd2 + ", threshold=" + threshold + "]";
	}
    
}