package com.note.notes;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotesApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(NotesApplication.class, args);
	}
}
