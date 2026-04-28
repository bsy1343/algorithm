# [Platinum III] Block, Stock and Two Smoking Galaxy Notes - 19282

[문제 링크](https://www.acmicpc.net/problem/19282)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 14, 맞힌 사람: 14, 정답 비율: 93.333%

### 분류

브루트포스 알고리즘, 이분 탐색, 이분 매칭

### 문제 설명

<p>I decided to start a new fancy project related to cryptocurrency, deep learning, self-driving cars and maybe mobile voice assistance (will decide that later). I already have a team consisting of $n$ promising software engineers and last thing that has to be done is choosing a techlead among them.&nbsp;</p>

<p>All engineers except the techlead should be divided into teams consisting of one or two engineers (recently I read first ten pages of the book ``Agile Software Development: Programming in Pairs&#39;&#39; and found the described technique very useful!). For each pair of engineers I know if they can interact with each other <em>effectively</em>.</p>

<p>The choice of techlead and distribution into teams is <em>effective</em>&nbsp;if any two-member team consists of two engineers that can interact effectively, and in any team there is at least one engineer who can interact effectively with the techlead.</p>

<p>I want you to find an appropriate company structure as fast as possible, so that our startup can make an IPO or ICO (not quite sure yet what that means, no time for that now), or determine that it is impossible and the world of success and glory is not for me (at least for today).</p>

### 입력

<p>The first line of input contains two integers $n$ and $m$ ($2 \le n \le 1000$, $0 \le m \le 10\,000$), the number of software engineers and the number of successfully interacting pairs.</p>

<p>Each of the next $m$ lines contains two integers $u_i$, $v_i$ ($1 \le u_i, v_i \le n$, $u_i \ne v_i$), the indices of engineers forming an effectively interacting pair.</p>

<p>I guarantee that all unordered pairs of engineers are different.</p>

### 출력

<p>Print a single word &quot;<code>No</code>&quot; if it is impossible to create a company structure satisfying my requirements.&nbsp;</p>

<p>Otherwise, print a word &quot;<code>Yes</code>&quot; in the first line.</p>

<p>In the second line print two integers $l$, $k$ ($1 \le l \le n$, $\left\lceil \frac{n-1}{2} \right\rceil \leq k \leq n - 1$), the index of the techlead and the number of teams.&nbsp;</p>

<p>Each of the next $k$ lines should contain two integers $t_1$ and $t_2$ defining a team. If the team consists of two members, $t_1$ and $t_2$ should be indices of the engineers forming it, otherwise $t_1$ should be the index of the only engineer in the team and $t_2$ should be $-1$.</p>

<p>If there are multiple correct answers, print any of them.</p>