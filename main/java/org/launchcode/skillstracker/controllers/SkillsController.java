package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

@GetMapping()
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
}
