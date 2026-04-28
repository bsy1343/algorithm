# [Platinum V] Podzielność - 26840

[문제 링크](https://www.acmicpc.net/problem/26840)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 13, 맞힌 사람: 11, 정답 비율: 50.000%

### 분류

수학, 그리디 알고리즘, 정수론, 이분 탐색, 누적 합

### 문제 설명

<p>Ostatnio na lekcji informatyki Bajtuś uczył się o pozycyjnych systemach liczbowych. Dowiedział się m.in., że ludzie najczęściej korzystają z naturalnego dla nich dziesiątkowego systemu liczbowego, a komputery zapisują liczby w systemie dw&oacute;jkowym. Jednak dowolna liczba naturalna B większa od 1 może stać się podstawą systemu liczbowego. W takim systemie dysponujemy cyframi 0, 1, 2, . . . , B&minus;2, B&minus;1, a k-cyfrowy zapis złożony z kolejnych cyfr c<sub>k&minus;1</sub>c<sub>k&minus;2</sub> . . . c<sub>2</sub>c<sub>1</sub>c<sub>0</sub> oznacza liczbę</p>

<p style="text-align: center;">c<sub>k&minus;1</sub> &middot; B<sup>k&minus;1</sup> + c<sub>k&minus;2</sub> &middot; B<sup>k&minus;2</sup> + . . . + c<sub>2</sub> &middot; B<sup>2</sup> + c<sub>1</sub> &middot; B + c<sub>0</sub>.</p>

<p>Przykładowo, w tr&oacute;jkowym systemie pozycyjnym zapis 201 oznacza liczbę 2 &middot; 3<sup>2</sup> + 0 &middot; 3 + 1, czyli 19 w systemie dziesiętnym (w skr&oacute;cie możemy to zapisać jako 201<sub>3</sub> = 19<sub>10</sub>).</p>

<p>Bajtuś wybrał pewną liczbę B jako podstawę systemu liczbowego i napisał na karteczkach wszystkie możliwe cyfry w tym systemie, niekt&oacute;re być może wielokrotnie: dla i = 0, 1, . . . , B &minus;1 ma on ai karteczek z cyfrą i. Chciałby ułożyć z nich jak największą liczbę podzielną przez B &minus; 1. Napisz program, kt&oacute;ry mu w tym pomoże. Szukana liczba może być bardzo duża, jednak Bajtusiowi wystarczy, że podasz tylko niekt&oacute;re jej cyfry. Przyjmujemy, że zapis liczby dodatniej nie może zaczynać się od zer wiodących, a jedyny zapis zera to 0.</p>

<p>Uwaga: Zakładamy, że w przypadku system&oacute;w pozycyjnych o podstawie większej niż 10, cyfry w zapisie liczby są rozdzielone np. odstępami, dzięki czemu nie ma problemu z podziałem liczby na poszczeg&oacute;lne cyfry.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajdują się dwie liczby całkowite B oraz q (B &ge; 2, q &ge; 1) oddzielone pojedynczym odstępem, oznaczające podstawę systemu liczbowego i liczbę pytań o cyfry szukanej przez Bajtusia liczby.</p>

<p>Drugi wiersz zawiera ciąg B liczb całkowitych a<sub>0</sub>, a<sub>1</sub>, . . . , a<sub>B&minus;1</sub> (a<sub>i</sub> &ge; 1) pooddzielanych pojedynczymi odstępami, oznaczających liczby karteczek z kolejnymi cyframi, kt&oacute;re są w posiadaniu Bajtusia.</p>

<p>Następne q wierszy zawiera pytania: i-ty z tych wierszy zawiera jedną liczbę całkowitą k<sub>i</sub> (0 &le; k<sub>i</sub> &le; 10<sup>18</sup>).</p>

### 출력

<p>Na standardowe wyjście należy wypisać dokładnie q wierszy; i-ty z nich musi zawierać k<sub>i</sub>-tą cyfrę największej liczby w systemie o podstawie B podzielnej przez B &minus; 1, kt&oacute;rą może ułożyć Bajtuś, wykorzystując posiadane karteczki. Cyfry numerujemy według wzoru podanego powyżej: od prawej strony (czyli od najmniej znaczących cyfr) i począwszy od 0. Jeśli szukana liczba ma mniej niż k<sub>i</sub> cyfr, w i-tym wierszu należy wypisać &minus;1.</p>

### 제한

<ul>
	<li>B, a<sub>i</sub> &le; 1 000 000, q &le; 100 000</li>
</ul>

### 힌트

<p>Wyjaśnienie do przykładu: Mając po jednej cyfrze 0, 1 i 2 w tr&oacute;jkowym systemie liczbowym, Bajtuś może ułożyć liczby 0<sub>3</sub> = 0<sub>10</sub>, 1<sub>3</sub> = 1<sub>10</sub>, 2<sub>3</sub> = 2<sub>10</sub>, 10<sub>3</sub> = 3<sub>10</sub>, 12<sub>3</sub> = 5<sub>10</sub>, 20<sub>3</sub> = 6<sub>10</sub>, 21<sub>3</sub> = 7<sub>10</sub>, 102<sub>3</sub> = 11<sub>10</sub>, 120<sub>3</sub> = 15<sub>10</sub>, 201<sub>3</sub> = 19<sub>10</sub> oraz 210<sub>3</sub> = 21<sub>10</sub>. Przez 2 podzielne są jedynie 0<sub>3</sub>, 2<sub>3</sub> oraz 20<sub>3</sub>, zatem szukana liczba to 20<sub>3</sub>.</p>