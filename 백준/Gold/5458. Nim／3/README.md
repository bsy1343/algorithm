# [Gold I] Nim/3 - 5458

[문제 링크](https://www.acmicpc.net/problem/5458)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 63, 정답: 12, 맞힌 사람: 12, 정답 비율: 20.000%

### 분류

다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>You are staying in the country of Determinisia for a challenging programming contest. The Determinisians are very fond of playing deterministic games, i.e. games of which the result can be known in advance, assuming the players play optimally. They really love to see each time everything is going exactly the way they had foreseen.</p>

<p>The great teacher Oneplusoneistwo has developed the game Nim some thousands of years ago, and this game is still very popular in Determinisia. This game is quite simple: there are three (possibly empty) stacks of matches. By turns, the players must choose a non-empty stack and remove any positive number of matches from it. The first player to make all three stacks empty, wins.</p>

<p>Recently, the scientist Oneplustwoisthree has suggested to make a three player Nim game, called Nim/3. In order to make this game deterministic, each of the players has one of the other two players as a favorite; in case he can&rsquo;t win himself, he will try to let his favorite win. The players must also know each other&rsquo;s favorites.</p>

<p>In order to socialize with the local students, you want to play a few games of Nim/3 with them. But this is only possible when you play the game in an optimal way. Luckily, you are allowed to write a computer program to assist you during game play.</p>

### 입력

<p>The first line of the input file contains a single number: the number of test cases to follow. Each test case has the following format:</p>

<ul>
	<li>One line with six integers: s<sub>1</sub> s<sub>2</sub> s<sub>3</sub> f<sub>1</sub> f<sub>2</sub> f<sub>3</sub>. Here, s<sub>1</sub>, s<sub>2</sub> and s<sub>3</sub> denote the number of matches on the stacks 1, 2 and 3 respectively (0 &le; s<sub>n</sub> &le; 20, s<sub>1</sub> + s<sub>2</sub> + s<sub>3</sub> &ge; 1). f<sub>1</sub>, f<sub>2</sub> and f<sub>3</sub> indicate the favorite player of player 1, 2 and 3 respectively.</li>
</ul>

<p>Note that f<sub>p</sub> &isin; {1, 2, 3} \ {p}. Currently it is the turn of player 1, followed by player 2 and 3 respectively.</p>

### 출력

<p>For every test case in the input file, the output should contain two numbers, on a single line, separated by a space: k and n. k &isin; {1,2,3} is the stack and 0 &lt; n &le; s<sub>k</sub> the number of matches to take from that stack by player 1, when he plays an optimal game. There might be multiple optimal choices, but you should give the one with k as small as possible, and next n as small as possible.</p>