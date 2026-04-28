# [Gold II] T-shirts - 21331

[문제 링크](https://www.acmicpc.net/problem/21331)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 50, 정답: 13, 맞힌 사람: 12, 정답 비율: 26.667%

### 분류

값 / 좌표 압축, 자료 구조, 그리디 알고리즘, 우선순위 큐, 정렬, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>During the Programming Olympiad finals, each of the $N$ contestants is always given a t-shirt as is customary. However, the judges are sometimes a bit stressed out with making last minute changes to the problem sets (only changes, mind you -- the judges never wait until the day before the contest to make a problem).</p>

<p>This means that when the judges order the t-shirts, they may not look <em>that</em> carefully on what t-shirt sizes the contestants have. After all, who can distinguish a size <code>XS</code> t-shirt from an <code>XL</code> t-shirt? The judges certainly couldn&#39;t, but it appears that the contestants can when they try putting their new t-shirts on. Since the judges never learn to plan properly, this will surely be a problem next year as well. But right now it is <em>your</em> problem.</p>

<p>While each contestant has a preferred size, they can wear t-shirts in an interval of sizes. More specifically, the $i$:th contestant (starting from 0) can wear a t-shirt in any size at least $L[i]$ but at most $H[i]$ (both limits inclusive). Here, each size has been assigned an integer so that a higher integer means a larger size. Your task is to assign t-shirts to the contestants, so that as many contestants as possible will get a t-shirt that he or she can wear. The judges have ordered exactly $N$ t-shirts, and the size of the $i$:th t-shirt is $T[i]$.</p>

### 입력

<p>The sample judge reads input in the following format:</p>

<ul>
	<li>line $1$: <code>N</code></li>
	<li>line $2$: <code>L[0] L[1] .. L[N - 1]</code></li>
	<li>line $3$: <code>H[0] H[1] .. H[N - 1]</code></li>
	<li>line $4$: <code>T[0] T[1] .. T[N - 1]</code></li>
</ul>

### 출력

<p>The judge writes a single line containing the return value of <code>tshirt(N, L, H, T)</code>.</p>

### 제한

<ul>
	<li>$1 \le N \le 100\,000$</li>
	<li>$0 \le T[i] \le 10^9$</li>
</ul>