package app.core.po;

public class CourseResource {
    private Integer id;

    private String kcbh;

    private String kcmc;

    private Integer zjxh;

    private String zjmc;

    private String zylx;

    private String zylj;

    private String bxzd_1;

    private String bxzd_2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKcbh() {
        return kcbh;
    }

    public void setKcbh(String kcbh) {
        this.kcbh = kcbh == null ? null : kcbh.trim();
    }

    public String getKcmc() {
        return kcmc;
    }

    public void setKcmc(String kcmc) {
        this.kcmc = kcmc == null ? null : kcmc.trim();
    }

    public Integer getZjxh() {
        return zjxh;
    }

    public void setZjxh(Integer zjxh) {
        this.zjxh = zjxh;
    }

    public String getZjmc() {
        return zjmc;
    }

    public void setZjmc(String zjmc) {
        this.zjmc = zjmc == null ? null : zjmc.trim();
    }

    public String getZylx() {
        return zylx;
    }

    public void setZylx(String zylx) {
        this.zylx = zylx == null ? null : zylx.trim();
    }

    public String getZylj() {
        return zylj;
    }

    public void setZylj(String zylj) {
        this.zylj = zylj == null ? null : zylj.trim();
    }
    
    public String getBxzd_1() {
        return bxzd_1;
    }

    public void setBxzd_1(String bxzd_1) {
        this.bxzd_1 = bxzd_1 == null ? null : bxzd_1.trim();
    }

    public String getBxzd_2() {
        return bxzd_2;
    }

    public void setBxzd_2(String bxzd2) {
        this.bxzd_2 = bxzd_2 == null ? null : bxzd_2.trim();
    }


	@Override
	public String toString() {
		return "CourseResource [id=" + id + ", kcbh=" + kcbh + ", kcmc=" + kcmc + ", zjxh=" + zjxh + ", zjmc=" + zjmc
				+ ", zylx=" + zylx + ", zylj=" + zylj + ", bxzd_1=" + bxzd_1 + ", bxzd_2=" + bxzd_2 + "]";
	}
    
}