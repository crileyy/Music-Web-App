package com.colinriley.colinmusicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.colinriley.colinmusicapp.music.app"})
public class ColinMusicAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColinMusicAppApplication.class, args);
	}
}
