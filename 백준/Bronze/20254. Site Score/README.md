# [Bronze V] Site Score - 20254

[문제 링크](https://www.acmicpc.net/problem/20254)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8051, 정답: 7235, 맞힌 사람: 7000, 정답 비율: 90.148%

### 분류

수학, 사칙연산

### 문제 설명

<p>Teams from variaous universities compete in ICPC regional contests for tickets to the ICPC World Finals. The number of tickets allocated to every regional contest may be different. The allocation method in our super region, Asia Pacific, is based on a parameter called site score.</p>

<p>Site scores will only count teams and universities solving at least one problem, in the regional contest or its preliminary contest TOPC. In 2020, the formula for calculating the site score of the Taipei-Hsinchu regional contest is much simpler than past years. Let</p>

<ul>
	<li>U<sub>R</sub> be the number of universities solving at least one problem in the regional contest.</li>
	<li>T<sub>R</sub> be the number of teams solving at least one problem in the regional contest.</li>
	<li>U<sub>O</sub> be the number of universities solving at least one problem in TOPC.</li>
	<li>T<sub>O</sub> be the number of teams solving at least one problem in TOPC.</li>
</ul>

<p>The site score of 2020 Taipei-Hsinchu regional contest will be 56U<sub>R</sub> + 24T<sub>R</sub> + 14U<sub>O</sub> + 6T<sub>O</sub>. Please write a program to compute the site score of the 2020 Taipei-Hsinchu regional contest.</p>

### 입력

<p>The input has only one line containing four blank-separated positive integers U<sub>R</sub>, T<sub>R</sub>, U<sub>O</sub>, and T<sub>O</sub>.</p>

### 출력

<p>Output the site score of the 2020 Taipei-Hsinchu regional contest.</p>

### 제한

<ul>
	<li>0 &lt; U<sub>R</sub> &le; T<sub>R</sub> &le; 120</li>
	<li>0 &lt; U<sub>O</sub> &le; T<sub>O</sub> &le; 1000</li>
</ul>

### 힌트

<p>The problem statement is fiction. The real site score has a different formula.</p>