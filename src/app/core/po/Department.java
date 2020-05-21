package app.core.po;

public class Department {
    private String bmbh;

    private Integer id;

    private String bmmc;

    private Double zfyq;

    private Double bxxfyq;

    private Double xxxfyq;

    private String bxzd1;

    private String bxzd2;

    private String bxzd3;

    private String bxzd4;

    public String getBmbh() {
        return bmbh;
    }

    public void setBmbh(String bmbh) {
        this.bmbh = bmbh == null ? null : bmbh.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBmmc() {
        return bmmc;
    }

    public void setBmmc(String bmmc) {
        this.bmmc = bmmc == null ? null : bmmc.trim();
    }

    public Double getZfyq() {
        return zfyq;
    }

    public void setZfyq(Double zfyq) {
        this.zfyq = zfyq;
    }

    public Double getBxxfyq() {
        return bxxfyq;
    }

    public void setBxxfyq(Double bxxfyq) {
        this.bxxfyq = bxxfyq;
    }

    public Double getXxxfyq() {
        return xxxfyq;
    }

    public void setXxxfyq(Double xxxfyq) {
        this.xxxfyq = xxxfyq;
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