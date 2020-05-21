package app.core.po;

public class CourseStructure {
    private Integer id;

    private String zjbh;

    private String zjmc;

    private String kcbh;

    private String bxzd1;

    private String bxzd2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZjbh() {
        return zjbh;
    }

    public void setZjbh(String zjbh) {
        this.zjbh = zjbh == null ? null : zjbh.trim();
    }

    public String getZjmc() {
        return zjmc;
    }

    public void setZjmc(String zjmc) {
        this.zjmc = zjmc == null ? null : zjmc.trim();
    }

    public String getKcbh() {
        return kcbh;
    }

    public void setKcbh(String kcbh) {
        this.kcbh = kcbh == null ? null : kcbh.trim();
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
}