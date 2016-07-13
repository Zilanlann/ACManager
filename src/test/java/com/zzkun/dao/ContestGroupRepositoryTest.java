package com.zzkun.dao;

import com.zzkun.model.ContestGroup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by kun on 2016/7/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springmvc-servlet.xml")
public class ContestGroupRepositoryTest {

    @Autowired
    private ContestGroupRepository contestGroupRepository;

    @Test
    public void findAll() throws Exception {
        ContestGroup group1 = contestGroupRepository.findOne(1);
        System.out.println(group1.getName());
        System.out.println(group1.getContests());
    }

    @Test
    public void save() throws Exception {
        ContestGroup group = new ContestGroup("山东科技大学第一次ACM集训");
        contestGroupRepository.save(group);
    }

    @Test
    public void findOne() throws Exception {

    }

}