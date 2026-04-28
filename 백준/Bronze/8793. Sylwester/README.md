# [Bronze I] Sylwester - 8793

[문제 링크](https://www.acmicpc.net/problem/8793)

### 성능 요약

시간 제한: 25 초, 메모리 제한: 128 MB

### 통계

제출: 125, 정답: 64, 맞힌 사람: 58, 정답 비율: 53.704%

### 분류

수학, 애드 혹, 사칙연산

### 문제 설명

<p>Jarek był w tym roku gospodarzem zabawy sylwestrowej. W czasie wieczoru pr&oacute;bował prowadzić ewidencję wchodzących i wychodzących os&oacute;b, ale obawia się, że nie zauważył kilku wejść i wyjść.</p>

<p>Lista Jarka ma&nbsp;<strong>N</strong>&nbsp;wpis&oacute;w, każdy z nich jest jednej z dw&oacute;ch postaci:</p>

<ul>
	<li>&quot;1&quot; oznacza wejście jednej osoby</li>
	<li>&quot;-1&quot; oznacza wyjście jednej osoby</li>
</ul>

<p>Wiedząc, że dom Jarka zar&oacute;wno przed imprezą, jak i po niej był pusty, oblicz ile minimalnie wejść lub wyjść swoich gości przegapił Jarek.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się jedna liczba naturalna&nbsp;<strong>Z</strong>&nbsp;( 1 &lt;=&nbsp;<strong>Z</strong>&nbsp;&lt;= 10 ) oznaczająca liczbę zestaw&oacute;w testowych. Następnie opisywane są kolejne zestawy.</p>

<p>W pierwszej linii zestawu testowego znajduje się jedna liczba naturalna&nbsp;<strong>N</strong>&nbsp;( 1 &lt;=&nbsp;<strong>N</strong>&nbsp;&lt;= 10<sup>6</sup>&nbsp;) oznaczająca liczbę wpis&oacute;w na liście Jarka. W kolejnych&nbsp;<strong>N</strong>&nbsp;liniach znajdują się wpisy na liście, po jednym w linii. Wpisy mają postać i znaczenie opisane w treści zadania.</p>

### 출력

<p>Dla każdego zestawu testowego należy w osobnej linii wypisać minimalną liczbę brakujących wpis&oacute;w na liście Jarka.</p>

### 힌트

<p>W teście przykładowym znajdują się trzy zestawy testowe.</p>

<ul>
	<li>W pierwszym zestawie jedyny wpis na liście oznacza wyjście. Ponieważ dom początkowo jest pusty, a nikt nie wychodzi z pustego domu, Jarek musiał wcześniej przegapić co najmniej jedno zdarzenie - wejście jednej osoby.</li>
	<li>W drugim zestawie Jarek zanotował wejścia trzech os&oacute;b, ale najwyraźniej nie zauważył ich wyjścia.</li>
	<li>W trzecim zestawie opisana kolejność wejść i wyjść jest możliwa.</li>
</ul>