/**
 * @author Mert GUNAY-041501007
 * @since 26.12.2017
 * @version 1.0
 * @see create a wordOccurrence class and hold the word and count values.
 * {@value} .java
 * {@code} .java
 */
public class WordOccurrence implements Comparable<WordOccurrence>{
	public String word;
	public int count;
	public WordOccurrence(){
	}
	public WordOccurrence(String word,int count){
		word=this.word;
		count=this.count;
	}
	public int compareTo(WordOccurrence i){
		long difference=this.count-i.count;
		if (difference>0)
			return -1;
		else if (difference<0)
			return 1;
		else
			return 0;
	}
}