package com.thanks.repo;

import com.thanks.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Administrator on 2017/2/3.
 */
public interface DemoRepository extends JpaRepository<Demo, Long>, JpaSpecificationExecutor<Demo> {




}
