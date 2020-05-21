package app.core.po;

import java.util.List;

public class ExamResultList {
	private List<ExamResult> examResults;

	public List<ExamResult> getExamResults() {
		return examResults;
	}

	public void setExamResults(List<ExamResult> examResults) {
		this.examResults = examResults;
	}

	public ExamResultList() {
		super();
	}
	
	public ExamResultList(List<ExamResult> examResults){
		super();
		this.examResults=examResults;
	}
}
