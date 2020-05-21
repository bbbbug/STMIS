package app.core.po;

public class CompetitionQuestion {
    private Integer id;

    private String stbh;

    private String jsbh;

    private String jszt;

    private String jstx;

    private String tmnr;

    private String tmda;

    private String tmjx;

    private String bxzd1;

    private String bxzd2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStbh() {
        return stbh;
    }

    public void setStbh(String stbh) {
        this.stbh = stbh == null ? null : stbh.trim();
    }

    public String getJsbh() {
        return jsbh;
    }

    public void setJsbh(String jsbh) {
        this.jsbh = jsbh == null ? null : jsbh.trim();
    }

    public String getJszt() {
        return jszt;
    }

    public void setJszt(String jszt) {
        this.jszt = jszt == null ? null : jszt.trim();
    }

    public String getJstx() {
        return jstx;
    }

    public void setJstx(String jstx) {
        this.jstx = jstx == null ? null : jstx.trim();
    }

    public String getTmnr() {
        return tmnr;
    }

    public void setTmnr(String tmnr) {
        this.tmnr = tmnr == null ? null : tmnr.trim();
    }

    public String getTmda() {
        return tmda;
    }

    public void setTmda(String tmda) {
        this.tmda = tmda == null ? null : tmda.trim();
    }

    public String getTmjx() {
        return tmjx;
    }

    public void setTmjx(String tmjx) {
        this.tmjx = tmjx == null ? null : tmjx.trim();
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