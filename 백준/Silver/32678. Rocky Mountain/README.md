# [Silver III] Rocky Mountain - 32678

[문제 링크](https://www.acmicpc.net/problem/32678)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 16, 맞힌 사람: 16, 정답 비율: 45.714%

### 분류

기하학, 다이나믹 프로그래밍

### 문제 설명

<p>The Rocky Mountain Cable (RMC) company is planning to run cables from the top peak of the Rocky Mountains to lower points in the mountain range, so that cable cars can be used to transport tourists to the highest peak.  A cable must connect from one of the potential sites to the highest peak in a straight line, but the cable cannot cross any part of the mountain range.  However, the cable may coincide with a slope.</p>

<p>In order to serve the most number of tourists, it is desirable to connect the cable from the highest peak to the lowest possible site.  Help the company determine the best possible site on the left and the right of the highest peak.  If there are ties, choose the leftmost site on the left, and the rightmost site on the right.</p>

<p>The mountain range is specified by $N$ sites $(x_i, y_i)$. One of these sites is the unique highest peak $(x_p, y_p)$ such that $1 &lt; p &lt; N$ and $y_p &gt; y_i$ for all $i \neq p$.  Note that the highest peak cannot be the first or the last site.  The entire mountain range is described by straight line segments connecting $(x_i, y_i)$ to $(x_{i+1}, y_{i+1})$ for $1 \leq i &lt; N$, such that $x_i &lt; x_{i+1}$.</p>

### 입력

<p>The first line of input contains the integer $N$ ($3 \leq N \leq 5 \cdot 10^5$) which is the number of sites.  The next $N$ lines each contains two integers $x_i$ and $y_i$, specifying the $N$ sites.  The coordinates satisfy $0 \leq x_i, y_i \leq 10^9$. It is guaranteed that there is a unique highest peak, and that $x_i &lt; x_{i+1}$ for all $1 \leq i &lt; N$.</p>

### 출력

<p>On the first line, output the coordinates of the best site to the left of the highest peak.  On the second line, output the coordinates of the best site to the right of the highest peak.</p>