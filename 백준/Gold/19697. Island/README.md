# [Gold IV] Island - 19697

[문제 링크](https://www.acmicpc.net/problem/19697)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 21, 맞힌 사람: 18, 정답 비율: 72.000%

### 분류

수학, 조합론

### 문제 설명

<p>Squeaky the Mouse has just discovered an inhabited, circular island and is sailing back to his homeland to announce this new discovery. The island is circular and made up mostly of rocky, non-arable land. As such, saltwater fish is the main food source to the inhabitants, so they reside in N towns (numbered 1 to N) along the coast of the island.</p>

<p>To connect the towns, M junctions have been created on the interior of the island and some roads built to connect the towns and the junctions. To minimise construction cost, exactly N + M &minus; 1 roads are built such that it is possible to travel by road between any two towns, and there is exactly one road ending at each town. In other words, the road network may be represented as a tree with N leaves (representing the N towns), M internal nodes (representing the M junctions), and N + M &minus; 1 edges (representing the N + M &minus; 1 roads).</p>

<p>Furthermore, every junction has at least three roads connected to it, roads do not meet other roads except at junctions, and there are no bridges or tunnels (they are expensive).</p>

<p>Here is an example map of the island, with 37 towns, 20 junctions, and 56 roads:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/802b7302-7db2-4e4c-b9bb-87e111094130/-/preview/" style="width: 314px; height: 320px;" /></p>

<p style="text-align: center;">Figure 1: Example map of the island</p>

<p>This island is so intriguing that Squeaky is already making plans for his next trip, in a bigger vessel, where he will sail around the whole island, visiting the towns in the order that they are located along the coast. To do this, it is important to know the ordering of the towns along the coast.</p>

<p>Unfortunately, due to strong winds during the journey home, the maps that Squeaky had meticulously crafted were blown off his ship and are now forever lost to the depths of the ocean.</p>

<p>However, not all is lost. Squeaky had brought along a small journal in which he noted down the two endpoints of every road on the island. From this information, he hopes to find the possible orderings of towns along the circular coast, and has tasked you to find them for him. Note that since this island is circular, rotations of the same ordering are treated as equivalent (see example for more details).</p>

<p>To complete your task, you need to know the number of possible orderings, P, of towns around the coast. Since this number may be large, write this value as a product of factors raised to positive exponents (see output section for details).</p>

### 입력

<p>Your program must read from standard input.</p>

<p>The first line of input contains two positive integers N and M, where N is the number of towns and M is the number of junctions.</p>

<p>The next N + M &minus; 1 lines of input will each contain two integers u and v. This means that the town or junction numbered u has a direct road to the town or junction numbered v. (If u &le; N, it represents a town; otherwise, it is a junction. Similarly for v.)</p>

<p>The input is guaranteed to fulfill all constraints stated above, and at least one valid road network is guaranteed to satisfy the input.</p>

### 출력

<p>Your program must write to standard output.</p>

<p>Your program must output \(K\) lines describing the number of possible orderings, \(P\), of towns around the coast.</p>

<p>The \(i\)th line must contain exactly two integers, \(a_i\) and \(b_i\).</p>

<p>Your output must satisfy:</p>

<ul>
	<li>\(P = a^{b_1}_1a^{b_2}_2a^{b_3}_3\cdots a^{b_K}_K\) (or equivalently, \(P = \prod_{i=1}^{K}{a^{b_i}_i}\))</li>
	<li>\(1 \le a_i, b_i \le 10^{18}\)</li>
	<li>\(0 \le K \le 10^6\)</li>
</ul>

<p>It is guaranteed that the number of possible orderings is expressible in this form.</p>

### 제한

<ul>
	<li>N &ge; 2</li>
	<li>M &ge; 0</li>
	<li>N + M &le; 200 000</li>
</ul>