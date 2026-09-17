package com.fineui.java.emptyproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * FineUI.Java 空项目启动类。
 *
 * <p>只引入 fineui-java 一个库，方言 / 回发端点 / 页面路由扫描 / 内嵌 F.js 运行时全部经自动配置装配，
 * 业务侧零 {@code @Configuration}。{@code @FineUIPage} 页面类在本包下，由库的扫描器登记路由。
 * 本项目不含任何数据库依赖，是最小可运行骨架，便于熟悉用法与重现问题。
 */
@SpringBootApplication
public class EmptyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmptyProjectApplication.class, args);
    }
}
