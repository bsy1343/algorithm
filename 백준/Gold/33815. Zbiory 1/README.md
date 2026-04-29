# [Gold I] Zbiory 1 - 33815

[문제 링크](https://www.acmicpc.net/problem/33815)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 17, 정답: 6, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

비트 집합

### 문제 설명

<p>W tym zadaniu będziemy rozpatrywać ciąg $n + m$ podzbiorów zbioru $\{1, \dots , n\}$. Zbiory $A_1, \dots , A_n$ są zdefiniowane następująco: wartość $1 ≤ i ≤ n$ należy do zbioru $A_j$ wtedy i tylko wtedy, gdy $i$ jest podzielne przez $j$.</p>

<p>Przykładowo dla $n = 7$ kolejne zbiory są następujące:</p>

<ul>
	<li>$A_1 = \{1, 2, 3, 4, 5, 6, 7\}$</li>
	<li>$A_2 = \{2, 4, 6\}$</li>
	<li>$A_3 = \{3, 6\}$</li>
	<li>$A_4 = \{4\}$</li>
	<li>$A_5 = \{5\}$</li>
	<li>$A_6 = \{6\}$</li>
	<li>$A_7 = \{7\}$</li>
</ul>

<p>Kolejnych $m$ zbiorów – $A_{n+1}, A_{n+2}, \dots , A_{n+m}$ – powstaje przez operacje sum, przecięć lub negacji na poprzednich zbiorach.</p>

<ul>
	<li>Operacja sumy zbiorów $A_i$ oraz $A_j$ (oznaczana przez $A_i ∪ A_j$) tworzy zbiór zawierający wszystkie liczby należące do któregokolwiek z $A_i$ lub $A_j$.</li>
	<li>Operacja przecięcia zbiorów $A_i$ oraz $A_j$ (oznaczana przez $A_i ∩ A_j$) tworzy zbiór zawierający wszystkie liczby należące do obu $A_i$ oraz $A_j$.</li>
	<li>Operacja negacji zbioru $A_i$ (oznaczana przez $A'_i$) tworzy zbiór zawierający wszystkie liczby całkowite $1 ≤ j ≤ n$, które nie należą do $A_i$.</li>
</ul>

<p>Przykładowy ciąg operacji może wyglądać następująco:</p>

<ul>
	<li>$A_8 = A_5 ∪ A_7 = \{5, 7\}$</li>
	<li>$A_9 = A_2 ∩ A_3 = \{6\}$</li>
	<li>$A_{10} = A'_8 = \{1, 2, 3, 4, 6\}$</li>
	<li>$A_{11} = A_{10} ∩ A_8 = \{\};$</li>
	<li>$A_{12} = A'_3 = \{1, 2, 4, 5, 7\}$</li>
	<li>$A_{13} = A_{12} ∪ A_{12} = \{1, 2, 4, 5, 7\}$</li>
	<li>$A_{14} = A_{10} ∩ A_{13} = \{1, 2, 4\}$</li>
	<li>$A_{15} = A_9 ∪ A_{14} = \{1, 2, 4, 6\}$</li>
</ul>

<p>Mając dane $n$, $m$ oraz listę operacji tworzących zbiory, odpowiedz na $q$ zapytań postaci: czy dana liczba $v$ należy do danego zbioru $A_x$.</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się trzy liczby całkowite $n$, $m$, $q$ ($1 ≤ n ≤ 50\, 000$, $1 ≤ m ≤ 400\, 000$, $1 ≤ q ≤ 1\, 000\, 000$), oznaczające odpowiednio liczbę początkowych zbiorów, liczbę operacji oraz liczbę zapytań.</p>

<p>Kolejne $m$ wierszy zawierają opisy operacji. Wiersz numer $i$ opisujący w jaki sposób powstał zbiór $A_{n+i}$, jest w jednej z trzech postaci:</p>

<ul>
	<li><code>1</code> $x$ $y$ – oznaczającej operację sumy $A_{n+i} = A_x ∪ A_y$,</li>
	<li><code>2</code> $x$ $y$ – oznaczającej operację przecięcia $A_{n+i} = A_x ∩ A_y$,</li>
	<li><code>3</code> $x$ – oznaczającej operację negacji $A_{n+i} = A'_x$.</li>
</ul>

<p>W każdej z tych postaci wartości $x$, $y$ spełniają warunek $1 ≤ x, y &lt; n + i$, tzn. każda operacja odwołuje się tylko do poprzednich zbiorów.</p>

<p>Kolejne $q$ wierszy zawiera zapytania. Każdy z nich zawiera dwie liczby całkowite $x$ oraz $v$ ($1 ≤ x ≤ n + m$, $1 ≤ v ≤ n$), które oznaczają pytanie o to, czy $v ∈ A_x$.</p>

### 출력

<p>Na wyjście należy wypisać $q$ wierszy zawierających odpowiedzi na kolejne zapytania. Każdy z wierszy ma zawierać jedno ze słów <code>TAK</code> lub <code>NIE</code>. Słowo <code>TAK</code> oznacza, że $v ∈ A_x$ dla odpowiednich $x$, $v$, zaś słowo <code>NIE</code> oznacza, że $v \not\in A_x$.</p>

### 힌트

<p>Wyjaśnienie przykładu: Test przykładowy odpowiada przykładowym operacjom opisanym w treści zadania.</p>