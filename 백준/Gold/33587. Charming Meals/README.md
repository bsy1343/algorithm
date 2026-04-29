# [Gold III] Charming Meals - 33587

[문제 링크](https://www.acmicpc.net/problem/33587)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 21, 정답: 18, 맞힌 사람: 18, 정답 비율: 90.000%

### 분류

그리디 알고리즘, 브루트포스 알고리즘, 정렬

### 문제 설명

<p>The Czech cuisine features $n$ appetizers and $n$ main dishes. The $i$-th appetizer has spiciness $a_i$, and the $i$-th main dish has spiciness $b_i$.</p>

<p>A typical Czech meal consists of exactly one appetizer and one main dish. You want to pair up the $n$ appetizers and $n$ main dishes into $n$ meals with each appetizer and each main dish being included in exactly one meal.</p>

<p>Your meals shall surprise the diners, so you want the spiciness levels of the two parts of the same meal to be as different as possible. The charm of a meal is the difference (in absolute value) between the spiciness of the appetizer and the spiciness of the main dish. So, a meal consisting of an appetizer with spiciness $x$ and a main dish with spiciness $y$ has charm equal to $|x - y|$.</p>

<p>You want to maximize the minimum charm of the resulting $n$ meals. What is the largest possible value of the minimum charm that you can achieve?</p>

### 입력

<p>Each test contains multiple test cases. The first line contains an integer $t$ ($1 ≤ t ≤ 1\, 000$) — the number of test cases. The descriptions of the $t$ test cases follow.</p>

<p>The first line of each test case contains a single integer $n$ ($1 ≤ n ≤ 5\, 000$) —the number of appetizers and main dishes.</p>

<p>The second line of each test case contains $n$ integers $a_1, a_2, \dots , a_n$ ($0 ≤ a_i ≤ 10^9$) — the spicinesses of the $n$ appetizers.</p>

<p>The third line of each test case contains $n$ integers $b_1, b_2, \dots , b_n$ ($0 ≤ b_i ≤ 10^9$) — the spicinesses of the $n$ main dishes.</p>

<p>It is guaranteed that the sum of $n^2$ over all test cases does not exceed $25 \cdot 10^6$.</p>

### 출력

<p>For each test case, print the largest possible value of the minimum charm you can achieve.</p>