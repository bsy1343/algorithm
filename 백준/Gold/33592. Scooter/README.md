# [Gold II] Scooter - 33592

[문제 링크](https://www.acmicpc.net/problem/33592)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

그리디 알고리즘

### 문제 설명

<p>The Czech Technical University campus consists of $n$ buildings, indexed from $1$ to $n$. In each building, there can be a math class scheduled, or a computer science class, or neither (but not both). Additionally, in each building, there is at most one professor, and each professor is either an expert in mathematics or in computer science.</p>

<p>As an intern at University Express Inc., your job is to quickly transport the professors to their classes. For this, you have been granted a brand new two-person scooter, able to accommodate yourself, plus at most one passenger.</p>

<p>Initially, you are the only person on the scooter. When you arrive at a building, you may drop off or pick up professors to/from that building. However, in order to improve the efficiency of your task, you are allowed to drive to each of the $n$ buildings <strong>at most once</strong>, in the order of your choice (you can also decide where to start the itinerary).</p>

<p>After the end of your itinerary, in each building where a math class is scheduled, there must be a professor expert in math, and in each building where a computer science class is scheduled, there must be a professor expert in computer science.</p>

<p>Devise an itinerary that makes it possible to teach all classes.</p>

### 입력

<p>The first line contains an integer $n$ ($1 ≤ n ≤ 2000$) — the number of buildings in the campus.</p>

<p>The second line contains a string of $c$ of length $n$ consisting of the characters <code>-</code>, <code>C</code>, <code>M</code> — the $i$-th character denotes the subject of the class scheduled in the $i$-th building. <code>C</code> stands for computer science, <code>M</code> stands for mathematics, while <code>-</code> means that there is no class scheduled in the $i$-th building.</p>

<p>The third line contains a string $p$ of length $n$ consisting of the characters <code>-</code>, <code>C</code>, <code>M</code> — the $i$-th character denotes the expertise of the professor in the $i$-th building (if there is a professor). <code>C</code> stands for computer science, <code>M</code> stands for mathematics, while <code>-</code> means that there is no professor in the $i$-th building.</p>

<p>It is guaranteed that, for all tests given to your program, there exists a valid itinerary.</p>

### 출력

<p>In the first line print an integer $l$ — the number of operations in your chosen itinerary.</p>

<p>The $i$-th ($1 ≤ i ≤ l$) of the next $l$ lines must contain one of three commands:</p>

<ol>
	<li><code>DRIVE</code> $x$ — go to the building with the number $x$ ($1 ≤ x ≤ n$);</li>
	<li><code>PICKUP</code> — pick up the professor which was <em>initially</em> at the current building;</li>
	<li><code>DROPOFF</code> — drop off the passenger professor at the current building.</li>
</ol>

<p>In order for the itinerary to be valid, the following conditions must hold:</p>

<ol>
	<li>No two <code>DRIVE</code> instructions should go to the same building;</li>
	<li>At most one <code>DROPOFF</code> and one <code>PICKUP</code> instruction <strong>in this order</strong> should be issued at each specific building;</li>
	<li>For all <code>PICKUP</code> instructions, there must be a professor <em>initially</em> at the building, as well as no one already riding along on the scooter;</li>
	<li>For all <code>DROPOFF</code> instructions, there must be a professor riding along at the time of the command;</li>
	<li>After the itinerary, in each building, if there is a class in that building, there must be a professor expert in the class’ subject (either initially, or because they were dropped off there).</li>
</ol>

<p><strong>Note that, in particular, you cannot pick up a professor that you just dropped off for an itinerary to be valid.</strong></p>