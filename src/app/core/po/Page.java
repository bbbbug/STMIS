package app.core.po;

public class Page {
	private Integer startPage;
	private Integer endPage;
	private Integer size;
	public Integer getStartPage() {
		return startPage;
	}
	public void setStartPage(Integer startPage) {
		this.startPage = startPage;
	}
	public Integer getEndPage() {
		return endPage;
	}
	public void setEndPage(Integer endPage) {
		this.endPage = endPage;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "开始页"+startPage+"截至页："+endPage+"页数："+size;
	}
}
