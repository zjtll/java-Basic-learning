package aggregate;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class properties {
	//properties 是java的一种配置文件，文件后缀为“.properties” ,文件的内容是"key=value"格式，用#号表示注释
	public static void main(String[] args) throws IOException {
		Properties pro = new Properties(); //创建一个properties对象
		OutputStream proos = new FileOutputStream("user.properties"); //创建文件输出流，里面写文件的路径，向文件中写数据
		pro.setProperty("id", "10001");
		pro.setProperty("username", "test");
		pro.setProperty("password", "123123");
		pro.store(proos, "User"); //写入配置方法用store，第一个参数是输出流，第二个是注释
		proos.close(); //关闭文件流
		//将文件数据读出
		InputStream prois = new FileInputStream("user.properties");
		
		pro.load(prois); //读出配置文件内容使用load
		System.out.println(pro);
		System.out.println(Integer.parseInt((String) pro.get("id")));
		System.out.println((String)pro.get("username"));
		System.out.println((String)pro.get("password"));
		prois.close();
	}

}
