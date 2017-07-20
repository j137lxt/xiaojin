package org.j137.xiaojin.systemmag.controller;

import java.util.List;

import javax.annotation.Resource;

import org.j137.xiaojin.beans.Organization;
import org.j137.xiaojin.beans.Page;
import org.j137.xiaojin.systemmag.service.IOrganizationService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="system/organization")
public class OrganizationController {
	@Resource
	private IOrganizationService organizationServiceImpl;

	@RequestMapping(value="/findAll")
	public List<Organization> findOrg(){
		Page page=new Page();
		page.setIndex(1);
		page.setPageSize(10);
		List list=organizationServiceImpl.findAllOrg(page).getData();
		System.out.println(list);
		return list;
	}
	
	@RequestMapping(value="/addOrg")
	public void addOrg(@RequestBody Organization org){
		
	}

}