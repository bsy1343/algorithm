# [Gold I] Criss-Cross Cables - 16295

[문제 링크](https://www.acmicpc.net/problem/16295)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 512 MB

### 통계

제출: 100, 정답: 52, 맞힌 사람: 45, 정답 비율: 55.556%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>As a participant in the BAPC (Bizarrely Awful Parties Competition) you are preparing for your next show. Now, you do not know anything about music, so you rip off someone else&rsquo;s playlist and decide not to worry about that any more. What you do worry about, though, is the aesthetics of your set-up: if it looks too simple, people will be unimpressed and they might figure out that you are actually a worthless DJ.</p>

<p>It doesn&rsquo;t take you long to come up with a correct and fast solution to this problem. You add a long strip with a couple of useless ports, and add some useless cables between these ports. Each of these cables connects two ports, and these special ports can be used more than once. Everyone looking at the massive tangle of wires will surely be in awe of your awesome DJ skills.</p>

<p>However, you do not want to connect the same two ports twice directly. If someone notices this, then they will immediately see that you are a fraud!</p>

<p>You&rsquo;ve made a large strip, with the ports in certain fixed places, and you&rsquo;ve found a set of cables with certain lengths that you find aesthetically pleasing. When you start trying to connect the cables, you run into another problem. If the cables are too short, you cannot use them to connect the ports! So you ask yourself the question whether you&rsquo;re able to fit all of the cords onto the strip or not. If not, the aesthetics are ruined, and you&rsquo;ll have to start all over again.</p>

### 입력

<ul>
	<li>The first line has 2 &le; n &le; 5 &middot; 10<sup>5</sup> and 1 &le; m &le; 5 &middot; 10<sup>5</sup>, the number of ports on the strip and the number of wires.</li>
	<li>The second line has integers 0 &le; x<sub>1</sub> &lt; &middot; &middot; &middot; &lt; x<sub>n</sub> &le; 10<sup>9</sup>, the positions of the n sockets.</li>
	<li>The third line has m integers l<sub>1</sub>, . . . , l<sub>m</sub>, the lengths of the wires, with 1 &le; l<sub>i</sub> &le; 10<sup>9</sup>.</li>
</ul>

### 출력

<ul>
	<li>Print <code>yes</code> if it is possible to plug in all the wires, or <code>no</code> if this is not possible.</li>
</ul>