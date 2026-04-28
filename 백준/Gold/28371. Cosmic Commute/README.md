# [Gold II] Cosmic Commute - 28371

[문제 링크](https://www.acmicpc.net/problem/28371)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 69, 정답: 50, 맞힌 사람: 45, 정답 비율: 76.271%

### 분류

수학, 그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>A long time ago, in a galaxy far, far away, the InterCosmic Passage Company (ICPC) operates a complex railway system using <em>light trains</em>. Each planet has exactly one train station and each light train connects two distinct planets of the galaxy, going back and forth between them. Just recently, the InterCosmic Passage Company established a teleportation system, which is now in its testing phase. Some train stations are now extended by a <em>wormhole</em>. All wormholes are connected to each other, and it is possible to teleport from one wormhole to another instantaneously. To not overload the new system, each citizen of the galaxy is only allowed to teleport at most once a day.   </p>

<p>Charlie lives on planet Gallifrey and works on planet Sontar. It is her first day of work, and she is already terribly late because her stupid alarm clock did not go off. On top of that, the new teleportation system is malfunctioning today of all days, and the destination wormhole cannot be chosen. Instead, after entering a wormhole, one is teleported to a wormhole that is chosen uniformly at random among all other wormholes. (It is impossible to be at the same train station after teleportation.)</p>

<p>Despite all her bad luck, Charlie is dead set on getting to work on time. Since all light trains are very slow, she wants to take as few light trains as possible. What is the expected minimum number of light trains she has to take to get to work if she can use the (malfunctioning) teleportation system at most once?  </p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with integers $n, m, k$ ($2 \leq n \leq 2\cdot10^5,$ $n - 1 \leq m \leq 10^6, 2\leq k\leq n$), the number of planets in the galaxy, light trains and wormholes. Planet $1$ is Charlie&#39;s home planet Gallifrey, and planet $n$ is Sontar, where Charlie works. </li>
	<li>One line containing $k$ distinct integers, the planets whose train stations each have a wormhole (in addition to the light trains).</li>
	<li>$m$ lines, each containing two integers $a$ and $b$ ($1 \leq a,b \leq n$ and $a \neq b$), describing a light train between the planets $a$ and $b$. It is guaranteed that all light trains are pairwise disjoint.</li>
</ul>

<p>It is guaranteed that it is possible to travel from any planet to any other planet of the galaxy using only light trains. </p>

### 출력

<p>Output a single reduced fraction, the expected minimum number of light trains Charlie has to take to get to work if she can use the (malfunctioning) teleportation system at most once. Output the fraction as &quot;<code>a/b</code>&quot;, where $a$ is the numerator and $b$ is the denominator.</p>