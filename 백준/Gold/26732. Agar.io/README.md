# [Gold V] Agar.io - 26732

[문제 링크](https://www.acmicpc.net/problem/26732)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 1024 MB

### 통계

제출: 74, 정답: 43, 맞힌 사람: 31, 정답 비율: 51.667%

### 분류

구현, 자료 구조, 그리디 알고리즘, 정렬, 시뮬레이션, 우선순위 큐

### 문제 설명

<p>Gra agar.io (swego czasu dość popularna w sieci) jest rozgrywana w przeglądarce internetowej. Każdy z obecnych na serwerze graczy steruje pojedynczą kom&oacute;rką o pewnej masie. Kiedy spotyka kom&oacute;rkę o masie mniejszej niż swoja, wchłania ją, powiększając swoją masę o masę drugiej kom&oacute;rki. Kiedy jednak spotka kom&oacute;rkę o masie większej lub r&oacute;wnej swojej, natychmiast przegrywa.</p>

<p>Bajtek połączył się właśnie z serwerem gry i jego kom&oacute;rka ma niezbyt imponującą masę 2. Bardzo chciałby jednak wygrać, czyli zostać najwiekszą kom&oacute;rką na tym serwerze. Dzięki niebywałym umiejętnościom hakerskim udało mu się zablokować możliwość poruszania się innych graczy &ndash; czyli jest w stanie swobodnie wybierać kolejne ofiary do wchłonięcia, a inni gracze nie mogą uniknąć spotkania.</p>

<p>Ta miła sytuacja nie potrwa jednak długo i administratorzy serwera niebawem cofną blokady Bajtka. Bajtek jest w stanie wchłonąć swoją kom&oacute;rką inną kom&oacute;rkę w czasie jednej sekundy. Ile sekund będzie potrzebował, aby stać się największą kom&oacute;rką na serwerze? Bajtek zadowoli się ewentualnym remisem z innymi największymi kom&oacute;rkami. Napisz program, kt&oacute;ry na podstawie masy kom&oacute;rek kontrolowanych przez przeciwnik&oacute;w Bajtka na serwerze gry, wyznaczy minimalny czas potrzebny Bajtkowi aby stać się największą kom&oacute;rką w grze. Przypominamy, że kom&oacute;rka Bajtka zaczyna z masą r&oacute;wną 2.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 200 000) określająca liczbę kom&oacute;rek przeciwnik&oacute;w Bajtka. W drugim (ostatnim) wierszu wejścia znajduje się ciąg N liczb naturalnych T<sub>i</sub> (1 &le; T<sub>i</sub> &le; 10<sup>18</sup>) pooddzielanych pojedynczymi odstępami. Są to masy kom&oacute;rek kolejnych przeciwnik&oacute;w Bajtka.</p>

### 출력

<p>W pierwszym (jedynym) wierszu wyjścia powinna się znaleźć jedna nieujemna liczba całkowita &ndash; minimalny czas w sekundach potrzebny aby kom&oacute;rka Bajtka stała się największa na serwerze (przy założeniu, że pozostałe kom&oacute;rki nie będą zjadać innych).</p>

<p>Jeżeli osiągnięcie tego celu jest niemożliwe, należy zamiast tego wypisać tylko jedno słowo <code>NIE</code>.</p>