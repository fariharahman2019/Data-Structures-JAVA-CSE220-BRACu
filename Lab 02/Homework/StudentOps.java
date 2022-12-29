import java.util.Scanner;
public class StudentOps{
  
  // array to hold the Student objects 
  Student [] st;
  Scanner k;
  // s is used to point to the next available space
  int s = 0;
  
  //constructor
  public StudentOps(int sz){
    /*creating an array that can hold sz Student addresses
     Initially the indeces have null as no objects created
     */
    st = new Student[sz];
    k = new Scanner(System.in);
  }
  public  void addStudent(){
    // at first check if there are empty spaces to enter a new Student
    // if not then resize
    
    if (s==st.length){
      resize();
    }
    // You need to enter the name, id, current semester and courses for a student
    System.out.println("Enter name");
    String name = k.nextLine();
    
    System.out.println("Enter Id");
    String id = k.next();
    
    System.out.println("Enter current Semester");
    String semester = k.next();
    
    System.out.println("How many courses did you take this semester?");
    int num = k.nextInt();
    k.nextLine();
    // using these pieces of information create a Student obeject
    // object is like a box where you will keep these information 
    // objects help you to keep a lot of information together
    
    Student s1 = new Student();
    /*s1 is an object (box), currently containing nothing
     you have to save name, id, semester and number of courses taken
     using methods in Student class
     */
    
    // saving the name 
    s1.setName(name);
    
    // save the id
    // TO DO
    s1.setId(id);
    
    // save the semester
    // TO DO
    s1.setSemester(semester);
    
    // create [courses] array in Student class using the number of courses taken
    // TO DO
    Student [] course=new Student[5];
    
    // now you will add the courses
    for(int i = 0;i<num;i++){
      System.out.println("Name of the course");
      String course = k.nextLine();
      s1.addCourse(course);
    }
    
    /* at this point you have created a box(object) and stored a student's information inside it.
     the variable named s1 holds the address where you have created the box.
     now if you create a new box(object) to store another student's information,
     the new box's address will also be saved in the variable s1, as this is happening in one loop,
     erasing the previous one. In order to store the address of all objects(boxes) you have created, save 
     the address in the global array named st everytime you finished creating the object.
     */
    
    // saving the object in st
    // s is the variable that points to the next available space
    st[s] = s1;
    s++;
    display();
  }
  
  public  void deleteStudent(){
    int index = -1;
    // delete the student using left shitf
    // id of the student you want to delete
    System.out.println("Enter the Id of the student you want to delete");
    String id = k.next();
    
    // search for that student using the id
    // TO DO
    
    if (index != -1){
      // if index is not -1, this means the id entered is valid
      // delete that object using left shift
      // TO DO
      System.out.println("Deleted Successfully");
      display();
    }else{
      System.out.println("Could not find Id");
    }
  }
  
  public  void editStudent(){
    int index = -1;
    String sid;
    // id of the student you want to edit
    System.out.println("Enter the Id of the student you want to edit");
    String id = k.next();
    // search for that student using the id
    // TO DO
    if (index != -1){
      System.out.println("What piece of information do you want to edit?");
      System.out.println("Press 1 to edit Id");
      System.out.println("Press 2 to edit name");
      int input = k.nextInt();
      if(input == 1){
        System.out.println("Enter the new Id");
        String newId = k.next();
        // set the new id of the student
        st[index].setId(newId);
        display();
      }else if(input == 2){
        System.out.println("Enter the new name");
        k.nextLine();
        String newName = k.nextLine();
        // set the new name of the student
        // TO DO
        display();
      }else{
        System.out.println("Wrong input");
      }
    }else{
      System.out.println("Could not find Id");
    }
  }
  public  void display(){
    for(int x= 0;x<s;x++){
      st[x].viewDetails();
    }
  }
  public  void resize(){
    //create a new array of bigger length
    // TO DO
  }
}