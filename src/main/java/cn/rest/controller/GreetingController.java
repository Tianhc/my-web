package cn.rest.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.rest.util.ConfigUtils;

@RestController
public class GreetingController {
	Logger log = Logger.getLogger(this.getClass());

	@RequestMapping(value = "/hello.do", method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> hello() {
		Map<String, Object> map = new HashMap<String, Object>();
		log.info("l0g " + ConfigUtils.getString("db.driver"));
		System.out.println(10 / 0);
		map.put("message", "Hello");
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}
}