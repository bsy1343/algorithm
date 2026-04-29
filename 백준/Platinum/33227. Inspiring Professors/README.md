# [Platinum III] Inspiring Professors - 33227

[문제 링크](https://www.acmicpc.net/problem/33227)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 18, 정답: 3, 맞힌 사람: 3, 정답 비율: 18.750%

### 분류

그리디 알고리즘, 두 포인터

### 문제 설명

<p>At TU Delft, more and more courses are going back to on-campus lectures. So, naturally, it becomes more difficult to effectively schedule which lecturer can have which lecture hall. They asked you, an algorithm expert, for help on this sub-problem:</p>

<p>There are $n$ lectures that happen at the same time, numbered $1$ to $n$. In the $i$th course, $x_i$ students will attend the lecture on-campus. The lectures are ordered by friendliness of the professor who gives the lecture, with the friendliest lecturer (we all know who that is) giving lecture $1$.</p>

<p>There are $m$ lecture halls. The lecture halls are numbered from $1$ to $m$ and the $j$th lecture hall has capacity $c_j$. The list of $m$ lecture halls is ranked on "niceness", with the nicest lecture hall on top.</p>

<p>Write a program that reads in the lectures and lecture halls and makes a valid assignment of the halls to lectures. In a valid assignment, the capacity of the hall assigned to a lecture should be greater or equal than the number of students attending.</p>

<p>If there exist multiple valid assignments, compute the assignment which maximizes the niceness of the lecture hall of the friendliest professor. If there are still multiple assignments, maximize the niceness of the lecture hall of lecturer 2, and so on.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing two integers $n$ ($1\leq n\leq 5000$) and $m$ ($1\leq m \leq 5000$), the number of lectures and halls, respectively.</li>
	<li>The next line contains $n$ integers $x_i$, with $x_i$ ($1\leq x_i \leq 10^9$) the number of students attending the $i$th lecture.</li>
	<li>The last line contains $m$ integers $c_j$, with $c_j$ ($1\leq c_j \leq 10^9$) the capacity of lecture hall $j$.</li>
</ul>

### 출력

<p>If there is a valid assignment, output a line with $n$ numbers, with the $i$th being equal to the number of the lecture hall that gets assigned to lecture $i$.</p>

<p>If there is no valid assignment, output "<code>impossible</code>".</p>