# [Silver II] Heraldic Prediction - 33236

[문제 링크](https://www.acmicpc.net/problem/33236)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 2048 MB

### 통계

제출: 92, 정답: 41, 맞힌 사람: 19, 정답 비율: 37.255%

### 분류

수학, 정수론, 해 구성하기

### 문제 설명

<p>After beating your friend Reyn in various games such as Chess, Backgammon, Checkers, and Battleships, you have almost managed to convince him that you possess the Monado -- a magic sword that lets you see the future. In an act of desparation, he offers you one last challenge. He will tell you a number $n$ between 1 and $10^{16}$ and then secretly pick a prime number $p$ of any size. It will then be your job to tell him an even number $m$, where $n &lt; m &lt; n+50$, and $p^2 + m$ is a composite number (a composite number is a positive integer, which can be formed by multiplying two smaller positive integers). If both of those conditions are fulfilled, it will be clear that the future truly is yours to decide. Luckily, you suspect that Reyn might not have thought this game through very well, and that it is probably possible to determine an $m$, which adds up to a composite number with any possible value of $p$.</p>

<p>With this knowledge in mind, make a program that can beat Reyn, no matter what numbers he picks.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A line with a single integer $n$ ($1 \leq n \leq 10^{16}$), the number chosen by Reyn.</li>
</ul>

### 출력

<p>Output a single even number $m$, where $n &lt; m &lt; n+50$ and $p^2 + m$ is composite for any prime $p$.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>