package app.core.po;

public class CourseFeedbackQuestion {
    private Integer id;

    private String fktmmc;

    private String fktmxx1;

    private String fktmxx2;

    private String fktmxx3;

    private String fktmxx4;

    private String fktmxx5;

    private String fktmlx;

    private Integer cfid;

    private String bxzd1;

    private String bxzd2;

    private String bxzd3;

    private String bxzd4;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFktmmc() {
        return fktmmc;
    }

    public void setFktmmc(String fktmmc) {
        this.fktmmc = fktmmc == null ? null : fktmmc.trim();
    }

    public String getFktmxx1() {
        return fktmxx1;
    }

    public void setFktmxx1(String fktmxx1) {
        this.fktmxx1 = fktmxx1 == null ? null : fktmxx1.trim();
    }

    public String getFktmxx2() {
        return fktmxx2;
    }

    public void setFktmxx2(String fktmxx2) {
        this.fktmxx2 = fktmxx2 == null ? null : fktmxx2.trim();
    }

    public String getFktmxx3() {
        return fktmxx3;
    }

    public void setFktmxx3(String fktmxx3) {
        this.fktmxx3 = fktmxx3 == null ? null : fktmxx3.trim();
    }

    public String getFktmxx4() {
        return fktmxx4;
    }

    public void setFktmxx4(String fktmxx4) {
        this.fktmxx4 = fktmxx4 == null ? null : fktmxx4.trim();
    }

    public String getFktmxx5() {
        return fktmxx5;
    }

    public void setFktmxx5(String fktmxx5) {
        this.fktmxx5 = fktmxx5 == null ? null : fktmxx5.trim();
    }

    public String getFktmlx() {
        return fktmlx;
    }

    public void setFktmlx(String fktmlx) {
        this.fktmlx = fktmlx == null ? null : fktmlx.trim();
    }

    public Integer getCfid() {
        return cfid;
    }

    public void setCfid(Integer cfid) {
        this.cfid = cfid;
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

	@Override
	public String toString() {
		return "CourseFeedbackQuestion [id=" + id + ", fktmmc=" + fktmmc + ", fktmxx1=" + fktmxx1 + ", fktmxx2="
				+ fktmxx2 + ", fktmxx3=" + fktmxx3 + ", fktmxx4=" + fktmxx4 + ", fktmxx5=" + fktmxx5 + ", fktmlx="
				+ fktmlx + ", cfid=" + cfid + ", bxzd1=" + bxzd1 + ", bxzd2=" + bxzd2 + ", bxzd3=" + bxzd3 + ", bxzd4="
				+ bxzd4 + "]";
	}
    
}