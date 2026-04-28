# [Gold I] Box Factory (Small) - 12386

[문제 링크](https://www.acmicpc.net/problem/12386)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 7, 정답: 7, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 자료 구조, 분리 집합

### 문제 설명

<p>You own a factory with two assembly lines. The first assembly line makes boxes, and the second assembly line makes toys to put in those boxes. Each type of box goes with one type of toy and vice-versa.</p>

<p>At the beginning, you pick up a box from the first assembly line and a toy from the second assembly line. You then have a few options.</p>

<ul>
	<li>You can always throw out the box and pick up the next one.</li>
	<li>You can always throw out the toy and pick up the next one.</li>
	<li>If the box and toy are the same type, you can put the toy in the box, and send it out to customers.</li>
</ul>

<p>You always pick boxes up in the order in which they are made, and similarly for toys. You know the order in which boxes and toys are made, and you want to plan out a strategy that will allow you to send as many boxed toys as possible to customers.</p>

<p>&nbsp;</p>

<p>Warning: The two assembly lines make a&nbsp;<em>lot</em>&nbsp;of boxes and toys. However, they tend to make one kind of thing for a long period of time before switching.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow.</p>

<p>Each test case begins with a line contains two integers&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>M</strong>. It is followed by a line containing 2 *&nbsp;<strong>N</strong>&nbsp;integers&nbsp;<strong>a<sub>1</sub></strong>,&nbsp;<strong>A<sub>1</sub></strong>,&nbsp;<strong>a<sub>2</sub></strong>,&nbsp;<strong>A<sub>2</sub></strong>, ...,&nbsp;<strong>a<sub>N</sub></strong>,&nbsp;<strong>A<sub>N</sub></strong>, and another line containing 2 *&nbsp;<strong>M</strong>integers&nbsp;<strong>b<sub>1</sub></strong>,&nbsp;<strong>B<sub>1</sub></strong>,&nbsp;<strong>b<sub>2</sub></strong>,&nbsp;<strong>B<sub>2</sub></strong>, ...,&nbsp;<strong>b<sub>M</sub></strong>,&nbsp;<strong>B<sub>M</sub></strong>.</p>

<p>This means that the first assembly line will make&nbsp;<strong>a<sub>1</sub></strong>&nbsp;boxes of type&nbsp;<strong>A<sub>1</sub></strong>, then&nbsp;<strong>a<sub>2</sub></strong>&nbsp;boxes of type&nbsp;<strong>A<sub>2</sub></strong>, etc., until it finishes with&nbsp;<strong>a<sub>N</sub></strong>&nbsp;boxes of type&nbsp;<strong>A<sub>N</sub></strong>. Similarly, the second assembly will make&nbsp;<strong>b<sub>1</sub></strong>&nbsp;toys of type&nbsp;<strong>B<sub>1</sub></strong>, followed by&nbsp;<strong>b<sub>2</sub></strong>&nbsp;toys of type&nbsp;<strong>B<sub>2</sub></strong>, etc., until it finishes with&nbsp;<strong>b<sub>M</sub></strong>&nbsp;toys of type&nbsp;<strong>B<sub>M</sub></strong>.</p>

<p>A toy can be matched with a box if and only if they have the same type number.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>a<sub>i</sub></strong>,&nbsp;<strong>b<sub>i</sub></strong>&nbsp;&le; 10<sup>16</sup>.</li>
	<li>1 &le;&nbsp;<strong>A<sub>i</sub></strong>,&nbsp;<strong>B<sub>i</sub></strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 3.</li>
	<li>1 &le;&nbsp;<strong>M</strong>&nbsp;&le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1), and y is the largest number of boxed toys that you can send out to customers.</p>