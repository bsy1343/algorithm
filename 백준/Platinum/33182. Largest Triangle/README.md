# [Platinum III] Largest Triangle - 33182

[문제 링크](https://www.acmicpc.net/problem/33182)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 11, 정답: 11, 맞힌 사람: 10, 정답 비율: 100.000%

### 분류

기하학, 볼록 껍질, 스택, 자료 구조

### 문제 설명

<p>A “terrain” is an $x$-monotone polygon defined by the points $p_1, \dots , p_n$ where each point $p_i$ has coordinates $(x_i , y_i)$, and the following three conditions hold:</p>

<ul>
	<li>$y_1 = y_n = 0$</li>
	<li>$y_i &gt; 0$ for $1 &lt; i &lt; n$</li>
	<li>$x_i &lt; x_{i+1}$ for $1 \le i &lt; n$</li>
</ul>

<p>Given a terrain defined by the points $p_1, \dots , p_n$, find the largest triangle that fits entirely within the terrain, and one of its three vertices is positioned at one of the terrain points $p_2$ through $p_{n-1}$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33182.%E2%80%85Largest%E2%80%85Triangle/a316cc20.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33182-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 239px;"></p>

### 입력

<p>The first line of input contains an integer $n$, representing the number of points in the terrain ($3 \le n \le 10^5$). The $i$<sup>th</sup> line in the following $n$ lines consists of two space-separated integers $x_i$ and $y_i$, representing the point $p_i$ of the terrain ($0 \le x_i , y_i \le 10^9$).</p>

### 출력

<p>Print the area of the largest triangle contained within the terrain. Your output will be considered correct if its absolute or relative error is at most $10^{-6}$.</p>