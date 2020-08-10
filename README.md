## Задача №1 - Поиск билетов

### Легенда

Вы работаете в сервисе по продаже авиабилетов онлайн. Вот как это выглядит на https://aviasales.ru*:

![](pic/aviasales.png)

Примечание*: если у вас не доступен по каким-то причинам сайт, вы можете воспользоваться сохранённой [pdf-версией](assets/aviasales.pdf)

Что вам нужно сделать:
1. Спроектируйте класс для информации о "Билете"*
1. Реализуйте репозиторий для хранения информации о "Билетах" (добавить, удалить, получить список)
1. Реализуйте менеджера поиска по аэропорту вылета и аэропорту прилёта (даты не учитывайте)

Примечание*: конечно же, сущность, которую вы видите на экране, - это не билет, а предложение. Попробуйте придумать ей более логичное имя.

#### Информация о "Билете"

Класс информации о билете - это data-класс, который должен содержать:
1. id
1. Стоимость (для упрощения будем считать стоимость единой для всех продавцов)
1. Аэропорт вылета (вы можете использовать [IATA-коды](https://ru.wikipedia.org/wiki/%D0%9A%D0%BE%D0%B4_%D0%B0%D1%8D%D1%80%D0%BE%D0%BF%D0%BE%D1%80%D1%82%D0%B0_%D0%98%D0%90%D0%A2%D0%90))
1. Аэропорт прилёта (вы можете использовать [IATA-коды](https://ru.wikipedia.org/wiki/%D0%9A%D0%BE%D0%B4_%D0%B0%D1%8D%D1%80%D0%BE%D0%BF%D0%BE%D1%80%D1%82%D0%B0_%D0%98%D0%90%D0%A2%D0%90))
1. Время в пути (в минутах)

Других данных не нужно.

Данный класс должен реализовывать интерфейс `Comparable` так, чтобы по умолчанию сортировка происходила по цене (самый дешёвый - самый первый).

#### Репозиторий

Репозиторий для хранения "билетов" ничем не отличается от тех репозиториев, что мы проходили раньше

### Менеджер

В менеджере методов `findAll` должен претерпеть некоторые изменения: он должен принимать два параметра:
1. `from` - аэропорта вылета
1. `to` -  аэропорт прилёта

Соответственно, в результате поиска возвращается массив только с теми билетами, что соответствуют условиям поиска.

Кроме того, результаты должны быть отсортированы по цене (от меньшей к большей).

**Важно**: выполняйте сортировку только после того, как вы выбрали из репозитория все подходящие результаты! Не нужно сортировать при каждом добавлении в массив результатов.

### Автотесты

Напишите автотесты на поиск, удостоверившись, что он удовлетворяет условиям задачи. Количество тестов и тестируемые сценарии мы оставляем на ваше усмотрение.

Итого: у вас должен быть репозиторий на GitHub, в котором расположен ваш Java-код и автотесты к нему, GitHub Actions и т.д. (всё как обычно).
