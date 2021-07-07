package br.edu.ifrs.restinga.jnccinemas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifrs.restinga.jnccinemas.business.TicketBusiness;
import io.swagger.annotations.ApiOperation;

@RestController
public class TicketController {

	
	@Autowired
	private TicketBusiness ticketBusiness;
	
	@ApiOperation(value = "Api operation modelo pra noix")
	@PostMapping("/cadastraTicket")
	@ResponseBody
	public void createTicket() throws Exception {
	
	}
}
