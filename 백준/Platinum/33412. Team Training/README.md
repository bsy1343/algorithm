# [Platinum I] Team Training - 33412

[문제 링크](https://www.acmicpc.net/problem/33412)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

그리디 알고리즘, 스택, 우선순위 큐, 자료 구조

### 문제 설명

<p>Today, Amir had another training session with his coach Timo from Kazakhstan.</p>

<p>Today, Timo had $3n$ students at his training session. Each student, indexed as $i$, had their own level denoted as $p_i$. It is important to note that all students had different levels.</p>

<p>Usually, Timo divided the students into teams of three participants. However, today he decided to change the system and divide the students into three teams. His approach was as follows: he selected three consecutive students from the list and distributed them among the three teams. The first student was sent to the first team, the second one to the second team, and the third one to the third team. Then he crossed out these three students from the list and repeated the process until all the students were distributed.</p>

<p>The level of a team was determined by the sum of the levels of participants in it. Timo wanted to maximize the level of the first team. If there were multiple options for maximizing the level of the first team, he would maximize the level of the second team. If there were still multiple options, he would maximize the level of the third team.</p>

<p>For example, consider the list of students $[3, 1, 5, 4, 2, 6]$. Suppose Timo would first choose $[1, 5, 4]$, then $[3, 2, 6]$. As a result, the teams would have the following levels: $[1{+}3, \, 5{+}2, \, 4{+}6] = [4, 7, 10]$. However, if Timo had chosen $[5, 4, 2]$ first, and then $[3, 1, 6]$, the team levels would have been $[8, 5, 8]$, which is a better distribution according to the criteria.</p>

<p>Find the levels of the teams if Timo divides people into teams optimally.</p>

### 입력

<p>The first line contains a single integer $t$ ($1 \le t \le 10^5$): the number of test cases. For each test case:</p>

<p>The first line contains an integer $n$ ($1 \le n \le 10^5$): the number of students.</p>

<p>The second line contains $3n$ distinct integers $p_1, p_2, \ldots, p_{3n}$ ($1 \le p_i \le 3n$): the levels of the students.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $10^5$.</p>

### 출력

<p>Output a line with three integers: the levels of the first, second, and third teams in the optimal division.</p>