import java.util.*;
/**
 * Write a description of class Translator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Translator
{
    static String[] english = {"The_person","The_people","The_herdsman","The_rules",
                        "The_salt","The_money","The_tree","The_trees","The_time",
                        "The_years","The_love","The_bread", "I", "You", "The_boy", 
                        "The_girl", "The_man", "The_woman", "The_buffalo"};
                        
    static String[] setswana = {"Motho","Batho","Modisa","Melao",
                         "Letswai","Madi","Setlhare","Ditlhare",
                         "Nako","Dingwaga","Lorato","Borotho", 
                         "Ke", "O", "Mosimane", "Mosetsana", "Monna","Mosadi", "Nare" };
                         
    static String[] eng_relative = {"is","are", "is", "is",
                                    "is", "is", "is", "are", "is", "are", "is", "is", "is"};
                             
    static String[] sets_relative = {"yo o","ba ba", "o o", "e e",
                              "le le", "a a", "se se","tse di",
                              "e e","tse di","lo lo","jo bo","mo go"};
    static String[] eng_possessive = {"their","their","their","its",
                               "its","its","its","their",
                               "its","their","its","its","its"};
    static String[] sets_possessive = {"wa","ba","wa","ya",
                                "la","a","sa","tsa",
                                "ya","tsa","lwa","jwa","ga"};
    static String[] nounClass = {"Mo","Ba","Mo","Me",
                          "Le","Ma","Se","Di",
                          "N","Din","Lo","Bo","Go"};                            
    static String[] verbs = {"running","eating","teaching", "reading", "talking", "sleeping", "driving", "singing", "writing","growing", "moving"};
    static String[] lediri = {"siana","ja","ruta", "bala", "bua", "robala", "kweetsa", "opela", "kwala", "gola", "tsamaya"};
    static String[] adverbs = {"quickly","amazingly","is_brightly_colored", "badly", "fast", "quitely"};
    static String[] matlhalosi = {"ka bonako","ka botswapelo","mmala o o phatsimang,", "bosula", "ka sepiti", "ka tidimalo"};
    
    static List<String> englishList = new ArrayList<>(Arrays.asList(english));
    static List<String> setswanaList = new ArrayList<>(Arrays.asList(setswana));
    static List<String> engRelList = new ArrayList<>(Arrays.asList(eng_relative));
    static List<String> setsRelList = new ArrayList<>(Arrays.asList(sets_relative));
    static List<String> verbsList = new ArrayList<>(Arrays.asList(verbs));
    static List<String> lediriList = new ArrayList<>(Arrays.asList(lediri));
    static List<String> adverbsList = new ArrayList<>(Arrays.asList(adverbs));
    static List<String> matlhalosiList = new ArrayList<>(Arrays.asList(matlhalosi));
    static List<String> engPossList = new ArrayList<>(Arrays.asList(eng_possessive));
    static List<String> setsPossList = new ArrayList<>(Arrays.asList(sets_possessive));
    static List<String> nounClassList = new ArrayList<>(Arrays.asList(nounClass));
    
    int index = 0;
    
    
    
   public static void splitting(String a){
       String[] arr = a.split(" ");
       for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
   }
   
   public static String firstChar(String str){
       return str.length() < 2 ? str : str.substring(0, 2);
   }
   
   public static String firstTwo(String a){
       return a.substring(0, 2);
   }
   
   public static String firstThree(String a){
       return a.substring(0, 3);
   }
   
   public static String translator(String s){
        String[] arr = s.split(" ");   
        String last = "";
        try{    
           if(elementWiseCompare(english,arr)){
            for(int i = 0; i < english.length; i++){
               for(int j = 0; j < arr.length; j++){
                if (english[i].equals(arr[j])){
                 last = last + setswana[i]; 
                }
               }
            }
           }
           
           if(elementWiseCompare(eng_relative,arr)){
                if(last.substring(0, 2).equals("Mo")){
                    last = last + " " + sets_relative[0];  
                 }else if(last.substring(0, 2).equals("Ba")){
                    last = last + " " + sets_relative[1];
                 }else if(last.substring(0, 2).equals("Mo")){
                    last = last + " " + sets_relative[2]; 
                 }else if(last.substring(0, 2).equals("Me")){
                    last = last + " " + sets_relative[3]; 
                 }else if(last.substring(0, 2).equals("Le")){
                    last = last + " " + sets_relative[4]; 
                 }else if(last.substring(0, 2).equals("Ma")){
                    last = last + " " + sets_relative[5]; 
                 }else if(last.substring(0, 2).equals("Se")){
                    last = last + " " + sets_relative[6]; 
                 }else if(last.substring(0, 2).equals("Di")){
                    last = last + " " + sets_relative[7]; 
                 }else if(last.substring(0, 1).equals("N")){
                    last = last + " " + sets_relative[8]; 
                 }else if(last.substring(0, 3).equals("Din")){
                    last = last + " " + sets_relative[9]; 
                 }else if(last.substring(0, 2).equals("Lo")){
                    last = last + " " + sets_relative[10]; 
                 }else if(last.substring(0, 2).equals("Bo")){
                    last = last + " " + sets_relative[11]; 
                 }else if(last.substring(0, 2).equals("Go")){
                    last = last + " " + sets_relative[12]; 
                 }else{
                    System.out.println(""); 
                 }
               }
            
           
           
           if(elementWiseCompare(verbs,arr)){
            for(int i = 0; i < verbs.length; i++){
               for(int j = 0; j < arr.length; j++){
                if (verbs[i].equals(arr[j])){
                 last = last + " " + lediri[i];
                }
               }
            }
           }
           
           if(elementWiseCompare(adverbs,arr)){
            for(int i = 0; i < adverbs.length; i++){
               for(int j = 0; j < arr.length; j++){
                if (adverbs[i].equals(arr[j])){
                 last = last + " " + matlhalosi[i];
                }
               }
            }
           }else{
             System.out.println("Please enter an adverb within the  specified dictionary");  
            }
           
           
           
        } catch(Exception e)  
        {  
            System.out.println(e);  
        }   
        System.out.println(last); 
        return last;
      }
      
      public static String nounClass(String s){
          String str = translator(s);
          String[] arr = str.split(" ");   
          String[] arr2 = s.split(" ");
          String last = "";
          if(elementWiseCompare(eng_relative,arr2)){
            for(int i = 0; i < eng_relative.length; i++){
               for(int j = 0; j < arr2.length; j++){
                if (eng_relative[i].equals(arr2[j])){
                 if(arr[0].substring(0,3).equals("Mo")){
                    last = str + " " + sets_relative[0];  
                 }else if(arr[0].substring(0,3).equals("Ba")){
                    last = str + " " + sets_relative[1];
                 }else if(arr[0].substring(0, 3).equals("Mo")){
                    last = str + " " + sets_relative[2]; 
                 }else if(arr[0].substring(0, 3).equals("Me")){
                    last = str + " " + sets_relative[3]; 
                 }else if(arr[0].substring(0, 3).equals("Le")){
                    last = str + " " + sets_relative[4]; 
                 }else if(arr[0].substring(0, 3).equals("Ma")){
                    last = str + " " + sets_relative[5]; 
                 }else if(arr[0].substring(0, 3).equals("Se")){
                    last = str + " " + sets_relative[6]; 
                 }else if(arr[0].substring(0, 3).equals("Di")){
                    last = str + " " + sets_relative[7]; 
                 }else if(arr[0].substring(0, 2).equals("N")){
                    last = str + " " + sets_relative[8]; 
                 }else if(arr[0].substring(0, 4).equals("Din")){
                    last = str + " " + sets_relative[9]; 
                 }else if(arr[0].substring(0, 3).equals("Lo")){
                    last = str + " " + sets_relative[10]; 
                 }else if(arr[0].substring(0, 3).equals("Bo")){
                    last = str + " " + sets_relative[11]; 
                 }else if(arr[0].substring(0, 3).equals("Go")){
                    last = str + " " + sets_relative[12]; 
                 }else{
                    System.out.println(""); 
                 }
                 }
               }
            }
           }
           System.out.println(last); 
           return last;
       }
    
    public static boolean elementWiseCompare(String[] a, String [] b){
      boolean status = false;
      for(int i = 0; i < a.length; i++){
         for(int j = 0;j < b.length; j++){
            if (a[i].equals(b[j])){
                return true;
            }
        }
      
     }
     return false;
    }
    
    public static void main(String[] args){
      System.out.println("Please enter a sentence in English:");
        
      Scanner scan = new Scanner(System.in);
      String text= scan.nextLine();
      
      
      translator(text);
      
        
      // String str1 = "The_person is running fast";
      // String str2 = "The_boy is eating quickly";
      // String str3 = "The_woman is driving amazingly";
      // String str4 = "The_man is teaching amazingly";
      // String str5 = "The_trees are growing quickly";
      // String str6 = "The_years are moving fast";
      // String str7 = "The_people are singing badly";
      // String str8 = "The_buffalo is sleeping quitely";
      // translator(str1);
      // translator(str2);
      // translator(str3);
      // translator(str4);
      // translator(str5);
      // translator(str6);
      // translator(str7);
      // translator(str8);
    }
}
