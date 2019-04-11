package com.github.springbootmapstruct.pojo;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 创建时间为 下午8:51-2018/7/12
 * 项目名称 SpringBootMapStruct
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@Getter
@Setter
public class UserDO {

    private String name;

    private String pass;

    private String desc;

    private Double number;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}
