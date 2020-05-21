package app.core.util.m;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;


public class ReverseEngineering{
	public void generatorPojo() throws Exception{
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		//指定 逆向工程配置文件
		//System.out.println(this.getClass().getClassLoader().getResource("/").getPath().replace("%20", " "));
		File configFile = new File("generatorConfig.xml"); 
		//File configFile = new File(this.getClass().getClassLoader().getResource("/").getPath().replace("%20", " ")+"generatorConfig.xml"); 
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);
	}
	public static void main(String[] srgs) throws Exception{
		try {
			ReverseEngineering reverseEngineering = new ReverseEngineering();
			reverseEngineering.generatorPojo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
