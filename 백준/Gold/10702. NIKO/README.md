# [Gold V] NIKO - 10702

[문제 링크](https://www.acmicpc.net/problem/10702)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 48, 정답: 39, 맞힌 사람: 38, 정답 비율: 82.609%

### 분류

브루트포스 알고리즘, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>It is the year 2018, Russia. History repeats itself and the not-so-young football coach Niko is leading the national team in a clash with Brazil.</p>

<p>Choosing a formation is the first step when it comes to preparing the strategy for a football game. A formation can be represented with three integers O, V and N, where O denotes the number of defensive players, V denotes the number of midfielders and N denotes the number of offensive players. It is evident that it must hold O + V + N = 10.</p>

<p>After choosing a formation, the coach needs to carefully choose the players because not every player is a defensive wizard or a world class striker. The coach knows his players very well. He knows which line suits each player. Setting a player in a line he doesn&rsquo;t know how to play would be tactical suicide.</p>

<p>The coach and his team of expertise have put together a list of formations that can be taken into consideration against Brazil, but in all their expertise they didn&rsquo;t have time to determine the formations which they have suitable players for. Help them!</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 10), the number of formations taken into consideration.</p>

<p>Each of the following N lines contains the formation given as O-V -N. The numbers O, V i N are positive integers and it holds O + V + N = 10.</p>

<p>The following line contains the integer M (10 &le; M &le; 22), the number of players who want to join the national team.</p>

<p>The ith of the following M lines contains the list of lines that the ith player can play in. Letter &lsquo;O&rsquo; denotes defense, letter &lsquo;V&rsquo; midfield positions and letter &lsquo;N&rsquo; offense.</p>

### 출력

<p>Output exactly N lines. The ith line of output should be &ldquo;DA&rdquo; if the coach has suitable players for the ith formation from the input, or &ldquo;NE&rdquo; if he doesn&rsquo;t.</p>

### 힌트

<p><strong>Clarification of the first example:</strong> We see that Niko has almost only defensive players at his service, so he can only use the formation 10-0-0, the infamous &ldquo;parking the bus&rdquo;.</p>

<p><strong>Clarification of the second example:</strong> For formation 4-4-2, he can put players 1, 2, 9 and 10 as defense, players 4, 5, 6 and 7 as midfielders, and players 3 and 8 as offense. For formation 3-5-2, he can put players 4, 9 and 10 as defense, players 1, 2, 5, 6 and 7 as midfielders, and players 3 and 8 as offense. Formation 4-3-3 can&rsquo;t be set up because the coach has only 2 offensive players.</p>