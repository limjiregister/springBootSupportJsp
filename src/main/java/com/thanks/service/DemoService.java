package com.thanks.service;

import com.thanks.entity.Demo;
import com.thanks.repo.DemoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
public class DemoService implements DemoDao {

	@Resource
	private DemoRepository demoRepository;


	@Transactional
	@Override
	public Demo saveNewDemo(Demo demo) {

		return demoRepository.saveAndFlush(demo);

	}


	@Transactional(readOnly = true)
	@Override
	public Page loadDatas(Integer pageNo, Integer pageSize) {

		PageRequest request = new PageRequest(pageNo-1, pageSize);

		return demoRepository.findAll(request);
	}
}
