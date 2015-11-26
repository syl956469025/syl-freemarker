package com.syl.freemarker;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

public class FreemarkerDemoTest {
	
	
	Configuration conf =null;
	
	@Before
	public void mark1() throws IOException  {
		conf = new Configuration();
		conf.setDirectoryForTemplateLoading(new File("src/main/template"));
		conf.setObjectWrapper(new DefaultObjectWrapper());
	}
	
	@Test
	public void mark4() throws ParseException, IOException, TemplateException{
		Map root = new HashMap();
		List<Person> plist = new ArrayList<Person>();
		plist.add(new Person("zhangsan", "北京市", "12","男"));
		plist.add(new Person("lisi", "北京市", "12","男"));
		plist.add(new Person("wangwu", "北京市", "12","男"));
		plist.add(new Person("zhaoliu", "北京市", "12","男"));
		root.put("plist", plist);
		List<Animal> alist = new ArrayList<Animal>();
		alist.add(new Animal("张三", "北京市", "12","男"));
		alist.add(new Animal("李四", "北京市", "12","男"));
		alist.add(new Animal("王五", "北京市", "12","男"));
		alist.add(new Animal("赵六", "北京市", "12","男"));
		root.put("alist", alist);
		Template t1 = conf.getTemplate("html.ftl");
		Writer out = new OutputStreamWriter(new FileOutputStream(new File("src/main/html/test.html")));
		t1.process(root, out);
		out.flush();
	}

	
	
	
	

}
