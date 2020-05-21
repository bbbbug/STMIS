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
	 * 文件上传
	 * @param file
	 * @return
	 */
	public static boolean upoladFile(MultipartFile file,HttpServletRequest request,String uploadPath) throws Exception{
		if(!file.isEmpty()){
			//上传文件路径
			String uploadpath=request.getServletContext().getRealPath(uploadPath);
			//上传文件名
			String filename=file.getOriginalFilename();
			File filepath=new File(uploadpath,filename);
			//判断路径是否存在，如果不存在就创建路径
			if(!filepath.getParentFile().exists()){
				filepath.getParentFile().mkdirs();
			}
			//将上传文件保存到一个目标文件中
			file.transferTo(new File(uploadPath+File.separator+filename));
			return true;
		}else{
			return false;
		}
	}
	
	public static ResponseEntity<byte[]> downloadFile(HttpServletRequest request,String filename,String downloadPath) throws Exception{
		//下载文件路径
		String downloadpath=request.getServletContext().getRealPath(downloadPath);
		//
		File file=new File(downloadpath+File.separator+filename);
		HttpHeaders headers=new HttpHeaders();
		//下载显示的文件名
		String downloadFileName=new String(filename.getBytes("UTF-8"),"iso-8859-1");
		//通知浏览器打开文件的方式
		headers.setContentDispositionFormData("attachment", downloadFileName);
		//二进制流数据
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers,HttpStatus.CREATED);
	}
	
}
