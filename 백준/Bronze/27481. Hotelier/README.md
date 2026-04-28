# [Bronze III] Hotelier - 27481

[문제 링크](https://www.acmicpc.net/problem/27481)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 356, 정답: 284, 맞힌 사람: 246, 정답 비율: 79.100%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Amugae has a hotel consisting of $10$ rooms. The rooms are numbered from $0$ to $9$ from left to right.</p>

<p>The hotel has two entrances --- one from the left end, and another from the right end. When a customer arrives to the hotel through the left entrance, they are assigned to an empty room closest to the left entrance. Similarly, when a customer arrives at the hotel through the right entrance, they are assigned to an empty room closest to the right entrance.</p>

<p>One day, Amugae lost the room assignment list. Thankfully Amugae&rsquo;s memory is perfect, and he remembers all of the customers: when a customer arrived, from which entrance, and when they left the hotel. Initially the hotel was empty. Write a program that recovers the room assignment list from Amugae&rsquo;s memory.</p>

### 입력

<p>The first line consists of an integer $n$ ($1\le n\le 10^5$), the number of events in Amugae&rsquo;s memory.</p>

<p>The second line consists of a string of length $n$ describing the events in chronological order. Each character represents:</p>

<ul>
	<li>&lsquo;<code>L</code>&rsquo;: A customer arrives from the left entrance.</li>
	<li>&lsquo;<code>R</code>&rsquo;: A customer arrives from the right entrance.</li>
	<li>&lsquo;<code>0</code>&rsquo;, &lsquo;<code>1</code>&rsquo;, &hellip;, &lsquo;<code>9</code>&rsquo;: The customer in room $x$ ($0$, $1$, &hellip;, $9$ respectively) leaves.</li>
</ul>

<p>It is guaranteed that there is at least one empty room when a customer arrives, and there is a customer in the room $x$ when $x$ ($0$, $1$, &hellip;, $9$) is given. Also, all the rooms are initially empty.</p>

### 출력

<p>In the only line, output the hotel room&rsquo;s assignment status, from room $0$ to room $9$. Represent an empty room as &lsquo;<code>0</code>&rsquo;, and an occupied room as &lsquo;<code>1</code>&rsquo;, without spaces.</p>

### 힌트

<p>In the first example, hotel room&rsquo;s assignment status after each action is as follows.</p>

<ul>
	<li>First of all, all rooms are empty. Assignment status is <code>0000000000</code>.</li>
	<li><code>L</code>: a customer arrives to the hotel through the left entrance. Assignment status is <code>1000000000</code>.</li>
	<li><code>L</code>: one more customer from the left entrance. Assignment status is <code>1100000000</code>.</li>
	<li><code>R</code>: one more customer from the right entrance. Assignment status is <code>1100000001</code>.</li>
	<li><code>L</code>: one more customer from the left entrance. Assignment status is <code>1110000001</code>.</li>
	<li><code>1</code>: the customer in room $1$ leaves. Assignment status is <code>1010000001</code>.</li>
	<li><code>R</code>: one more customer from the right entrance. Assignment status is <code>1010000011</code>.</li>
	<li><code>L</code>: one more customer from the left entrance. Assignment status is <code>1110000011</code>.</li>
	<li><code>1</code>: the customer in room $1$ leaves. Assignment status is <code>1010000011</code>.</li>
</ul>

<p>So after all, hotel room&rsquo;s final assignment status is <code>1010000011</code>.</p>

<p>In the second example, hotel room&rsquo;s assignment status after each action is as follows.</p>

<ul>
	<li><code>L</code>: a customer arrives to the hotel through the left entrance. Assignment status is <code>1000000000</code>.</li>
	<li><code>0</code>: the customer in room $0$ leaves. Assignment status is <code>0000000000</code>.</li>
	<li><code>L</code>: a customer arrives to the hotel through the left entrance. Assignment status is <code>1000000000</code> again.</li>
	<li><code>0</code>: the customer in room $0$ leaves. Assignment status is <code>0000000000</code>.</li>
	<li><code>L</code>: a customer arrives to the hotel through the left entrance. Assignment status is <code>1000000000</code>.</li>
	<li><code>L</code>: one more customer from the left entrance. Assignment status is <code>1100000000</code>.</li>
	<li><code>R</code>: one more customer from the right entrance. Assignment status is <code>1100000001</code>.</li>
	<li><code>R</code>: one more customer from the right entrance. Assignment status is <code>1100000011</code>.</li>
	<li><code>9</code>: the customer in room $9$ leaves. Assignment status is <code>1100000010</code>.</li>
</ul>

<p>So after all, hotel room&rsquo;s final assignment status is <code>1100000010</code>.</p>