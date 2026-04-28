# [Bronze III] Koncert - 7947

[문제 링크](https://www.acmicpc.net/problem/7947)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 601, 정답: 415, 맞힌 사람: 370, 정답 비율: 69.680%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Ekipa realizująca koncert znanej gwiazdy muzyki pop stanęła przed nie lada problemem. Gwiazda zażyczyła sobie bowiem, aby podczas trwania koncertu została oświetlona na precyzyjnie określony i niebanalny kolor. Technicy ekipy używają do oświetlenia gwiazdy 10 reflektor&oacute;w, kt&oacute;re jednocześnie oświetlają ją z r&oacute;żnych kierunk&oacute;w w precyzyjnie dobranych kolorach, aby efekt kompozycyjny całej sceny był zachowany. Musisz pom&oacute;c technikom określić jaki kolor zostanie uzyskany w centralnym miejscu, w kt&oacute;rym znajduje się gwiazda.</p>

### 입력

<p>Pierwsza linia wejścia zawiera małą liczbę całkowitą z &ndash; liczbę zestaw&oacute;w danych występujących kolejno po sobie. Opis jednego zestawu jest następujący:</p>

<p>Składa się on z 10 linii, każda złożona z trzech liczb całkowitych r, g, b oddzielonych spacjami (0 &le; r, g, b &le; 255) oznaczającymi odpowiednio zawartość trzech podstawowych barw światła w kolejnych reflektorach. Przyjmujemy, że kolor światła oświetlający gwiazdę będzie prostym uśrednieniem kolor&oacute;w pochodzących od wszystkich 10 używanych reflektor&oacute;w.</p>

### 출력

<p>Dla każdego zestawu danych wypisz trzy liczby całkowite r, g, b stanowiące opis trzech składowych koloru światła padającego na gwiazdę, będące uśrednieniem światła padającego z reflektor&oacute;w. Podaj wynik uwzględniając zaokrąglenie matematyczne do najbliższej liczby całkowitej, tzn. cyfry od 1 do 4 w d&oacute;ł, natomiast od 5 do 9 w g&oacute;rę.</p>