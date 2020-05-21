package app.core.po;

import java.util.Date;

public class CourseType {
    private Integer id;

    private String kcbh;

    private String kcmc;

    private Integer bmid;

    private String bmmc;

    private Date jzsj;

    private String xxbx;

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

    public Integer getBmid() {
        return bmid;
    }

    public void setBmid(Integer bmid) {
        this.bmid = bmid;
    }

    public String getBmmc() {
        return bmmc;
    }

    public void setBmmc(String bmmc) {
        this.bmmc = bmmc == null ? null : bmmc.trim();
    }

    public Date getJzsj() {
        return jzsj;
    }

    public void setJzsj(Date jzsj) {
        this.jzsj = jzsj;
    }

    public String getXxbx() {
        return xxbx;
    }

    public void setXxbx(String xxbx) {
        this.xxbx = xxbx == null ? null : xxbx.trim();
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