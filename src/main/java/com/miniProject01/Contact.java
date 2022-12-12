package com.miniProject01;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Contact_Details")
public class Contact {
	@Id
	@GeneratedValue
	private Integer contactId;
	private String contactName;
    private String contactEmail;
	private Long contactNum;
	

}
