package app.core.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.mapper.CourseCollectionMapper;
import app.core.mapper.CourseMapper;
import app.core.mapper.CourseResourceMapper;
import app.core.mapper.CourseSelectionMapper;
import app.core.mapper.EmployeeMapper;
import app.core.mapper.NoteMapper;
import app.core.mapper.ProgressMapper;
import app.core.mapper.ReviewMapper;
import app.core.po.Course;
import app.core.po.CourseCollection;
import app.core.po.CourseResource;
import app.core.po.CourseSelection;
import app.core.po.Course_Selection;
import app.core.po.Employee;
import app.core.po.Note;
import app.core.service.CourseService;
import app.core.po.Page;
import app.core.po.Progress;
import app.core.po.Review;

@Service("courseService")
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseMapper courseMapper;
	@Autowired
	private CourseResourceMapper courseResourceMapper;
	@Autowired
	private CourseSelectionMapper courseSelectionMapper;
	@Autowired
	private ReviewMapper reviewMapper;
	@Autowired
	private NoteMapper noteMapper;
	@Autowired
	private CourseCollectionMapper collectionMapper ;
	@Autowired
	private EmployeeMapper employeeMapper ;
	@Autowired
	private ProgressMapper progressMapper ;
	
	@Override
	public Boolean addCourse(Course course) {
		System.out.println("����addCourseImpl");
		courseMapper.insert(course);
		return true;
	}
	
	@Override
	public Boolean addCourse(ArrayList<CourseResource> CourseList) {
		System.out.println("����addCourseImpl_1");
		for (CourseResource courseResource : CourseList) {
			List<CourseResource> cResources = courseResourceMapper.selectCourseResource(courseResource);
			if(cResources.size()>0){
				courseResource.setZjxh(cResources.get(0).getZjxh()+1);
			}else{
				courseResource.setZjxh(1);
			}
			courseResourceMapper.insert(courseResource);
		}
		return true;
	}

	@Override
	public List<Course> showCourse(Page page) {
		System.out.println("����showCourseImpl");
		List<Course> course_list = courseMapper.selectChoose(page);
		return course_list;
	}

	@Override
	public List<CourseResource> selectByKCBH(Course course) {
		System.out.println("����selectByKCBHImpl");
		return courseResourceMapper.selectByKCBH(course.getKcbh());
	}

	@Override
	public Course selectCourse(Course course) {
		System.out.println("����selectCourse����");
		return courseMapper.selectByPrimaryKey(course.getKcbh());
	}

	@Override
	public List<Course> searchCourse(Course course) {
		System.out.println("����searchCourse����");
		return courseMapper.searchCourse(course);
	}

	@Override
	public List<Course> showByKclb(Course course) {
		System.out.println("����showByKclb����");
		System.out.println(course.getKclb());
		return courseMapper.showByKclb(course);
	}

	@Override
	public CourseSelection checkFraction(CourseSelection courseSelection) {
		return courseSelectionMapper.checkFraction(courseSelection);
	}

	@Override
	public CourseSelection checkCourseSelection(CourseSelection courseSelection) {
		return courseSelectionMapper.checkCourseSelection(courseSelection);
	}

	@Override
	public Boolean addComment(Review review) {
		if(reviewMapper.addComment(review)>0){
			return true;
		}
		return false;
	}

	@Override
	public List<Review> showReviews(Review review) {
		System.out.println("��������"+review.getKcbh());
		return reviewMapper.showReviews(review);
	}

	@Override
	public Boolean addNote(Note note) {
		System.out.println("�ʼ�����"+note);
		if(noteMapper.addNote(note)>0){
			return true;
		}
		return false;
	}

	@Override
	public List<Note> showNotes(Note note) {
		System.out.println(":note"+note.getYgzh());
		List<Note> notes=noteMapper.showNotes(note);
		System.out.println("�ʼ���Ŀľľľ"+notes.size());
		return notes;
	}

	@Override
	public CourseCollection checkCourseCollect(CourseCollection courseCollection) {
		return collectionMapper.checkCourseCollect(courseCollection);
	}

	@Override
	public List<Course> recommendCourse(Course course) {
		System.out.println("�Ƽ��γ����"+course.getKclb());
		return courseMapper.recommendCourse(course);
	}

	@Override
	public List<Course> reCourse(CourseSelection courseSelection) {
		int emCount = employeeMapper.emCount();
		System.out.println("Ա������"+Math.floor(emCount/3));
		courseSelection.setThreshold((int)Math.floor(emCount/3));
		courseSelection.setKcbh(courseSelection.getKcbh().substring(0,courseSelection.getKcbh().length()-6));
		System.out.println("�µ�kcbh"+courseSelection.getKcbh());
		List<CourseSelection> reCourses = courseSelectionMapper.selectReCourse(courseSelection);
		System.out.println("�Ƽ�"+reCourses.size());
		List<Course> recomCourses =new ArrayList<Course>();
		if(reCourses.size()>0){
			for (CourseSelection rec : reCourses) {
				Course course = courseMapper.selectByPrimaryKey(rec.getKcbh());
				
				int learnCount = courseSelectionMapper.learnCount(rec);
				System.out.println("�������γ���"+learnCount);
				course.setBxzd1(""+learnCount);
				recomCourses.add(course);
			}
		}
		return recomCourses;
	}

	@Override
	public List<Progress> selectProgress(Progress progress) {
		return progressMapper.selectProgress(progress);
	}

	@Override
	public int learnCount(CourseSelection courseSelection) {
		return courseSelectionMapper.learnCount(courseSelection);
	}

	@Override
	public List<Course> showHotCourse(Page page) {
		List<CourseSelection> hotCSelections = courseSelectionMapper.showHotCourse(page);
		System.out.println("hotCSelections"+hotCSelections.size());
		List<Course> hotCourses =new ArrayList<Course>();
		for (CourseSelection cs : hotCSelections) {
			Course course = courseMapper.selectByPrimaryKey(cs.getKcbh());
			hotCourses.add(course);
		}
		System.out.println("hotCourses"+hotCourses.size());
		return hotCourses;
	}

	@Override
	public List<Course> showNewCourse(Page page) {
		List<Course>newcourses = courseMapper.showNewCourse(page);
		for (Course c : newcourses) {
			System.out.println(c.getKcmc());
		}
		return courseMapper.showNewCourse(page);
	}

	@Override
	public List<Course> showAllCourse() {
		return courseMapper.showAllCourse();
	}

	@Override
	public int updateKCXF(CourseSelection courseSelection) {
		System.out.println("����fenshu");
		return courseSelectionMapper.updateKCXF(courseSelection);
	}	
}
 