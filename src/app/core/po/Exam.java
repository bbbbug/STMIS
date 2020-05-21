package app.core.po;

public class Exam {
    private Integer id;

    private String caption;

    private String answer;

    private String rrange;

    private String kcjs;

    private String sjlb;

    private String kcbh;
    
    private Category category;
    
    

    public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption == null ? null : caption.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getRrange() {
        return rrange;
    }

    public void setRrange(String rrange) {
        this.rrange = rrange == null ? null : rrange.trim();
    }

    public String getKcjs() {
        return kcjs;
    }

    public void setKcjs(String kcjs) {
        this.kcjs = kcjs == null ? null : kcjs.trim();
    }

    public String getSjlb() {
        return sjlb;
    }

    public void setSjlb(String sjlb) {
        this.sjlb = sjlb == null ? null : sjlb.trim();
    }

    public String getKcbh() {
        return kcbh;
    }

    public void setKcbh(String kcbh) {
        this.kcbh = kcbh == null ? null : kcbh.trim();
    }
}