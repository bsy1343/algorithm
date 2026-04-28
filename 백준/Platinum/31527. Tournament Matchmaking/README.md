# [Platinum II] Tournament Matchmaking - 31527

[문제 링크](https://www.acmicpc.net/problem/31527)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 32, 정답: 21, 맞힌 사람: 21, 정답 비율: 65.625%

### 분류

브루트포스 알고리즘, 비트마스킹, 이분 매칭

### 문제 설명

<p>You are organizing a recreational rugby tournament. A rugby team has $15$ distinct roles, numbered $1$ to $15$. Each team in the tournament must have exactly $15$ players, each fulfilling one of the roles. Although several groups of friends showed up to play in the tournament, none of the groups are large enough to form a complete team. You would like to create teams by merging some pairs of groups together.</p>

<p>Each group has between $1$ and $14$ players (inclusive) and you know that each player has exactly $2$ potential roles they could play on a team. Determine the maximum number of valid teams you can form. A team is valid if it is made of exactly two groups, it has exactly $15$ players (no more, no fewer), and every role on the team is played by a different player able to play that role. A group cannot be part of more than one team.</p>

### 입력

<p>The first line contain a single integer $n (1 \le n \le 500)$, the number of groups.</p>

<p>Following this line are $n$ group descriptions. The first line of a group description contains a single integer $k (1 \leq k \leq 14)$, the size of the group. The following $k$ lines each contain two space-separated integers $a$ and $b$ $(1 \leq a &lt; b \leq 15)$, representing a player that can fulfill either role $a$ or role $b$ on team.</p>

### 출력

<p>Output the maximum number of valid teams that can be created by merging pairs of groups together.</p>