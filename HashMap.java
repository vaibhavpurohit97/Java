import java.util.HashMap;
import java.util.Map;
class SampleMaps
  {
     public static void main(String[] args)
      {
        Map<String, String> objMap = new HashMap<String, String>();
        objMap.put("Name", "Suzuki");
        objMap.put("Power", "220");
        objMap.put("Type", "2-wheeler");
        objMap.put("Price", "85000");
        System.out.println("Elements of the Map:");
        System.out.println(objMap);
	System.out.println(objMap.get("Price"));
      }
}