package com.example.contacts;

public class UserData {
    int pic;
    String Uname;
    String num;
    String email;
    public UserData(int pic,String Uname,String email,String num)
    {
        this.pic=pic;
        this.Uname=Uname;
        this.email=email;
        this.num=num;
    }
    public String getUname(){return Uname;}
    public void setUname(String uname){this.Uname=Uname;}
    public String getnum(){return num;}
    public void setnum(String num){this.num=num;}
    public int getpic(){return pic;}
    public void setpic(int pic){this.pic=pic;}
    public String getEmail() {return email;}
    public void setEmail(String email){this.email=email;}
}
