package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hi")
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form/hi")
    public ModelAndView process(){
        return new ModelAndView("new-form");
    }

    @RequestMapping("/hello")
    @GetMapping
    public String helloView(){
        return "new-form";
    }
}
