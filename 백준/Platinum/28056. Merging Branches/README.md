# [Platinum I] Merging Branches - 28056

[문제 링크](https://www.acmicpc.net/problem/28056)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 150, 정답: 47, 맞힌 사람: 43, 정답 비율: 70.492%

### 분류

다이나믹 프로그래밍, 홀의 결혼 정리

### 문제 설명

<p>Moloco is an ad-tech company in KAIST city which can be described as a 1-dimensional line. There are $N$ branches in Moloco, and the sales territory of the $i$th branch is range $[l_i, r_i]$. Also it is known that $l_i &lt; r_i$ for $1 \leq i \leq N$ and $r_i \leq l_{i+1}$ for $1 \leq i \leq N-1$.</p>

<p>Moloco defines two branches to intersect if there exists a point which is included in both branches&#39; sales territory. For example $[3, 5]$ and $[5, 7]$ intersect, $[1, 4]$ and $[2, 5]$ intersect while $[1, 2]$ and $[3, 5]$ does not.</p>

<p>Moloco can widen the whole branch&#39;s sales territory by efficient advertisement. If Moloco spends $K$ won, then <strong>every</strong> branch may widen its sales territory by at most $K$ length units. Start and end of widened sales territory should have integer value. </p>

<p>Formally, let the new sales territory of $i$th branch be $[l_i&#39;, r_i&#39;]$. Below conditions should satisfy.</p>

<ul>
	<li>$l_i&#39; \leq l_i$ and $r_i \leq r_i&#39;$</li>
	<li>$(l_i-l_i&#39;)+(r_i&#39;-r_i) \leq K$ </li>
	<li>$l_i&#39;$ and $r_i&#39;$ are both integers.</li>
</ul>

<p>Since too many branches cause difficulty in company management, Moloco is trying to merge all branches into one. Two branch can be merged if they intersect. The sales territory of the new branch will be the union of sales territories of two branches.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28056.%E2%80%85Merging%E2%80%85Branches/348019de.png" data-original-src="https://upload.acmicpc.net/5a749e19-614d-4c8f-9f71-76d7db4446b2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 383px; width: 1000px;" /></p>

<p style="text-align: center;">Fig 1. Illustration of sample 1 when $K=4$</p>

<p>You are employed to Moloco. You are curious of hypothetical scenarios when Moloco only owns $s$th to $e$th branches. For each of these scenarios, you want to find the minimum cost to merge the branches owned by Moloco. Given $Q$ queries where Moloco only owns $s$th to $e$th branches, solve the minimum cost to merge all branches into one.</p>

### 입력

<p>First line contains two integers $N$, $Q$ ($1 \leq N \leq 5000, 1 \leq Q \leq 10^6$).</p>

<p>$N$ lines follow. $i$-th line contains two integers $l_i$, $r_i$ ($1 \leq l_i &lt; r_i \leq 10^9$), denoting the sales territory of $i$th branch. Additionaly, $r_i \leq l_{i+1}$ for all $1 \leq i \leq N-1$.</p>

<p>$Q$ lines follow. $i$-th line contains two integers $s_i$, $e_i$ ($1 \leq s_i \leq e_i \leq N$), denoting the $i$th query.</p>

### 출력

<p>Print $Q$ lines. On the $i$th line, print the answer to the $i$th query, the minimum cost to merge all branches from $s_i$-th to $e_i$-th.</p>

### 힌트

<p>Notice that you don&#39;t need any cost if there is only one branch.</p>