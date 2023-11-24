///Программа для введения пароля

// string password = "aksjd";
// string userinput;

// System.Console.WriteLine("Введите пароль:");

// userinput = Console.ReadLine();

// if (userinput == password)
// {
//     System.Console.WriteLine("Пароль принят.");
// }
// else
// {
//     System.Console.WriteLine("Неверный пароль.");

// }


///Обменник валют
// float dolinWallet;

// int rubToUsd = 64, USDTorub = 66;

// float exchangeCurrencyOperation;

// string desiredOperetion;

// System.Console.WriteLine("Добро пожаловать в обменник валют.");

// System.Console.WriteLine("Введите баланс рублей: ");
// rubinWallet = Convert.ToSingle  (Console.ReadLine());
// System.Console.WriteLine("Введите баланс Долларов: ");
// dolinWallet = Convert.ToSingle (Console.ReadLine());

// System.Console.WriteLine("Выберите необходимую операцию.");
// System.Console.WriteLine("1 - Обменять рубли на доллары.");
// System.Console.WriteLine("2 - обменять доллары на рубли.");
// System.Console.WriteLine("Ваш выбор: ");
// desiredOperetion = Console.ReadLine();

// switch (desiredOperetion)
// {
//     case "1":
//     System.Console.WriteLine("Обмен рублей на доллары.");
//     System.Console.WriteLine("Сколько вы хотите обменять?");
//     exchangeCurrencyOperation = Convert.ToSingle (Console.ReadLine());
//     if (rubinWallet >= exchangeCurrencyOperation)
//     {
//         rubinWallet -= exchangeCurrencyOperation;
//         dolinWallet += exchangeCurrencyOperation / rubToUsd;
//     }
//     else 
//     {
//         System.Console.WriteLine("Недопустимое колличество рублей.");
//     }
//     break;
//     case "2":
//     System.Console.WriteLine("Обмен долларов на рубли.");
//     System.Console.WriteLine("Сколько вы хотите обменять?");
//     exchangeCurrencyOperation = Convert.ToSingle (Console.ReadLine());
//     if (dolinWallet >= exchangeCurrencyOperation)
//     {
//         dolinWallet -= exchangeCurrencyOperation;
//         rubinWallet += exchangeCurrencyOperation * rubToUsd;
//     }
//     else 
//     {
//         System.Console.WriteLine("Недопустимое колличество долларов.");
//     }
//     break;
//     default:
//     System.Console.WriteLine("Выбрана неверная операция.");
//     break;
// }
// System.Console.WriteLine($"Ваш баланс: {rubinWallet} рублей." + $" {dolinWallet} долларов.");



// using System.Net.Http.Headers;

// /// float rubinWallet;
// ///


///Библиотека
internal class Program
{
    private static void Main(string[] args)
    {
        bool isOpen = true;
        string[,] books =
        {
    { "Aleksandr Pushkin", "Mihail Lermontov", "Sergey Esenin" },
    { "Robert Martin", "Jessie Shell", "Sergey Teplyakov" },
    { "Steven King", "Govard Lovecraft", "Brem Stoker" }
};

        while (isOpen)
        {
            Console.SetCursorPosition(0, 20);
            Console.WriteLine("\nAll list Authors:\n");
            for (int i = 0; i < books.GetLength(0); i++)
            {
                for (int j = 0; j < books.GetLength(1); j++)
                {
                    Console.Write(books[i, j] + " | ");
                }
                Console.WriteLine();
            }

            Console.SetCursorPosition(0, 0);
            Console.WriteLine("Library");
            Console.WriteLine("\n1 - search name of author for index." +
                                     "\n\n2 - search book for author." +
                                     "\n\n3 - Quit.");
            Console.Write("\nSelect menu item: ");

            switch (Convert.ToInt32(Console.ReadLine()))
            {
                case 1:
                    int line, column;
                    Console.Write("Enter shelf number: ");
                    line = Convert.ToInt32(Console.ReadLine()) - 1;
                    Console.Write("Enter column number: ");
                    column = Convert.ToInt32(Console.ReadLine()) - 1;
                    Console.Write("This author: " + books[line, column]);
                    break;
                case 2:
                    string author;
                    bool authorIsFound = false;
                    Console.Write("Enter author: ");
                    author = Console.ReadLine();
                    for (int i = 0; i < books.GetLength(0); i++)
                    {
                        for (int j = 0; j < books.GetLength(1); j++)
                        {
                            if (author.ToLower() == books[i, j].ToLower())
                            {
                                Console.WriteLine($"Author {books[i, j]} located at shelf " +
                                $"{i + 1}, place {j + 1}.");
                                authorIsFound = true;
                            }
                        }
                    }
                    if (authorIsFound == false)
                    {
                        Console.WriteLine("This author is not found.");
                    }
                    break;
                case 3:
                    isOpen = false;
                    break;
                default:
                    Console.WriteLine("Invalid command.");
                    break;
            }

            if (isOpen)
            {
                Console.WriteLine("\nTap any key...");
            }

            Console.ReadKey();
            Console.Clear();
        }
    }
}