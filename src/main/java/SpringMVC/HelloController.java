package SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class HelloController {
    //To make normal Java method as a Request Handler method use @RequestMapping
    @RequestMapping(value = "/hello")
    public String empInfo(Model model) {
//        model.addAttribute("message", "Hello, Spring MVC!");
//        return "hello"; // view name

       List<Employee> employeeList = List.of(new Employee(123,"sai",23456),
                                             new Employee(345,"skr",34213));
       model.addAttribute("employeeList",employeeList);//model helps in transfer the data to controller to view
       return "empInfo";
    }
}