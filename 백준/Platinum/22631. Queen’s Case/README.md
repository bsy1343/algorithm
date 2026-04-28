# [Platinum III] Queen’s Case - 22631

[문제 링크](https://www.acmicpc.net/problem/22631)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 4, 정답: 2, 맞힌 사람: 1, 정답 비율: 33.333%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 게임 이론

### 문제 설명

<p>A small country called Maltius was governed by a queen. The queen was known as an oppressive ruler. People in the country suffered from heavy taxes and forced labor. So some young people decided to form a revolutionary army and fight against the queen. Now, they besieged the palace and have just rushed into the entrance.</p>

<p>Your task is to write a program to determine whether the queen can escape or will be caught by the army.</p>

<p>Here is detailed description.</p>

<ul>
	<li>The palace can be considered as grid squares.</li>
	<li>The queen and the army move alternately. The queen moves first.</li>
	<li>At each of their turns, they either move to an adjacent cell or stay at the same cell.</li>
	<li>Each of them must follow the optimal strategy.</li>
	<li>If the queen and the army are at the same cell, the queen will be caught by the army immediately.</li>
	<li>If the queen is at any of exit cells alone after the army&rsquo;s turn, the queen can escape from the army.</li>
	<li>There may be cases in which the queen cannot escape but won&rsquo;t be caught by the army forever, under their optimal strategies.</li>
</ul>

### 입력

<p>The input describes a map of the palace. The first line of the input contains two integers&nbsp;<i>W</i>&nbsp;(1 &le;&nbsp;<i>W</i>&nbsp;&le; 30) and&nbsp;<i>H</i>&nbsp;(1 &le;&nbsp;<i>H</i>&nbsp;&le; 30), which indicate the width and height of the palace. The following&nbsp;<i>H</i>&nbsp;lines, each of which contains&nbsp;<i>W</i>&nbsp;characters, denote the map of the palace. &quot;Q&quot; indicates the queen, &quot;A&quot; the army,&quot;E&quot; an exit,&quot;#&quot; a wall and &quot;.&quot; a floor.</p>

<p>The map contains exactly one &quot;Q&quot;, exactly one &quot;A&quot; and at least one &quot;E&quot;. You can assume both the queen and the army can reach all the exits.</p>

### 출력

<p>Output &quot;Queen can escape.&quot;, &quot;Army can catch Queen.&quot; or &quot;Queen can not escape and Army can not catch Queen.&quot; in a line.</p>

### 힌트

<p>On the first sample input, the queen can move to exit cells, but either way the queen will be caught at the next army&rsquo;s turn. So the optimal strategy for the queen is staying at the same cell. Then the army can move to exit cells as well, but again either way the army will miss the queen from the other exit. So the optimal strategy for the army is also staying at the same cell. Thus the queen cannot escape but won&rsquo;t be caught.</p>