package org.j137.xiaojin.filter;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class EncodingHttpServletRequest extends HttpServletRequestWrapper {

	private HttpServletRequest request;
	private String encoding;
	
	public EncodingHttpServletRequest(HttpServletRequest request) {
		super(request);
		// TODO Auto-generated constructor stub
		this.request = request;
	}
	
	public EncodingHttpServletRequest(HttpServletRequest request,String encoding) {
		super(request);
		// TODO Auto-generated constructor stub
		this.request = request;
		this.encoding = encoding;
	}
	
	@Override
	public Map<String, String[]> getParameterMap() {
		// TODO Auto-generated method stub
		String content = getQueryString();
		Map<String,String[]> params = new HashMap<String,String[]>();
		Map<String,List<String>> multiValues = new HashMap<String, List<String>>();
		if(content != null){
			String [] tem = content.split("&");
			for (String str : tem) {
				String[] kvs = str.split("=");
				if(params.containsKey(kvs[0])){
					List<String> valuesList;
					if(multiValues.containsKey(kvs[0])){
						valuesList = multiValues.get(kvs[0]);
						if(kvs.length >= 2){
							valuesList.add(kvs[1]);
						}else{
							valuesList.add("");
						}
					}else{
						valuesList = new ArrayList<String>();
						valuesList.add(params.get(kvs[0])[0]);
						if(kvs.length >= 2){
							valuesList.add(kvs[1]);
						}else{
							valuesList.add("");
						}
						multiValues.put(kvs[0], valuesList);
					}
				}else{
					if(kvs.length >=2){
						params.put(kvs[0], new String[]{kvs[1]});
					}else{
						params.put(kvs[0], new String[]{""});
					}
				}
			}
			
			if(multiValues != null && !multiValues.isEmpty()){
				Iterator<String> its = multiValues.keySet().iterator();
				while (its.hasNext()) {
					String key = (String) its.next();
					List<String> strs = multiValues.get(key);
					int size = strs.size();
					String[] arrays = new String[size];
					for(int i = 0; i < size; i ++){
						arrays[i] = strs.get(i);
					}
					params.put(key, arrays);
				}
			}
		}
		return params;
	}
	
	@Override
	public String getQueryString() {
		// TODO Auto-generated method stub
		String content = request.getQueryString();
		if(content != null){
			try {
				content = URLDecoder.decode(content, encoding);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return content;
	}
	
	@Override
	public String getParameter(String name) {
		// TODO Auto-generated method stub
		Map<String, String[]> params = getParameterMap();
		String val = "";
		if(params != null && params.containsKey(name)){
			val = params.get(name)[0];
		}
		return val;
	}
	
	@Override
	public Enumeration<String> getParameterNames() {
		// TODO Auto-generated method stub
		return Collections.enumeration(getParameterMap().keySet());
	}
	
	@Override
	public String[] getParameterValues(String name) {
		// TODO Auto-generated method stub
		return (String[]) getParameterMap().get(name);
	}

}
