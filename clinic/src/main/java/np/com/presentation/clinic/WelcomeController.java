/**
 * 
 */
package np.com.presentation.clinic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author prakash.poudel
 *
 */
@Controller
//@RequestMapping("/welcome")
public class WelcomeController {

//	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Welcome to spring framework 3.2");
		return "hello";
	}
}
