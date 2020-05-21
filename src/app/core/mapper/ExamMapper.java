package app.core.mapper;

import app.core.po.Exam;
import app.core.po.ExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamMapper {
	//author by Jaylin_Yang
    int countByExample(ExamExample example);

    int deleteByExample(ExamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Exam record);

    int insertSelective(Exam record);

    List<Exam> selectByExample(ExamExample example);

    Exam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Exam record, @Param("example") ExamExample example);

    int updateByExample(@Param("record") Exam record, @Param("example") ExamExample example);

    int updateByPrimaryKeySelective(Exam record);
//author by Jaylin_yang
    int updateByPrimaryKey(Exam exam);
    
    List<Exam> adminShowExam(Exam exam);
    
    List<Exam> startExam(@Param("exam") Exam exam, @Param("bxzd2") int bxzd2);
    
    Exam checkExamResult(Exam exam);
    

	List<Exam> selectExamByKcbhKcjs(Exam exam);

	String selectLbmcByKcbh(String kcbh);

	public List<Exam> searchFromExam(String caption);

	Exam selectByPrimaryKey(@Param("id") Integer id);
}