package com.example.Final_Event;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Person_Event {
@Id
	int id;
	private int persont_id;
	private int event_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPerson_id() {
		return persont_id;
	}
	public void setPerson_id(int person_id) {
		this.persont_id = person_id;
	}
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	
	
}
