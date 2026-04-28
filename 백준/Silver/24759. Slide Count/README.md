# [Silver I] Slide Count - 24759

[문제 링크](https://www.acmicpc.net/problem/24759)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 35, 맞힌 사람: 34, 정답 비율: 85.000%

### 분류

구현, 시뮬레이션, 누적 합, 두 포인터, 슬라이딩 윈도우

### 문제 설명

<p>In your programming class, you are given an assignment to analyze an integer array using a sliding window algorithm. &nbsp;Specifically, given $N$ integers $w_1, \ldots, w_N$ and some constant $C$, the sliding window algorithm maintains start and end indices $s$ and $e$ such that</p>

<ul>
	<li>initially $s = e &nbsp;= 1$;</li>
	<li>as long as $s \leq N$:
	<ul>
		<li>if $e+1 &gt; N$, then increment $s$;</li>
		<li>else if $w_s + \cdots + w_{e+1} &gt; C$, then increment $s$;</li>
		<li>else increment $e$.</li>
	</ul>
	</li>
</ul>

<p>During the execution of this algorithm, each distinct pair of indices $(s,e)$ defines a window. &nbsp;An element $w_i$ belongs to the window defined by $(s,e)$ if $s \leq i \leq e$. &nbsp;Notice that if $s &gt; e$, the window is empty.</p>

<p>Consider the first sample input below. &nbsp;The windows appearing during the execution of the algorithm are defined by $(1,1)$, $(1,2)$, $(1,3)$, $(2,3)$, $(3,3)$, $(3,4)$, $(4,4)$, $(5,4)$, $(5,5)$, and $(6,5)$.</p>

<p>For each element $w_i$, determine how many different windows it belongs to during the execution of the sliding window algorithm.</p>

### 입력

<p>The first line of input contains two integers $N$ ($1 \leq N \leq 100\,000$), which is the number of elements, and $C$ ($1 \leq C \leq 1\,000\,000$), which is the sliding window constant.&nbsp;</p>

<p>The next line contains $N$ integers $w_1, \ldots, w_N$ ($0 \leq w_i \leq C$).</p>

### 출력

<p>For each element, in order, display the number of different windows it belongs to during the execution of the algorithm.</p>