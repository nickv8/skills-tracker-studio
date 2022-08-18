package org.launchcode.skillstracker.controllers;

import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("skills")
public class SkillsController {

@GetMapping("home")
    public String languages(){
    return "<html>" +
            "<body>" +
            "<h1>Skills Tracker</h1>" +
            "<h2>Languages</h2>" +
            "<ol>" +
            "<li>JavaScript</li>" +
            "<li>Python</li>" +
            "<li>Java</li>" +
            "</ol>" +
            "</body>" +
            "</html>";
}

    @RequestMapping( value = "skills", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String displayFavorites(@RequestParam String name, @RequestParam String favorite1, @RequestParam String favorite2, @RequestParam String favorite3){
        return yourFavorite(name, favorite1, favorite2, favorite3);
    }

    public static String yourFavorite(String n, String f1, String f2, String f3) {
        String name = n;
        String favorite1 = f1;
        String favorite2 = f2;
        String favorite3 = f3;

        return "<html>" +
                "<body>" +
                "<h1>"+ name +"</h1>" +
                "<ol>" +
                "<li>" + favorite1 + "</li>" +
                "<li>" + favorite2 + "</li>" +
                "<li>" + favorite3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }



    @GetMapping("form")
    @ResponseBody()
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'skills'/>" +
                "<p>Name:</p>" +
                "<input type = 'text' name = 'name'/>" +
                "<p>Select your favorite language:</p>" +
                "<select name = 'favorite1'>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'Java'>Java</option>" +
                "</select>" +
                "<p>Select your second favorite language<p>" +
                "<select name = 'favorite2'>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'Java'>Java</option>" +
                "</select>" +
                "<p>Select your third favorite language</p>" +
                "<select name = 'favorite3'>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'Java'>Java</option>" +
                "</select><br>" +
                "<br>" +
                "<input type = 'submit' value = 'Submit'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
