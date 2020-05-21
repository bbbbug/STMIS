package app.core.po;

public class Employee {
    private String ygzh;

    private Integer id;

    private String ygmm;

    private String ygxm;

    private String ygxb;

    private Integer ygnl;

    private String ygdz;

    private String ygdwbh;

    private String ygdh;

    private Integer ygqx;

    private String ygyx;

    private String ygxf;

    private Double ygcj;

    private String ygpxyq;

    private String ygpxzp;

    private Integer ygzt;

    private Integer ygdlzt;

    private String jsbs;

    private String bxzd_1;

    private String bxzd_2;
    
    private Review review;
    
    private Note note;
    
    public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

    public String getYgzh() {
        return ygzh;
    }

    public void setYgzh(String ygzh) {
        this.ygzh = ygzh == null ? null : ygzh.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYgmm() {
        return ygmm;
    }

    public void setYgmm(String ygmm) {
        this.ygmm = ygmm == null ? null : ygmm.trim();
    }

    public String getYgxm() {
        return ygxm;
    }

    public void setYgxm(String ygxm) {
        this.ygxm = ygxm == null ? null : ygxm.trim();
    }

    public String getYgxb() {
        return ygxb;
    }

    public void setYgxb(String ygxb) {
        this.ygxb = ygxb == null ? null : ygxb.trim();
    }

    public Integer getYgnl() {
        return ygnl;
    }

    public void setYgnl(Integer ygnl) {
        this.ygnl = ygnl;
    }

    public String getYgdz() {
        return ygdz;
    }

    public void setYgdz(String ygdz) {
        this.ygdz = ygdz == null ? null : ygdz.trim();
    }

    public String getYgdwbh() {
        return ygdwbh;
    }

    public void setYgdwbh(String ygdwbh) {
        this.ygdwbh = ygdwbh == null ? null : ygdwbh.trim();
    }

    public String getYgdh() {
        return ygdh;
    }

    public void setYgdh(String ygdh) {
        this.ygdh = ygdh == null ? null : ygdh.trim();
    }

    public Integer getYgqx() {
        return ygqx;
    }

    public void setYgqx(Integer ygqx) {
        this.ygqx = ygqx;
    }

    public String getYgyx() {
        return ygyx;
    }

    public void setYgyx(String ygyx) {
        this.ygyx = ygyx == null ? null : ygyx.trim();
    }

    public String getYgxf() {
        return ygxf;
    }

    public void setYgxf(String ygxf) {
        this.ygxf = ygxf == null ? null : ygxf.trim();
    }

    public Double getYgcj() {
        return ygcj;
    }

    public void setYgcj(Double ygcj) {
        this.ygcj = ygcj;
    }

    public String getYgpxyq() {
        return ygpxyq;
    }

    public void setYgpxyq(String ygpxyq) {
        this.ygpxyq = ygpxyq == null ? null : ygpxyq.trim();
    }

    public String getYgpxzp() {
        return ygpxzp;
    }

    public void setYgpxzp(String ygpxzp) {
        this.ygpxzp = ygpxzp == null ? null : ygpxzp.trim();
    }

    public Integer getYgzt() {
        return ygzt;
    }

    public void setYgzt(Integer ygzt) {
        this.ygzt = ygzt;
    }

    public Integer getYgdlzt() {
        return ygdlzt;
    }

    public void setYgdlzt(Integer ygdlzt) {
        this.ygdlzt = ygdlzt;
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

    public String getBxzd2() {
        return bxzd_2;
    }

    public void setBxzd2(String bxzd_2) {
        this.bxzd_2 = bxzd_2 == null ? null : bxzd_2.trim();
    }

	@Override
	public String toString() {
		return "Employee [ygzh=" + ygzh + ", id=" + id + ", ygmm=" + ygmm + ", ygxm=" + ygxm + ", ygxb=" + ygxb
				+ ", ygnl=" + ygnl + ", ygdz=" + ygdz + ", ygdwbh=" + ygdwbh + ", ygdh=" + ygdh + ", ygqx=" + ygqx
				+ ", ygyx=" + ygyx + ", ygxf=" + ygxf + ", ygcj=" + ygcj + ", ygpxyq=" + ygpxyq + ", ygpxzp=" + ygpxzp
				+ ", ygzt=" + ygzt + ", ygdlzt=" + ygdlzt + ", jsbs=" + jsbs + ", bxzd_1=" + bxzd_1 + ", bxzd_2="
				+ bxzd_2 + ", review=" + review + ", note=" + note + "]";
	}

}