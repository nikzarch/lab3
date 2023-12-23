# Текст:
```
В спальне мерно звучало "грр-пс-пс". Дядя Юлиус спал, как ребенок. Начинало светать.
В еще совсем густых сумерках Малыш с трудом разглядел на тумбочке стакан с водой. Он опустил туда челюсти, послышался тихий плеск.
Рядом со стаканом лежали очки дяди Юлиуса и кулек с карамельками. Малыш взял кулек и сунул его в карман пижамы, чтобы отдать Карлсону.
Дяде Юлиусу было ни к чему его видеть, а то начнет еще допытываться, как он сюда попал.
```

# Описание модели
Класс Environment - класс окружающей среды, с полями имени и времени суток (енам состоящий из вечера и утра)  
Базовый абстрактный класс - Сущность Essence - от него наследуются следующие:  
Вещь Thing - класс, обозначающий вещь, имеет поле имени и места, нужного для метода лежать (лежит где-то или при отсутствии места просто лежит)  
От вещи наследуется класс Container - вещь, которая может содержать в себе другую, имеет поле содержимое типа Thing, куда и помещаются вещи, реализована логика добавления(с проверкой на свободное место) и удаления вещи   
От вещи также наследуется особый класс CandyBag - мешок с конфетами, в основном нужный для того, чтобы реализовать енам с карамельками (да, это мир где есть ТОЛЬКО ТРИ КАРАМЕЛЬКИ) и содержащий в себе n-ое количество карамелек, которые можно брать(тому же малышу) и войдово класть  
Человек Person - класс человека, есть поля имени и состояния(спит/не спит енам)  
от человека наследуются два final класса:  
Julius - Юлиус  
Kid - Малыш, с полем карман типа Container, куда он может класть вещи и доставать, в целом он умеет замечать вещи и брать их с причиной и без  

# UML
![UML](https://github.com/nikzarch/lab3/assets/153365178/b5f4d561-37ec-4d89-aec7-749e53372f65)

# Вывод программы  
В Спальня звучал грр-пс-пс  
Начинало светать  
Дядя Юлиус спит  
Стакан с водой лежит в Спальня  
Малыш увидел Стакан с водой  
Челюсти был положен в Карман  
Малыш взял Челюсти  
Челюсти был положен в Стакан с водой  
Малыш положил Челюсти в Стакан с водой  
Очки лежит в Спальня  
Кулёк с карамельками лежит в Спальня  
Малыш увидел Кулёк с карамельками  
В Кулёк с карамельками конфеты: Ротфронт Чупа-чупс Кремка   
Малыш взял Кулёк с карамельками чтобы отдать Карлсону  
Кулёк с карамельками был положен в Карман  
Карман занят  



