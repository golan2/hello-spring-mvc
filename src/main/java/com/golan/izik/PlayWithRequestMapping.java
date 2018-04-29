package com.golan.izik;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * <B>Copyright:</B>   Izik Golan
 * <B>Owner:</B>       <a href="mailto:golan2@hotmail.com">Izik Golan</a>
 * <B>Creation:</B>    18/06/2015 08:31
 * <B>Since:</B>       BSM 9.21
 * <B>Description:</B>
 *
 * http://localhost:8080/hello-spring-mvc/play/add_person
 *
 * </pre>
 */
@Controller
@RequestMapping("/play/*")
public class PlayWithRequestMapping {


  @RequestMapping(value="/method0")
  @ResponseBody
  public String simple(Model model) {
    return "simple";
  }


  @RequestMapping(value="/game")
  @ResponseBody
  public String root(Model model) {
    return "play_game";
  }

  @RequestMapping("/add_person")
  @ResponseBody
  public String addPerson(Model model,HttpServletRequest request, Person person, @RequestParam String firstName) {
    return "p="+firstName + "_" + impersonate(person);
  }

  protected String impersonate(Person person) {
    return person.getFirstname();
  }



  @RequestMapping("/all_persons")
  @ResponseBody
  public List<Person> getAllPersons() {
    List<Person> result = new ArrayList<>();
    result.add(new Person("F1", "L1"));
    result.add(new Person("F2", "L2"));
    return result;
  }
}
