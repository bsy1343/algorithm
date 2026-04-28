# [Platinum I] The Good, the Bad and the Ugly - 18523

[문제 링크](https://www.acmicpc.net/problem/18523)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 7, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

애드 혹

### 문제 설명

<p>This problem was supposed to have a nice long legend about the Wild Wild West, but the author did not manage to write it in time, so use the power of your imagination!</p>

<p>Consider a number line. A player initially stands at the position $x = p$. At the beginning of each round, you can say either &quot;<code>+</code>&quot; or &quot;<code>-</code>&quot;. After that, the player changes position according to what you said. More precisely, if you say $t$ and the player stood at position $x$, then he moves to position $x&#39; = x + d_t$, where $d_+$ and $d_-$ are two integer constants.</p>

<p>You do not know the exact values $p$, $d_0$ and $d_1$, but you know that the player is either the Good, the Bad or the Ugly (yeah, imagination!):</p>

<ul>
	<li>The Good player has $p = m$, $d_+ = 2$, $d_- = -1$;</li>
	<li>The Bad player has $p = -m$, $d_+ = 1$, $d_- = -2$;</li>
	<li>The Ugly player has either $p = m$ or $p = -m$ and either $d_+ = 1$ and $d_- = -1$ or $d_+ = -1$ and $d_- = 1$.</li>
</ul>

<p>As you can see, the starting position of the player depends on some integer constant $m$ ($1 \le m \le 1000$)... unfortunately, you do not know it too.</p>

<p>After each round, the player tells you if he now stands at $x = 0$ or not.&nbsp;</p>

<p>It appears that, by playing several rounds, you can uniquely determine if the player is Good, Bad or Ugly. Do it in no more than $30 m$ rounds.</p>

<p>In each test, the values $m$, $p$, $d_+$ and $d_-$ are chosen according to the above rules. They are fixed in advance and don&#39;t change during the checking process.</p>

### 입력



### 출력

