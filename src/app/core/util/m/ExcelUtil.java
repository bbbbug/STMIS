package app.core.util.m;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import app.core.po.CourseFeedbackQuestion;
import app.core.po.Employee;
import app.core.po.Exam;

public class ExcelUtil {
	//����������
	public static void main(String[] args) throws FileNotFoundException, IOException, InstantiationException,
			IllegalAccessException, ClassNotFoundException {
		ExcelUtil excelUtil = new ExcelUtil();
		Employee employee = new Employee();
		// String filePath = "D:\\Ա����ѵ������Ϣϵͳ\\Ա����ѵϵͳ���ڿ���\\java����Excel\\Ա������
		// (ģ��).xlsx";
		String filePath = "D:\\Ա����ѵ������Ϣϵͳ\\Ա����ѵϵͳ���ڿ���\\java����Excel\\�����ϴ�(ģ��).xlsx";
		excelUtil.importExcelToPo_exam(filePath);
	}
	
	/**
	 * �ϴ�Excel�����ϴ�ģ�壬����װ������Exam��POJO������
	 * @author chen
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public List<Exam> importExcelToPo_exam(String filePath) throws FileNotFoundException,
			IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {// ��׺��ΪxlsxΪ�°�excel�ļ�
		// ����
		// Class clazz=Class.forName(object.getClass().getName());
		// System.out.println(clazz);
		// System.out.println(object.getClass().newInstance());//ʵ��������

		Workbook workbook;
		if (filePath.indexOf(".xlsx") > -1) {
			workbook = new XSSFWorkbook(new FileInputStream(filePath));
		} else {
			workbook = new HSSFWorkbook(new FileInputStream(filePath));
		}

		// ��ȡExcel���
		Sheet sheet = workbook.getSheet("Sheet1");// ���������������
		int rows = sheet.getPhysicalNumberOfRows();// ��ȡ���
		int cells = 0;// ��Ԫ�����
		List<String> cellTitle = new ArrayList<String>();// ��Ԫ��ı���
		List<Exam> examList = new ArrayList<Exam>();// Ա�����󼯺�
		List<Exam> examListFromExcel = new ArrayList<Exam>();
		System.out.println(rows);
		// �������
		for (int r = 0; r < rows; r++) {// ����Excel������
			if (r == 0) {
				// �ڵ�һ�б����м�����п��,��Ϊ�������п��ܻ��п�ֵ
				cells = sheet.getRow(r).getLastCellNum();
				Row row = sheet.getRow(r);// ��ȡ��Ԫ����ָ�����ж���
				for (int c = 0; c < cells; c++) {// ����ѭ����Ӧ��Ԫ��
					Cell cell = row.getCell(c);
					// ��ӡ��ͷ����
					cellTitle.add(cell.getStringCellValue());
					System.out.println(cell.getStringCellValue());
				}
				continue;
			}
			String cellValue = "";
			Row row = sheet.getRow(r);// ��ȡ��Ԫ����ָ���еĶ���
			if (row != null) {// �в�Ϊ��
				// System.out.println(row.toString());
				Exam exam = new Exam();// ÿһ�ж�Ӧһ������
				String options="";//��װѡ����ѡ��
				for (int c = 0; c < cells; c++) {// ��Excel������
					String title = cellTitle.get(c);// ��ȡ��Ӧ���������
					Cell cell = row.getCell(c);
					String value = formatCellData(cell);// ��ȡ����е����ݽ����ַ�����ʽ��					
					if (!value.equals("")) {
						if (title.equals("ID")) {
//							exam.setId(Integer.parseInt(value));
						} else if (title.equals("问题")) {
							exam.setCaption(value);
						} else if (title.equals("A选项")) {
							options+=value+"#";
						} else if (title.equals("B选项")) {
							options+=value+"#";
						} else if (title.equals("C选项")) {
							options+=value+"#";
						} else if (title.equals("D选项")) {
							options+=value+"#";
						} else if (title.equals("正确答案")) {
							exam.setAnswer(value);
						}
					}
				}				
				options=options.substring(0, options.length()-1);
				exam.setRrange(options);
				examList.add(exam);
			}
		}
		examListFromExcel = examList;
		System.out.println(examListFromExcel);
		return examListFromExcel;
	}

	/**
	 * �ϴ�ExcelԱ����Ϣģ�壬����װ��Ա��Employee��POJO������
	 * 
	 * @author chen
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public List<Employee> importExcelToPo_employee(String filePath) throws FileNotFoundException, IOException,
			InstantiationException, IllegalAccessException, ClassNotFoundException {// ��׺��ΪxlsxΪ�°�excel�ļ�
		// ����
		// Class clazz=Class.forName(object.getClass().getName());
		// System.out.println(clazz);
		// System.out.println(object.getClass().newInstance());//ʵ��������

		Workbook workbook;
		if (filePath.indexOf(".xlsx") > -1) {
			workbook = new XSSFWorkbook(new FileInputStream(filePath));
		} else {
			workbook = new HSSFWorkbook(new FileInputStream(filePath));
		}

		// ��ȡExcel���
		Sheet sheet = workbook.getSheet("Sheet1");// ���������������
		int rows = sheet.getPhysicalNumberOfRows();// ��ȡ���
		int cells = 0;// ��Ԫ�����
		List<String> cellTitle = new ArrayList<String>();// ��Ԫ��ı���
		List<Employee> employeeList = new ArrayList<Employee>();// Ա�����󼯺�
		List<Employee> employeeListFromExcel = new ArrayList<Employee>();
		System.out.println(rows);
		// �������
		for (int r = 0; r < rows; r++) {// ����Excel������
			if (r == 0) {
				// �ڵ�һ�б����м�����п��,��Ϊ�������п��ܻ��п�ֵ
				cells = sheet.getRow(r).getLastCellNum();
				Row row = sheet.getRow(r);// ��ȡ��Ԫ����ָ�����ж���
				for (int c = 0; c < cells; c++) {// ����ѭ����Ӧ��Ԫ��
					Cell cell = row.getCell(c);
					// ��ӡ�������
					cellTitle.add(cell.getStringCellValue());
					System.out.println(cell.getStringCellValue());
				}
				continue;
			}
			String cellValue = "";
			Row row = sheet.getRow(r);// ��ȡ��Ԫ����ָ���еĶ���
			if (row != null) {// �в�Ϊ��
				// System.out.println(row.toString());
				Employee employee = new Employee();// ÿһ�ж�Ӧһ������
				for (int c = 0; c < cells; c++) {// ��Excel������
					String title = cellTitle.get(c);// ��ȡ��Ӧ���������
					Cell cell = row.getCell(c);
					String value = formatCellData(cell);// ��ȡ����е����ݽ����ַ�����ʽ��
					if (!value.equals("")) {
						if (title.equals("ID")) {
							employee.setId(Integer.parseInt(value));
						} else if (title.equals("员工账号")) {
							employee.setYgzh(value);
						} else if (title.equals("员工密码")) {
							employee.setYgmm(value);
						} else if (title.equals("员工姓名")) {
							employee.setYgxm(value);
						} else if (title.equals("员工性别")) {
							employee.setYgxb(value);
						} else if (title.equals("员工年龄")) {
							employee.setYgnl(Integer.parseInt(value));
						} else if (title.equals("员工地址")) {
							employee.setYgdz(value);
						} else if (title.equals("员工单位编号")) {
							employee.setYgdwbh(value);
						} else if (title.equals("员工电话")) {
							employee.setYgdh(value);
						} else if (title.equals("员工邮箱")) {
							employee.setYgyx(value);
						} else if (title.equals("员工状态")) {
							employee.setYgzt(Integer.parseInt(value));
						} else if (title.equals("员工登录状态")) {
							employee.setYgdlzt(Integer.parseInt(value));
						}
					}
					// if(cell!=null){
					// switch (cell.getCellTypeEnum()) {
					// case STRING:
					// String stringValue=cell.getStringCellValue();
					// break;
					// case NUMERIC:
					// Double doubleValue=cell.getNumericCellValue();
					// break;
					// case BOOLEAN:
					// Boolean booleanValue=cell.getBooleanCellValue();
					// break;
					// default:
					// if(HSSFDateUtil.isCellDateFormatted(cell)){//�������������
					// Date dateValue=cell.getDateCellValue();
					// }
					// break;
					// }
					// }
				}
				employeeList.add(employee);
			}
		}
		employeeListFromExcel = employeeList;
		System.out.println(employeeListFromExcel);
		return employeeListFromExcel;
	}

	/**
	 * �ϴ�Excel�γ̷���ģ�壬����װ��������POJO������
	 * 
	 * @author chen
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public List<CourseFeedbackQuestion> importExcelToPo_feedbackQuestion(String filePath) throws FileNotFoundException,
			IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {// ��׺��ΪxlsxΪ�°�excel�ļ�
		// ����
		// Class clazz=Class.forName(object.getClass().getName());
		// System.out.println(clazz);
		// System.out.println(object.getClass().newInstance());//ʵ��������

		Workbook workbook;
		if (filePath.indexOf(".xlsx") > -1) {
			workbook = new XSSFWorkbook(new FileInputStream(filePath));
		} else {
			workbook = new HSSFWorkbook(new FileInputStream(filePath));
		}

		// ��ȡExcel���
		Sheet sheet = workbook.getSheet("Sheet1");// ���������������
		int rows = sheet.getPhysicalNumberOfRows();// ��ȡ���
		int cells = 0;// ��Ԫ�����
		List<String> cellTitle = new ArrayList<String>();// ��Ԫ��ı���
		List<CourseFeedbackQuestion> courseFeedbackQuestionList = new ArrayList<CourseFeedbackQuestion>();// Ա�����󼯺�
		List<CourseFeedbackQuestion> courseFeedbackQuestionListFromExcel = new ArrayList<CourseFeedbackQuestion>();
		System.out.println(rows);
		// �������
		for (int r = 0; r < rows; r++) {// ����Excel������
			if (r == 0) {
				// �ڵ�һ�б����м�����п��,��Ϊ�������п��ܻ��п�ֵ
				cells = sheet.getRow(r).getLastCellNum();
				Row row = sheet.getRow(r);// ��ȡ��Ԫ����ָ�����ж���
				for (int c = 0; c < cells; c++) {// ����ѭ����Ӧ��Ԫ��
					Cell cell = row.getCell(c);
					// ��ӡ�������
					cellTitle.add(cell.getStringCellValue());
					System.out.println(cell.getStringCellValue());
				}
				continue;
			}
			String cellValue = "";
			Row row = sheet.getRow(r);// ��ȡ��Ԫ����ָ���еĶ���
			if (row != null) {// �в�Ϊ��
				// System.out.println(row.toString());
				CourseFeedbackQuestion courseFeedbackQuestion = new CourseFeedbackQuestion();// ÿһ�ж�Ӧһ������
				for (int c = 0; c < cells; c++) {// ��Excel������
					String title = cellTitle.get(c);// ��ȡ��Ӧ���������
					Cell cell = row.getCell(c);
					String value = formatCellData(cell);// ��ȡ����е����ݽ����ַ�����ʽ��
					if (!value.equals("")) {
						if (title.equals("ID")) {
							courseFeedbackQuestion.setId(Integer.parseInt(value));
						} else if (title.equals("题目名称")) {
							courseFeedbackQuestion.setFktmmc(value);
						} else if (title.equals("题目选项1")) {
							courseFeedbackQuestion.setFktmxx1(value);
							;
						} else if (title.equals("题目选项2")) {
							courseFeedbackQuestion.setFktmxx2(value);
							;
						} else if (title.equals("题目选项3")) {
							courseFeedbackQuestion.setFktmxx3(value);
						} else if (title.equals("题目选项4")) {
							courseFeedbackQuestion.setFktmxx4(value);
						} else if (title.equals("题目选项5")) {
							courseFeedbackQuestion.setFktmxx5(value);
						} else if (title.equals("题目类型")) {
							courseFeedbackQuestion.setFktmlx(value);
						}
					}
				}
				courseFeedbackQuestionList.add(courseFeedbackQuestion);
			}
		}
		courseFeedbackQuestionListFromExcel = courseFeedbackQuestionList;
		System.out.println(courseFeedbackQuestionListFromExcel);
		return courseFeedbackQuestionListFromExcel;
	}
	

	/**
	 * ��ʽ������ڵ�����Ϊ�ַ���
	 * 
	 * @param cell
	 * @return
	 */
	public String formatCellData(Cell cell) {
		String value = "";
		if (cell != null) {
			switch (cell.getCellTypeEnum()) {
			case STRING:
				String stringValue = cell.getStringCellValue();
				value = cell.getStringCellValue();
				break;
			case NUMERIC:
				Double doubleValue = cell.getNumericCellValue();
				value = new Integer(doubleValue.intValue()).toString();
				break;
			case BOOLEAN:
				Boolean booleanValue = cell.getBooleanCellValue();
				value = booleanValue.toString();
				break;
			default:
				if (HSSFDateUtil.isCellDateFormatted(cell)) {// �������������
					Date dateValue = cell.getDateCellValue();
					value = dateValue.toString();
				}
				break;
			}
		}
		return value;
	}
}
