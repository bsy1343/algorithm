# [Platinum I] Geometric Balance - 33033

[문제 링크](https://www.acmicpc.net/problem/33033)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 32, 정답: 14, 맞힌 사람: 13, 정답 비율: 76.471%

### 분류

구현, 기하학

### 문제 설명

<p>Peter's little brother Ivan likes to play with a turtle. The turtle is a special toy that lives on the plane and can execute three commands:</p>

<ul>
	<li>Rotate $a$ degrees counterclockwise.</li>
	<li>Draw $d$ units in the direction it is facing while dispensing ink. No segment of the plane will be covered by ink more than once.</li>
	<li>Move $d$ units in the direction it is facing without drawing.</li>
</ul>

<p>Ivan just learned about the compass, so he will only rotate his turtle so it faces one of eight cardinal or ordinal directions (angles $a$ in rotate commands are always divisible by 45). Also, he will perform at least one draw command.</p>

<p>Peter has noted all the commands Ivan has given to his turtle. He thinks that the image drawn by the turtle is adorable. Now Peter wonders about the smallest positive angle $b$ such that he can perform the following operations: move the turtle to a point of his choosing, rotate it by $b$ degrees, and execute all the commands in the same order. These operations should produce the same image as the original one. Can you help Peter?</p>

<p>Note, two images are considered <em>the same</em> if the sets of points covered by ink on the plane are the same in both of the images.</p>

### 입력



### 출력

<p>The first line of the input contains a single integer $n(1 \le n \le 50000)$ --- the number of commands Ivan has given.</p>

<p>The next $n$ lines contain commands. Each command is one of:</p>

<ul>
	<li>"<code>rotate</code> $a$" ($45 \le a \le 360$) where $a$ is divisible by $45$;</li>
	<li>"<code>draw</code> $d$" ($1 \le d \le 10^9$);</li>
	<li>"<code>move</code> $d$" ($1 \le d \le 10^9$). </li>
</ul>

<p>At least one and <strong>at most 2000</strong> of the commands are <code>draw</code>. It is guaranteed that no segment of the plane will be covered by ink more than once.</p>

### 제한

<p>Output a single number, the answer to the question. The answer always exists.</p>