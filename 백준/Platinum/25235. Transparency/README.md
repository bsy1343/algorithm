# [Platinum I] Transparency - 25235

[문제 링크](https://www.acmicpc.net/problem/25235)

### 성능 요약

시간 제한: 6 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 28, 맞힌 사람: 20, 정답 비율: 43.478%

### 분류

구현, 그래프 이론, 많은 조건 분기, 최단 경로, 데이크스트라, 0-1 너비 우선 탐색

### 문제 설명

<p>You must audit a factory that produces a number of products. Each product is subject to its own taxation rules and regulations. Unfortunately, deciding which rules apply to a product is not obvious since it can be difficult to distinguish the products from one another. It is your job to investigate if the factory is being completely <em>transparent</em> in its production process by determining if the factory is capable of producing two different products that are indistinguishable from one another.</p>

<p>The final products are represented by sequences of uppercase letters (&#39;<code>A</code>&#39;--&#39;<code>Z</code>&#39;) and lowercase letters (&#39;<code>a</code>&#39;--&#39;<code>z</code>&#39;).  Two final products are indistinguishable from one another if the products are equal after removing all lowercase letters. For example, <code>WabXYcz</code> is indistinguishable from <code>gWXfbY</code>, since after removing all lowercase letters we are left with <code>WXY</code> in both instances.</p>

<p>A factory is modelled as a set of stations $S$, a set of directed and labelled transition edges $T$, an initial station $s_0$, and a set of packaging stations $P$. The initial station is in the set of stations, i.e., $s_0\in S$, and the set of packaging stations is a subset of $S$, i.e., $P \subseteq S$. A transition edge is defined by a $3$-tuple $(s_1, \sigma, s_2)$, where $s_1,s_2\in S$ are stations, and $\sigma$ is an uppercase or lowercase letter. The existence of the transition $(s_1, \sigma, s_2)$ in $T$ means that if in producing some product we are at station $s_1$, then appending $\sigma$ to the product will leave us at station $s_2$. That is, there is a directed edge from station $s_1$ to station $s_2$, labelled $\sigma$.</p>

<p>A product can be produced by the factory if by starting at station $s_0$ there is a sequence of edges that can be followed, ending at a station in $P$, whose edge labels can be concatenated, in order, to create the product. The sequence of edges can be empty if $s_0 \in P$. For example, the following strings can all be produced by the factory described in the first sample input and illustrated in the figure: <code>AF</code>, <code>FAFB</code>, <code>AbFFAd</code>, <code>AdydAd</code>. Note that this is not an exhaustive list.</p>

<p>Each production transition can be used an unlimited number of times to make a product. It is guaranteed that for each station, $s$, and letter, $\sigma$, there is at most one directed edge from station $s$ labelled $\sigma$. That is, $(s_1, \sigma, s_2), (s_1, \sigma, s_3)\in T$ implies $s_2=s_3$. It is possible that transitions will go back to the same station; that is, $(s_1, \sigma, s_1)\in T$ is allowed.</p>

<p>Given a factory design, determine if the factory is capable of producing two distinct but indistinguishable products. If there is such a pair of products, then report the sum of the lengths of the strings in the pair that minimizes the sum of the lengths. If there is no such pair, print $-1$.</p>

### 입력

<p>The first line of input contains three integers, $s$ ($1 \le s \le 50$), $p$ ($1 \le p \le s$) and $t$ ($1 \le t \le 52 \cdot s$), where $s$ is the number of stations, $p$ is the number of packaging stations, and $t$ is the number of transitions. The set of stations is numbered from $1$ to $s$. </p>

<p>Each of the next $p$ lines contains a single integer $i$ ($1 \le i \le s$). These are the packing stations. All values of $i$ are distinct.</p>

<p>Each of the next $t$ lines is of the form:</p>

<p>$s_1  \sigma  s_2$</p>

<p>where $s_1$ and $s_2$ ($1 \le s_1, s_2 \le s$) are stations, and $\sigma$ is a single character, consisting of an uppercase or lowercase letter. These are the transitions. The initial station is always station $1$. There will never be two transitions out of the same state labelled with the same character.</p>

### 출력

<p>Output a single line with a single integer. If there is no pair of distinct, indistinguishable products, then output $-1$. If there exists a pair of distinct, indistinguishable products, then output the smallest sum $|a|+|b|$ where $a$ and $b$ are strings corresponding to distinct, indistinguishable products.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25235.%E2%80%85Transparency/d3f1c2ee.png" data-original-src="https://upload.acmicpc.net/d3e35693-edd3-4384-8eb7-f17b7ad36a1f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 290px; height: 200px;" /></p>

<p style="text-align: center;">The factory design from the first sample input.  The packaging station is marked by a double circle.</p>