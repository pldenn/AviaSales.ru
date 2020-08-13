## Задача №2 - Самый быстрый

### Легенда

Иногда необходима сортировка не только по цене, а, например, по времени - люди хотят найти самый быстрый перелёт.

Естественно, ваш сервис идёт навстречу пожеланиям клиентов и решает добавить такую возможность.

Но как мы это сделаем? Ведь наши "билеты" уже сортируются по цене?

### `Comparator`

На помощь нам приходит подход, который мы обсуждали на лекции, и который вы должны теперь реализовать.

Помимо интерфейса `Comparable`, который определяет порядок сортировки объектов данного класса по умолчанию, у нас есть интерфейс `Comparator`, который позволяет создавать объекты, определяющие порядок сортировки других объектов.

Как это выглядит (мы покажем на примере сортировки по цене по возрастанию - аналог, который реализован вами в первой задаче):

```java
public class TicketByPriceAscComparator implements Comparator<Ticket> {
  public int compare(Ticket o1, Ticket o2) {
    return o1.getPrice() - o2.getPrice();
  }
}
```

Обратите внимание: это отдельный специальный класс, который умеет сравнивать два объекта типа "Билет".

Логика интерпретации возвращаемого из метода `compare` значения аналогична логике `compareTo`.

### Задача

В отдельной ветке "улучшите" сервис, создав метод `findAll(String from, String to, Comparator<Ticket> comparator)`*.

Примечание*: синтаксис `Comparator<Ticket>` в параметрах метода мы с вами обсудим на следующей лекции.

Что делает этот метод: он делает всё то же самое, что и обычный `findAll` (из первой задачи), но сортирует не методом `Arrays.sort(result)`, а `Arrays.sort(result, comparator)`.

Таким образом, вы сможете передавать в этот метод объект любого класса, реализующего интерфейс `Comparator<Ticket>`.

Итого: у вас должен быть репозиторий на GitHub, в котором в отдельной ветке расположен ваш компаратор, сервис с новым методами и автотесты к нему (к сервису).

Если автотесты в ветке проходят - делаете Pull Request на слияние в основную ветку (сливать не нужно).