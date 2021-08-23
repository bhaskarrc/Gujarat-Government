package com.gov.guj;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration.AccessLevel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GujGovtApplication {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(AccessLevel.PRIVATE);
		mapper.getConfiguration().setSkipNullEnabled(true);
		return mapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(GujGovtApplication.class, args);
	}

}
