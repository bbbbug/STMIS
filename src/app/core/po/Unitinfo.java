package app.core.po;

public class Unitinfo {
    private String dwbh;

    private Integer id;

    private String dwmc;

    private String hy;

    private String bxzd1;

    private String bxzd2;

    public String getDwbh() {
        return dwbh;
    }

    public void setDwbh(String dwbh) {
        this.dwbh = dwbh == null ? null : dwbh.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDwmc() {
        return dwmc;
    }

    public void setDwmc(String dwmc) {
        this.dwmc = dwmc == null ? null : dwmc.trim();
    }

    public String getHy() {
        return hy;
    }

    public void setHy(String hy) {
        this.hy = hy == null ? null : hy.trim();
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