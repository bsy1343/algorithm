# [Gold II] Berland University - 19828

[문제 링크](https://www.acmicpc.net/problem/19828)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 22, 맞힌 사람: 20, 정답 비율: 57.143%

### 분류

이분 탐색

### 문제 설명

<p>There are $t$ students studying in the best university of Berland. They only study programming in Berland, so there is only one subject. Each student must attend the lectures.</p>

<p>The entire course consists of $n$ lectures. It is known that a student who visits at least $k$ of them will pass the course.</p>

<p>There are only two auditoriums in the university, one has space for $a$ people and the other one --- for $b$ people. To make it comfortable, the administration decided that in odd weeks the lectures will be in the first auditorium, and in the even weeks --- in the second auditorium. So the first lecture will be in the 1-st auditorium, the second lecture in the 2-nd one, the third in the 1-st one again, and so on.</p>

<p>The sizes of the auditoriums are small so it might not be possible for all students to attend at least $k$ lectures. They ask you to count the maximum number of students that can pass the course.</p>

### 입력

<p>The first line contains five integers:</p>

<ul>
	<li>$t$ --- the number of students;</li>
	<li>$n$ --- the number of lectures;</li>
	<li>$a$ --- the size of the first auditorium;</li>
	<li>$b$ --- the size of the second auditorium;</li>
	<li>$k$ --- the minimal number of lectures to pass the course.</li>
</ul>

<p>The limits are: $1 \leq t, n, a, b, k \leq 10^9$.</p>

### 출력

<p>Print a single integer --- the maximal number of students that can attend at least $k$ lectures and thus pass the course.</p>

### 힌트

<p>In the fourth sample, 5 students can pass the course. Here&#39;s one possible strategy:</p>

<ol>
	<li>Students $1$, $2$, $3$, $4$, $5$ visit the first lecture.</li>
	<li>Students $1$, $3$ visit the second lecture.</li>
	<li>Students $1$, $2$, $3$, $4$, $5$ visit the third lecture.</li>
	<li>Students $2$, $4$, $5$ visit the fourth lecture.</li>
</ol>

<p>This way each of these 5 students can attend at least 3 lectures.</p>