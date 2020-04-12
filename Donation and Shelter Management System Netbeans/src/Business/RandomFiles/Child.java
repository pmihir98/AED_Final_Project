/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RandomFiles;

import Business.Role.Gender;
import java.util.List;

/**
 *
 * @author Sudheer Reddy Gaddam
 */
public class Child {

    private Problem currentProblem;
    private static int counter =1;
    private int id ;
    private String name;
    private String age;
    private Gender gender;
    private int standard;

    public Problem getCurrentProblem() {
        return currentProblem;
    }

    public void setCurrentProblem(Problem currentProblem) {
        this.currentProblem = currentProblem;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public Child() {
        this.id = counter;
        ++counter;
    }

  
    
    private List<Problem> problems;

    public List<Problem> getProblems() {
        return problems;
    }

    public void setProblems(List<Problem> problems) {
        this.problems = problems;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return name;
    }

}
