package com.golan.izik;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre>
 * <B>Copyright:</B>   Izik Golan
 * <B>Owner:</B>       <a href="mailto:golan2@hotmail.com">Izik Golan</a>
 * <B>Creation:</B>    19/06/2015 19:17
 * <B>Since:</B>       BSM 9.21
 * <B>Description:</B>
 *
 * </pre>
 */
@Controller
@RequestMapping("/mplay/*")
public class PlayMoreWithRequestMapping extends PlayWithRequestMapping {

  protected String impersonate(Person person) {
    return "m_"+person.getFirstname();
  }

}
