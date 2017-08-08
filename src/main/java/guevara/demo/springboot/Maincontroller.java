package guevara.demo.springboot;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;

@Controller
public class Maincontroller {


    @RequestMapping("/songform")
    public String loadFormPage(Model model) {
        model.addAttribute("song", new Song());
        return "songform";
    }

    @PostMapping("/songform")
    public String loadFromPage(@Valid @ModelAttribute Song song, BindingResult bindingResult) {

        System.out.println("**" + bindingResult.toString());
        if (bindingResult.hasErrors()){
            return "songform";

    }
        System.out.println("*no errores*");
            return "confirmsong";

    }

}

//Eg.#2...
    /* public String (Model model){
        model.addAttribute("myvar", "Say hello to the People!");
        return "index";
*/

//Eg.#3&4...
    /*    @RequestMapping("/loadform")
  public String loadFormPage(){

        return "formtemplate";
    }

    @RequestMapping("/processform")
    public String loadFromPage(@RequestParam("login") String login, Model model) {


      model.addAttribute("loginval",login);
      return "confirm";
    }
*/
