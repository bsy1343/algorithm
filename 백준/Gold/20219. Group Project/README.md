# [Gold I] Group Project - 20219

[문제 링크](https://www.acmicpc.net/problem/20219)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 122, 정답: 49, 맞힌 사람: 47, 정답 비율: 44.762%

### 분류

이분 그래프, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 그리디 알고리즘

### 문제 설명

<p>The big day has finally arrived: today you are going to form groups of two in which you will do the end-of-the-year project. When you arrive at school, you learn that the teacher of the other class is sick, and that your teacher, Mr. B.A.P. Cee, will also have to make groups for the other class. Mr. B.A.P. Cee is a smart guy and realizes that he can use these unfortunate circumstances to his advantage.</p>

<p>Ending up with groups of one should be avoided at all cost, so mixing the students of the two classes may avoid this situation. However, while it is easy to pair up two students from the same class, it is more difficult to match up students from different classes. Throughout the years there has been a lot of rivalry between the two groups, and many students dislike students in the other class. Mr. B.A.P. Cee knows which pairs of students will result in a fight and a failed project.</p>

<p>You are given a list of pairs of students who cannot work together. How many disjoint groups of two can Mr. B.A.P. Cee make that will not result in a failed project?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A line with two integers $n$ ($1 \leq n \leq 10^5$), the number of students, and $m$ (${0\leq m\leq 2\cdot10^5}$), the number of pairs of students who cannot work together.</li>
	<li>$m$ lines, each with two distinct integers $i$ and $j$ ($1\leq i, j\leq n$, $i \neq j$), giving a pair of students who cannot work together.</li>
</ul>

<p>Students are identified by the numbers $1$ through $n$. It is guaranteed that it is possible to split the students into two classes in such a way that all students from the same class get along.</p>

### 출력

<p>Output the number of pairs of students Mr. B.A.P. Cee can make without making any pair of students who cannot work together.</p>