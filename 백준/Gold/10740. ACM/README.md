# [Gold I] ACM - 10740

[문제 링크](https://www.acmicpc.net/problem/10740)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 143, 정답: 103, 맞힌 사람: 60, 정답 비율: 64.516%

### 분류

다이나믹 프로그래밍, 누적 합, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>The team of the University of Zagreb &ndash; Stjepan, Ivan and Gustav &ndash; are taking part in the World Finals of the ACM International Collegiate Programming Contest in Morocco. Their technical guide Goran has come up with an invincible strategy to use for solving tasks in the finals.</p>

<p>In the very beginning, each team member quickly estimates the difficulty of each of the N tasks. The difficulties are described by numbers from 1 to 5, and their meaning is the following:</p>

<ul>
	<li>1 - hehehe</li>
	<li>2 - bring it on!</li>
	<li>3 - well OK.</li>
	<li>4 - hmmmm. . .</li>
	<li>5 - are you insane?</li>
</ul>

<p>After this, they will distribute the tasks between them. For simplicity&rsquo;s sake, the array of tasks will be split into three parts so that each team member gets a nonempty array of consecutive tasks to contemplate about. The distribution is made so that the sum of estimated difficulties is minimal, whereas only the estimate of the team member whom that task is assigned to is calculated. Your task is to calculate that minimal possible sum.</p>

### 입력

<p>The first line of input contains the integer N (3 &le; N &le; 150 000), the number of tasks.</p>

<p>Each of the following three lines contains N integers (from 1 to 5): the estimated task difficulties, given respectively. First of those lines corresponds to Stjepan&rsquo;s estimates, the second to Ivan&rsquo;s and the third to Gustav&rsquo;s.</p>

### 출력

<p>The first and only line of output must contain the minimal sum of difficulties.</p>

### 힌트

<p>Clarification of the first example: Stjepan gets the first, Gustav the second, and Ivan the third task.</p>