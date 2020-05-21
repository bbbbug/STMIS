package app.core.po;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CourseOnsite {
    private Integer id;

    private String pxkc;

    private String pxdd;

    private String pxfs;

    private String skls;

    private Double skxf;

    private Double cjrs;

    private String pxzl;

    private String pxnr;

    private String pxjlr;
    
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date pxsj;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date pxjlsj;

    private String pxzzbm;

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

    public String getPxkc() {
        return pxkc;
    }

    public void setPxkc(String pxkc) {
        this.pxkc = pxkc == null ? null : pxkc.trim();
    }

    public String getPxdd() {
        return pxdd;
    }

    public void setPxdd(String pxdd) {
        this.pxdd = pxdd == null ? null : pxdd.trim();
    }

    public String getPxfs() {
        return pxfs;
    }

    public void setPxfs(String pxfs) {
        this.pxfs = pxfs == null ? null : pxfs.trim();
    }

    public String getSkls() {
        return skls;
    }

    public void setSkls(String skls) {
        this.skls = skls == null ? null : skls.trim();
    }

    public Double getSkxf() {
        return skxf;
    }

    public void setSkxf(Double skxf) {
        this.skxf = skxf;
    }

    public Double getCjrs() {
        return cjrs;
    }

    public void setCjrs(Double cjrs) {
        this.cjrs = cjrs;
    }

    public String getPxzl() {
        return pxzl;
    }

    public void setPxzl(String pxzl) {
        this.pxzl = pxzl == null ? null : pxzl.trim();
    }

    public String getPxnr() {
        return pxnr;
    }

    public void setPxnr(String pxnr) {
        this.pxnr = pxnr == null ? null : pxnr.trim();
    }

    public String getPxjlr() {
        return pxjlr;
    }

    public void setPxjlr(String pxjlr) {
        this.pxjlr = pxjlr == null ? null : pxjlr.trim();
    }

    public Date getPxsj() {
        return pxsj;
    }

    public void setPxsj(@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8") Date pxsj) {
        this.pxsj = pxsj;
    }

    public Date getPxjlsj() {
        return pxjlsj;
    }

    public void setPxjlsj(@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8") Date pxjlsj) {
        this.pxjlsj = pxjlsj;
    }

    public String getPxzzbm() {
        return pxzzbm;
    }

    public void setPxzzbm(String pxzzbm) {
        this.pxzzbm = pxzzbm == null ? null : pxzzbm.trim();
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