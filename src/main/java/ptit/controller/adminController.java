package ptit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class adminController {
	@RequestMapping(value="/dashboard",method=RequestMethod.GET)
	public String dashboardShow() {
		return "admin/dashboard";
	}
	@RequestMapping(value="/maidManagement",method=RequestMethod.GET)
	public String maidManagementShow() {
		return "admin/maidManagement";
	}
	@RequestMapping(value="/customerManagement",method=RequestMethod.GET)
	public String customerManagementShow() {
		return "admin/customerManagement";
	}
	@RequestMapping(value="/serviceManagement",method=RequestMethod.GET)
	public String serviceManagementShow() {
		return "admin/serviceManagement";
	}
	@RequestMapping(value="/bookingManagement",method=RequestMethod.GET)
	public String bookingManagementShow() {
		return "admin/bookingManagement";
	}
	@RequestMapping(value="/profile",method=RequestMethod.GET)
	public String adminProfileShow() {
		return "admin/profile";
	}
	@RequestMapping(value="/addService",method=RequestMethod.GET)
	public String addServiceShow() {
		return "admin/addService";
	}
	@RequestMapping(value="/addMaid",method=RequestMethod.GET)
	public String addMaidShow() {
		return "admin/addMaid";
	}
}

