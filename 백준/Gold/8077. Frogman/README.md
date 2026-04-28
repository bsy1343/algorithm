# [Gold III] Frogman - 8077

[문제 링크](https://www.acmicpc.net/problem/8077)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 82, 정답: 30, 맞힌 사람: 24, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>A frogman uses a special equipment for diving. He has a cylinder with two containers: one with oxygen and the other with nitrogen. Depending on the time he wants to stay under water and the depth of diving the frogman needs various amount of oxygen and nitrogen. The frogman has at his disposal a certain number of cylinders. Each cylinder can be described by its weight and the volume of gas it contains. In order to complete his task the frogman needs specific amount of oxygen and nitrogen. What is the minimal total weight of cylinders he has to take to complete the task?</p>

<p>The frogman has at his disposal 5&nbsp;cylinders described below. Each description consists of: volume of oxygen, volume of nitrogen (both values are given in litres) and weight of the cylinder (given in decagrams):</p>

<pre>
3 36 120
10 25 129
5 50 250
1 45 130
4 20 119
</pre>

<p>If the frogman needs 5&nbsp;litres of oxygen and 60&nbsp;litres of nitrogen then he has to take two cylinders of total weight 249&nbsp;(for example the first and the second ones or the fourth and the fifth ones).</p>

<p>Write a program that:</p>

<ul>
	<li>reads frogman&#39;s demand for oxygen and nitrogen, the number of accessible cylinders and their descriptions from the standard input;</li>
	<li>computes the minimal total weight of cylinders the frogman needs to complete his task;</li>
	<li>writes the result to the standard output.</li>
</ul>

<p>Note: given set of cylinders always allows to complete the given task.</p>

### 입력

<p>In the first line of the standard input there are two integers t, a&nbsp;separated by a single space, 1 &le; t &le; 21&nbsp;and 1 &le; a &le; 79. They denote volumes of oxygen and nitrogen respectively, needed to complete the task.</p>

<p>The second line contains one integer&nbsp;n,&nbsp;1 &le; n &le; 1,000, which is the number of accessible cylinders. The following n&nbsp;lines contain descriptions of cylinders; (i+2)-nd line contains three integers t<sub>i</sub>, a<sub>i</sub>, w<sub>i</sub>&nbsp;separated by single spaces, (1 &le; t<sub>i</sub> &le; 21, 1 &le; a<sub>i</sub> &le; 79, 1 &le; w<sub>i</sub> &le; 800). These are respectively: volume of oxygen and nitrogen in the i-th cylinder and the weight of this cylinder.</p>

### 출력

<p>Your program should write one integer to the first and only line of the standard output. This number should be the minimal total weight of cylinders the frogman should take to complete the task.</p>