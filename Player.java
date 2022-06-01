/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmr_esports;

/**
 *
 * @author home
 */
public class Player {
    
    public String name;
    public int grade;
    private int points;
    public boolean eligible; 
    //public 
    
    public Player (String name, int grade) {
        this.name = name;
        this.grade = grade;
        points = 0;
        this.eligible = false;
    }
    
    public Player (String name, int grade, int points) {
        this.name = name;
        this.grade = grade;
        this.points = 0;
        setPoints(points);
    }
    
    public String getName() {return name;}
    public int getGrade() {return grade;}
    public int getPoints() {return points;}
    
    public void setPoints(int p) {
        points = p;
        if (points >= 10) eligible = true;
    }
    
    public String toString() {
        return "Name: " + name + " | Grade: " + grade + " | Points: " + points;
    }
    
}
