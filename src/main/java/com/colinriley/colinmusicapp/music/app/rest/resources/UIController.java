package com.colinriley.colinmusicapp.music.app.rest.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UIController {

  @RequestMapping(value = "/")
  public String index() {
    return "index";
  }

}