# [Gold I] Billion Players Game - 35228

[문제 링크](https://www.acmicpc.net/problem/35228)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 15, 정답: 14, 맞힌 사람: 14, 정답 비율: 93.333%

### 분류

그리디 알고리즘, 수학, 정렬

### 문제 설명

<p>You are following the world championship of the Billion Players Game. There are $10^9$ players competing, and you want to predict the final ranking $p$ of Godflex, your favorite streamer. After analyzing recent matches, you are sure that $l ≤ p ≤ r$, but you don’t know anything else.</p>

<p>There are $n$ offers made by the in-game bookmaker. In the $i$-th offer, the bookmaker suggests an estimation $a_i$ for Godflex’s final ranking. For each offer, you must choose exactly one of the following actions:</p>

<ul>
<li>Ignore the offer.</li>
<li>Accept the offer by claiming that $p ≤ a_i$. If you are right, you earn $|p − a_i |$ coins; otherwise you lose $|p − a_i |$ coins.</li>
<li>Accept the offer by claiming that $p ≥ a_i$. If you are right, you earn $|p − a_i |$ coins; otherwise you lose $|p − a_i |$ coins.</li>
</ul>

<p>After you decide how to deal with all the offers, the actual Billion Players Game is played. Godflex gets an integer position $p$ in $[l, r]$, and then all the offers are settled up.</p>

<p>Your total score is the number of coins you are guaranteed to earn, that is, the minimum number of coins you earn over all possible values of $p$ in $[l, r]$. Find the maximum possible score you can guarantee.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 ≤ t ≤ 10^4$). The description of the test cases follows.</p>

<p>The first line of each test case contains three integers $n$, $l$, $r$ ($1 ≤ n ≤ 2 \cdot 10^5$, $1 ≤ l ≤ r ≤ 10^9$) — the number of offers and the possible range of Godflex’s final ranking.</p>

<p>The second line of each test case contains $n$ integers $a_1, a_2, \dots , a_n$ ($1 ≤ a_i ≤ 10^9$) — the bookmaker’s estimations of Godflex’s ranking in each offer.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, output a single line containing an integer: the maximum possible score you can guarantee.</p>