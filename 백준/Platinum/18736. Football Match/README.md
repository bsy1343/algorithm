# [Platinum II] Football Match - 18736

[문제 링크](https://www.acmicpc.net/problem/18736)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 78, 정답: 13, 맞힌 사람: 13, 정답 비율: 18.841%

### 분류

많은 조건 분기, 해 구성하기, 수학

### 문제 설명

<p>Zenyk wants to play football, and n &minus; 1 friends join him. All players have skill level &mdash; an integer between 1 and 10 000.</p>

<p>Players want to choose a referee and then divide into two teams such that each player is either the referee or a member of one of the teams, and the sums of skills of players in both teams are the same. So that will be a fair game.</p>

<p>Unfortunately all of them forgot their own skill levels. But each player remembers if it&rsquo;s possible to divide into teams when he is a referee.</p>

<p>Find such skill values that satisfy all conditions. If several possible answers exist print any of them.</p>

### 입력

<p>The first line contains one integer n (3 &le; n &le; 50).</p>

<p>The second line contains a string of length n. The i-th character of this string equals &ldquo;Y&rdquo; if it&rsquo;s possible to divide players into teams if i-th player is a referee, and &ldquo;N&rdquo; otherwise.</p>

### 출력

<p>In the first line, print &ldquo;YES&rdquo; if at least one possible set of values exists, and &ldquo;NO&rdquo; otherwise. If the answer is &ldquo;YES&rdquo;, print n integers &mdash; the corresponding values. These values should be between 1 and 10 000. If several possible answers exist, print any of them.</p>