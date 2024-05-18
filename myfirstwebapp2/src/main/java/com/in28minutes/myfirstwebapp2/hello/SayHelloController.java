package com.in28minutes.myfirstwebapp2.hello;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ComponentScan("com.in28minutes.myfirstwebapp2.hello")
public class SayHelloController {

	// "say-hello" =>"Hello! what are you learning today?"
	// http://localhost:8080/say-hello

	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! what are you learning today?";

	}

	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First HTML Page--Changed</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My first html page with body changed");
		sb.append("</body>");
		sb.append("</html>");

		return sb.toString();

	}
	//sayHello.jsp
	//"say-hello-jsp" => sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
	 ///src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
	 // src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp
	
	@RequestMapping(value="say-hello-jsp",method=RequestMethod.GET)
	public String sayHelloJsp() {
		return "sayHello";
}
}
