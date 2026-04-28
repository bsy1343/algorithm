# [Gold V] Tournament - 27196

[문제 링크](https://www.acmicpc.net/problem/27196)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 10, 맞힌 사람: 10, 정답 비율: 71.429%

### 분류

브루트포스 알고리즘, 자료 구조, 그리디 알고리즘, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>The linguistic game &quot;Hat&quot; is played by several pairs of players. Also there should be one host of the game.</p>

<p>A teacher plans to organize a &quot;Hat&quot; tournament in their class consisting of $n$ students, where $n$ is odd number. In order to do this he wants to split students into pairs and leave one student to be the host.</p>

<p>Number students from $1$ to $n$. Student number $i$ is known to have a skill value of $a_i$ in the &quot;Hat&quot; game. Skill of a pair of students is defined as the sum of their individual skills.</p>

<p>In order for the tournament to be as fair as possible the teacher wants the difference between the maximum and minimum skills of resulting pairs to be as small as possible. Help the teacher to choose the host and split other $n - 1$ students into pairs in order to achieve the desired goal.</p>

### 입력

<p>The first line of input contains an integer $n$ --- the number of students in the class ($3 \le n \le 5 \cdot 10^5$, $n$ is guaranteed to be odd).</p>

<p>The second line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($1 \le a_i \le 10^9$).</p>

### 출력

<p>Output one number --- the smallest possible difference between maximum and minimum skills of pairs participating in the tournament.</p>