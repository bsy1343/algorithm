# [Silver III] Malowane liczby - 8808

[문제 링크](https://www.acmicpc.net/problem/8808)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 63, 정답: 26, 맞힌 사람: 21, 정답 비율: 36.842%

### 분류

수학, 정수론

### 문제 설명

<p>Pomalowano wszystkie liczby wymierne dodatnie dwoma kolorami - czerwonym i niebieskim - w taki spos&oacute;b, że:</p>

<ul>
	<li>liczby r&oacute;żniące się o 1 są pomalowane r&oacute;żnymi kolorami</li>
	<li>liczby do siebie odwrotne są pomalowane tym samym kolorem</li>
	<li>liczba 1 jest pomalowana kolorem czerwonym</li>
</ul>

<p>Jakimi kolorami pomalowane są poszczeg&oacute;lne liczby?</p>

### 입력

<p>W pierwszej linii znajduje się jedna liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 20 ) oznaczająca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>W pierwszej i jedynej linii zestawu znajduje się jedna liczba wymierna w postaci &quot;<strong>a</strong>&nbsp;/&nbsp;<strong>b</strong>&quot; gdzie&nbsp;<strong>a, b&nbsp;</strong>są dodatnimi liczbami całkowitymi ( 1 &lt;=&nbsp;<strong>a</strong>,&nbsp;<strong>b&nbsp;</strong>&lt;= 10<sup>9</sup>).</p>

### 출력

<p>Dla każdego zestawu testowego w osobnej linii należy wypisać kolor danej liczby - &quot;czerwony&quot; lub &quot;niebieski&quot;.</p>

### 힌트

<p>4 / 2 = 2 = 1 + 1, więc musi to być kolor przeciwny do koloru 1.</p>

<p>1 / 3 = 1 / ( 3 ) = 1 / ( 1 + 2 ), czyli musi to być kolor przeciwny do koloru 2.</p>