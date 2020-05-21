package app.core.po;

import java.io.Serializable;
import java.util.Date;

public class Course implements Serializable{
    private String kcbh;

    private Integer id;

    private String kcmc;

    private String kclb;

    private String kcjj;

    private String kcjs;

    private Integer kczt;

    private Integer kcxf;

    private String qxkcbh;

    private String xgkcbh;

    private String kclj;

    private Date kksj;

    private Date jksj;

    private String bxzd1;

    private String bxzd2;

    private String kctb;
    
    private CourseSelection courseSelection;
    
    private CourseCollection courseCollection;
    
    private String courseCount;
    
    private String courseKCJD;
    
    private Category category;
    
    public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getCourseCount() {
		return courseCount;
	}

	public void setCourseCount(String courseCount) {
		this.courseCount = courseCount;
	}

	public String getCourseKCJD() {
		return courseKCJD;
	}

	public void setCourseKCJD(String courseKCJD) {
		this.courseKCJD = courseKCJD;
	}

	public CourseCollection getCourseCollection() {
		return courseCollection;
	}

	public void setCourseCollection(CourseCollection courseCollection) {
		this.courseCollection = courseCollection;
	}

	public CourseSelection getCourseSelection() {
		return courseSelection;
	}

	public void setCourseSelection(CourseSelection courseSelection) {
		this.courseSelection = courseSelection;
	}
    

    public String getKcbh() {
        return kcbh;
    }

    public void setKcbh(String kcbh) {
        this.kcbh = kcbh == null ? null : kcbh.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKcmc() {
        return kcmc;
    }

    public void setKcmc(String kcmc) {
        this.kcmc = kcmc == null ? null : kcmc.trim();
    }

    public String getKclb() {
        return kclb;
    }

    public void setKclb(String kclb) {
        this.kclb = kclb == null ? null : kclb.trim();
    }

    public String getKcjj() {
        return kcjj;
    }

    public void setKcjj(String kcjj) {
        this.kcjj = kcjj == null ? null : kcjj.trim();
    }

    public String getKcjs() {
        return kcjs;
    }

    public void setKcjs(String kcjs) {
        this.kcjs = kcjs == null ? null : kcjs.trim();
    }

    public Integer getKczt() {
        return kczt;
    }

    public void setKczt(Integer kczt) {
        this.kczt = kczt;
    }

    public Integer getKcxf() {
        return kcxf;
    }

    public void setKcxf(Integer kcxf) {
        this.kcxf = kcxf;
    }

    public String getQxkcbh() {
        return qxkcbh;
    }

    public void setQxkcbh(String qxkcbh) {
        this.qxkcbh = qxkcbh == null ? null : qxkcbh.trim();
    }

    public String getXgkcbh() {
        return xgkcbh;
    }

    public void setXgkcbh(String xgkcbh) {
        this.xgkcbh = xgkcbh == null ? null : xgkcbh.trim();
    }

    public String getKclj() {
        return kclj;
    }

    public void setKclj(String kclj) {
        this.kclj = kclj == null ? null : kclj.trim();
    }

    public Date getKksj() {
        return kksj;
    }

    public void setKksj(Date kksj) {
        this.kksj = kksj;
    }

    public Date getJksj() {
        return jksj;
    }

    public void setJksj(Date jksj) {
        this.jksj = jksj;
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

    public String getKctb() {
        return kctb;
    }

    public void setKctb(String kctb) {
        this.kctb = kctb == null ? null : kctb.trim();
    }

	@Override
	public String toString() {
		return "Course [kcbh=" + kcbh + ", id=" + id + ", kcmc=" + kcmc + ", kclb=" + kclb + ", kcjj=" + kcjj
				+ ", kcjs=" + kcjs + ", kczt=" + kczt + ", kcxf=" + kcxf + ", qxkcbh=" + qxkcbh + ", xgkcbh=" + xgkcbh
				+ ", kclj=" + kclj + ", kksj=" + kksj + ", jksj=" + jksj + ", bxzd1=" + bxzd1 + ", bxzd2=" + bxzd2
				+ ", kctb=" + kctb + "]";
	}
    
}