package Part_7_2;
import java.util.HashMap;

public class UseOfHashMap {

        public static void main(String args[])
        {
            String str = "Yuvrajsinh Solanki";
//HashMap char as a key and occurrence as a value
            HashMap <Character, Integer> charCount = new HashMap<>();
            HashMap<String, Integer> hashMap = new HashMap<>();
            for (int i = str.length() - 1; i >= 0; i--)
            {
                if(charCount.containsKey(str.charAt(i)))
                {
                    int count = charCount.get(str.charAt(i));
                    charCount.put(str.charAt(i), ++count);
                }
                else
                {
                    charCount.put(str.charAt(i),1);
                }
            }
            System.out.println(charCount);

            // Splitting the words of string
            // and storing them in the array.
            String[] words = str.split(" ");

            for (String word : words) {

                // Asking whether the HashMap contains the
                // key or not. Will return null if not.
                Integer integer = hashMap.get(word);

                if (integer == null)
                    // Storing the word as key and its
                    // occurrence as value in the HashMap.
                    hashMap.put(word, 1);

                else {
                    // Incrementing the value if the word
                    // is already present in the HashMap.
                    hashMap.put(word, integer + 1);
                }
            }
            System.out.println(hashMap);
            System.out.println("This Program is Created by 21CE138 Yuvrajsinh Solanki");
        }
        }
