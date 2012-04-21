public class FirstInfo {
  private String name;
  private String firstName;
  
  public FirstInfo(String name, String firstName) {
    this.name = name;
    this.firstName = firstName;
  }
  
  public String getName() {
    return this.name;
  }
  public String getFirstName() {
    return this.firstName;
  }
}

def listeOfFirstInfos = [
  new FirstInfo("Name1", "Vorname1"), 
  new FirstInfo("Name2", "Vorname2"),
  new FirstInfo("Name3", "Vorname3"),
]

def liste = new ArrayList<String>();
liste.add("Frist");
liste.add("Second");
liste.add("Third");


liste.each {
  item -> println item;
}


listeOfFirstInfos.each {
  item -> println ("Name:" + item.getName() + " firstname:" + item.getFirstName());
}

