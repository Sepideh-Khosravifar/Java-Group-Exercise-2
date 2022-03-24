package com.syntax.groupProjectII;

//Create Registration Class in which you would have
//variables as email, userName and password that
//have an access scope only within its own class. After
//creating an object of the class user should be able to
//call methods and in each method separately pass
//values to set users email, username and password.

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {

        this.email = email;

        if(email.equals("yahoo.com")) {

            System.out.println("valid email");

        } else{

            System.out.println("invalid email");
        }
    }

    public void setUserName(String userName) {

        this.userName=userName;

        if (!userName.isEmpty() && userName.length() > 6) {

            System.out.println("valid userName");

        } else {

            System.out.println("invalid userName");
        }
    }

    public void password(String password) {

        this.password=password;

        if(password.isEmpty()||password.length()<6||password.contains(userName)){

            System.out.println("invalid password");

        } else {

            System.out.println("valid password, account registered");
        }
    }

    public static void main(String[] args) {

        Registration user = new Registration();
        user.setEmail("yahoo.com");
        user.setUserName("Parvaneh");
        user.password("L1f3I$G00d");
    }
}