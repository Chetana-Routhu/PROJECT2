package supplement_store2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import supplement_store2.entities.User;
import supplement_store2.Repository.UserRepository;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam("email") String email,
                            @RequestParam("password") String password,
                            Model model) {
        User user = userRepository.findByEmailAndPassword(email, password);
        if (user != null) {
            model.addAttribute("user", user);
            return "dashboard";
        }
        model.addAttribute("error", "Invalid email or password.");
        return "login";
    }
}
