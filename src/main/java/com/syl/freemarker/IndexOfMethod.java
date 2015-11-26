package com.syl.freemarker;

import java.util.List;

import freemarker.template.SimpleNumber;
import freemarker.template.TemplateMethodModel;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

public class IndexOfMethod implements TemplateMethodModel {

	public TemplateModel exec(List list) throws TemplateModelException {
		if(list.size() != 2){
			throw new TemplateModelException("Wrong arguments");
		}
		return new SimpleNumber(((String)list.get(0)).indexOf((String)list.get(1)));
	}

}
