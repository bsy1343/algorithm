# [Platinum II] Joking? - 26872

[문제 링크](https://www.acmicpc.net/problem/26872)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

애드 혹, 해 구성하기, 런타임 전의 전처리, 휴리스틱

### 문제 설명

<p>Julia wants to create a new board game for $n$ players. As part of the game, players decide the order of their turns. The game should be fair: every possible permutation of players should be chosen with the same probability.</p>

<p>To help players determine this permutation, Julia wants to create $n$ different $k$-sided dice. Each player will throw their own dice and look at the number. The player with the smallest number will go first, the player with the second smallest number will go second, and so on. To make sure no ties could happen, all numbers used on all dice should be distinct.</p>

<p>That could be a good math problem, but this is a programming contest, so we allow some imprecision. We ask you to create the dice for this game, but the probabilities of obtaining the permutations may differ slightly. Your solution will be accepted if the relative difference of probabilities of any two permutations is no more than 0.2\%.</p>

<p>Formally, there are $k^n$ different outcomes of throwing all $n$ dice. For each permutation $P$, we can compute the number of scenarios $f(P)$ that lead to this permutation. For any two permutations $P$ and $Q$, the following should be true: $\frac{|f(P) - f(Q)|}{max(f(P), f(Q))} \le 0.002$.</p>

<p>You may choose any $k$, but it may not exceed $120$.</p>

### 입력

<p>The only line contains a single integer $n$ --- the number of players ($2 \le n \le 5$).</p>

### 출력

<p>In the first line, print a single integer $k$ --- the number of sides on each dice ($1 \le k \le 120$).</p>

<p>Each of the next $n$ lines should describe one dice. For each dice, print $k$ integers from $1$ to $k \cdot n$. All integers used on all dice should be distinct.</p>

### 힌트

<p>In the first example test, both permutations of players have the probability of $\frac{1}{2}$.</p>

<p>In the second example test, there are $16^3=4096$ possible scenarios. Permutations $[2, 1, 3]$ and $[3, 1, 2]$ arise in $682$ scenarios each, while every other permutation arises in $683$ scenarios. Thus, the relative difference between the most and the least probable permutations is $\frac{683-682}{683} \approx 0.146\%$.</p>