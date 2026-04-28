# [Platinum IV] Topical - 28495

[문제 링크](https://www.acmicpc.net/problem/28495)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 208, 정답: 85, 맞힌 사람: 48, 정답 비율: 37.795%

### 분류

정렬

### 문제 설명

<p>Benson the Rabbit is attending pilot school!</p>

<p>He has $n$ modules to complete, numbered from $1$ to $n$. There are $k$ topics in flying numbered from $1$ to $k$. As Benson is new to flying, he starts with zero knowledge in each topic.</p>

<p>Each of these $n$ modules have a knowledge requirement to complete them. In particular, to complete module $i$, Benson requires at least $r[i][j]$ knowledge of topic $j$ for all topics $j$.</p>

<p>Completing a module also allows Benson to gain knowledge in some topics. After completing module $i$, he will gain $u[i][j]$ knowledge in topic $j$.</p>

<p>Formally, let Benson&rsquo;s knowledge in topic $j$ be $p[j]$. Initially, $p[j] = 0$ for all $j$. He can only complete a module $i$ if $p[j] &ge; r[i][j]$ for every topic $j$. After completing module $i$, the value of $p[j]$ increases by $u[i][j]$ for each topic $j$.</p>

<p>Benson may complete the modules in any order, but each module may only be completed at most once. Help Benson determine the maximum number of modules he can complete.</p>

### 입력

<p>The first line of input contains $2$ space-separated integers, $n$ and $k$.</p>

<p>Then, $n$ lines will follow. The $i$-th ($1 &le; i &le; n$) of these lines contains $k$ spaced integers $r[i][1], r[i][2], \dots , r[i][k]$, denoting the knowledge requirements to complete module $i$.</p>

<p>Another $n$ lines follow. The $i$-th ($1 &le; i &le; n$) of these lines contains $k$ spaced integers $u[i][1], u[i][2], \dots , u[i][k]$, denoting the knowledge gained after completing module $i$.</p>

### 출력

<p>The output should contain one integer, the maximum number of modules Benson can complete.</p>

<p> </p>

### 제한

<ul>
	<li>$1 &le; n, k &le; 10^6$</li>
	<li>$n \cdot k &le; 10^6$</li>
	<li>$0 &le; u[i][j], r[i][j] &le; 10^9$ (for all $1 &le; i &le; n$ and $1 &le; j &le; k$).</li>
</ul>