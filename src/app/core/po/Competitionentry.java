package app.core.po;

public class Competitionentry {
    private Integer id;

    private Integer jsbh;

    private String jszt;

    private String bmygzh;

    private String zdls;

    private String bxzd1;

    private String bxzd2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getBmygzh() {
        return bmygzh;
    }

    public void setBmygzh(String bmygzh) {
        this.bmygzh = bmygzh == null ? null : bmygzh.trim();
    }

    public String getZdls() {
        return zdls;
    }

    public void setZdls(String zdls) {
        this.zdls = zdls == null ? null : zdls.trim();
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