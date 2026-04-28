# [Gold I] Eatcoin - 23338

[문제 링크](https://www.acmicpc.net/problem/23338)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 81, 정답: 46, 맞힌 사람: 40, 정답 비율: 57.143%

### 분류

수학, 이분 탐색, 매개 변수 탐색, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>Eric developed a new algorithm to mine a cryptocurrency called Eatcoin. Since Eric&rsquo;s algorithm is an evolutionary algorithm, its performance keeps improving. On the d-th day of the execution of Eric&rsquo;s algorithm, it consumes p Eatcoins and then produces q &times; d<sup>5</sup> Eatcoins where p and q are positive constants.</p>

<p>Eric wants to become a &ldquo;duotrigintillionaire&rdquo;. A duotrigintillionaire is a person who has at least 10<sup>99</sup> Eatcoins. Eric plans to exploit his algorithm to achieve his goal. Eric&rsquo;s algorithm can soon produce a massive amount of Eatcoins if he has enough Eatcoins. However, his algorithm cannot continue if he does not have p Eatcoins when needed.</p>

<p>Eric gives the values of p and q to you. Please write a program to help Eric to compute two numbers x and y defined as follows.</p>

<ul>
	<li>x is the minimum number of Eatcoins required to execute Eric&rsquo;s algorithm to make him a duotrigintillionaire.</li>
	<li>y is the minimum number of days required to make Eric a duotrigintillionaire if Eric has exactly x Eatcoins before executing his algorithm.</li>
</ul>

### 입력

<p>Two positive integers p and q are given in one line and separated by a space.</p>

### 출력

<p>Output two lines. Print x on the first line and y on the second line.</p>

### 제한

<ul>
	<li>1 &le; q &le; p &le; 10<sup>18</sup></li>
</ul>