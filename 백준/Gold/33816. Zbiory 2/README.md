# [Gold IV] Zbiory 2 - 33816

[문제 링크](https://www.acmicpc.net/problem/33816)

### 성능 요약

시간 제한: 6 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

해 구성하기

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

<p>Mając daną liczbę $n$ oraz docelowy zbiór $B$, Twoim zadaniem jest dobrać liczbę $m$ ($0 ≤ m ≤ 100\, 000$) oraz ciąg $m$ operacji, aby otrzymać zbiór $A_{n+m}$ równy zbiorowi $B$. Da się udowodnić, że dla limitów z treści zadania da się skonstruować dowolny podzbiór $\{1, \dots , n\}$, mieszcząc się w limicie operacji.</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite $n$, $s$ ($1 ≤ n ≤ 50\, 000$, $1 ≤ s ≤ n$), oznaczające odpowiednio liczbę początkowych zbiorów oraz rozmiar zbioru docelowego $B$. W drugim wierszu następuje ciąg $s$ liczb całkowitych $b_1, b_2, \dots , b_s$ ($1 ≤ b_1 &lt; b_2 &lt; \dots &lt; b_s ≤ n$), zawierający elementy zbioru $B$.</p>

### 출력

<p>W pierwszym wierszu wyjścia należy wypisać liczbę całkowitą $m$ ($0 ≤ m ≤ 100\, 000$). W kolejnych $m$ wierszach powinny znajdować się opisy kolejnych operacji. Wiersz numer i, opisujący w jaki sposób powstał zbiór $A_{n+i}$, powinien być jednej z trzech postaci:</p>

<ul>
	<li><code>1</code> $x$ $y$ – oznaczającej operację sumy $A_{n+i} = A_x ∪ A_y$,</li>
	<li><code>2</code> $x$ $y$ – oznaczającej operację przecięcia $A_{n+i} = A_x ∩ A_y$,</li>
	<li><code>3</code> $x$ – oznaczającej operację negacji $A_{n+i} = A'_x$.</li>
</ul>

<p>Ponadto, musi być spełnione $A_{n+m} = B$.</p>

### 힌트

<p>Wyjaśnienie przykładów: Pierwszy test przykładowy odpowiada przykładowym operacjom opisanym w treści zadania. W drugim przypadku nie trzeba robić żadnej operacji, gdyż $A_n = B$.</p>