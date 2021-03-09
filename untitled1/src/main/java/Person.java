

 class Person {

    private String name;
    private int age;

     private int id;
     static int counter = 1;
     Account account;


     class Account {
         private String password;

         Account(String pass, String login ) {
             this.password = pass;

             System.out.println(name);
             System.out.println(password);
         }

         public void setPassword(String password) {
             this.password = password;
         }

         public String getPassword() {
             return password;
         }

     }


    public Person(String name, int age){
        this.age = age;
        this.name = name;
        id = counter++;

    }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }




    public void displayID() {
        System.out.println(id);
    }
 }

