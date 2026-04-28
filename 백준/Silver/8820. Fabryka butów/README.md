# [Silver V] Fabryka butów - 8820

[문제 링크](https://www.acmicpc.net/problem/8820)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 143, 정답: 84, 맞힌 사람: 54, 정답 비율: 55.102%

### 분류

구현, 누적 합

### 문제 설명

<p>Pan J&oacute;zef zainwestował ostatnio w fabrykę but&oacute;w. Fabryka świetnie prosperuje choć, jak wie każdy przedsiębiorca, nigdy nie jest tak dobrze żeby nie mogło być lepiej. Pan J&oacute;zef postanowił sprawdzić jaka cena pary but&oacute;w zapewni jego fabryce największy zysk.</p>

<p>Koszt produkcji pary but&oacute;w wynosi&nbsp;<strong>K</strong>.</p>

<p>Badania rynku wskazały&nbsp;<strong>N</strong>&nbsp;elementowy ciąg liczb naturalnych&nbsp;<strong>A</strong>[].&nbsp;<strong>A</strong>[<strong>i</strong>] ( 1 &lt;=<strong>&nbsp;i</strong>&nbsp;&lt;=&nbsp;<strong>N</strong>&nbsp;) oznacza liczbę os&oacute;b, kt&oacute;ra kupi buty z fabryki pana J&oacute;zefa, jeśli będą kosztowały co najwyżej i.</p>

<p>Oblicz maksymalny zysk fabryki ( czyli r&oacute;żnicę pomiędzy wartością sprzedanych but&oacute;w a kosztem ich produkcji ).</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba zestaw&oacute;w testowych&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ).</p>

<p>Pierwsza linia pojedynczego zestawu testowego zawiera liczbę&nbsp;<strong>N</strong>&nbsp;i&nbsp;<strong>K</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>,&nbsp;<strong>K</strong>&nbsp;&lt;= 10<sup>5</sup>&nbsp;). W drugiej lini znajduje się&nbsp;<strong>N</strong>&nbsp;liczb&nbsp;<strong>A</strong>[1],<strong>A</strong>[2],...,<strong>A</strong>[<strong>N</strong>] ( 0 &lt;=&nbsp;<strong>A</strong>[<strong>i</strong>] &lt;= 10<sup>5</sup>).</p>

### 출력

<p>Dla każdego zestawu testowego należy wypisać maksymalny zysk fabryki.</p>

### 힌트

<p>Wyjaśnienie: W zestawie pierwszym gdy cena wyniesie 3 to&nbsp; buty kupi 6 os&oacute;b, czyli zysk wyniesie 6 * 3 - 6 * 1 = 12. W zestawie drugim gdy cena wyniesie 4 to buty kupi 9 os&oacute;b, czyli zysk wyniesie 9 * 4 - 9 * 1 = 27.</p>