package org.example.MVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/hello")
public class ActivityController {

    @Autowired
    ActivityService activityService;
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        List<ActivityModel> list = activityService.getAll();
        model.addAttribute("list", "list");
        return "index.html";
    }
}

