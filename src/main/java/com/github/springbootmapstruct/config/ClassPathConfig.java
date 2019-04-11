package com.github.springbootmapstruct.config;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 创建时间为 下午3:42-2018/7/15
 * 项目名称 SpringBootMapStruct
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


@Component
public class ClassPathConfig {

    public ClassPathConfig() {

        InputStream stream = getClass().getClassLoader().getResourceAsStream("arr.txt");
        File targetFile = new File("arr.txt");
        System.out.println(targetFile.getAbsolutePath());
//        FileUtils.copyInputStreamToFile(stream, targetFile);
        try {
            FileUtils.copyInputStreamToFile(stream, targetFile);
            List<String> list = Files.readLines(targetFile, Charsets.UTF_8);
            list.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
