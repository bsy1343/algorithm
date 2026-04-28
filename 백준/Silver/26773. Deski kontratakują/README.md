# [Silver II] Deski kontratakują - 26773

[문제 링크](https://www.acmicpc.net/problem/26773)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 50, 정답: 38, 맞힌 사람: 30, 정답 비율: 76.923%

### 분류

이분 탐색, 매개 변수 탐색

### 문제 설명

<p>Uwaga. To zadanie r&oacute;żni się (nieznacznie) od zadania z tury otwartej: w tym zadaniu deski można dzielić, a nie tylko skracać.</p>

<p>Bajtek chce zbudować wielką, kwadratową piaskownicę. Do budowy piaskownicy są mu potrzebne zaledwie cztery deski, kt&oacute;re muszą być r&oacute;wnej długości. Niestety, podczas kupowania desek w tartaku Bajtek zupełnie zapomniał o tym fakcie i kupił N przypadkowych, niekoniecznie takich samych desek. Na szczęście Bajtek może &ndash; jeśli potrzebuje &ndash; podzielić część posiadanych desek na mniejsze kawałki, a następnie wybrać do budowy cztery kawałki r&oacute;wnej długości. Na przykład, gdyby Bajtek miał deski o długościach 5, 2, 2, 2 i 1, może deskę o długości 5 podzielić na mniejsze, o długościach 2,3 (ale też np. 1,2,2), w wyniku czego będzie już m&oacute;gł wybrać cztery deski o długości 2. Bajtek nie lubi ułamk&oacute;w, dlatego wszystkie długości desek są całkowite oraz wszystkie długości kawałk&oacute;w po podzieleniu r&oacute;wnież muszą być całkowite. Z drugiej strony chciałby jednak, żeby jego piaskownica była jak największa.</p>

<p>Napisz program, kt&oacute;ry wczyta długości desek posiadanych przez Bajtka, wyznaczy pole największej piaskownicy, kt&oacute;rą może zbudować i wypisze wynik na standardowe wyjście.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 1 000 000), określająca liczbę desek posiadanych przez Bajtka. W drugim (ostatnim) wierszu wejścia znajduje się ciąg N liczb naturalnych L<sub>1</sub>, L<sub>2</sub>,. . . , L<sub>N</sub> (1 &le; L<sub>i</sub> &le; 10<sup>9</sup>), pooddzielanych pojedynczymi odstępami. Są to długości desek posiadanych przez Bajtka.</p>

### 출력

<p>W pierwszym (jedynym) wierszu wyjścia powinna się znaleźć jedna liczba całkowita &ndash; pole powierzchni największej możliwej do uzyskania kwadratowej piaskownicy zgodnie z warunkami powyżej. Jeśli zbudowanie takiej piaskownicy nie jest możliwe, należy wypisać 0.</p>