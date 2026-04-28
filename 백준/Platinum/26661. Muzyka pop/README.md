# [Platinum I] Muzyka pop - 26661

[문제 링크](https://www.acmicpc.net/problem/26661)

### 성능 요약

시간 제한: 9 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Mateusz uwielbia muzykę pop. Jest odprężająca, świetnie się do niej tańczy, a nawet pomaga w programowaniu. Te wszystkie zalety wymagają jednak dobrego zgrania melodii z bitem.</p>

<p>Mateusz stworzył właśnie nową melodię i zamierza dopasować do niej dobre bity. Melodia trwa n sekund i niekt&oacute;re jej momenty mogą być dużo lepsze od innych. Jakość i-tej sekundy melodii jest opisana liczbą całkowitą a<sub>i</sub> (być może ujemną) i trzeba do niej dobrać nieujemny całkowity wsp&oacute;łczynnik bitowego wzmocnienia b<sub>i</sub>. Wsp&oacute;łczynnik wzmacnia tę sekundę C(b<sub>i</sub>)-krotnie, gdzie C(b<sub>i</sub>) oznacza liczbę zapalonych bit&oacute;w w zapisie binarnym liczby b<sub>i</sub>.<sup>&lowast;</sup> Przykładowo, wybranie b<sub>i</sub> = 13 daje trzykrotne wzmocnienie i-tej sekundy melodii, gdyż zapisem binarnym liczby 13 jest <code>1101</code> i zawiera on trzy zapalone bity.</p>

<p>Ostateczną jakość całej piosenki możemy zapisać jako:</p>

<p style="text-align: center;">a<sub>1</sub> &middot; C(b<sub>1</sub>) + a<sub>2</sub> &middot; C(b<sub>2</sub>) + . . . + a<sub>n</sub> &middot; C(b<sub>n</sub>).</p>

<p>Każdy lubi piosenki z narastającym wzmocnieniem bitowym i Mateusz nie jest wyjątkiem. Wsp&oacute;łczynniki bitowe b<sub>i</sub> muszą tworzyć rosnący ciąg nieujemnych liczb całkowitych z pewnym g&oacute;rnym limitem m:</p>

<p style="text-align: center;">0 &le; b<sub>1</sub> &lt; b<sub>2</sub> &lt; . . . &lt; b<sub>n</sub> &le; m.</p>

<p>Celem Mateusza jest takie dobranie wsp&oacute;łczynnik&oacute;w bitowych, aby zmaksymalizować ostateczną jakość piosenki. Jaką największą wartość może on otrzymać?</p>

<hr />
<p><sup>&lowast;</sup>Innymi słowy, C(b<sub>i</sub>) jest liczbą jedynek w zapisie binarnym liczby b<sub>i</sub>.</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite n, m (1 &le; n &le; 200, n &minus; 1 &le; m &le; 10<sup>18</sup>), oznaczające długość trwania piosenki w sekundach oraz g&oacute;rne ograniczenie na wsp&oacute;łczynniki bitowe.</p>

<p>W drugim wierszu wejścia znajduje się n liczb całkowitych a<sub>1</sub>, . . . , a<sub>n</sub> (&minus;10<sup>14</sup> &le; a<sub>i</sub> &le; 10<sup>14</sup>), oznaczających jakości kolejnych sekund melodii.</p>

### 출력

<p>Na wyjściu powinna znajdować się jedna liczba całkowita &ndash; maksymalna możliwa ostateczna jakość piosenki.</p>

### 제한

<p>Wyjaśnienie pierwszego przykładu: Melodia składa się z trzech sekund o jakościach odpowiednio 2, &minus;1, 3. Zauważ, że jakość sekundy może być ujemna! Optymalnym ciągiem b jest b<sub>1</sub> = 3, b<sub>2</sub> = 4, b<sub>3</sub> = 5. Wtedy otrzymujemy:</p>

<p style="text-align: center;">a<sub>1</sub> &middot; C(b<sub>1</sub>) + a<sub>2</sub> &middot; C(b<sub>2</sub>) + a<sub>3</sub> &middot; C(b<sub>3</sub>) = 2 &middot; C(3) + (&minus;1) &middot; C(4) + 3 &middot; C(5) = 2 &middot; 2 + (&minus;1) &middot; 1 + 3 &middot; 2 = 9</p>