package homework35;

import java.util.ArrayList;
import java.util.List;

public class CatService {

    private List<Cat> cats;

    public CatService() {
        this.cats = new ArrayList<>();
    }

    public void addCat(Cat cat) {
        cats.add(cat);
    }

    public ResponseCat<Cat> findCatByName(String name) {
        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                return new ResponseCat<>(200, "кот найден", cat);
            }
        }

        return new ResponseCat<>(404, "кота не нашли", null);
    }

    public ResponseCat<List<Cat>> findCatsByBreed(String breed) {
        List<Cat> foundedCats = new ArrayList<>();
        for (Cat currentCat : cats) {
            if (currentCat.getBreed().equalsIgnoreCase(breed)) {
                foundedCats.add(currentCat);
            }
        }

        if (!foundedCats.isEmpty()) {
            return new ResponseCat<>(200, "коты найдены", foundedCats);
        } else {
            return new ResponseCat<>(404, "котов не нашли", null);

        }

    }
}

/*
   Создать универсальный класс (с использованием дженериков),
   который бы использовался в качестве объекта для передачи результата какого-либо метода.


    Допустим есть класс Cat в котором String name; String breed;

    Допустим есть класс ResponseCat в котором int codeResult; String message; Cat cat;

    То есть, когда мы вызываем метод findCatByName(String name) - то нам возвращается ResponseCat в котором будет следующие данные:

    если кота нашли: то int codeResult = 200; String message = "кот найден"; Cat cat = ссылка на найденный экземпляр класса;

    если кота НЕ нашли: то int codeResult = 404; String message = "кот не найден"; Cat cat = null;

???? А если нам надо создать метод findCatsByBreed(String breed)

    то нам надо вернуть ResponseCats (где будет int codeResult; String message; List cats; )

    ЗАДНИЕ - создать класс с дженериками, чтобы и из метода findCatByName и findCatsByBreed возвращать Response или Response<List>

    */

