package app.core.po;

import java.util.Date;

public class Review {
    private Integer id;

    private String ygzh;

    private String kcbh;

    private String plnr;

    private Date plsj;

    private Integer pllll;
    
    private Employee employee;
    

    public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

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

    public String getPlnr() {
        return plnr;
    }

    public void setPlnr(String plnr) {
        this.plnr = plnr == null ? null : plnr.trim();
    }

    public Date getPlsj() {
        return plsj;
    }

    public void setPlsj(Date plsj) {
        this.plsj = plsj;
    }

    public Integer getPllll() {
        return pllll;
    }

    public void setPllll(Integer pllll) {
        this.pllll = pllll;
    }
}