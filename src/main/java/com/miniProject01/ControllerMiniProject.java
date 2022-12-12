package com.miniProject01;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerMiniProject {
	@Autowired
	private ContactService service;
	
	@PostMapping("/contact")
	public String createcontact(@RequestBody Contact contact) {
		String status=service.saveContact(contact);
		return status;
	}
	
	@GetMapping("/contacts")
	public List<Contact>getAllContacts(){
		return service.getAllContact();
	}
	@PutMapping("/contact")
	public String updateContact(@RequestBody Contact contact) {
		return service.updateContact(contact);
		
	}
    @DeleteMapping("/contact/{contactId}")
    public String deleteContact(@PathVariable Integer contactId) {
    	return service.deleteContactById(contactId);
    }
}
