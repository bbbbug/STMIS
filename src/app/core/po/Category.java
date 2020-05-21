package app.core.po;

import java.io.Serializable;

public class Category implements Serializable{
    private String LBBH;

    private Integer ID;

    private String LBMC;

    private String BXZD_1;

    private String BXZD_2;

    public String getLBBH() {
        return LBBH;
    }

    public void setLBBH(String LBBH) {
        this.LBBH = LBBH == null ? null : LBBH.trim();
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getLBMC() {
        return LBMC;
    }

    public void setLBMC(String LBMC) {
        this.LBMC = LBMC == null ? null : LBMC.trim();
    }

    public String getBXZD_1() {
        return BXZD_1;
    }

    public void setBXZD_1(String BXZD_1) {
        this.BXZD_1 = BXZD_1 == null ? null : BXZD_1.trim();
    }

    public String getBXZD_2() {
        return BXZD_2;
    }

    public void setBXZD_2(String BXZD_2) {
        this.BXZD_2 = BXZD_2 == null ? null : BXZD_2.trim();
    }

	@Override
	public String toString() {
		return "Category [LBBH=" + LBBH + ", ID=" + ID + ", LBMC=" + LBMC + ", BXZD_1=" + BXZD_1 + ", BXZD_2=" + BXZD_2
				+ "]";
	}

	
    
}