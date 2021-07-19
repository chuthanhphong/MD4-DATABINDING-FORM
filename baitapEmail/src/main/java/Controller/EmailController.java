package Controller;

import model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailController {
    @GetMapping("/home")
    public String showForm(Model model){
        model.addAttribute("email",new Email());
        return "home";
    }
    @PostMapping("/result")
    public String showResult(@ModelAttribute("email")Email email, ModelMap model){
        model.addAttribute("language",email.getLanguage());
        model.addAttribute("pathSize",email.getPathSize());
        model.addAttribute("filter",email.isFilter());
        model.addAttribute("signature",email.getSignature());
        return "result";

    }
}
