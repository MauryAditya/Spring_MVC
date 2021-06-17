package springmvc.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;



@Controller
public class ContactController {
		@Autowired
		private UserService userService;
		
		@ModelAttribute
		public void commonField(Model m) {
			m.addAttribute("header","Registration Form");
			
		}
		@RequestMapping("/contact")
		public String showForm(Model m) {
			
			return "contact";
		}
		
		// 1 using RequestParam
		
//		@RequestMapping(path="/form", method = RequestMethod.POST)
//		public String handleForm( 
//			@RequestParam("name") 
//		String uname,@RequestParam("email")
//		String uemail,@RequestParam("password") String upassword,Model model) {
//			System.out.println(uname+" "+uemail+" "+upassword);
//			
//			User user=new User();
//			user.setName(uname);
//			user.setEmail(uemail);
//			user.setPassword(upassword);
//			
//			model.addAttribute("users",user);
//			
////			model.addAttribute("name",uname);
////			model.addAttribute("email",uemail);
////			model.addAttribute("password",upassword);
//			
//			
//			return "success";
//		}
		
		//2 using ModelAttribute
		@RequestMapping(path="/form",method=RequestMethod.POST)
		public String handleForm(@ModelAttribute User user,Model model ) {
			//modelAttribute fetch the form 
			//create User Object 
			//seting the Attibute  
			this.userService.createUser(user);
			model.addAttribute("users",user);
			return "success";
		}
		
}
