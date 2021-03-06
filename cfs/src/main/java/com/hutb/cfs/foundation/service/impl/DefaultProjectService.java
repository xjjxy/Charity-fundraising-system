package com.hutb.cfs.foundation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hutb.cfs.admin.dao.StatisticDao;
import com.hutb.cfs.foundation.dao.BasicProjectDao;
import com.hutb.cfs.foundation.entity.Project;
import com.hutb.cfs.foundation.service.BasicProjectService;


@Component
public class DefaultProjectService implements BasicProjectService {

	@Autowired
	private BasicProjectDao projectDao;
	
	@Autowired
	private StatisticDao statisticDao;
	
	@Override
	public int addProject(Project p) {
		// TODO Auto-generated method stub
		statisticDao.addProject_Count();
		return projectDao.addProject(p);
	}


	@Override
	public List<Project> getAllMyProject(int foundation_id) {
		// TODO Auto-generated method stub
		return projectDao.getAllMyProject(foundation_id);
	}


	@Override
	public String getFoundationName(int foundation_id) {
		// TODO Auto-generated method stub
		return projectDao.getFoundationName(foundation_id);
	}

}
