/*
 Svi znaju igru kaladont. Svako kaže reč koja počinje sa zadnja dva slova prethodne reči.
Zadatak je da svako napiše metod koji će da štampa svoju reč na prethodnu.
Naravno da ne možete svi odjednom da implementirate svoj metod već jedan po jedan redom kako su poređani metodi da biste znali 
koju reč vaš emtod da vraća.
 */
package gittaskproject;
import java.lang.Exception;


public class Example {
    public static class Kaladont {
        
        public static String InitialWord() {
            return "Poruka";
        }
        
        public static String Nenad(){
            throw new RuntimeException();
        }
        
        public static String Dijana(){
            throw new RuntimeException();
        }
        
        public static String Ana() {
            return tanjir;
        }
        
        public static String Ivan() {
            throw new RuntimeException();
        }
        
        public static String Radenko() {
            throw new RuntimeException();
        }
        
        public static String Dusko() {
            throw new RuntimeException();
        }
        
        public static String Marko() {
            throw new RuntimeException();
        }
        
        public static String Milan() {
            throw new RuntimeException();
        }
        
        public static String ConcatenateAll(){
            return InitialWord() + " " + Nenad() + " " + Dijana() + " " + Ana() + " " + Ivan() + " " + Radenko() + " " + Dusko() + " " + Marko () + " " + Milan();
        }
                
    }
}
