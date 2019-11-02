/**
 * @author Mert GUNAY
 * @since 26.12.2017
 * @version 1.0
 * @see this program take .java file from the user and check the program keywords count the keywords and print them descending order.
 * @{@touch} .java file user_input
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class Hashing {
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		System.out.print("Enter the name of the input Java file: ");
		String SourceFile,temp; 
		Scanner scan=new Scanner(System.in);
		SourceFile=scan.next();
		int x=0,y=0,k=0;
		String keyWords[]={"abstract","finally","public","boolean","float","return","break","for","short","byte","goto","static","case","if","super","catch","implements","switch","char","import","synchronized","class","instanceof","this","const","int","throw","continue","interface","throws","default","long","transient","do","native","try","double","new","void","else","package","volatile","extends","private","while","final","protected","true","null"};
		HashSet<String> mainWord=new HashSet<String>(); 
		for(int i=0;i<keyWords.length;i++) { 
			mainWord.add(keyWords[i]);
		}
		File File=new File(SourceFile);  
		Scanner input=new Scanner(File);
		HashMap<String,Integer>termMap=new HashMap<>();
		while(input.hasNext()){  
			temp=input.next();
			if(mainWord.contains(temp)){	
				if(!termMap.containsKey(temp)){
					termMap.put(temp,1);
				}
				else{
					k=termMap.get(temp).intValue();
					k++;
					termMap.replace(temp,k);
				}
			}
		}
		Set<Entry<String,Integer>>setEntry=termMap.entrySet();
		ArrayList<WordOccurrence>thisWord=new ArrayList<>();
		WordOccurrence Key;  	
		for (Entry<String,Integer>entry:setEntry) {
			Key=new WordOccurrence();
			if((x%3)==0){
				x=0;
			}
			Key.word=entry.getKey();
			Key.count=entry.getValue();
			thisWord.add(y,Key);
			x++;
			y++;
		}
		System.out.println("Keyword Frequencies in Descending Order");
		Collections.sort(thisWord);
		for(int i=0;i<thisWord.size();i++){
			System.out.printf("%-12s",thisWord.get(i).word);
			System.out.printf("%-6s",": " +thisWord.get(i).count);
			System.out.println("");	
		}
	}
}
