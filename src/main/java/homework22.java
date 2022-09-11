import java.util.HashMap;
import java.util.Map;
import java.lang.*;
public class homework22 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        String [] start ={"name","Ivanov", "country","Russia", "city","Moscow", "age","null"};
        for(int i=0; i< start.length;i++){
            map.put(start[i],start[i+1]);
            i+=1;
        }
        System.out.println(map);
        StringBuilder sb = new StringBuilder();
        String result = "select * from students where ";
        sb.append(result);
        if(map.get("name")!="null"){
            sb.append("name = "+map.get("name")+ "'");
        }
        if(map.get("country")!="null"){
            sb.append(" and country = "+map.get("country")+ "'");
        }
        if(map.get("city")!="null") {
            sb.append(" and city = " + map.get("city") + "'");
        }
        if (map.get("age") != "null") {
            sb.append(" and age = " + map.get("age") + "'");
        }
        System.out.println((sb));


            //"select * from students where name = 'Ivanov' and country = 'Russia' and city = 'Moscow'"
        }
    }


