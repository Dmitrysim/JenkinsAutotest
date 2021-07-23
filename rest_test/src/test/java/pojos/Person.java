package pojos;

import lombok.Data;

import java.util.List;

@Data
public class Person{
	private List<ItemsOfClientsItem> itemsOfClients;
	private String patronymic;
	private String surname;
	private String name;
	private String dateOfBirth;
	private String location;

//	public List<ItemsOfClientsItem> getItemsOfClients(){
//		return itemsOfClients;
//	}
//
//	public String getPatronymic(){
//		return patronymic;
//	}
//
//	public String getSurname(){
//		return surname;
//	}
//
//	public String getName(){
//		return name;
//	}
//
//	public String getDateOfBirth(){
//		return dateOfBirth;
//	}
//
//	public String getLocation(){
//		return location;
//	}
}