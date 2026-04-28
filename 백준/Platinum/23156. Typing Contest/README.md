# [Platinum III] Typing Contest - 23156

[문제 링크](https://www.acmicpc.net/problem/23156)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 4, 맞힌 사람: 4, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Teacher Docriz is planning to select some students in his class for a typing contest.</p>

<p>There are $n$ students in the class. The $i$-th classmate&#39;s initial typing speed is $s_i$ and the typing noise is $f_i$. However, when several students are selected to compete, their total typing speed is not the sum of everyone&#39;s initial typing speed, because the noise each person makes affects others.</p>

<p>Specifically, if students $1, 2, 3, \ldots, k$ form a team, the actual typing speed of student $1$ is $s_1 \cdot (1 - f_1 f_2 - f_1 f_3 - \ldots - f_1 f_k)$, the actual typing speed of student $2$ is $s_2 \cdot (1 - f_2 f_1 - f_2 f_3 - \ldots - f_2 f_k)$, and so on.</p>

<p>Teacher Docriz wants to form a team so that the total typing speed is as large as possible. Please help him calculate the maximum typing speed he could possibly achieve.</p>

### 입력

<p>The first line contains an integer $T$ ($1 \leq T \leq 2000$), the number of test cases. Then $T$ test cases follow.</p>

<p>The first line of each test case contains a single integer $n$ ($1 \leq n \leq 100$), the number of students.</p>

<p>Then $n$ lines follow, each line contains two numbers $s_i$, $f_i$ ($1 \leq s_i \leq 10^{12}$, $0 \leq f_i \leq 1$), where $s_i$ is an integer and $f_i$ is a real number with <strong>exactly two decimal places</strong>.</p>

<p>It is guaranteed that $\sum n \leq 2000$.</p>

### 출력

<p>For each test case, output a line with a single real number: the maximum typing speed that teacher Docriz can achieve. Keep your answers to <strong>exactly $9$ decimal places</strong> after the decimal point.</p>

<p>It is guaranteed that the answer is absolutely precise when $9$ decimal places are used, so only the answers that <strong>coincide</strong> with the model solution are accepted, so <strong>please ensure the accuracy of your output</strong>.</p>