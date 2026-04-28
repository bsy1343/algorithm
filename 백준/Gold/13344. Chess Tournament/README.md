# [Gold I] Chess Tournament - 13344

[문제 링크](https://www.acmicpc.net/problem/13344)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 2030, 정답: 728, 맞힌 사람: 471, 정답 비율: 31.932%

### 분류

자료 구조, 그래프 이론, 분리 집합, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>Your friend is an organizer of the International Chess Playing Championship. He is worried&nbsp;that some of the contestants may be cheating, and he has asked you to help out. The chess&nbsp;players are allowed to report matches to the jury themselves, and this is not checked with the&nbsp;reported opponent. So, it is possible for competitors to make up matches and falsely report&nbsp;themselves as the winners.</p>

<p>Since chess is a game of skill, and not of chance, a player will always beat their opponent if&nbsp;their skill level is higher. A game will result in a draw if and only if the two players&rsquo; skills&nbsp;are exactly equal.</p>

<p>However, the skill level of the players is not known. He has therefore asked you to write&nbsp;a program that, given a list of reported matches, determines whether this list is consistent&nbsp;or not. The list is inconsistent if we can determine that at least reported match is falsely&nbsp;reported, otherwise it is consistent.</p>

### 입력

<p>The first line contains two integers N (2 &le; N &le; 50 000) and M (1 &le; M &le; 250 000), to&nbsp;describe a championship with N players and M reported matches.</p>

<p>The following M lines each consist of an integer K, a symbol which is either &lsquo;=&rsquo; or &lsquo;&gt;&rsquo;, and&nbsp;another integer L. The integers K and L each uniquely identify a player (0 &le; K, L &lt; N). If&nbsp;the symbol is &lsquo;=&rsquo;, then the game between K and L was a draw. If the symbol is &lsquo;&gt;&rsquo;, then K&nbsp;beat L in a match.</p>

<p>You may assume that there is at most one reported match between any given pair of players.&nbsp;Also, each player takes part in at least one reported match.</p>

### 출력

<p>Output a single line containing a single word: &ldquo;consistent&rdquo; if the list of recorded matches&nbsp;is consistent, and &ldquo;inconsistent&rdquo; if it is not.</p>