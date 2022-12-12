package com.miniProject01;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository repo;

	@Override
	public String saveContact(Contact contact) {
	   contact= repo.save(contact);
	   
	   if( contact.getcontactId()!=null) {
		   return "contact Saved";
	   }else {
		   return "contact Failed To Save";
	   }
	
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> contacts=repo.findAll();
		return contacts;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		java.util.Optional<Contact> findById =repo.findById(contactId);
		if(findById.isPresent()) {
		return findById.get();
		}
		return null;
	}

	@Override
	public String updateContact(Contact contact) {
		if(repo.existById(contact.getContactId())) {
			repo.save(contact);
			return"Update Success";
			
		}else {
			return"no record found";
		}
		
	
	}

	@Override
	public String deleteContactById(Integer contactId) {
		if(repo.existsById(contactId)) {
			repo.deleteById(contactId);
			return"record deleted";
		}else {
			return"no record found";
		}
		
	}
	

}
