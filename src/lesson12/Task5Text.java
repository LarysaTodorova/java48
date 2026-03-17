package lesson12;

public class Task5Text {

     /*
        У вас есть текст.

Требуется - убрать ВСЕ специальные символы, такие как: "(",")","@"
(методом replace не пользоваться!!!)
         */

  //  public String textWithoutSpecialSymbols(String text){

    //    String cleanText = "";

      //  for (int i = 0; i < text.length(); i++) {

        //    char currentChar = text.charAt(i);

          //  if (currentChar != '(' && currentChar != ')' && currentChar != '@'){
          //      cleanText = cleanText + currentChar;
         //   }

       // }
      //  return cleanText;

    /*
    доп условия от закзчика
    спец символы это !"№;%:?*()
     */

    public String textWithoutSpecialSymbols(String text){

        String cleanText = "";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if (isNotSpecialCharacters(currentChar)){

                cleanText = cleanText + currentChar;
            }

        }
        return cleanText;
    }

    public boolean isNotSpecialCharacters(char currentChar){
        if (currentChar =='@') return false;
        if (currentChar =='#') return false;
        if (currentChar =='$') return false;
        if (currentChar =='%') return false;
        if (currentChar =='(') return false;
        if (currentChar ==')') return false;

        return true;
    }
}

