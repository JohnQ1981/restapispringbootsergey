package com.location.jq.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.location.jq.entities.Location;
import com.location.jq.location.service.LocationService;
import com.location.jq.repos.LocationRepository;
//import com.location.jq.util.EmailUtil;
import com.location.jq.util.ReportUtil;

@Controller
public class LocationController {
	
	@Autowired
	LocationService service;
	@Autowired
	LocationRepository repository;
	@Autowired
	ReportUtil reportUtil;
//	@Autowired
//	EmailUtil emailUtil;
	@Autowired
	ServletContext sc;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location")Location location, ModelMap modelMap) {
		Location locationSaved = service.saveLocation(location);
		String msg ="Location saved with id of: "+ locationSaved.getId();
		modelMap.addAttribute("msg", msg);
//		emailUtil.sendEmail("ikram1981@gmail.com", "Location Saved",
//				"Location saved good, please check the website");
		return "createLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations",locations);
		return "displayLocations";
	}
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id,ModelMap modelMap) {
		//Location location = service.getLocationById(id);
		Location location =new Location();
		location.setId(id);
		service.deleteLocation(location);
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations",locations);
		return "displayLocations";		
	}
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id,ModelMap modelMap) {
		Location location = service.getLocationById(id);
		modelMap.addAttribute("location",location);
		return "editLocation";		
	}
	@RequestMapping("/editLoc")
	public String updateLocation(@ModelAttribute("location")Location location, ModelMap modelMap) {
		service.updateLocation(location);
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations",locations);
		return "displayLocations";
		
	}
	
	@RequestMapping("/generateReport")
	public String generateReport() {
		String path = sc.getRealPath("/");
		List<Object[]> data = repository.findTypeAndTypeCount();
		reportUtil.generatePieChart(path, data);
		return "report";
		
	}
	
}
