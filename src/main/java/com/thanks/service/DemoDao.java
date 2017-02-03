package com.thanks.service;

import com.thanks.entity.Demo;
import org.springframework.data.domain.Page;

/**
 * Created by Administrator on 2017/2/3.
 */
public interface DemoDao {

	Demo saveNewDemo(Demo demo);

	Page loadDatas(Integer pageNo, Integer pageSize);


}
