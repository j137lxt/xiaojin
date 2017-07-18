package org.j137.xiaojin.sellmag.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.j137.xiaojin.beans.Baseinfo;
import org.j137.xiaojin.sellmag.service.IBaseinfoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/users")
@RestController
public class BaseinfoController {
	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource
	private IBaseinfoService baseinfoServiceImpl;
	
	@RequestMapping(value="/{id}",method=RequestMethod.POST,produces="application/json;charset=utf-8")
	public void saveBaseinfo(@RequestBody Baseinfo baseinfo){
		log.info(baseinfo);
		
		try {
			baseinfoServiceImpl.saveBaseinfo(baseinfo);
			System.out.println(System.getProperty("ssm.root"));
		} catch (Exception e) {
			// TODO: handle exception
			log.error("BaseinfoController-------saveBaseinfo()", e);
		}
	}
}
