package app.core.util;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;



public class FileUtil {
	/**
	 * �ļ��ϴ�
	 * @param file
	 * @return
	 */
	public static boolean upoladFile(MultipartFile file,HttpServletRequest request,String uploadPath) throws Exception{
		if(!file.isEmpty()){
			//�ϴ��ļ�·��
			String uploadpath=request.getServletContext().getRealPath(uploadPath);
			//�ϴ��ļ���
			String filename=file.getOriginalFilename();
			File filepath=new File(uploadpath,filename);
			//�ж�·���Ƿ���ڣ���������ھʹ���·��
			if(!filepath.getParentFile().exists()){
				filepath.getParentFile().mkdirs();
			}
			//���ϴ��ļ����浽һ��Ŀ���ļ���
			file.transferTo(new File(uploadPath+File.separator+filename));
			return true;
		}else{
			return false;
		}
	}
	
	public static ResponseEntity<byte[]> downloadFile(HttpServletRequest request,String filename,String downloadPath) throws Exception{
		//�����ļ�·��
		String downloadpath=request.getServletContext().getRealPath(downloadPath);
		//
		File file=new File(downloadpath+File.separator+filename);
		HttpHeaders headers=new HttpHeaders();
		//������ʾ���ļ���
		String downloadFileName=new String(filename.getBytes("UTF-8"),"iso-8859-1");
		//֪ͨ��������ļ��ķ�ʽ
		headers.setContentDispositionFormData("attachment", downloadFileName);
		//������������
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);
	}
	
}
