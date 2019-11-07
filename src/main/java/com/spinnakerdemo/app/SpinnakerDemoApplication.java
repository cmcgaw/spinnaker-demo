package com.spinnakerdemo.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.stream.Stream;

@EnableScheduling
@SpringBootApplication
public class SpinnakerDemoApplication {

	private Logger logger = LoggerFactory.getLogger(SpinnakerDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpinnakerDemoApplication.class, args);
	}

	@Scheduled(fixedDelay = 20000)
	public void printCharacters() {
		String[] characters = new String[] {
				"Baker", "OBJ", "Mr. Kitchen", "Chubb", "Miles",
				"Landry", "Deke", "Todd",
				"Matt", "Gunnar", "Hank",
				"Joanne", "Elvis", "Kanye"
		};
		Stream.of(characters).forEach(logger::info);
	}
}
