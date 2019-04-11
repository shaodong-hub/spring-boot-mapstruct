package com.github.springbootmapstruct.mapper;


import com.github.springbootmapstruct.pojo.UserDO;
import com.github.springbootmapstruct.pojo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * <p>
 * 创建时间为 下午6:51-2018/9/3
 * 项目名称 SpringBootMapStruct
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Mapper(componentModel = "spring")
public interface UserMapper2 {

    UserMapper2 MAPPER = Mappers.getMapper(UserMapper2.class);

    @Mappings({
        @Mapping(source = "name", target = "name"),
        @Mapping(source = "number", target = "number")
    })
    UserVO from(UserDO userDO);

}
