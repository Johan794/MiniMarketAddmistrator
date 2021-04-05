package model;

public class Person {
   private String id;
   private Type typeId;

    public Person(String id, String type) {
        this.id = id;
        typeId= Type.valueOf(type);
    }

	public String getId() {
		return id;
	}

	public Type getTypeId() {
		return typeId;
	}
    
    
}
