package com.springboot.hbase;

import com.springboot.hbase.utils.hbase.HBaseService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Map;

@SpringBootTest
@Log4j2
class HBaseApplicationTests {

    @Resource
    HBaseService hBaseService;

    @Test
    void createTable() throws IOException {
        hBaseService.createTable("test","Column Family 1","Column Family 2");
        hBaseService.insertOrUpdate("test","1","Column Family 1","测试key1","测试key1");
        hBaseService.insertOrUpdate("test","2","Column Family 2","测试key2","测试key2");
    }
    @Test
    void getResultScanner() throws IOException {
        Map<String, Map<String, String>> test = hBaseService.getResultScanner("test");
        test.forEach((k,v)->{
            log.info("key为:{},value为:{}",k,v);
        });
    }
    @Test
    void deleteTable() throws IOException {
        hBaseService.deleteTable("test");
    }

}
