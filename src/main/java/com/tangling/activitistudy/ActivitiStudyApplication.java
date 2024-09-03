package com.tangling.activitistudy;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActivitiStudyApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(ActivitiStudyApplication.class, args);
        ProcessEngine processEngine = ProcessEngineConfiguration
                .createStandaloneProcessEngineConfiguration()
                .setProcessEngineName("Process Engine For TangLing")
                .setAsyncExecutorActivate(true)
                .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE)
                .setJdbcDriver("com.mysql.cj.jdbc.Driver")
                .setJdbcUrl("jdbc:mysql://192.168.91.150:3306/activiti7?characterEncoding=utf8")
                .setJdbcUsername("root")
                .setJdbcPassword("123456")
                .buildProcessEngine();
        System.out.println(processEngine);
    }

}
