# [Platinum II] Magic Trick - 34213

[문제 링크](https://www.acmicpc.net/problem/34213)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 48, 정답: 9, 맞힌 사람: 9, 정답 비율: 18.750%

### 분류

가장 긴 증가하는 부분 수열 문제, 애드 혹

### 문제 설명

<p>Alicia and Beatriz are preparing a magic trick for the IOI Talent Show. The trick works as follows:</p>

<ul>
	<li>A volunteer selects a permutation $P$ of length $N$ and places $N$ cards on the table. The cards are numbered from $0$ to $N − 1$, with card $i$ displaying the value $P[i]$.</li>
	<li>Alicia enters the room, observes the cards, and selects $K$ of them to flip face down, hiding their values.</li>
	<li>Beatriz then enters the room, sees the current arrangement of the cards (including which ones are face down), and magically determines the values of all $K$ hidden cards!</li>
</ul>

<p>Your task is to devise and implement a strategy for Alicia and Beatriz. The more impressive the trick, the better your score: the objective is to maximize $K$, the number of hidden cards Beatriz can correctly reveal.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$N = 256$</li>
	<li>$1 ≤ P[i] ≤ N$ for each $i$ such that $0 ≤ i &lt; N$.</li>
	<li>All values in $P$ are distinct.</li>
</ul>