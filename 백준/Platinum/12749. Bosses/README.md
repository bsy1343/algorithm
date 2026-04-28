# [Platinum IV] Bosses - 12749

[문제 링크](https://www.acmicpc.net/problem/12749)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 256 MB

### 통계

제출: 330, 정답: 159, 맞힌 사람: 132, 정답 비율: 46.479%

### 분류

그래프 이론, 그리디 알고리즘, 브루트포스 알고리즘, 그래프 탐색, 트리, 너비 우선 탐색

### 문제 설명

<p>A company of $n$ employees is due for a restructuring. In the resulting hierarchy, represented as a rooted tree, every node will be the boss of its children.</p>

<p>Each employee has a list of bosses they will accept. In addition, all employees must be assigned a salary. The salary must be a positive integer, and the salary of each boss must be larger than the sum of salaries of their immediate subordinates.</p>

<p>Your task is to structure the company so that all above conditions hold, and the sum of all the salaries is as small as possible.</p>

### 입력

<p>The first input line contains an integer $n$: the number of employees. The employees are numbered $1$, $2$, $\dots$, $n$.</p>

<p>After this, the input contains $n$ lines that describe the preferences of the employees. The $i$th such line contains an integer $k_i$, followed by a list of $k_i$ integers. The list consists of all employees that the $i$th employee accepts as their boss.</p>

### 출력

<p>You should output the lowest total salary among all valid restructurings. You can assume that at least one solution exists.</p>