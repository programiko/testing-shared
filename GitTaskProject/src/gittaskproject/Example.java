/*
 Svi znaju igru kaladont. Svako kaÅ¾e reÄ� koja poÄ�inje sa zadnja dva slova prethodne reÄ�i.
Zadatak je da svako napiÅ¡e metod koji Ä‡e da Å¡tampa svoju reÄ� na prethodnu.
Naravno da ne moÅ¾ete svi odjednom da implementirate svoj metod veÄ‡ jedan po jedan redom kako su poreÄ‘ani metodi da biste znali 
koju reÄ� vaÅ¡ emtod da vraÄ‡a.
 */
package gittaskproject;
import java.lang.Exception;


public class Example {
    public static class Kaladont {
        
        public static String InitialWord() {
            return "Poruka";
        }
        
        public static String Nenad(){
            return "kandilo";
        }
        
        public static String Diana(){
            return "lopta";
        }
        
        public static String Ana() {
            return "tanjir";
        }
        public static String Radenko() {
           return "iteracija";
        }
        
	public static String Marko() {
            return "javnost";
        }
	
        public static String Ivan() {
            return "stomaklija";
        }
        
        
        public static String Dusko() {
            throw new RuntimeException();
        }
        
        public static String Danilo() {
            return "vraticu se";
        }
        
        public static String ConcatenateAll(){
            return InitialWord() + " " + Nenad() + " " + Diana() + " " + Ana() + " " + Radenko() + " " + Marko() + " " + Ivan() + " " + Dusko() + " " + Danilo();
        }
                
    }
}
