package com.github.springbootmapstruct.mapper;


import com.github.springbootmapstruct.pojo.UserDO;
import com.github.springbootmapstruct.pojo.UserPO;
import com.github.springbootmapstruct.pojo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * <p>
 * 创建时间为 下午9:06-2018/7/12
 * 项目名称 SpringBootMapStruct
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Mapper(componentModel = "spring")
public interface UserMapper1 {

    UserMapper1 MAPPER = Mappers.getMapper(UserMapper1.class);

    /**
     * 从第一个对象和第二个对象中提取出 UserVO 对象
     *
     * @param userDO 第一个对象
     * @param userPO 第二个对象
     * @return UserVO
     */
    @Mappings({
            @Mapping(source = "userDO.name", target = "name"),
            @Mapping(source = "userPO.info", target = "info"),
            @Mapping(source = "userPO.age", target = "age")
    })
    UserVO from(UserDO userDO, UserPO userPO);

}
