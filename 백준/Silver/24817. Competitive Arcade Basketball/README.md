# [Silver V] Competitive Arcade Basketball - 24817

[문제 링크](https://www.acmicpc.net/problem/24817)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 187, 정답: 109, 맞힌 사람: 90, 정답 비율: 58.065%

### 분류

구현, 자료 구조, 문자열, 집합과 맵, 시뮬레이션, 해시를 사용한 집합과 맵

### 문제 설명

<p>You&#39;re attending a arcade basketball competition, where the objective is to score as many points as possible until the time runs out. The announcer has informed the crowd that their scoreboard is broken, so they don&#39;t have a way to keep track of all the scores. As a seasoned programmer, you feel you can whip up a program that can keep track of the names of the players and the amount of points they&#39;ve scored, announcing the winner(s) at the end of the contest.&nbsp;</p>

### 입력

<p>The first line contains three integers: the number of participants $n$ ($1 \le n \le 100\,000$); the minimum number $p$ of points required to win the contest ($10 \le p \le 10\,001$); and $m$, the number of lines with player names and points ($1 \le m \le 200\,000$). The next $n$ lines contain the names of the participants, each mentioned exactly once. Each name consist of no more than $20$ alphanumerical characters. The remaining $m$ lines each contain the name of a participant, followed by how many points they scored ($1$, $2$, or $3$).</p>

### 출력

<p>Output the names of those participants who reached the minimum required score, one per line! Output &quot;<code>&lt;Winner&gt; wins!</code>&quot; for each winner. Output the winners in the order in which they&#39;ve reached the required score. If no one reaches the minimum required score, output &quot;<code>No winner!</code>&quot; (including the exclamation mark!).</p>