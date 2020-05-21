package app.core.mapper;

import app.core.po.CourseOnsiteCreditAggregation;
import app.core.po.Grade;
import app.core.po.GradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeMapper {
	//�Զ���
		/**
		 * @author chen
		 * �����޸�Ա���ɼ�Grade������¿γ�ѧ�֣���Ӧ��ѡ�ֶ�3
		 * �޸�ʱ��:2019.7.11
		 */
		public void updateBatchGradeWithEmp(List<CourseOnsiteCreditAggregation> list);
	
    int countByExample(GradeExample example);

    int deleteByExample(GradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Grade record);

    int insertSelective(Grade record);

    List<Grade> selectByExample(GradeExample example);

    Grade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Grade record, @Param("example") GradeExample example);

    int updateByExample(@Param("record") Grade record, @Param("example") GradeExample example);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
    
	List selectAllFrom3Table();

	List selectYGDetialFrom2(@Param("YGBH") String YGBH);

	//author by Jaylin 2019.7.1
	public List searchYearEnd(@Param("ygzh") String ygzh);
	//author by Jaylin 2019.7.10
	Grade selectGradeByYgzh(@Param("ygzh") String ygzh);
}