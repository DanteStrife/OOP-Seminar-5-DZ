Задание 1

1. Создать package – data. Работу продолжаем в нем
2. Реализовать абстрактный класс User и его наследники Student и Teacher.
    Родитель имеет в себе общие данные (пример: фио, год рождения и тд),
    а наследники собственные параметры (какие, по выбору преподавателя –
    Пример: studentId для Student, disciplesTaught для Teacher).
3. После этого проговорить со студентами важность снижения
    дублирования кода и легкость управления структурой данных
    (в том числе, создание необходимого числа корректных конструкторов)
    и добавления новых сущностей путем наследования от абстрактного класса

Задание 2

1. Создать package – service. Работу продолжаем в нем
2. Создать класс DataService с методами по управлению
    сущностями User (create, read) и агрегирующий всех пользователей заведенных в системе
3. StudentId должны быть созданы по алгоритму –
    максимальный id в коллекции + 1.
    Аналогично и для TeacherId. Здесь решение через перебор элементов и instanceOf

Задание 3
1. Создать package – controller. Работу продолжаем в нем
2. Создать класс Controller агрегирующий в себе необходимые классы в виде полей, а инициализируем прям в поле.
3. Создаем метод созданиеСтудента – реализующий логику, путем вызова соответствующих методов интерфейсов:
    1. Создания Студента в сервисе
    2. Возвращение всех студентов в сервисе