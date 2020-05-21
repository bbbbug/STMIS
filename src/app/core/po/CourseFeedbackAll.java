package app.core.po;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CourseFeedbackAll {
    private Integer id;

    private String kcbh;

    private String kcmc;

    private String kcjs;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date jksj;

    private String ygzh;

    private String ygmc;

    private Double pjfs;

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

    public String getKcjs() {
        return kcjs;
    }

    public void setKcjs(String kcjs) {
        this.kcjs = kcjs == null ? null : kcjs.trim();
    }

    public Date getJksj() {
        return jksj;
    }

    public void setJksj(@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8") Date jksj) {
        this.jksj = jksj;
    }

    public String getYgzh() {
        return ygzh;
    }

    public void setYgzh(String ygzh) {
        this.ygzh = ygzh == null ? null : ygzh.trim();
    }

    public String getYgmc() {
        return ygmc;
    }

    public void setYgmc(String ygmc) {
        this.ygmc = ygmc == null ? null : ygmc.trim();
    }

    public Double getPjfs() {
        return pjfs;
    }

    public void setPjfs(Double pjfs) {
        this.pjfs = pjfs;
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