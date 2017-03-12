package com.uity;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.uity.dao.RollcallDAO;
import com.uity.model.Output;
import com.uity.model.Rollcall;

@Controller
public class HomeController {

	private static final Logger logger = Logger.getLogger(HomeController.class);
	@Autowired(required = true)
	private RollcallDAO rollcallDAO;
	@Autowired(required = true)
	ServletContext servletContext;

	@RequestMapping(value = "/home")
	public String listRollcall(@ModelAttribute("rollcall") Rollcall rollcall, ModelMap model) throws IOException {
		List<Rollcall> listRollcall = rollcallDAO.list();
		model.addAttribute("rollcallList", listRollcall);
		
		return "home";
	}
	
	@RequestMapping(value = "/searchRC", method = RequestMethod.POST)
	public String searchRC(@ModelAttribute("rollcall") Rollcall rollcall,Output output,@RequestParam("rollno")String rollno, ModelMap model) {
		
		List<Rollcall> listRollcall = rollcallDAO.searchRC(rollno);
		rollcall.setRollcallList(listRollcall);
		model.addAttribute("rollcallList", listRollcall);

//		List<Output> listOutput = rollcallDAO.see5Algor(rollcall);
//		output.setOutputList(listOutput);
//		model.addAttribute("output", listOutput.get(0));
		
		return "result";
	}

}
