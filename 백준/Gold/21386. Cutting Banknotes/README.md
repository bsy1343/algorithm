# [Gold III] Cutting Banknotes - 21386

[문제 링크](https://www.acmicpc.net/problem/21386)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 23, 맞힌 사람: 16, 정답 비율: 59.259%

### 분류

수학, 정수론

### 문제 설명

<p>Philip is often faced with a big problem: after going out for dinner or having a few beers, he owes money to his friends or the other way around. These are often small amounts, but because Philip hates coins, his wallet contains only banknotes. Therefore he usually can&rsquo;t pay the amount exactly. Since he hates coins, he also doesn&rsquo;t allow his friends to return them as change. He does allow for banknotes as change though.</p>

<p>To accomodate for this problem, he and his friends came up with the following idea: let&rsquo;s pay with pieces of banknotes. To make the cutting easy, they only cut banknotes in two equally-sized pieces, cut those pieces in two pieces, and so on. This yields a much larger range of amounts that can be paid. Philip wonders which ones exactly.</p>

### 입력

<p>On the first line an integer t (1 &le; t &le; 100): the number of test cases. Then for each test case:</p>

<ul>
	<li>One line with a number x (0.01 &le; x &le; 10 000.00): the amount Philip has to pay. This is formatted with two decimal digits and a period as decimal separator.</li>
	<li>One line with a positive integer n (1 &le; n &le; 1 000): the number of different banknotes.</li>
	<li>n lines, each with an integer b<sub>i</sub> (1 &le; b<sub>i</sub> &le; 10 000): the values of the banknotes.</li>
</ul>

### 출력

<p>For each test case:</p>

<ul>
	<li>One line with &ldquo;<code>yes</code>&rdquo; if the amount can be paid exactly and &ldquo;<code>no</code>&rdquo; otherwise.</li>
</ul>