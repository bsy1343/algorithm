# [Platinum II] Wielomian - 8434

[문제 링크](https://www.acmicpc.net/problem/8434)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 4, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

수학, 다항식 보간법

### 문제 설명

<p>Dany jest wielomian&nbsp;<i>W</i>&nbsp;stopnia (co najwyżej)&nbsp;<i>n</i>, zdefiniowany poprzez jego wartości w punktach&nbsp;0,&nbsp;1,&nbsp;2, ...,&nbsp;<i>n</i>. Twoim zadaniem jest wyznaczenie wartości tego wielomianu w punkcie&nbsp;<i>n</i>&nbsp;+ 1.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta (maksymalny) stopień wielomianu&nbsp;<i>n</i>&nbsp;oraz jego wartości w punktach&nbsp;0,&nbsp;1, ...,&nbsp;<i>n</i>,</li>
	<li>obliczy wartość tego wielomianu w punkcie&nbsp;<i>n</i>&nbsp;+ 1,</li>
	<li>wypisze wynik.</li>
</ul>

### 입력

<p>W pierwszym wierszu wejścia zapisano jedną dodatnią liczbę całkowitą&nbsp;<i>n</i>&nbsp;- (maksymalny) stopień wielomianu,&nbsp;1 &le;&nbsp;<i>n</i> &le;&nbsp;10&nbsp;000. W następnych&nbsp;<i>n</i>&nbsp;+ 1&nbsp;wierszach zapisano liczby całkowite&nbsp;<i>w</i>(0),&nbsp;<i>w</i>(1),&nbsp;...,&nbsp;<i>w</i>(<i>n</i>), będące wartościami wielomianu&nbsp;<i>w</i>&nbsp;w kolejnych punktach, przy czym&nbsp;-10<sup>9</sup>&nbsp;&lt;&nbsp;<i>w</i>(<i>i</i>) &lt; 10<sup>9</sup>. Dla wszystkich danych wejściowych, poszukiwany wynik jest liczbą całkowitą.</p>

### 출력

<p>W pierwszym i jedynym wierszu wyjścia powinna się znajdować jedna liczba całkowita - wartość wielomianu w punkcie&nbsp;<i>n</i>&nbsp;+ 1.</p>