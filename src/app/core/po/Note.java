package app.core.po;

import java.util.Date;

public class Note {
    private Integer id;

    private String ygzh;

    private String kcbh;

    private Integer zjxh;

    private String bjnr;

    private Date bjsj;

    private Integer bjzt;

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

    public Integer getZjxh() {
        return zjxh;
    }

    public void setZjxh(Integer zjxh) {
        this.zjxh = zjxh;
    }

    public String getBjnr() {
        return bjnr;
    }

    public void setBjnr(String bjnr) {
        this.bjnr = bjnr == null ? null : bjnr.trim();
    }

    public Date getBjsj() {
        return bjsj;
    }

    public void setBjsj(Date bjsj) {
        this.bjsj = bjsj;
    }

    public Integer getBjzt() {
        return bjzt;
    }

    public void setBjzt(Integer bjzt) {
        this.bjzt = bjzt;
    }
}