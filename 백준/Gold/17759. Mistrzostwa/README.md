# [Gold II] Mistrzostwa - 17759

[문제 링크](https://www.acmicpc.net/problem/17759)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 13, 맞힌 사람: 12, 정답 비율: 48.000%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색, 그리디 알고리즘

### 문제 설명

<p>Mistrzostwa Świata w Sportach Komputerowych to najważniejsze wydarzenie w kalendarzu każdego fana elektronicznych rozrywek. W tym roku organizacja mistrzostw przypadła w udziale kr&oacute;lestwu Bajtocji. Komitet organizacyjny powołany przez kr&oacute;la Bajtazara stoi przed trudnym zadaniem &ndash; musi zdecydować, w kt&oacute;rych miastach Bajtocji rozegrane zostaną zawody. W Bajtocji jest n miast (ponumerowanych liczbami od 1 do n) połączonych m dwukierunkowymi drogami.</p>

<p>Komitet spodziewa się, że na mistrzostwa przyjadą tłumy kibic&oacute;w z całego świata. Wiadomo, że kibice będą często podr&oacute;żować pomiędzy miastami-organizatorami, aby oglądać zawody r&oacute;żnych dyscyplin. Priorytetem jest zatem, aby zbi&oacute;r miast, w kt&oacute;rych odbywać się będą zawody, był dobrze skomunikowany.</p>

<p>Zbi&oacute;r miast S nazwiemy dobrze skomunikowanym, jeśli:</p>

<ol>
	<li>Z każdego miasta zbioru S wychodzi co najmniej d bezpośrednich dr&oacute;g do innych miast zbioru S.</li>
	<li>Pomiędzy każdymi dwoma miastami zbioru S istnieje trasa przebiegająca tylko przez miasta zbioru S.</li>
</ol>

<p>Dodatkowo, aby zminimalizować średnią liczbę gości przypadających na jedno miasto, komitet chciałby, aby wybrany zbi&oacute;r był możliwie najliczniejszy.</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się trzy liczby całkowite n, m i d (2 &le; n &le; 200 000, 1 &le; m &le; 200 000, 1 &le; d &lt; n) oznaczające odpowiednio liczbę miast i liczbę dr&oacute;g w Bajtocji oraz parametr d. Kolejne m wierszy zawiera opis bajtockich dr&oacute;g: w i-tym z nich znajdują się dwie liczby całkowite a<sub>i</sub> i b<sub>i</sub> (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; n, a<sub>i</sub> &ne; b<sub>i</sub>) oznaczające, że i-ta droga łączy miasta o numerach a<sub>i</sub> i b<sub>i</sub>. Pomiędzy każdą parą miast istnieje co najwyżej jedna bezpośrednia droga.</p>

### 출력

<p>Jeśli nie da się wybrać dobrze skomunikowanego zbioru miast Bajtocji, na wyjście należy wypisać słowo NIE.</p>

<p>W przeciwnym razie na wyjście należy wypisać najliczniejszy dobrze skomunikowany zbi&oacute;r miast, w następującym formacie. W pierwszym wierszu powinna znaleźć się liczba k oznaczająca wielkość znalezionego zbioru. W drugim wierszu należy wypisać k liczb będących numerami miast należących do zbioru, w kolejności rosnącej.</p>

<p>Jeśli istnieje wiele rozwiązań, Tw&oacute;j program może wypisać dowolne z nich.</p>