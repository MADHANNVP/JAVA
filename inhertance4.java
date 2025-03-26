abstract class Sports{
    abstract void Play();
}
class Football extends Sports{
    void Play(){
      System.out.println( "Football is a team sport where two teams of eleven players compete to score goals by getting a ball into the opponent's net.");  
    }
}
class Basketball extends Sports{
    void Play(){
        System.out.println("Basketball is a fast-paced game where two teams of five players each try to score by shooting a ball through the opponent's hoop.");
    }
}
class Rugby extends Sports{
    void Play(){
        System.out.println("Rugby is a contact sport where two teams of players aim to score tries by carrying, passing, or kicking an oval ball across the opponent's goal line.");
    }
}
public class inhertance4 {
    public static void main(String[] args) {
        Football football=new Football();
        Basketball basketball=new Basketball();
        Rugby rugby=new Rugby();
        football.Play();
        basketball.Play();
        rugby.Play();
    }
}
