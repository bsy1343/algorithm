# [Platinum IV] Balanced Balloons - 35398

[문제 링크](https://www.acmicpc.net/problem/35398)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 23, 정답: 17, 맞힌 사람: 12, 정답 비율: 70.588%

### 분류

다이나믹 프로그래밍, 수학, 조합론

### 문제 설명

<p>A group of students is starting a competitive programming club, and they expect that $N$ people will join, one by one. When each person joins, they must bring between $1$ and $K$ balloons.</p>

<p>The founders want to make sure things stay fair and decided to impose the following fairness rule: after each person joins, it must be possible to evenly redistribute all balloons collected so far among the current members. In other words, after each step, the total number of balloons so far must be divisible by the current number of people.</p>

<p>Being competitive programmers, they realized that this makes for a nice counting problem, and decided to challenge you. How many sequences of $N$ balloon contributions (each contribution between $1$ and $K$) satisfy the fairness rule at every step?</p>

<p>Two sequences are considered different if they differ at any position.</p>

### 입력

<p>The input consists of a single line that contains two integers $N$ ($1 \le N \le 10^9$) and $K$ ($1 \le K \le 2000$), indicating respectively the number of members and the maximum number of balloons each member can bring.</p>

### 출력

<p>Output a single line with an integer indicating the number of balloon contribution sequences that satisfy the fairness rule. Because this number can be very large, output the remainder of dividing it by $998\,244\,353$.</p>