package uk.co.eggsylife;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.co.eggsylife.command.CalcCommand;

@Controller
public class CalculatorController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/calc", method = RequestMethod.GET)
	public String showCalcScreen(Model model) {
		model.addAttribute("calcCommand", new CalcCommand());
		return "calc";
	}
	
	@RequestMapping(value = "/calc", method = RequestMethod.POST)
	public String performCalculation(@ModelAttribute CalcCommand calcCommand, Model model) {
		
		int result = calcCommand.getValueOne() + calcCommand.getValueTwo();
		model.addAttribute("total", result);
		return "calc";
	}

}
