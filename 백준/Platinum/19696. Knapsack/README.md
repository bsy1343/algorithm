# [Platinum IV] Knapsack - 19696

[문제 링크](https://www.acmicpc.net/problem/19696)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 183, 정답: 40, 맞힌 사람: 31, 정답 비율: 28.972%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 배낭 문제, 조화수

### 문제 설명

<p>There is a housewife who recently won a prize to &ldquo;shop for free as long as your shopping basket is not full&rdquo; in a department store.</p>

<p>This housewife is given a shopping basket that can carry a maximal weight of S kilograms.</p>

<p>There are N item types in the department store and the i-th item is worth V<sub>i</sub> SGD, weighs W<sub>i</sub> kilograms, and there are K<sub>i</sub> copies (of exactly same value and weight) of such item i.</p>

<p>For example, there are N = 3 item types: meat, milk, and bread; of which there are: 1 pack of meat, 3 bottles of milk, and 4 loaves of bread (see the last sample test case).</p>

<p>What items should the housewife take to maximize the total value of the items in her shopping basket?</p>

### 입력

<p>Your program must read from standard input.</p>

<p>The first line of input contains two positive integers, S and N.</p>

<p>The next N lines of input will each contain three integers, where the i-th line contains V<sub>i</sub>, W<sub>i</sub> and K<sub>i</sub>, the value in SGD, weight in kilograms and number of the i-th item respectively.</p>

### 출력

<p>Your program must print to standard output.</p>

<p>Your program should print one integer, representing the maximum total value in SGD of the items that this housewife can take while ensuring the total weight does not exceed S kilograms.</p>

### 제한

<ul>
	<li>1 &le; S &le; 2000</li>
	<li>1 &le; V<sub>i</sub> &le; 1000000</li>
	<li>1 &le; W<sub>i</sub> &le; S</li>
	<li>1 &le; N &le; 100000</li>
	<li>1 &le; K<sub>i</sub> &le; 10<sup>9</sup></li>
</ul>