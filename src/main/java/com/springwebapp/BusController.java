package com.springwebapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BusController {
	
	@Autowired
	private BusDatabaseAccessor busDbAccessor;
	
	@RequestMapping(value = "/busDetailsEntryForm", method = RequestMethod.GET)
	public ModelAndView busAddingForm() {
		return new ModelAndView("busForm", "bus", new Bus());
	}
	
	@RequestMapping(value = "/addbus", method = RequestMethod.POST)
	public String addingBusDetails(@ModelAttribute("bus")Bus bus, ModelMap modelMap) {
		busDbAccessor.addBusDetails(bus);
		return "BusDetailsSuccessfullyadded";
	}
	
	@RequestMapping(value = "/buses", method = RequestMethod.GET)
	public String retrieveAllBuses(Model model) {
		List<Bus> busList = busDbAccessor.getAllBusDetails();
		model.addAttribute("buses", busList);
		return "AllBusDetails";
	}
	
	@RequestMapping(value = "/buses/{location}", method = RequestMethod.GET)
	public String retrieveBusDetailsWithLocation(@PathVariable String location, Model model) {
		List<Bus> busList = busDbAccessor.getBusDetailsWithLocation(location);
		model.addAttribute("buses", busList);
		model.addAttribute("location", location);
		return "BusesWithLocation";
	}
	
	public void setBusDbAccessor(BusDatabaseAccessor busDbAccessor) {
		this.busDbAccessor = busDbAccessor;
	}
}
