package com.altimetrik.ee.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping(value = "/")
@CrossOrigin
public class Default {
    
    @Value("${k8s.db.env}")
	private String deploymentEnv;

	@GetMapping(value = "/", produces = { "text/html" }, consumes = MediaType.ALL_VALUE)
	public ResponseEntity<String> getUserDetailByGitlabEmailId() {
		String data = "Welcome to Playground Engineering Environment";
		if (deploymentEnv != null && !deploymentEnv.isEmpty()) {
			data = "<!DOCTYPE html>\n" + "<html>\n" + "<head>\n" + "<title>Playground Engineering Environment</title>\n"
					+ "<style>\n" + "body {\n" + "  background-color: white;\n" + "  text-align: center;\n"
					+ "  color: black;\n" + "}\n" + "table {\n" + "  align: center;\n"
					+ "  border-collapse: collapse;\n" + "  width: 65%;\n" + "}\n" + "td, th {\n"
					+ "  border: 1px solid #dddddd;\n" + "  padding: 8px;\n" + "}\n" + "tr:nth-child(even) {\n"
					+ "  background-color: #dddddd;\n" + "}\n" + "</style>\n" + "</head>\n" + "<body>\n"
					+ "<img src='https://playground.altimetrik.com/assets/img/playground-logo2.svg' alt='Avatar' style='width:200px'>\n"
					+ "<h2>Welcome to Playground Engineering Environment</h2>\n" + "<h3>Database access details</h3>\n"
					+ "<table align=center>\n" + "  <tr>\n" + "    <th>DB Admin Console</th>\n" + "    <th>JDBC URL</th>\n"
					+ "    <th>User Name</th>\n" + "    <th>Password</th>\n" + "  </tr>\n" + "  <tr>\n"
					+ "    <td><a target='_blank' href='https://pgsandbox.altimetrik.com/project4515/project4515/'>https://pgsandbox.altimetrik.com/project4515/project4515/</a></td>\n"
					+ "    <td>jdbc:h2:file:./src/main/resources/project4515</td>\n" + "    <td>playground</td>\n"
					+ "    <td>password</td>\n" + "  </tr>\n" + "</table>\n" + "</body>\n" + "</html>\n";
		}
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

}