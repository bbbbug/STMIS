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
		return "��ʼҳ"+startPage+"����ҳ��"+endPage+"ҳ����"+size;
	}
}
