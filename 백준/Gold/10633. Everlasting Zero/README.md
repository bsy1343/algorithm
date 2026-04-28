# [Gold II] Everlasting Zero - 10633

[문제 링크](https://www.acmicpc.net/problem/10633)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 13, 맞힌 사람: 13, 정답 비율: 44.828%

### 분류

너비 우선 탐색, 깊이 우선 탐색, 플로이드–워셜, 그래프 이론, 그래프 탐색, 최단 경로

### 문제 설명

<p>You are very absorbed in a famous role-playing game (RPG), &quot;Everlasting -Zero-&quot;. An RPG is a game in which players assume the roles of characters in a fictional setting. While you play the game, you can forget your &quot;real life&quot; and become a different person.</p>

<p>To play the game more effectively, you have to understand two notions, a <em>skill point</em> and a <em>special command</em>. A character can boost up by accumulating his experience points. When a character boosts up, he can gain skill points.</p>

<p>You can arbitrarily allocate the skill points to the character&#39;s skills to enhance the character&#39;s abilities. If skill points of each skill meets some conditions simultaneously (e.g., the skill points of some skills are are greater than or equal to the threshold values and those of others are less than or equal to the values) , the character learns a special command. One important thing is that once a character learned the command, he will never forget it. And once skill points are allocated to the character, you cannot revoke the allocation. In addition, the initial values of each skill is <var>0</var>.</p>

<p>The system is so complicated that it is difficult for ordinary players to know whether a character can learn all the special commands or not. Luckily, in the &quot;real&quot; world, you are a great programmer, so you decided to write a program to tell whether a character can learn all the special commnads or not. If it turns out to be feasible, you will be more absorbed in the game and become happy.</p>

### 입력

<p>The input is formatted as follows.</p>

<pre>
M N
K<sub>1</sub>
s<sub>1,1</sub> cond<sub>1,1</sub> t<sub>1,1</sub>
s<sub>1,2</sub> cond<sub>1,2</sub> t<sub>1,2</sub>
...
s<sub>1,K<sub>1</sub></sub> cond<sub>1,K<sub>1</sub></sub> t<sub>1,K<sub>1</sub></sub>
K<sub>2</sub>
...
K<sub>M</sub>
s<sub>M,1</sub> cond<sub>M,1</sub> t<sub>M,1</sub>
s<sub>M,2</sub> cond<sub>M,2</sub> t<sub>M,2</sub>
...
s<sub>M,K<sub>M</sub></sub> cond<sub>M,K<sub>M</sub></sub> t<sub>M,K<sub>M</sub></sub>
</pre>

<p>The first line of the input contains two integers (M, N), where M is the number of special commands (1 &le; M &le; 100), N is the number of skills (1 &le; N &le; 100). All special commands and skills are numbered from 1.</p>

<p>Then M set of conditions follows. The first line of a condition set contains a single integer K<sub>i</sub> (0 &le; K<sub>i</sub>&nbsp;&le; 100), where K<sub>i</sub> is the number of conditions to learn the i-th command. The following K<sub>i</sub> lines describe the conditions on the skill values. s<sub>i,j</sub> is an integer to identify the skill required to learn the command. cond<sub>i,j</sub> is given by string &quot;&lt;=&quot; or &quot;&gt;=&quot;. If cond<sub>i,j</sub> is &quot;&lt;=&quot;, the skill point of s<sub>i,j</sub>-th skill must be less than or equal to the threshold value t<sub>i,j</sub> (0 &le; t<sub>i,j</sub>&nbsp;&le; 100). Otherwise, i.e. if cond<sub>i,j</sub> is &quot;&gt;=&quot;, the skill point of s<sub>i,j</sub> must be greater than or equal to t<sub>i,j</sub>.</p>

### 출력

<p>Output &quot;Yes&quot; (without quotes) if a character can learn all the special commands in given conditions, otherwise &quot;No&quot; (without quotes).</p>