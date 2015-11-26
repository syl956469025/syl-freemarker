package com.syl.freemarker;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import freemarker.template.TemplateModelException;
import freemarker.template.TemplateTransformModel;

public class UpperCaseTransform implements TemplateTransformModel {

	public Writer getWriter(Writer out, Map args) throws TemplateModelException, IOException {
		
		return new UpperCaseWriter(out);
	}
	
	private class UpperCaseWriter extends Writer{
		
		private Writer out;
		
		UpperCaseWriter(Writer out){
			this.out = out;
		}
		

		@Override
		public void write(char[] cbuf, int off, int len) throws IOException {
			this.out.write(new String(cbuf, off, len).toUpperCase());
		}

		@Override
		public void flush() throws IOException {
			out.flush();
		}

		@Override
		public void close() throws IOException {
		}
		
	}

}
