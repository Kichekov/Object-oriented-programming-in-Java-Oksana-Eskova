package Task_40;

public class Logger {
    private static Logger uniqueInstance; //ссылка на единственный экземпляр класса
    private static StringBuilder result;


    public Logger() {
        result = new StringBuilder();
    }

    public static Logger getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Logger();
        }
        return uniqueInstance;
    }
    public static void putError( String text){
       result.insert(0, " ").insert(0, text);
    }

    public static String getErrors(){
        return result.toString().trim();
    }
}
