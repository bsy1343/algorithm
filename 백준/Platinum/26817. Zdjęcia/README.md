# [Platinum II] Zdjęcia - 26817

[문제 링크](https://www.acmicpc.net/problem/26817)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 2, 정답: 1, 맞힌 사람: 1, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 이분 탐색, 자릿수를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Bajtazar ma kolekcję wielu zdjęć z r&oacute;żnych wydarzeń ze swojego życia, na przykład: <code>ferie1.jpg</code>, <code>ferie2.jpg</code>, . . . , <code>ferie129.jpg</code>, <code>oboz1.jpg</code>, <code>oboz2.jpg</code>, . . . , <code>oboz13.jpg</code>, <code>olimpiada1.jpg</code>, <code>olimpiada2.jpg</code>, . . . , <code>olimpiada30.jpg</code>. . .</p>

<p>Innymi słowy, nazwa każdego zdjęcia to nazwa wydarzenia (ciąg małych liter alfabetu angielskiego) i liczba (bez zer wiodących<sup>1</sup>).</p>

<p>Bajtazar postanowił załadować swoje zdjęcia na portal społecznościowy, aby wszyscy znajomi mogli je podziwiać. Nie przewidział jednak, że zdjęcia zostaną posortowane alfabetycznie &ndash; na przykład plik <code>zdj10</code> będzie w powstałym albumie wcześniej niż <code>zdj2</code>, a plik <code>ferie351</code> przed plikiem <code>ferie37</code>. Oczywiście zaburzy to kolejność wydarzeń uwiecznionych na zdjęciach i wyrządzi Bajtazarowi nieodwracalne szkody wizerunkowe.</p>

<p>Czekając, aż zdjęcia się załadują i zostaną opublikowane, pom&oacute;ż Bajtazarowi oszacować straty &ndash; dla r&oacute;żnych wartości K odpowiedz na pytanie, jaka jest K-ta alfabetycznie nazwa spośr&oacute;d podanych plik&oacute;w?</p>

<hr />
<p><sup>1</sup>Zera wiodące to niepotrzebne zera z lewej strony liczby, np. 0023, czy 042.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 200 000) określająca liczbę wydarzeń. W kolejnych N wierszach znajduje się niepusty ciąg małych liter alfabetu angielskiego (nazwa wydarzenia), pojedynczy odstęp i liczba naturalna P<sub>i</sub> (1 &le; P<sub>i</sub> &lt; 10<sup>18</sup>) określająca liczbę zdjęć w tym wydarzeniu (o numerach od 1 do P<sub>i</sub> włącznie). Zakładamy, że nazwy plik&oacute;w składają się z nazwy wydarzenia i numeru (np. <code>olimpiada28</code>), rozszerzenie pliku (<code>.jpg</code>) pomijamy.</p>

<p>W kolejnym wierszu znajduje się jedna liczba naturalna Q (1 &le; Q &le; 800 000) określająca liczbę zapytań. W kolejnych Q wierszach znajduje się po jednej liczbie naturalnej K<sub>i</sub> (1 &le; K<sub>i</sub> &lt; 10<sup>18</sup>).</p>

<p>Suma długości wszystkich nazw wydarzeń nie przekracza 2 000 000 znak&oacute;w. Nazwy wszystkich wydarzeń są parami r&oacute;żne. Łączna liczba zdjęć w kolekcji nie przekracza 10<sup>18</sup>.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać dokładnie Q wierszy odpowiedzi. W i-tym wierszu powinna się znaleźć Ki-ta leksykograficznie nazwa zdjęcia w kolekcji lub <code>NIE</code> jeśli takowe nie istnieje.</p>

<p>Gwarantowane jest, że łączna długość napis&oacute;w, kt&oacute;re trzeba będzie wypisać na wyjście, nie przekroczy 20 000 000 znak&oacute;w.</p>