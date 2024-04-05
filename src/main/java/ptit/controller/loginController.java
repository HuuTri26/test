package ptit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ptit.model.User;

@Controller
public class loginController {
	//Hiển thị form đăng nhập:
//	link trên URL dẫn đến view index.jsp trong web.xml khai báo index.jsp hoặc index.htm trong controller làm default 
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String indexShow() {
		return "index";
	}
	//Hiển thị form đang kí:
	@RequestMapping(value="/signup",method=RequestMethod.GET)
	public String signupShow() {
		return "signup";
	}
	
	@RequestMapping(value="/forgotPassword",method=RequestMethod.GET)
	public String forgotPasswordShow() {
		return "forgotPassword";
	}

	//controller xử lý sau khi đã nhập form.
//	@RequestMapping(value="/index",method=RequestMethod.POST)
//	public String indexPost(ModelMap model, User user) {
////		model.addAttribute("user",user);
////		user.setId("abc");
//		
//	  return "admin/dashboard";	
//		
//	}
	
//	@RequestMapping("/user/form")
//	public String showForm() {
//		return "user/login";
//	}
	
	@RequestMapping(value="/index",method=RequestMethod.POST)//=> giống webroute trong ReactJS
	//Các RequestMapping có thể lồng nhau.
	//Ánh xạ đến hàm login trong controller
	//Lấy dữ liệu bằng HttpServletRequest:
	//GET ->trả về giao diện,(không gửi password và thông tin nhạy cảm lên server)client gửi phương thức get(có thể thông qua querry trên URL..) đến server, server phân tích và trả lại dữ liệu từ database cho client.Nhận dạng thông qua (name)
	//POST -> trả về dữ liệu thông qua form, xử lí các nút chức năng cập nhật , thêm...
	//Tham số (params="name")
	public String login(HttpServletRequest request) {
//		model.addAttribute("user",user);
//		user.setId("abc");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		if(email.equals("admin@gmail.com") && password.equals("123456")){
			request.setAttribute("email", email);
			request.setAttribute("password", password);
			request.setAttribute("message", "");
			return "admin/dashboard";
		}
		else  if(email.equals("customer@gmail.com") && password.equals("123456")) {
			request.setAttribute("email", email);
			request.setAttribute("password", password);
			request.setAttribute("message", "");
			return "customer/dashboard";
			
		}
		else  if(email.equals("maid@gmail.com") && password.equals("123456")) {
			request.setAttribute("email", email);
			request.setAttribute("password", password);
			request.setAttribute("message", "");
			return "maid/dashboard";
			
		}
//		request.setAttribute(Biến, giá trị trả về);
		if(!email.equals("admin@gmail.com") && !email.equals("customer@gmail.com") && !email.equals("maid@gmail.com") ) {
		request.setAttribute("message", "Nhập sai email!");
		email="";
		}else if(!password.equals("123456")){
			request.setAttribute("message", "Nhập sai password!");
			password="";
		}
		else {
			request.setAttribute("message", "Nhập sai email và password!");
			email="";
			password="";
		}
		return "index";
	}
}
