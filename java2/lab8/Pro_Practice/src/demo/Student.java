/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo;

/**
 *
 * @author lab2_02
 */
public class Student {
private String name;
private String birth;
private String email;

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, String birth, String email, String sex) {
        this.name = name;
        this.birth = birth;
        this.email = email;
    }

}
