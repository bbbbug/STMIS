package app.core.mapper;

import app.core.po.Review;
import app.core.po.ReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReviewMapper {
    int countByExample(ReviewExample example);

    int deleteByExample(ReviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Review record);

    int insertSelective(Review record);

    List<Review> selectByExample(ReviewExample example);

    Review selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Review record, @Param("example") ReviewExample example);

    int updateByExample(@Param("record") Review record, @Param("example") ReviewExample example);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKey(Review record);
    
    int addComment(Review review);
    
    List<Review> showReviews(Review review);
    
    List<Review> showReview(Review review);
}