import java.util.*;
public class TestList
{
	private final  Map<String, String> testMap = new HashMap<>(); 
	private final  Map<String, String> finalMap = new HashMap<>();

 public static void main(String[] args) {
	TestList t = new TestList();
	t.test();
	 
	 
 }
 
 public void test(){
	 finalMap.put("A","ABC");
	 finalMap.put("B","BCD");
	 finalMap.put("C","CDE");


	 testMap.put("A1","ABC");
	 testMap.put("B","test");
	 testMap.put("C1","CDE");
	
	 prepareFinalList();		
 }
    private void prepareFinalList()
    {
		Set finalKeys = finalMap.keySet();
		Iterator itr = finalKeys.iterator();
			while (itr.hasNext()){
            String key = (String)itr.next();
				System.out.println("Key ="+key);

            if (testMap.containsKey(key)) {
				System.out.println("Key Found");
                checkTestList(key);
            }
            else{
                System.out.println("Not Found");
				testMap.put(key, "A");
                checkTestList(key);
            }
        }
    }

    private void checkTestList(String key)
    {
        String keyValue = testMap.get(key);
        if (keyValue.equals("test")) {
            System.out.println("Data Found. Removing");
            testMap.remove(key);
        }
    }

  
}
