package vip.zdd.ums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan(basePackages = "vip.zdd.ums.mapper")
@MapperScan(basePackages = "vip.zdd.ums.mapper")
public class ZddUmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZddUmsApplication.class, args);
    }

}
