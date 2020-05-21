package app.core.po;

public class Rank {
    private Integer id;

    private String ygzh;

    private Integer jsbh;

    private String jszt;

    private String ygxm;

    private String ygjsfs;

    private String ygjspm;

    private String bxzd1;

    private String bxzd2;

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

    public Integer getJsbh() {
        return jsbh;
    }

    public void setJsbh(Integer jsbh) {
        this.jsbh = jsbh;
    }

    public String getJszt() {
        return jszt;
    }

    public void setJszt(String jszt) {
        this.jszt = jszt == null ? null : jszt.trim();
    }

    public String getYgxm() {
        return ygxm;
    }

    public void setYgxm(String ygxm) {
        this.ygxm = ygxm == null ? null : ygxm.trim();
    }

    public String getYgjsfs() {
        return ygjsfs;
    }

    public void setYgjsfs(String ygjsfs) {
        this.ygjsfs = ygjsfs == null ? null : ygjsfs.trim();
    }

    public String getYgjspm() {
        return ygjspm;
    }

    public void setYgjspm(String ygjspm) {
        this.ygjspm = ygjspm == null ? null : ygjspm.trim();
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