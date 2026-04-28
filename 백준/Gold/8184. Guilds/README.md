# [Gold V] Guilds - 8184

[문제 링크](https://www.acmicpc.net/problem/8184)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 185, 정답: 85, 맞힌 사람: 71, 정답 비율: 48.299%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 홀짝성

### 문제 설명

<p>King Byteasar faces a serious matter. Two competing trade organisations, The Tailors Guild and The Sewers Guild asked, at the same time, for permissions to open their offices in each town of the kingdom.</p>

<p>There are n towns in Byteotia. Some of them are connected with bidirectional roads. Each of the guilds postulate that every town should:</p>

<ul>
	<li>have an office of the guild, or</li>
	<li>be directly connected to another town that does.</li>
</ul>

<p>The king, however, suspects foul play. He fears that if there is just a single town holding the offices of both guilds, it could lead to a clothing cartel. For this reason he asks your help.</p>

### 입력

<p>Two integers, n and m (1 &le; n &le; 200,000, 0 &le; m &le; 500,000), are given in the first line of the standard input. These denote the number of towns and roads in Byteotia, respectively. The towns are numbered from 1 to n. Then the roads are given as follows: the input line no.i+1 &nbsp;describes the i-th road; it holds the numbers a<sub>i</sub> and b<sub>i</sub> (1 &le; a<sub>i</sub>,b<sub>i</sub> &le; n, a<sub>i</sub>&ne;b<sub>i</sub>), denoting that the i-th road connects the towns &nbsp;and . Every pair of towns is (directly) connected by at most one road. The roads do not cross - meeting only in towns - but may lead through tunnels and overpasses.</p>

<p>&nbsp;</p>

### 출력

<p>Your program should print out one word in the first line of the standard output: TAK (yes in Polish) - if the offices can be placed in towns according to these rules, or NIE (no in Polish) - in the opposite case. If the answers is TAK, then the following n lines should give an exemplary placement of the offices. Thus the line no. i+1 should hold:</p>

<ul>
	<li>the letter K if there should be an office of The Tailors Guild in the town i, or</li>
	<li>the letter S if there should be an office of The Sewers Guild in the town i, or</li>
	<li>the letter N if there should be no office in the town i.</li>
</ul>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8184.%E2%80%85Guilds/3e643158.gif" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/8184/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:201px; width:192px" /></p>

<p>The towns in which an office of The Tailors Guild should open are marked with circles, whereas those in which an office of The Sewers Guild should open are marked with rhombi.</p>

<p>&nbsp;</p>