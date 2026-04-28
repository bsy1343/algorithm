# [Gold III] Lefties vs. Righties - 31657

[문제 링크](https://www.acmicpc.net/problem/31657)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 12, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

많은 조건 분기, 다이나믹 프로그래밍, 그리디 알고리즘, 배낭 문제

### 문제 설명

<p>Election season has begun! The news network you work for wants to present expert opinions on a variety of important topics. To give the appearance of being unbiased, the news chief insists the experts that are interviewed cover a broad range of the political spectrum.</p>

<p>This seems difficult to do since the political spectrum is so varied, so you decide to go with the tried, tested, and true practice of calling each person either just a <em>rightie</em> or a <em>leftie</em>. Finally, you want to get this job done as quickly as possible meaning you want to conduct the fewest interviews possible.</p>

<p>More specifically, there are $T$ topics to be covered and $N$ experts. Each expert is experienced with only one of the topics you should cover, and each expert is also either a <em>rightie</em> or a <em>leftie</em>. Your job is to interview the fewest experts possible such that the following conditions hold.</p>

<ul>
	<li>
	<p>For each topic, you interviewed at least one expert in that topic.</p>
	</li>
	<li>
	<p>You interviewed each expert at most once (the audience would get bored otherwise).</p>
	</li>
	<li>
	<p>The number of <em>rightie</em> experts you interviewed is the same as the number of <em>leftie</em> experts you interviewed.</p>
	</li>
</ul>

### 입력

<p>The first line of input contains two integers $T$ ($1 \leq T \leq 100$) and $N$ ($1 \leq N \leq 200$) denoting the number of topics and experts, respectively. Then $N$ lines follow, each containing an integer $t_ i$ ($1 \leq t_ i \leq T$), indicating the topic that the $i$&rsquo;th expert is experienced with, and a single character $c_ i$ ($c_ i \in \{$ <code>R</code>, <code>L</code>$\} $) indicating if the $i$&rsquo;th expert is a <em>rightie</em> or a <em>leftie</em>.</p>

### 출력

<p>Output a single integer $x$ on a line by itself indicating the fewest interviews that can be conducted to satisfy these constraints. If it is not possible to satisfy all constraints, then simply ouput $-1$.</p>