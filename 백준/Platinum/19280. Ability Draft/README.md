# [Platinum III] Ability Draft - 19280

[문제 링크](https://www.acmicpc.net/problem/19280)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 13, 맞힌 사람: 9, 정답 비율: 47.368%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>Dota 2 is a competitive multiplayer computer game. In this game, two teams of $n$ players are fighting each other in order to destroy the enemy main building, Ancient. Each player controls one hero, and each hero has exactly $s$ standard abilities and exactly one ultimate ability.</p>

<p>Ability Draft is a fun mode of Dota 2. In this mode, at the start of the game each player gets random hero without abilities at all. Then players pick abilities in certain order from the pool of abilities provided by the game. At his turn, player may either pick any of the remaining standard abilities, or, if he didn&#39;t pick his ultimate ability, pick any of the remaining ultimate abilities. The pool contains enough abilities of both kinds so that each player can always pick his $s$ standard abilities and one ultimate ability.</p>

<p>The strength of the team is the sum of strengths of all abilities of all heroes in this team. All players are picking abilities in such a way that the difference between the strength of their own team and the strength of the enemy team at the end of draft procedure is maximum possible.</p>

<p>Knowing the strengths of abilities in the pool and the order of ability picks, find the difference of strengths of the teams if all players perform their picks optimally.</p>

### 입력

<p>The first line of input contains two integers $n$ and $s$ ($1 \le n \le 5$, $1 \le s \le 3$) --- the number of players in the team and the number of standard abilities of the heroes.</p>

<p>The second line contains $2n \cdot (s + 1)$ indices of players --- the order of ability picks. Each index from $1$ to $2n$ appears exactly $s + 1$ times in this array. Players with indices between 1 and $n$ belong to the first team, and players with indices between $n + 1$ and $2n$ belong to the second team.&nbsp;</p>

<p>The third line contains an integer $p_s$ ($2n \cdot s \le p_s \le 36$) --- the number of standard abilities in the pool.</p>

<p>The fourth line contains $p_s$ integers from $1$ to $10^6$ --- strengths of the standard abilities.</p>

<p>The fifth line contains an integer $p_u$ ($2n \le p_u \le 12$) --- the number of ultimate abilities in the pool.</p>

<p>The sixth line contains $p_u$ integers from $1$ to $10^6$ --- strengths of the ultimate abilities.</p>

### 출력

<p>Output a single integer --- the difference of strengths of the teams after all ability picks.</p>