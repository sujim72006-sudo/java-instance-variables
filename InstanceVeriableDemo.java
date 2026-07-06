class InstanceVariableDemo {  
    //Defining Instance Variables  
    public String name;  
    public int age;  
 //Creadting a default Constructor initializing Instance Variable  
    public InstanceVariableDemo()  
    {  
        this.name = "suji";
        this.age = 20;
    }
    public static void main(String[] args)  
    {  
        // Object Creation  
       InstanceVariableDemo obj = new InstanceVariableDemo();  
        System.out.println("Student Name is: " + obj.name);  
        System.out.println("Age: "+ obj.age);  
    }  
}
