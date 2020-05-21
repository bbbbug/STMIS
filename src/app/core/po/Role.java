package app.core.po;

public class Role {
    private String jsbs;

    private Integer id;

    private String jsmc;

    private String bxzd1;

    private String bxzd2;

    public String getJsbs() {
        return jsbs;
    }

    public void setJsbs(String jsbs) {
        this.jsbs = jsbs == null ? null : jsbs.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJsmc() {
        return jsmc;
    }

    public void setJsmc(String jsmc) {
        this.jsmc = jsmc == null ? null : jsmc.trim();
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