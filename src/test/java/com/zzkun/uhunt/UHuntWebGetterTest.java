package com.zzkun.uhunt;

import com.zzkun.util.web.UHuntWebGetter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by kun on 2016/7/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:springmvc-servlet.xml")
public class UHuntWebGetterTest {

    @Autowired
    private UHuntWebGetter webGetter;

    @Test
    public void allPbInfo() throws Exception {
//        List<UVaPbInfo> list = webGetter.allPbInfo();
//        System.out.println(list);
    }

    @Test
    public void allPbInfo2() throws Exception {
//        List<ExtOjPbInfo> list = webGetter.allPbInfo2(link);
//        System.out.println(list);
    }

    @Test
    public void uname2uid() throws Exception {

    }

    @Test
    public void userACSubmits() throws Exception {
//        List<Integer> list = webGetter.userACSubmits(617781, link);
//        System.out.println(list);
//        System.out.println(list.size());
    }

}