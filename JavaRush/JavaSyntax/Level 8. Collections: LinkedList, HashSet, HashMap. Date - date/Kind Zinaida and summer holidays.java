import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Iterator;
/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("JUNE 12 2002"));
        map.put("Иванов", dateFormat.parse("JULY 30 2002"));
        map.put("Денисов", dateFormat.parse("JULY 14 2001"));
        map.put("Королев", dateFormat.parse("MARCH 15 2012"));
        map.put("Сашин", dateFormat.parse("AUGUST 21 2003"));
        map.put("Леднев", dateFormat.parse("JUNE 9 1999"));
        map.put("Морозов", dateFormat.parse("SEPTEMBER 1 1989"));
        map.put("Алёшин", dateFormat.parse("AUGUST 14 1997"));
        map.put("Закиров", dateFormat.parse("NOVEMBER 12 1995"));
        map.put("Антонов", dateFormat.parse("AUGUST 8 2008"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Map<String, Date> date_m = map;
        Iterator iter = map.values().iterator();
        
        while(iter.hasNext()){
            String month = iter.next().toString().substring(4,7);
            if(month.equals("Aug") || month.equals("Jun") || month.equals("Jul")) {
                iter.remove();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Map<String, Date> date = createMap(); 
        removeAllSummerPeople(date);
    }
}