# [Platinum III] Focusing on Costs - 26868

[문제 링크](https://www.acmicpc.net/problem/26868)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 137, 정답: 88, 맞힌 사람: 53, 정답 비율: 67.089%

### 분류

수학, 애드 혹, 정수론, 해 구성하기, 유클리드 호제법

### 문제 설명

<p>In modern gadgets, it&#39;s crucial to trim down the fat and get rid of unnecessary features, like a headphone jack. The same trend applies to the calculator industry.</p>

<p>In their pursuit for minimalism, Cosio calculator company started to produce calculators that have a single display and can only compute trigonometric functions <code>sin</code>, <code>cos</code>, <code>tan</code> and their inverses <code>asin</code>, <code>acos</code>, <code>atan</code>.</p>

<p>Initially, the calculator&#39;s display shows the number $0$. After that, for each of the functions listed above, you can press a button that applies that function to the displayed number. If the operation is inapplicable or produces infinity, then the calculator breaks and stops responding.</p>

<p>You took it as a challenge to figure out what you can achieve using this calculator. Find a way to compute $\frac {a}{b}$ using at most $1000$ operations.</p>

### 입력

<p>The only line contains two integers $a$ and $b$ ($1 \le a, b \le 10$).</p>

### 출력

<p>In the first line, print a single integer $k$ --- the number of button presses in your solution ($1 \le k \le 1000$).</p>

<p>In the second line, print the applied operations in order, separated by spaces.</p>

<p>The solution will be checked with a program in C++ using the standard 64-bit floating-point type: <code>double</code>. Your answer will be considered correct if the sequence of actions does not cause an error, and in the end the calculator displays $\frac {a}{b}$ with an absolute error of at most $10^{-9}$.</p>

<p>You do not have to find the shortest solution. Any solution satisfying the constraints will be accepted.</p>