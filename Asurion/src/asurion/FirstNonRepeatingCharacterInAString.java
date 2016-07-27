package asurion;

import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacterInAString {
	
	
	public class CharacterCounter
	{
		int index;
		int count;
		public CharacterCounter(int index,int count)
		{
			this.index=index;
			this.count=count;
		}
	}

	public static void main(String args[])
	{
		String str = "geeksforgeeks";
		FirstNonRepeatingCharacterInAString f = new FirstNonRepeatingCharacterInAString();
		System.out.println("The first non-repeating character is: "+f.getFirstNonRepeatingCharacter(str));
	}
	
	public Character getFirstNonRepeatingCharacter(String str)
	{
		LinkedHashMap<Character,CharacterCounter> linkedHashMap = new LinkedHashMap<Character,CharacterCounter>();
		
		for(int i=0;i<str.length();i++)
		{
			
			if(linkedHashMap.containsKey(Character.valueOf(str.charAt(i))))
			{
				linkedHashMap.get(Character.valueOf(str.charAt(i))).count++;
			}
			else
			{
								
				CharacterCounter object = new CharacterCounter(0,0);
				object.index=i;
				object.count=1;
				linkedHashMap.put(Character.valueOf(str.charAt(i)),object);
			}
			
		}
		
		for(Character ch:linkedHashMap.keySet())
		{
			if(linkedHashMap.get(ch).count==1)return ch;
		}
		
		return null;
	}
}
