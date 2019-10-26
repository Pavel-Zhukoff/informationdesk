package ru.pavel_zhukoff.desk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.pavel_zhukoff.desk.config.DbConfig;
import ru.pavel_zhukoff.desk.config.WebConfig;

@SpringBootApplication
public class DeskApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeskApplication.class, args);
	}
}
