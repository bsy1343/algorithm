# [Platinum V] Effcient Slabstones Rearrangement - 32453

[문제 링크](https://www.acmicpc.net/problem/32453)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 28, 맞힌 사람: 27, 정답 비율: 67.500%

### 분류

그리디 알고리즘, 브루트포스 알고리즘

### 문제 설명

<p>Barbara has a garden. The garden is long and narrow, divided into $m$ equal-sized regions arranged in a row. Her friend, Babara, gave her $n$ slabstones as birthday present. Barbara then placed these slabstones in her garden, so she can enjoy stepping slabstones from one to another every day. The $i$-th slabstone fully occupies the $l_i$-th to $r_i$-th region of the garden. The slabstones do not overlap, and any two slabstones have at least $d$ empty regions between them.</p>

<p>Below is a valid placement of the slabstones with $m = 15$, $n = 3$, $d = 2$, and the three slabstones occupy the regions $2-4$, $7-7$, $12-13$ respectively.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32453.%E2%80%85Effcient%E2%80%85Slabstones%E2%80%85Rearrangement/c4802665.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32453-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 700px; height: 46px;"></p>

<p>Barbara recently bought another slabstone that will occupy $x$ consecutive regions in her garden. She will shift the original slabstones within the garden, then place the new slabstone somewhere in the garden. <strong>After shifting</strong> the original slabstones and placing the new slabstone, the slabstones cannot overlap, and any two slabstones must have at least $d$ empty regions between them. The slabstones should remain non-overlapping <strong>during slabstone rearrangement</strong>.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32453.%E2%80%85Effcient%E2%80%85Slabstones%E2%80%85Rearrangement/37d7572c.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32453-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 700px; height: 174px;"></p>

<p>Shifting a single slabstone to an adjacent region takes one minute. For example, the above rearrangement process takes $4$ minutes. Now Barbara wants to know the minimum possible total time required to rearrange the slabstones, so she can save time for “other purposes”.</p>

### 입력

<p>The first line contains four integers $n$, $m$, $d$ and $x$. The $i$-th of the following $n$ lines contains two integers $l_i$ and $r_i$.</p>

### 출력

<p>The minimum possible total time (in minutes) to rearrange the slabstones so the new slabstone can be placed in the garden. If the new slabstone cannot be placed in the garden no matter how the slabstones are rearranged, just output <code>-1</code>.</p>

### 제한

<ul>
	<li>$1 ≤ n ≤ 2000$</li>
	<li>$1 ≤ d ≤ m ≤ 10^9$</li>
	<li>$1 ≤ x ≤ m ≤ 10^9$</li>
	<li>$1 ≤ l_i ≤ r_i ≤ m$ for $i \in \{1, 2,\dots ,n\}$</li>
	<li>$r_i + d + 1 ≤ l_i+1$ for $i \in \{1, 2,\dots ,n - 1\}$. That is, the slabstones are given in order from left to right.</li>
</ul>