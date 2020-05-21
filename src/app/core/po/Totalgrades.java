package app.core.po;

public class Totalgrades {
    private Integer id;

    private String ygzh;

    private Integer bndsxkczs;

    private Integer ljsxkczs;

    private Double bndzf;

    private Double ljzf;

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

    public Integer getBndsxkczs() {
        return bndsxkczs;
    }

    public void setBndsxkczs(Integer bndsxkczs) {
        this.bndsxkczs = bndsxkczs;
    }

    public Integer getLjsxkczs() {
        return ljsxkczs;
    }

    public void setLjsxkczs(Integer ljsxkczs) {
        this.ljsxkczs = ljsxkczs;
    }

    public Double getBndzf() {
        return bndzf;
    }

    public void setBndzf(Double bndzf) {
        this.bndzf = bndzf;
    }

    public Double getLjzf() {
        return ljzf;
    }

    public void setLjzf(Double ljzf) {
        this.ljzf = ljzf;
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