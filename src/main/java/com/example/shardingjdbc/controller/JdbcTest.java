//package com.example.shardingjdbc.controller;
//
//import io.shardingjdbc.core.api.ShardingDataSourceFactory;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.sql.DataSource;
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//public class JdbcTest {
//
//    DataSource dataSource;
//
//    public void init(){
//        // 配置真实数据源
//        Map<String, DataSource> dataSourceMap = new HashMap<>();
//
//        // 配置第一个数据源
//        BasicDataSource dataSource1 = new BasicDataSource();
//        dataSource1.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource1.setUrl("jdbc:mysql://localhost:3306/ds0");
//        dataSource1.setUsername("root");
//        dataSource1.setPassword("");
//        dataSourceMap.put("ds0", dataSource1);
//
//        // 配置第二个数据源
//        BasicDataSource dataSource2 = new BasicDataSource();
//        dataSource2.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource2.setUrl("jdbc:mysql://localhost:3306/ds1");
//        dataSource2.setUsername("root");
//        dataSource2.setPassword("");
//        dataSourceMap.put("ds1", dataSource2);
//
//        // 配置Order表规则
//        TableRuleConfiguration orderTableRuleConfig = new TableRuleConfiguration();
//        orderTableRuleConfig.setLogicTable("t_order");
//        orderTableRuleConfig.setActualDataNodes("ds${0..1}.t_order${0..1}");
//
//        // 配置分库 + 分表策略
//        orderTableRuleConfig.setDatabaseShardingStrategyConfig(new InlineShardingStrategyConfiguration("user_id", "ds${user_id % 2}"));
//        orderTableRuleConfig.setTableShardingStrategyConfig(new InlineShardingStrategyConfiguration("order_id", "t_order${order_id % 2}"));
//
//        // 配置分片规则
//        ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();
//        shardingRuleConfig.getTableRuleConfigs().add(orderTableRuleConfig);
//
//        // 省略配置order_item表规则...
//        // ...
//
//        // 获取数据源对象
//        DataSource dataSource = ShardingDataSourceFactory.createDataSource(dataSourceMap, shardingRuleConfig, new ConcurrentHashMap(), new Properties());
//    }
//
//
//
//    public static void main(String[] args) {}
////    DataSource dataSource = ShardingDataSourceFactory.createDataSource(dataSourceMap, shardingRuleConfig);
//
//}
