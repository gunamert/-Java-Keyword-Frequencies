# -Java-Keyword-Frequencies

This program takes a .java file from the user and search the keywords in the .java file and print the keywords descending order.

Sample Input:

import java.util.LinkedList;
public class MyHashMap<K, V> implements MyMap<K, V> {
//Construct a map with the specified initial capacity. Use this.
public MyHashMap(int initialCapacity, float loadFactorThreshold) { if (initialCapacity > MAXIMUM_CAPACITY)
this.capacity = MAXIMUM_CAPACITY; else
this.capacity = trimToPowerOf2(initialCapacity); this.loadFactorThreshold = loadFactorThreshold; table = new LinkedList[capacity];
}
@Override // Remove all of the entries from this map. Returns void. public void clear() { size = 0;
removeEntries(); }
@Override // Return true if this map contains the value. Uses for loop. public boolean containsValue(V value) {
for (int i = 0; i < capacity; i++) { if (table[i] != null) {
LinkedList<Entry<K, V>> bucket = table[i]; for (Entry<K, V> entry : bucket)
if (entry.getValue().equals(value)) return true; }}
return false; }
}

Sample Output:

Enter the name of the input Java file: MyHashMap.java Keyword Frequencies in Descending Order
public : 4
if :4
for :3
this :2 
return : 2 
implements : 1 
new :1 
package : 1
void :1
import:1 
float:1 
boolean:1 
else :1 
true :1 
class : 1
