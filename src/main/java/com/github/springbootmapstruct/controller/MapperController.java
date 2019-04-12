package com.github.springbootmapstruct.controller;


import com.github.springbootmapstruct.mapper.UserMapper1;
import com.github.springbootmapstruct.mapper.UserMapper2;
import com.github.springbootmapstruct.pojo.UserDO;
import com.github.springbootmapstruct.pojo.UserPO;
import com.github.springbootmapstruct.pojo.UserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 创建时间为 下午9:18-2018/7/12
 * 项目名称 SpringBootMapStruct
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@RestController
public class MapperController {

    /**
     * 这个地方用 @Autowired 会报错
     */
    @Resource
    private UserMapper1 mapper1;

    @Resource
    private UserMapper2 mapper2;

    @GetMapping("/tuple")
    public UserVO getUserVO1() {
        UserDO userDO = new UserDO();
        userDO.setName("userDO");
        userDO.setDesc("userDO");
        userDO.setPass("userDO");

        UserPO userPO = new UserPO();
        userPO.setName("userPO");
        userPO.setInfo("userPO");
        userPO.setAge(19);

        return mapper1.from(userDO, userPO);
    }


    @GetMapping("/number")
    public UserVO getUserVO2() {
        UserDO userDO = new UserDO();
        userDO.setName("userDO");
        userDO.setDesc("userDO");
        userDO.setPass("userDO");
        userDO.setNumber(21322.12345678);
        return mapper2.from(userDO);
    }


}
