package practice.codewars;

    public class ShortestWord {
        public static int findShortestWordLength(String sentence) {
            // Разделяем строку на слова
            String[] words = sentence.split(" ");

            // Инициализируем длину самого короткого слова длиной первого слова
            int shortestLength = words[0].length();

            // Перебираем слова и находим минимальную длину
            for (String word : words) {
                if (word.length() < shortestLength) {
                    shortestLength = word.length();
                }
            }

            return shortestLength;
        }

        public static void main(String[] args) {
            String sentence = "Java is a versatile programming language";
            System.out.println("Длина самого короткого слова: " + findShortestWordLength(sentence));
        }
    }


