# [Bronze I] ICPC - 14004

[문제 링크](https://www.acmicpc.net/problem/14004)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 659, 정답: 225, 맞힌 사람: 199, 정답 비율: 35.921%

### 분류

수학, 사칙연산

### 문제 설명

<p><strong>&quot;I once met an interesting guy who had a phone with two batteries.&quot;</strong>&nbsp;- Dudu, 2014</p>

<p>Dudu once met an interesting chap who had a phone with two batteries. With that in mind he decided to create a phone that would have a pair of batteries for his upcoming trip to Thailand.</p>

<p>His company, Interesting Chap Phone Charging (ICPC), created an advanced dual battery technology. While one battery is being used to supply the phone the other is being recharged via a solar receptor.</p>

<p>Unfortunately the rate that the phone uses energy is higher than the rate a battery can be recharged. ICPC is interested to know how long a system will last until being completely out of charge.</p>

### 입력

<p>The input will consist of 4 integers A, B, C and D. They are respectively the rate a phone uses energy in Amperes (Coulombs per second), the rate in which a battery can be recharged in Amperes, the initial charge of the first battery in Coulombs and the initial charge of the second battery in Coulombs.</p>

<p>ICPC&#39;s batteries have infinite capacity and the phone changes from using one battery to using the other instantaneously.</p>

<ul>
	<li>0 &le; A,B,C,D &lt; 2<sup>31</sup></li>
	<li>A &gt; B</li>
</ul>

### 출력

<p>Output one integer with the number of seconds a phone will last given an ICPC dual battery as described in the statement. Round down your answer in case it&#39;s nonintegral.</p>

### 힌트

<p>The phone starts with battery 1 in place. After 2 seconds it is completely depleted, so it changes to battery 2, which now has a total charge of 12.</p>

<p>It takes 2.4 seconds to deplete battery 2, and thus, now battery 1 has a charge of 2.4 coulombs. It&#39;s time to change to battery 1 again.</p>

<p>After 0.48 seconds battery 1 is depleted and battery 2 has 0.48 coulombs of charge.</p>

<p>This process continues for an extra 0.12 seconds until none of the batteries have any power left. Note that we will make an infinite number of battery swaps.</p>