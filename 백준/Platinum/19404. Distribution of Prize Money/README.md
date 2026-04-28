# [Platinum I] Distribution of Prize Money - 19404

[문제 링크](https://www.acmicpc.net/problem/19404)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 8, 맞힌 사람: 8, 정답 비율: 36.364%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 배낭 문제

### 문제 설명

<p>The most famous Zurumbian programming contest, Zurumbia Open, has been recently held online. The total prize fund of the contest is $x$ Zurumbian roubles!</p>

<p>There were $n$ contestants taking part, and each of them was ranked from 1-st to $n$-th. No two contestants had the same rank.</p>

<p>Unfortunately, the distribution of prize money among the contestants is not known yet. It&#39;s only known that every contestant will receive a non-negative integer amount of Zurumbian roubles, and no contestant will receive less money than another contestant with greater rank.</p>

<p>Some of the contestants are your friends. You&#39;ve decided to find the least possible part of the prize fund which will be definitely received by them in total, among all valid distributions of prize money. Also, you are interested in the <em>worst</em> distribution --- that is, the one that leads to the least possible amount of money received by your friends. Write a program to help yourself.</p>

### 입력

<p>The first line of the input contains a single integer $x$ ($1 \le x \le 10^9$) --- the total prize fund, in Zurumbian roubles. The second line contains a string of length $n$ ($1 \le n \le 400$) consisting of uppercase English letters &quot;<code>Y</code>&quot; and &quot;<code>N</code>&quot; only. The $i$-th (1-based) character of the string equals to &quot;<code>Y</code>&quot; if the contestant ranked $i$-th is your friend, and &quot;<code>N</code>&quot; otherwise.</p>

### 출력

<p>Output two lines.</p>

<p>The first line must contain the least possible amount of money, in Zurumbian roubles, which will be definitely received by your friends in total.</p>

<p>The second line must contain a non-increasing sequence of $n$ non-negative integers --- the prizes of the contestants ranked first, second, $\ldots$, $n$-th in the worst distribution of prize money. The sum of these $n$ integers must be equal to $x$. If there are several worst distributions, you may output any of them.</p>

### 힌트

<p>In the distribution from the example test case, your friend ranked first will receive 7 Zurumbian roubles, the third-ranked one will receive 3 Zurumbian roubles, and two other friends will receive nothing, resulting in the grand total of 10 Zurumbian roubles received by your friends. It can be proved that in any distribution of prize money, your friends will always receive at least 10 Zurumbian roubles.</p>