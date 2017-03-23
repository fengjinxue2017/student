package com.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manage.mapper.ClassesMapper;

@Service
@Transactional
public class ClassService {
	@Autowired
	private ClassesMapper classmapper;
	public List query(){
		List list = classmapper.getAllClasses();
		return list;
	}
}
