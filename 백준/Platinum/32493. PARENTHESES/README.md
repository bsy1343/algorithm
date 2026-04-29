# [Platinum IV] PARENTHESES - 32493

[문제 링크](https://www.acmicpc.net/problem/32493)

### 성능 요약

시간 제한: 0.3 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 9, 맞힌 사람: 9, 정답 비율: 75.000%

### 분류

누적 합, 세그먼트 트리, 자료 구조

### 문제 설명

<p style="text-align: center;"><em>Who doesn't love parentheses?</em></p>

<p>Sashka stumbled upon a bracket sequence $S=s_1 s_2 \dots s_{2N}$ of $2N$ parentheses, from which $N$ are opening parentheses and $N$ are closing parentheses. She defines the bracket sequence's clumsiness as the minimum number of required swaps of elements to turn it into a regular parentheses sequence. The regular parentheses sequences follow these rules:</p>

<ul>
	<li>The empty sequence is a regular parentheses sequence.</li>
	<li>$S$ is a regular non-empty parentheses sequence iff two regular sequences $A$ and $B$ exist such that $S=<code>(</code>+A+<code>)</code>+B$, where $+$ denotes the operation concatenation of two sequences.</li>
</ul>

<p>Sashka wants to know the clumsiness for $Q$ such sequences $T_1, T_2, \dots,T_Q$, where the $i$-th of them $T_i=s_{L_i} s_{L_i+1} \dots s_{R_i}$ consists of all the elements in $S$ from position $L_i$ to $R_i$ inclusive. <strong>It is guaranteed that every sequence $T_i$ consists of equal number of opening and closing parentheses.</strong> Write a program <strong><code>parentheses</code></strong>, which answers the $Q$ questions.</p>

### 입력

<p>The first line of the standard input contains the three integers $N$, $Q$ and $G$, which describe the number of opening parentheses in the sequence, the number of questions and the number of the subtask that the test is from. The second line contains $2N$ parentheses, $s_1 s_2 \dots s_{2N}$ respectively. The last $Q$ lines of the standard input contain the integers $L_i$ and $R_i$, which describe the positions for the $i$-th question.</p>

### 출력

<p>On the standard output print one number on each line, the $i$-th number being the minimum number of required swaps to turn $T_i$ into a regular parentheses sequence.</p>

### 제한

<ul>
	<li>$1 \leq N, Q \leq 2 \times 10^5$</li>
	<li>$1 \leq L_i &lt; R_i \leq 2 \times N$</li>
	<li>All questions are different from one another.</li>
</ul>