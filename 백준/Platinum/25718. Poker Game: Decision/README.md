# [Platinum II] Poker Game: Decision - 25718

[문제 링크](https://www.acmicpc.net/problem/25718)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 83, 정답: 11, 맞힌 사람: 8, 정답 비율: 10.526%

### 분류

백트래킹, 많은 조건 분기, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 구현, 시뮬레이션

### 문제 설명

<p>Alice and Bob invent a new game based on Texas hold&#39;em. <strong>Please read the following rules carefully as they are different from the usual rules. The background of this problem is exactly the same as problem E.</strong></p>

<p>There are $13$ ranks, which are <code>A</code>, <code>K</code>, <code>Q</code>, <code>J</code>, <code>T</code>, <code>9</code>, <code>8</code>, <code>7</code>, <code>6</code>, <code>5</code>, <code>4</code>, <code>3</code>, and <code>2</code> from high to low. There are $4$ suits, which are <code>S</code>, <code>H</code>, <code>C</code>, and <code>D</code>. Every combination of a rank and a suit occurs exactly once, so there are $52$($=13\times 4$) cards.</p>

<p>A hand is a set of five cards. Each hand has a rank. There are $10$ types of hands. Each type also has a rank. If two hands are of different types, the hand of the type with a higher rank always ranks higher. A hand can be represented as a sequence $(r_1,r_2,r_3,r_4,r_5)$, where $r_i$ is the rank of the $i$-th card and the order of the five cards depends on the type of the hand. If two hands are of the same type, the hand represented as the lexicographically larger sequence ranks higher: formally, if we find the smallest index $i$ such that $r_i$ of two hands are different, the hand with higher $r_i$ ranks higher. If the types and the sequences $r$ of two hands are equal, two hands have the same rank.</p>

<p>The $10$ types are given below, from lowest to highest rank. If a hand matches the patterns of multiple types, it belongs to the one with the highest rank.</p>

<ul>
	<li><strong>Highcard</strong>: Any five cards. The sequence $r$ satisfies $r_1&gt;r_2&gt;r_3&gt;r_4&gt;r_5$.</li>
	<li><strong>Pair</strong>: Two cards with the same rank. The sequence $r$ satisfies $r_1=r_2$, $r_3&gt;r_4&gt;r_5$.</li>
	<li><strong>Two pairs</strong>: Two cards with the same rank and another two cards with the same rank. The sequence $r$ satisfies $r_1=r_2&gt;r_3=r_4$.</li>
	<li><strong>Three of a kind</strong>: Three cards with the same rank. The sequence $r$ satisfies $r_1=r_2=r_3$, $r_4&gt;r_5$.</li>
	<li><strong>Straight</strong>: Five cards with five consecutive ranks. The sequence $r$ satisfies $r_1&gt;r_2&gt;r_3&gt;r_4&gt;r_5$. Additionally, <code>A 2 3 4 5</code> is a straight, and <code>A</code> is regarded as a rank lower than <code>2</code> in this case. Hence <code>A 2 3 4 5</code> is the straight with the lowest ranks.</li>
	<li><strong>Flush</strong>: Five cards with the same suit. The sequence $r$ satisfies $r_1&gt;r_2&gt;r_3&gt;r_4&gt;r_5$.</li>
	<li><strong>Full house</strong>: Three cards with the same rank and another two cards with the same rank. The sequence $r$ satisfies $r_1=r_2=r_3$, $r_4=r_5$.</li>
	<li><strong>Four of a kind</strong>: Four cards with the same rank. The sequence $r$ satisfies $r_1=r_2=r_3=r_4$.</li>
	<li><strong>Straight flush</strong>: A straight with the same suit. The sequence $r$ satisfies $r_1&gt;r_2&gt;r_3&gt;r_4&gt;r_5$. Additionally, <code>A 2 3 4 5</code> with the same suit is a straight flush, and <code>A</code> is regarded as a rank lower than <code>2</code> in this case. Hence <code>A 2 3 4 5</code> with the same suit is the straight flush with the lowest ranks.</li>
	<li><strong>Royal flush</strong>: Straight flush with the ranks <code>T</code>, <code>J</code>, <code>Q</code>, <code>K</code>, and <code>A</code>. Four different royal flushes are of the same rank.</li>
</ul>

<p>Two cards are dealt to each of Alice and Bob. Instead of the regular rules, $6$ community cards are dealt. Two players take community cards one by one, in turn, until each player has five cards, completing a hand. <strong>Alice takes first.</strong> The player who has a hand with higher rank wins. If two hands have same rank, there is a draw. <strong>Note that all ten cards are shown to both, and they always choose the optimal strategy.</strong></p>

<p><strong>The above are the same in problem E. The task is the following.</strong></p>

<p>Given the cards of Alice, the cards of Bob and the $6$ community cards, find the winner.</p>

### 입력

<p>There are multiple test cases. The first line of input contains an integer $T$ ($1\le T\le 10^5$), the number of test cases. For each test case:</p>

<p>The first line contains two strings $a_1$ and $a_2$: Alice&#39;s initial cards.</p>

<p>The second line contains two strings $b_1$ and $b_2$: Bob&#39;s initial cards.</p>

<p>The third line contains six strings $c_1$, $c_2$, $c_3$, $c_4$, $c_5$, and $c_6$: the community cards.</p>

<p>Each string is of length two. The first character is one of &quot;<code>A</code>&quot;, &quot;<code>K</code>&quot;, &quot;<code>Q</code>&quot;, &quot;<code>J</code>&quot;, &quot;<code>T</code>&quot;, &quot;<code>9</code>&quot;, &quot;<code>8</code>&quot;, &quot;<code>7</code>&quot;, &quot;<code>6</code>&quot;, &quot;<code>5</code>&quot;, &quot;<code>4</code>&quot;, &quot;<code>3</code>&quot;, &quot;<code>2</code>&quot;, which represents the rank of a card. The second character is one of &quot;<code>S</code>&quot;, &quot;<code>H</code>&quot;, &quot;<code>C</code>&quot;, &quot;<code>D</code>&quot;, which represents the suit of a card.</p>

<p>It is guaranteed that all $10$ given cards are pairwise distinct.</p>

### 출력

<p>For each test case:</p>

<p>Output the word &quot;<code>Alice</code>&quot; if Alice wins, &quot;<code>Bob</code>&quot; if Bob wins, or &quot;<code>Draw</code>&quot; if there is a draw.</p>