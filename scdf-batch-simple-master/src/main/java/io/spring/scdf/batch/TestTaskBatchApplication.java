package io.spring.scdf.batch;

import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@EnableTask
@SpringBootApplication
public class TestTaskBatchApplication {

	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private JobExplorer jobExplorer;

	@Value("${sample.jobParams:null}")
	private String additionalJobParams;

	@Value("${sample.makeParametersUnique:true}")
	private boolean makeParametersUnique;

	public static void main(String[] args) {
		SpringApplication.run(TestTaskBatchApplication.class, args);
	}
//
//	@Bean
//	public MyJobLauncherCommandLineRunner commandLineRunner() {
//		return new MyJobLauncherCommandLineRunner(jobLauncher, jobExplorer, additionalJobParams, makeParametersUnique);
//	}
}
