# [Silver I] Histogram Sequence 4 - 25730

[문제 링크](https://www.acmicpc.net/problem/25730)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 329, 정답: 107, 맞힌 사람: 90, 정답 비율: 35.433%

### 분류

수학, 해 구성하기

### 문제 설명

<p>You had a histogram made of $N$ axis-parallel rectangles sharing a common baseline: the $i$-th rectangle from the left had a width $1$ and an integer height $H_i$.</p>

<p>Sadly, you lost your histogram! Moreover, you even forgot what your histogram looked like &mdash; the heights of the rectangles of the histogram. What you remember is the maximum area $A$ of the axis-parallel rectangle inside the histogram, and the fact that $L\le H_i\le R$ for every $H_i$.</p>

<p>Your goal is to recover the histogram by finding any histogram satisfying all the requirements that you remember. As your memory might not be perfect, there may be no histogram satisfying the requirements.</p>

### 입력

<p>The first and only line contains four space-separated integers, $N$, $A$, $L$, $R$.</p>

### 출력

<p>If there is no histogram satisfying the requirements, output <span style="color:#e74c3c;"><code>NO</code></span>.</p>

<p>Otherwise, output <span style="color:#e74c3c;"><code>YES</code></span> in the first line. In the second line, output $N$ integers in a single line, where the $i$-th value is the height $H_i$ of the $i$-th rectangle. If there are multiple answers, print any.</p>

### 제한

<ul>
	<li>$1\le N\le 500\, 000$</li>
	<li>$0\le A\le 10^{18}$</li>
	<li>$0\le L\le R\le 10^{18}$</li>
</ul>

### 힌트

<p>A histogram with heights $3,7,6,8,5,5$ is shown below. The maximum area rectangle inside the histogram has an area of $25$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f83b19d0-0a8a-4955-81bd-125f4331d949/-/preview/" style="max-width: 100%; width: 320px;" /></p>