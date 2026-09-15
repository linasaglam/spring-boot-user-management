package lab9.rowd.jpa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    private final UserRepository repo;

    public MyController(UserRepository repo) {
        this.repo = repo;
    }

    // ANA SAYFA → liste
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("users", repo.findAll());
        model.addAttribute("user", new User());
        return "index";
    }

    // EKLEME
    @PostMapping("/add")
    public String addUser(@ModelAttribute User user) {
        repo.save(user);
        return "redirect:/";
    }

    // SİLME
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/";
    }
}