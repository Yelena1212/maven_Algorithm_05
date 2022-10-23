public class NumberOccurrences {

        public static int[][] /*Object[]*/ numberOccurrences(int[] arr) {       // так тоже можно + строка 25
            //{3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1} →
            //{{1, 4}, {2, 4}, {3, 4}, {4, 3}, {5, 4}}
            if (arr == null || arr.length == 0) {
                return new int[0][0];
            }

            Utils.sortArray(arr);                                 // Сортируем массив (ССЫЛКА НА ВАШ КЛАСС/МЕТОД СОРТИРОВКИ)
            // [1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5]

            int uniqNumbers = 1;

            for (int i = 1; i < arr.length; i++) {                              // считаем уникальные числа в массиве(это будет количеством пар в итоговом двумерном)
                if (arr[i] != arr[i - 1]) {
                    uniqNumbers++;
                }
            }

            int[][] resultArr = new int[uniqNumbers][2];                        //Object[] resultArr = new Object[uniqNumbers]; //так тоже можно + строка 7

            int counter = 1;                                                    // счетчик повторяющихся цифр
            int resultArrIndex = 0;                                             // индекс двумерного массива

            if (arr.length == 1) {                                              // если массив длиной 1 (в for нельзя т.к. for будет от 1 до < 0)
                resultArr[resultArrIndex] = new int[]{arr[0], 1};               // рисуем пару в двумерном масссиве
            }

            for (int i = 1; i < arr.length; i++) {
                if (i == 1 && arr[i] != arr[i - 1]) {                           // если 0 элемент массива встречается 1 раз
                    resultArr[resultArrIndex] = new int[]{arr[0], 1};           // рисуем пару про него в двумерном масссиве
                    resultArrIndex++;                                           // переводим на следующий индекс двумерного массива
                } else if (arr[i] == arr[i - 1] && i == arr.length - 1) {       // если последний элемент массива не одинок
                    resultArr[resultArrIndex] = new int[]{arr[i], counter + 1};
                } else if (arr[i] != arr[i - 1] && i == arr.length - 1) {       // если последний элемент массива единственный
                    resultArr[resultArrIndex] = new int[]{arr[i - 1], counter}; // рисуем прошлую пару
                    resultArr[resultArrIndex + 1] = new int[]{arr[i], 1};       // рисуем последнюю пару про последний элемент
                } else if (arr[i] == arr[i - 1]) {                              // считаем повторяющиеся цифры (не на краях массива)
                    counter++;
                } else if (arr[i] != arr[i - 1]) {                              // если появилось новое число (не на краях массива)
                    resultArr[resultArrIndex] = new int[]{arr[i - 1], counter}; // рисуем пару про предыдущее в двумерном масссиве
                    resultArrIndex++;                                           // переводим на следующий индекс двумерного массива
                    counter = 1;                                                //сбрасываем счетчик повторяющихся цифр
                }
            }

            return resultArr;
        }
    }

