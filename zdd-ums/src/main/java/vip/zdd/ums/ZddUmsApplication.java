package vip.zdd.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "vip.zdd.ums.mapper")
public class ZddUmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZddUmsApplication.class, args);
    }

}
