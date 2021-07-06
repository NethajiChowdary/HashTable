package hashtable;

public class HashTable
{

    public static void main(String[] args)
    {
        HashTableImpl<String, Integer> hashImpl = new HashTableImpl();
        String message = "“Paranoids are not\r\n"
        		+ "paranoid because they are paranoid but\r\n"
        		+ "because they keep putting themselves\r\n"
        		+ "deliberately into paranoid avoidable\r\n"
        		+ "situations”";;

        //String to String conversion.
        String[] messageArray = message.toLowerCase().split(" ");

        //Iterate within the array
        for(String word: messageArray) 
        {
            Integer value =  hashImpl.get(word);
            if( value == null)
                value = 1;
            else
                value = value + 1;
            hashImpl.add(word , value);
        }
        //Display the Linkedlist
        System.out.println(hashImpl);
    }
}