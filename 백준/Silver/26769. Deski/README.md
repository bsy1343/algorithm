# [Silver V] Deski - 26769

[문제 링크](https://www.acmicpc.net/problem/26769)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 101, 정답: 69, 맞힌 사람: 53, 정답 비율: 73.611%

### 분류

정렬

### 문제 설명

<p>Bajtek chce zbudować wielką, kwadratową piaskownicę. Do budowy piaskownicy są mu potrzebne zaledwie cztery deski, kt&oacute;re muszą być r&oacute;wnej długości. Niestety, podczas kupowania desek w tartaku Bajtek zupełnie zapomniał o tym fakcie i kupił N desek o niekoniecznie r&oacute;wnych długościach. Bajtek może (ale nie musi) najpierw skr&oacute;cić posiadane deski, a następnie wybrać cztery kawałki r&oacute;wnej długości i zbudować z nich piaskownicę. Zauważ, że deska może jedynie być skracana, a nie dzielona, czyli nie można na przykład z jednej deski o długości 4 otrzymać dw&oacute;ch desek o długości 2. Bajtek nie lubi ułamk&oacute;w, dlatego wszystkie długości desek są całkowite oraz wszystkie długości skr&oacute;conych kawałk&oacute;w r&oacute;wnież muszą być całkowite.</p>

<p>Napisz program, kt&oacute;ry: wczyta długości desek posiadanych przez Bajtka, wyznaczy pole największej piaskownicy, kt&oacute;rą może zbudować i wypisze wynik na standardowe wyjście.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba naturalna N (1 &le; N &le; 1 000 000), określająca liczbę desek posiadanych przez Bajtka. W drugim (ostatnim) wierszu wejścia znajduje się ciąg N liczb naturalnych L<sub>1</sub>, L<sub>2</sub>,. . . , L<sub>N</sub> (1 &le; L<sub>i</sub> &le; 10<sup>9</sup>), pooddzielanych pojedynczymi odstępami. Są to długości desek posiadanych przez Bajtka.</p>

### 출력

<p>W pierwszym (jedynym) wierszu wyjścia powinna się znaleźć jedna liczba całkowita &ndash; pole powierzchni największej możliwej do uzyskania kwadratowej piaskownicy zgodnie z warunkami powyżej. Jeśli zbudowanie takiej piaskownicy nie jest możliwe, należy wypisać 0.</p>