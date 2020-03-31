package NewProject;
import java.io.*;
/**
 *
 * @author ReLL
 */
public class Player implements Serializable {
    private String nameOfPlayer;
    private double jerseyNum;
    private double height;
    private double weight;
    private String teamName;
    
       public Player( double jerseyNum ,String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
        this.jerseyNum = jerseyNum;
        this.height = height;
        this.weight = weight;
        this.teamName = teamName;
    }
       public boolean equals(Player player){
       if(this.height == player.height && this.nameOfPlayer.equals(player.nameOfPlayer) && this.teamName.equals(player.teamName ) 
               && this.weight == player.weight && this.jerseyNum == player.jerseyNum ){
            return true;
       }else{
       return false;
       }
       }

    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }

    public double getJerseyNum() {
        return jerseyNum;
    }

    public void setJerseyNum(int jerseyNum) {
        this.jerseyNum = jerseyNum;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

 
}
