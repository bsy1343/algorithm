# [Gold I] Cylinders - 8525

[문제 링크](https://www.acmicpc.net/problem/8525)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 30, 정답: 7, 맞힌 사람: 5, 정답 비율: 41.667%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 최단 경로

### 문제 설명

<p>Byteasar urgently needs to measure l milliliters of water. He went to a shop that sells technical glass. Unfortunately, water measuring glass is out of date and found the shop being wound up. Most of the glass was sold out and there were only two identical defective cylinders. Their defect was that each of them had only a subset of all the necessary scales (in milliliters). Byteasar had no choice: he needed those cylinders, so he bought them. He is facing a new problem now: how to measure l milliliters of water using his cylinders?</p>

<p>In the beginning both cylinders are empty. Possible actions that can be performed are:</p>

<ul>
	<li>pouring water from a tap to a cylinder until water reaches one of the cylinder&#39;s scales,</li>
	<li>pouring water from a cylinder to the sink until water reaches one of the cylinder&#39;s scales,</li>
	<li>pouring water from one cylinder to the other until water reaches one of the first cylinder&#39;s scales,</li>
	<li>pouring water from one cylinder to the other until water reaches one of the second cylinder&#39;s scales.</li>
</ul>

<p>Each of these actions takes the same amount of time. Byteasar is in a hurry, so he would like to measure the necessary amount of water as quickly as possible. Your task is to either compute the minimal number of actions that Byteasar needs to perform in order to obtain exactly l milliliters of water in one of his cylinders or check that the measurement is impossible.</p>

### 입력

<p>The first line of the input contains one positive integer n (3 &le; n &le; 25) that represents the number of scales in each of the cylinders. The second line contains an increasing sequence of integers x<sub>1</sub>, &hellip;, x<sub>n</sub> (separated by single spaces): the scales&#39; values. x<sub>1</sub> is always equal to 0 and x<sub>n</sub> (x<sub>n</sub> &le; 100,000) is equal to the capacity of each of the cylinders. The third and last line of the input contains one integer l (0 &le; l &le; xn).</p>

<p>&nbsp;</p>

### 출력

<p>If it is impossible for Byteasar to measure the desired amount of water, your program should output a single word NIE (Polish for no). Otherwise your program should output the minimal number of actions that are necessary to perform the measurement.</p>

<p>&nbsp;</p>