# [Platinum IV] Black and White - 24604

[문제 링크](https://www.acmicpc.net/problem/24604)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 68, 정답: 48, 맞힌 사람: 43, 정답 비율: 78.182%

### 분류

수학, 다이나믹 프로그래밍, 비트마스킹, 확률론, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p><em>Black and White</em> is a Chinese children&#39;s game played in rounds. During each round, the children who are playing all put their hands in either face-up (&quot;White&quot;) or face-down (&quot;Black&quot;). If all the children but one make the same choice, then the &quot;odd one out&quot; sits out for the rest of the game. Play continues until there are only two children left.</p>

<p>Each child independently chooses whether to put their hand face-up with their own fixed probability. What is the expected number of rounds that such a game will last?</p>

### 입력

<p>The first line contains a single integer $n$ ($2 \le n \le 20$), which is the number of children.</p>

<p>Each of the next $n$ lines contains a single real number $p$ ($0.1 \le p \le 0.9$). These are the probabilities for each child that they will put their hand in face-up. The probabilities will have at most three digits after the decimal point.</p>

### 출력

<p>Output a single real number, which is the expected number of rounds. The result must be accurate to within an absolute or relative error of $10^{-6}$.</p>