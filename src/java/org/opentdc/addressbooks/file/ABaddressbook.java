/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Arbalo AG
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.opentdc.addressbooks.file;

import java.util.ArrayList;
import java.util.Date;

import org.opentdc.addressbooks.AddressbookModel;

public class ABaddressbook {
	private AddressbookModel model;
	private ArrayList<ABcontact> contacts;
	
	public ABaddressbook() {
		contacts = new ArrayList<ABcontact>();
	}
	
	public ABaddressbook(AddressbookModel addressbookModel) {
		contacts = new ArrayList<ABcontact>();
		this.model = addressbookModel;
	}
	
	public AddressbookModel getModel() {
		return model;
	}
	
	public void setModel(AddressbookModel addressbookModel) {
		this.model = addressbookModel;
	}
	
	public ArrayList<ABcontact> getContacts() {
		return contacts;
	}
	
	public void setContacts(ArrayList<ABcontact> contacts) {
		this.contacts = contacts;
	}
	
	public void addContact(ABcontact contact) {
		this.contacts.add(contact);
	}
	
	public boolean removeContact(ABcontact contact) {
		return this.contacts.remove(contact);
	}
	
	public void setName(String name) {
		model.setName(name);
	}
	
	public void setCreatedAt(Date createdAt) {
		model.setCreatedAt(createdAt);
	}
	
	public void setCreatedBy(String createdBy) {
		model.setCreatedBy(createdBy);
	}
	
	public void setModifiedAt(Date modifiedAt) {
		model.setModifiedAt(modifiedAt);		
	}
	
	public void setModifiedBy(String modifiedBy) {
		model.setModifiedBy(modifiedBy);
	}
}