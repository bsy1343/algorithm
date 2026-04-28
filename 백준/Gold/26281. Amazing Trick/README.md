# [Gold I] Amazing Trick - 26281

[문제 링크](https://www.acmicpc.net/problem/26281)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 101, 정답: 25, 맞힌 사람: 20, 정답 비율: 26.667%

### 분류

해 구성하기, 무작위화

### 문제 설명

<p>Alice is a magician and she creates a new trick. She has $n$ cards with different numbers from $1$ to $n$ written on them. First, she asks an audience member to shuffle the deck and put cards in a row. Let&#39;s say the $i$-th card from the left has the number $a_i$ on it.</p>

<p>Then Alice picks two permutations $p$ and $q$. There is a restriction on $p$ and $q$ --- <strong>permutations can&#39;t have fixed points</strong>. Which means $\forall i: p_i \ne i\ \text{and}\ q_i \ne i$.</p>

<p>After permutations are chosen, Alice shuffles the cards according to them. Now the $i$-th card from the left is the card $a[p[q[i]]$. The trick is considered successful if $i$-th card from the left has the number $i$ on it after the shuffles.</p>

<p>Help Alice pick the permutations $p$ and $q$ or say it is not possible for the specific starting permutation $a$.</p>

### 입력

<p>The first line of the input contains the number of tests $t$ ($1 \leq t \leq 10^5$).</p>

<p>Each test is described in two lines. The first line contains one integer $n$ --- the number of cards ($1 \leq n \leq 10^5$). The second line contains $n$ integers $a_i$ --- the initial permutation of the cards ($1 \leq a_i \leq n$; $\forall i \neq j: a_i \neq a_j$).</p>

<p>It is guaranteed that the sum of $n$ over all tests does not exceed $10^5$.</p>

### 출력

<p>Print the answer for each test case in the same order the cases appear in the input.</p>

<p>For each test case, print &quot;<code>Impossible</code>&quot; in a single line, if no solution exists.</p>

<p>Otherwise, print &quot;<code>Possible</code>&quot; in the first line, and in the following two lines print permutations $p$ and $q$.</p>