# Калькулятор (SOLID)

## 1) S - Single Responsibility Principle - принцип единственной ответственности.
Все методы класса Calculator перенесли в отдельные классы, таким образом каждый имеет только одну
зону ответственности:

а) *CalculatorSum* - класс, обеспечивающий суммирование;  
б) *CalculatorMultiply* - класс, обеспечивающий умножение;  
в) *CalculatorDivision* - класс, обеспечивающий деление;  
г) *CalculatorNumToBinary* - класс, обеспечивающий перевод десятичного числа в двоичное представление;  
д) *CalculatorStrToBinary* - класс, обеспечивающий перевод десятичного числа (как строка) в двоичное представление.

## 2) O - Open closed Principle - принцип открытости-закрытости. 
*(Классы должны быть открыты для расширения, но закрыты для изменения.)*

У калькулятора есть возможность суммирования чисел, однако числа могут быть разного представления: десятичного или 
двоичного. Для этого создали интерфейс *SumService* и в нем поместили метод суммы. После этого создали 2 класса:
*CalculatorDecimalSum* для суммы десятичных чисел и *CalculatorBinarySum* для суммы двоичных чисел. Таким образом 
расширяется функциональность и принцип сохраняется. 

Аналогично сделано и для *SubtractionService*. 

## 3) L - Liskov substitution Principle - принцип подстановки Барбары Лисков.
*(Должна быть возможность вместо базового (родительского) типа (класса) подставить любой его подтип (класс-наследник), 
при этом работа программы не должна измениться.)*

Есть класс *Calculator*, обеспечивающий базовые функции +,-,*,/; а также его 
класс-наследник *BinaryCalculator*, обеспечивающий базовые функции сложения и вычитания для
двоичных чисел. В результате, если заменить класс *Calculator* на *BinaryCalculator*, то программа продолжит
нормально работать.

## 4) I -  Interface Segregation Principle - принцип разделения интерфейсов. 
*(Данный принцип обозначает, что не нужно заставлять клиента (класс) реализовывать интерфейс, 
который не имеет к нему отношения.)*

Интерфейс *toBinaryService* разделен на 3 интерфейса:  
а) *wholeToBinaryService* - работа с целой частью;  
б) *fractionalToBinaryService* - работа с дробной частью;  
в) *strToBinaryService* - работа со строковой переменной. 

## 5) D - Dependency Inversion Principle - принцип инверсии зависимостей.

Данный принцип тесно связан с предыдущем. Инверсия отрабатывает на моменте имплементации
интерфейса *fractionalToBinaryService* в классы *CalculateNumToBinary* и *CalculateStrToBinary*