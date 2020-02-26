package homework5_1;

//* Создать массив из 5 сотрудников
//* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

    public class MainTestDrive {
        public static void main(String[] args) {

            Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
            persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 25); // потом для каждой ячейки массива задаем объект
            persArray[1] = new Person("Fedorov Sergei", "CEO", "Fedorov@mailbox.com", "892312312", 40000, 30);
            persArray[2] = new Person("Jhonson Jan", "CRM", "Jhonson@mailbox.com", "892312312", 50000, 45);
            persArray[3] = new Person("Bill Van Dam", "Jva developer", "Bill@mailbox.com", "892312312", 60000, 41);
            persArray[4] = new Person("Black Mamba", "Manager", "Black@mailbox.com", "892312312", 70000, 49);

            for (Person item : persArray){
                if(item.getAge() > 40) item.personInfo();
            }
        }
    }
