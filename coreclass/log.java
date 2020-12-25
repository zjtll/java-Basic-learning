package coreclass;


import java.util.logging.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import sun.applet.Main;


public class log {

	public static void main(String[] args) {
		//一、jdk logging 使用java内置的日志包java.util.logging ,这种方法使用的不多
		// jdk 的logging 定义了7种日志级别 {SEVERE WARNING INFO FINE FINER FINEST} 
		Logger logger = Logger.getGlobal();
		//logger.info("start process...");
		//logger.warning("warning ...");
		
		/* 二、commons logging  
		 1、 commons logging 和Java标准库提供的日志不同，Commons Logging是一个第三方日志库，它是由Apache创建的日志模块。
		 2、 Commons Logging的特色是，它可以挂接不同的日志系统，并通过配置文件指定挂接的日志系统。默认情况下，Commons Loggin自动搜索并使用Log4j
		     （Log4j是另一个流行的日志系统），如果没有找到Log4j，再使用JDK Logging。
		 3、commons 定义了6种日志级别{FATAL ERROR WARNING INFO DEBUG TRACE} 默认info
		 4、commons是第三方库所以要去https://commons.apache.org/下载该文件，解压将jar文件放到lib中右键build path，包出现在referenced说明导入成功
		*/
		 Log log = LogFactory.getLog(Main.class);
	        log.warn("start...");
	        log.error("end.");
	     
	      /* 三、log4j
	  
		 log4j 可以定义将日志输出到不同的地方，通过xml文件去定义。{console：输出到屏幕；file：输出到文件 socket：通过网络输出到远程计算机； jdbc：输出到数据库}
	         使用log4j只需要将log4j2.xml文件和下载好的log4j 解压拿到 log4j-api-2.x.jar log4j-core-x.jar log4j-jcl-2.x.jar放到lib下 build path后就可以使用了
	         使用方法只需要按照commons logging的方式写就可以得到log4的输出
	         在开发阶段，始终使用Commons Logging接口来写入日志，并且开发阶段无需引入Log4j。如果需要把日志写入文件， 
	         只需要把正确的配置文件和Log4j相关的jar包放入classpath，就可以自动把日志切换成使用Log4j写入，无需修改任何代码。

	      */ 
	        
		  /*四、SLF4j和logback
		   1、SLF4和logback 和commons log4j使用几乎是一样的,也需要将下载的SLF4J和logbackjar包和logback.xml文件放到lib下build后使用
		   2、定义方式如下
		   Logger logger = LoggerFactory.getLogger(getClass());
		   	 logger.warn("start...");
	
           */
	        
	}

}
