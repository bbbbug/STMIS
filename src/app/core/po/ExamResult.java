package app.core.po;

public class ExamResult {
    private Integer id;

    private Integer stid;

    private String answer;

    private String ygzh;

    private String kcbh;
    
    private String caption;
    
    private String right_answer;
    
    private String ktsl;
    
    private String rrange;
    
    

    public String getRrange() {
		return rrange;
	}

	public void setRrange(String rrange) {
		this.rrange = rrange;
	}

	public String getKtsl() {
		return ktsl;
	}

	public void setKtsl(String ktsl) {
		this.ktsl = ktsl;
	}

	public String getRight_answer() {
		return right_answer;
	}

	public void setRight_answer(String right_answer) {
		this.right_answer = right_answer;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public Integer getId() {
        return id;
    }
    
    public ExamResult() {
		super();
	}
    
	public ExamResult(Integer id, Integer stid, String answer, String ygzh, String kcbh) {
		super();
		this.id = id;
		this.stid = stid;
		this.answer = answer;
		this.ygzh = ygzh;
		this.kcbh = kcbh;
	}

	public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
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
}