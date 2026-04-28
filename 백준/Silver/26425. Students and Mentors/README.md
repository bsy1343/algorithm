# [Silver II] Students and Mentors - 26425

[문제 링크](https://www.acmicpc.net/problem/26425)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 20, 맞힌 사람: 18, 정답 비율: 94.737%

### 분류

자료 구조, 그리디 알고리즘, 이분 탐색, 트리를 사용한 집합과 맵

### 문제 설명

<p>A group of $\mathbf{N}$ students prepares together for upcoming programming competitions such as Kick Start and Code Jam by Google. To help each other prepare, it was decided that each student will pick a mentor among other students. A mentor will help their mentee to solve problems, learn algorithms, track their progress, and will generally support them throughout preparation.</p>

<p>Each student will have exactly one mentor among all other students, and a person can be a mentor to multiple people. For every student $i$ we know their rating $\mathbf{R_i}$ which approximates how good that student is at programming competitions. Because it is believed that a mentor should not be much stronger than their mentee, a student $j$ can be a mentor of student $i$ only if $\mathbf{R_j} \le 2 \times \mathbf{R_i}$. Note that a mentor can even have a rating that is lower or equal to their mentee&#39;s rating.</p>

<p>Unsurprisingly, each student wants to have the strongest possible mentor. For each student, can you help to figure out what is the highest possible rating of a mentor they can pick?</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow. Each test case consists of two lines.</p>

<p>The first line of each test case contains an integer $\mathbf{N}$, representing the number of students in a group.</p>

<p>The second line of each test case contains $\mathbf{N}$ integers $\mathbf{R_1} \ \mathbf{R_2} \ \mathbf{R_3} \ \dots \ \mathbf{R_N}$ where $\mathbf{R_i}$ is a rating of the $i$-th student.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: M<sub>1</sub> M<sub>2</sub> M<sub>3</sub> ... M<sub>N</sub>$</code> where $x$ is the test case number (starting from 1), and $M_i$ is the maximum possible rating of the $i$-th student&#39;s mentor or $-1$ if there are no suitable mentors for that student.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$1 \le \mathbf{R_i} \le 10^6$, for all $i$.</li>
</ul>