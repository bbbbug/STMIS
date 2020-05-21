package app.core.po;

public class Progress {
    private Integer id;

    private String ygzh;

    private String kcbh;

    private Integer zjxh;

    private Integer kcjd;

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

    public Integer getKcjd() {
        return kcjd;
    }

    public void setKcjd(Integer kcjd) {
        this.kcjd = kcjd;
    }
}