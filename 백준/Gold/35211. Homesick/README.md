# [Gold I] Homesick - 35211

[문제 링크](https://www.acmicpc.net/problem/35211)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 9, 정답: 9, 맞힌 사람: 9, 정답 비율: 100.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>It is the 25th of August, 225 BCE. You are in charge of the annual road trip of the Backtracking-Averse Promenaders Club in Rome. Alas, you get homesick easily and would much rather stay at home. Therefore, your goal is to keep the road trip as short as possible. Traditionally, the road trip cannot backtrack along a road it just used -- your friends would start to complain. Specifically, if you travel directly from site $x$ to site $y$, you cannot immediately go back from $y$ to $x$ along the same road.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35211.%E2%80%85Homesick/0454385b.png" data-original-src="https://boja.mercury.kr/assets/problem/35211-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 303px;"></p>

<p style="text-align: center;">Figure H.1: Sample Input 2. The illustration shows a valid trip using six roads. The road connecting sites 1 and 4 is used twice.</p>

<p>You are given a list of sites to possibly visit and the roads connecting them. Find the road trip with the shortest length that would keep your friends happy.</p>

<p>The road trip must start at site $1$, your home, and must visit at least one other site.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with two integers $n$ and $m$ (\(2\leq n\leq 10^{5}\), \(1\leq m\leq 2\cdot 10^{5}\)), the number of sites and the number of roads.</li>
<li>\(m\) lines, each with two integers $u$ and $v$ (\(1\leq u &lt; v \leq n\)), indicating there is a road between sites \(u\) and \(v\). Roads can be travelled in either direction. Each pair of sites is connected by at most one road.</li>
</ul>

### 출력

<p>If there is no road trip possible, output "<code>impossible</code>". Otherwise, output a your planned road trip, described by an integer $k$, the number of sites to visit on the road trip (including your home twice), followed by the $k$ sites, in the order of visiting them.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>