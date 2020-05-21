package app.core.service;

import java.util.ArrayList;
import java.util.List;

import app.core.po.Course;
import app.core.po.CourseCollection;
import app.core.po.CourseResource;
import app.core.po.CourseSelection;
import app.core.po.Note;
import app.core.po.Page;
import app.core.po.Progress;
import app.core.po.Review;
public interface CourseService {
	/*
	 * �ϴ��γ̵Ľӿ�
	 */
	public Boolean addCourse(Course course);
	
	/*
	 * �ϴ��γ���Դ�Ľӿ�
	 */
	public Boolean addCourse(ArrayList<CourseResource> CourseList );
	
	/*
	 * ��ѯ�γ̵Ľӿ�
	 */
	public List<Course> showCourse(Page page );
	public List<Course> showHotCourse(Page page );
	public List<Course> showNewCourse(Page page );
	
	/*
	 * ��ѯĳһ�γ̵Ľӿ�
	 */
	public List<CourseResource> selectByKCBH(Course course);
	
	
	
	public Course selectCourse(Course course);
	
	/**
	 * �����γ�
	 * @param course
	 * @return
	 */
	public List<Course> searchCourse(Course course);
	
	/**
	 * ����ѯ
	 * @param course
	 * @return
	 */
	public List<Course> showByKclb(Course course);
	
	public CourseSelection checkFraction(CourseSelection courseSelection);
	
	public CourseSelection checkCourseSelection(CourseSelection courseSelection);
	
	public CourseCollection checkCourseCollect(CourseCollection courseCollection);
	
	public Boolean addComment(Review review);
	
	public List<Review> showReviews(Review review);
	
	public Boolean addNote(Note note);
	
	public List<Note> showNotes(Note note);
	
	public List<Course> recommendCourse(Course course);
	
	public List<Course> reCourse(CourseSelection courseSelection);
	
	List<Progress> selectProgress(Progress progress);
	
	public int learnCount(CourseSelection courseSelection);
	
	public List<Course> showAllCourse();
	
	public int updateKCXF(CourseSelection courseSelection);
}
