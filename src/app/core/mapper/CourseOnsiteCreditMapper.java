package app.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import app.core.po.CourseOnsiteCredit;
import app.core.po.CourseOnsiteCreditAggregation;
import app.core.po.CourseOnsiteCreditExample;

public interface CourseOnsiteCreditMapper {
	//自定义
	//批量插入线下员工学分
	public void addBatchCourseOnsiteCredit(List<CourseOnsiteCredit> courseOnsiteCredits);
	
	/**
	 * 将学员账号分组查询，计算每个员工的线下总学分
	 * @author chen
	 * @return
	 * 修改时间:2019.7.11
	 */
	public List<CourseOnsiteCreditAggregation> selectCourseOnsiteCreditWithEmp();
	
	
	//自动生成
    int countByExample(CourseOnsiteCreditExample example);

    int deleteByExample(CourseOnsiteCreditExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseOnsiteCredit record);

    int insertSelective(CourseOnsiteCredit record);

    List<CourseOnsiteCredit> selectByExample(CourseOnsiteCreditExample example);

    CourseOnsiteCredit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseOnsiteCredit record, @Param("example") CourseOnsiteCreditExample example);

    int updateByExample(@Param("record") CourseOnsiteCredit record, @Param("example") CourseOnsiteCreditExample example);

    int updateByPrimaryKeySelective(CourseOnsiteCredit record);

    int updateByPrimaryKey(CourseOnsiteCredit record);
}