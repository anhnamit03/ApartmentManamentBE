package com.hvn.controllers1;

import com.hvn.pojo.Item;
import com.hvn.pojo.User;
import com.hvn.services.LockerService;
import com.hvn.services.UserService;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ControllerAdvice
@PropertySource("classpath:configs.properties")
public class HomeController {

    @Autowired
    private UserService userService;
    @Autowired
    private LockerService l;
    @Autowired
    private Environment env;

    @RequestMapping("/")
    public String index(Model model, @RequestParam Map<String, String> params) {
        model.addAttribute("users", this.userService.getUser(params));
        
        int pageSize = Integer.parseInt(env.getProperty("PAGE_SIZE").toString());
        int count = this.userService.CountUser();
        model.addAttribute("counter", (int) Math.ceil(count * 1.0 / pageSize));

        return "index";
    }


    @GetMapping("/resident")
    public String getResident(Model model) {
        
        model.addAttribute("users", new User());
        return "residents";
    }
    

    @PostMapping("/resident")
    public String postResident(@ModelAttribute("user") @Valid User user, BindingResult bindingResult, Model model) {
        if (!bindingResult.hasErrors()) {
          try{
                userService.saveUser(user);
                return "redirect:/";
            
          }
          catch(Exception ex){
              model.addAttribute("errMsg", ex.toString());
          }
        } 
       
        
         return "residents";
    }
    @GetMapping("/residentUpdate/{id}")
    public String getResidentUpdate(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("users", new User());
        model.addAttribute("id", this.userService.getUserById(id));
       
        return "residentUpdate";
    }
   

}
 