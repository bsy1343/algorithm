# [Bronze I] Konduktor - 8805

[문제 링크](https://www.acmicpc.net/problem/8805)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 193, 정답: 83, 맞힌 사람: 61, 정답 비율: 38.608%

### 분류

수학, 구현

### 문제 설명

<p>Konduktor Konrad zajmuje się sprawdzaniem bilet&oacute;w w pociągach jednej z dw&oacute;ch dużych sp&oacute;łek kolejowych.</p>

<p>W jego pociągu znajduje się&nbsp;<strong>N</strong>&nbsp;przedział&oacute;w ponumerowanych od 1 do&nbsp;<strong>N</strong>. Konrad odwiedza je, zaczynając od przedziału z numerem 1, w następującej kolejności: 1, 2, ... ,&nbsp;<strong>N</strong>-1,&nbsp;<strong>N</strong>,&nbsp;<strong>N</strong>-1, ... , 2, 1, 2, itd.&nbsp;</p>

<p>Znając&nbsp;<strong>N</strong>&nbsp;- liczbę przedział&oacute;w w pociągu oraz&nbsp;<strong>K</strong>&nbsp;- liczbę odwiedzonych przedział&oacute;w, oblicz ile razy Konrad odwiedził każdy z przedział&oacute;w.</p>

### 입력

<p>W pierwszej linii znajduje się jedna liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) oznaczająca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>W pierwszej i jedynej linii zestawu znajduje się para liczb naturalnych&nbsp;<strong>N</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 10<sup>6</sup>&nbsp;)&nbsp;i&nbsp;<strong>K</strong>&nbsp;( 1 &lt;=&nbsp;<strong>K</strong>&nbsp;&lt;= 10<sup>9</sup>&nbsp;).</p>

### 출력

<p>Dla każdego zestawu testowego w osobnej linii należy wypisać oddzielone spacjami&nbsp;<strong>N</strong>&nbsp;liczb&nbsp;<strong>A</strong><sub><strong>i</strong></sub>, gdzie&nbsp;<strong>A</strong><sub><strong>i</strong></sub>&nbsp;oznacza liczbę kontroli bilet&oacute;w w&nbsp;<strong>i</strong>-tym przedziale.&nbsp;</p>