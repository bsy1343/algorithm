# [Platinum III] Factory Balls - 21767

[문제 링크](https://www.acmicpc.net/problem/21767)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 197, 정답: 65, 맞힌 사람: 57, 정답 비율: 38.255%

### 분류

너비 우선 탐색, 비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색

### 문제 설명

<p>The year 2021 marks the death of <em>Adobe Flash</em>, a multimedia software for animations, applications, games, and so on. Together with it, the era of Flash games (especially from 2005 to 2012) has started to fade away into history. Some good news on this front is that people have already been working on a way to preserve Flash content. Major efforts include <em>Ruffle</em>: an open source Flash player written in Rust, and <em>Flashpoint</em>: an archive of over 78,000 Flash applications.</p>

<p>In memory of the golden era of Flash games, we present a simplified variant of a famous Flash game called <em>Factory Balls</em>. You are tasked with painting a ball in a given pattern. The surface of a ball can be divided into $N$ distinct regions, enumerated with indices from 1 to $N$. You have $K$ paint cans full of paint, where the $i$-th paint can has the color $i$. You are also given $M$ pieces of equipment. Each piece of equipment is specified by a set of regions, and it precisely covers that subset of the regions of the ball.</p>

<p>In the beginning, all regions have color 1 and all pieces of equipment are unequipped. You may perform one of the following actions any number of times:</p>

<ol>
	<li>Immerse the ball into the $i$-th paint can. Every region not covered by any of the pieces of equipment on the ball will be painted with color $i$.</li>
	<li>Pick one piece of equipment currently not equipped, and equip it. You can equip multiple pieces of equipment.</li>
	<li>Pick one piece of equipment currently equipped, and unequip it.</li>
</ol>

<p>In the end, each region of the ball should have a specific color, and all pieces of equipment should be unequipped. Find the minimum number of actions required to paint the ball, or report that it is impossible.</p>

### 입력

<p>The first line contains three integers: $N$, $K$, and $M$.</p>

<p>The next line contains $N$ integers. The $i$-th integer $c_i$ is the desired color of the $i$-th region.</p>

<p>Each of the next $M$ lines describes a piece of equipment. The first number of each line, $r_j$, denotes the number of regions the piece of equipment covers, followed by $r_j$ distinct positive integers, denoting the indices of the regions the piece of equipment covers.</p>

### 출력

<p>If it&#39;s not possible to paint each region of the ball to a given color, output <code>-1</code>. Otherwise, output the minimum number of actions required.</p>

### 제한

<ul>
	<li>$1 \leq N, K \leq 10$</li>
	<li>$0 \leq M \leq 10$</li>
	<li>$1 \leq c_i \leq K$</li>
	<li>$1 \leq r_j \leq N$, and for each piece of equipment, all indices of the regions are distinct.</li>
</ul>

### 힌트

<p>In the second example, this is the fastest method:</p>

<ul>
	<li>Immerse the ball into the third paint can.</li>
	<li>Equip the first piece of equipment.</li>
	<li>Immerse it into the second paint can.</li>
	<li>Equip the second piece of equipment.</li>
	<li>Immerse it into the first paint can.</li>
	<li>Unequip both pieces of equipment.</li>
</ul>