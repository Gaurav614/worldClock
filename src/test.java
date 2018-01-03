
import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gaurav
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    ZoneId zoneid1 = ZoneId.of("America/Mendoza");  
   /* ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");  
    ZoneId as=ZoneId.of("America/New_York");*/
    LocalTime id1 = LocalTime.now(zoneid1);  
    //LocalTime id2 = LocalTime.now(zoneid2);  
    // LocalTime id3 = LocalTime.now(as); 
     //LocalTime id4=LocalTime.now(ZoneId.systemDefault());
  //  System.out.println(as.getgroup());  
   // System.out.println(id2);  
System.out.println(id1);  
//System.out.println(id4);  

        //"America/New_York"
//System.out.println(id1.isBefore(id2));    
    
 /* 
  Set<String> s=new HashSet();
  s=ZoneId.getAvailableZoneIds();
  String region="",area;
  ArrayList<String> li=new ArrayList();
  HashMap<String,ArrayList<String>> mp=new HashMap();
  //for(String i:s)
  //System.out.println(i);
 // ZoneId zone1 = ZoneId.of("Europe/Berlin");
  //System.out.println(zone1);
      /*for(String i:s)
  {
      int k=i.indexOf('/');
     if(k>=0){
      region=i.substring(0,k);
    area=i.substring(k+1,i.length());
     } 
    else
     {
         region=i;
     area=i;
     }
    
     if(!mp.containsKey(region))
     {
         mp.put(region,new ArrayList());
         
     }
     mp.get(region).add(area);
  }
  //for(String i:mp.keySet())
  //{
      //System.out.println(i);
     // for(String j:mp.get("Europe"))
      
      //  System.out.println(s.size());
    //}
    */
      //getAvailableTimeZones();*/
}
    public static Map<String, Set<TimeZone>> getAvailableTimeZones()

{

Map<String, Set<TimeZone>> availableTimezones =

new HashMap<String, Set<TimeZone>>();

 

// Loop through all available locales

 

for (String locale : Locale.getISOCountries())

{
Locale obj=new Locale("",locale);
final String countryCode = obj.getCountry();

 

// Locate the timezones added for this country so far

// (This can be moved to inside the loop if depending

// on whether country with no available timezones should

// be in the result map with an empty set,

// or not included at all)

 

Set<TimeZone> timezones = availableTimezones.get(countryCode);

if (timezones==null)

{

timezones = new HashSet<TimeZone>();

availableTimezones.put(countryCode, timezones);

}

 

// Find all timezones for that country (code) using ICU4J

 

for (String id :

com.ibm.icu.util.TimeZone.getAvailableIDs(countryCode))

{

// Add timezone to result map
 

timezones.add(TimeZone.getTimeZone(id));

}

}
//System.out.println(availableTimezones.get("US"));
Object keys[]=availableTimezones.keySet().toArray();
Arrays.sort(keys);
//for(Object i:keys)
//{  
  //  System.out.println(i+"--->");
/*for(TimeZone k:availableTimezones.get("AU"))
{
    if(!k.getID().equals("ACT") && !k.getID().equals("AET"))
    {
         ZoneId zoneid1 = ZoneId.of(k.getID());  
    
        System.out.println(k.getID()+"---->>" +LocalTime.now(zoneid1));
}
}*/
//}
//System.out.println(keys.);
return availableTimezones;

}
    
    
    
    
}


