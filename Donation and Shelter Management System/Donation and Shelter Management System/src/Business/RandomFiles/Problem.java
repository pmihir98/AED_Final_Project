/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RandomFiles;

/**
 *
 * @author Utkarsh
 */
public class Problem {

    public Problem(String issue, String solution) {
        this.issue = issue;
        this.solution = solution;
    }
    
    
    private String issue;
    private String solution;

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    @Override
    public String toString() {
        return "Problem{" + "issue=" + issue + ", solution=" + solution + '}';
    }
    
    
    
}
