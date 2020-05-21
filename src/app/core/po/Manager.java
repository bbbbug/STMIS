package app.core.po;

public class Manager {
    private String glyzh;

    private Integer id;

    private String glymm;

    private String jsbs;

    private String bxzd_1;

    private String bxzd_2;

    public String getGlyzh() {
        return glyzh;
    }

    public void setGlyzh(String glyzh) {
        this.glyzh = glyzh == null ? null : glyzh.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGlymm() {
        return glymm;
    }

    public void setGlymm(String glymm) {
        this.glymm = glymm == null ? null : glymm.trim();
    }

    public String getJsbs() {
        return jsbs;
    }

    public void setJsbs(String jsbs) {
        this.jsbs = jsbs == null ? null : jsbs.trim();
    }

    public String getbxzd_1() {
        return bxzd_1;
    }

    public void setbxzd_1(String bxzd_1) {
        this.bxzd_1 = bxzd_1 == null ? null : bxzd_1.trim();
    }

    public String getbxzd_2() {
        return bxzd_2;
    }

    public void setbxzd_2(String bxzd_2) {
        this.bxzd_2 = bxzd_2 == null ? null : bxzd_2.trim();
    }
}