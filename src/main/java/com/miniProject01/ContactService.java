package com.miniProject01;

import java.util.List;

public interface ContactService {
	public String saveContact(Contact contact);
	public List<Contact> getAllContact();
	public Contact getContactById(Integer contactId);
	public String updateContact(Contact contact);
	public String deleteContactById(Integer contactId );
	

	
}
