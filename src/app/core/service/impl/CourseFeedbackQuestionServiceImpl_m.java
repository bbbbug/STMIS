package app.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.CourseFeedbackQuestionMapper;
import app.core.po.CourseFeedbackQuestion;
import app.core.service.CourseFeedbackQuestionService_m;

@Service
public class CourseFeedbackQuestionServiceImpl_m implements CourseFeedbackQuestionService_m{
	
	@Autowired
	public CourseFeedbackQuestionMapper courseFeedbackQuestionMapper;
	
	@Override
	public void addCourseFeedbackQuestion(List<CourseFeedbackQuestion> courseFeedbackQuestions) {
		courseFeedbackQuestionMapper.addCourseFeedbackQuestion(courseFeedbackQuestions);
	}

	@Override
	public List<CourseFeedbackQuestion> getAllCourseFeedbackQuestion() {		
		return courseFeedbackQuestionMapper.selectByExample(null);
	}

	@Override
	public void updateCourseFeedbackQuestion(List<CourseFeedbackQuestion> courseFeedbackQuestions) {
		courseFeedbackQuestionMapper.updateCourseFeedbackQuestion(courseFeedbackQuestions);
	}

}
