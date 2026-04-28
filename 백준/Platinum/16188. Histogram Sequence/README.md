# [Platinum I] Histogram Sequence - 16188

[문제 링크](https://www.acmicpc.net/problem/16188)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 166, 정답: 42, 맞힌 사람: 39, 정답 비율: 30.233%

### 분류

이분 탐색

### 문제 설명

<p>A histogram is a polygon made by aligning $N$ adjacent rectangles that share a common base line. Each rectangle is called a <em>bar</em>. The $i$-th bar from the left has width 1 and height $H_i$.</p>

<p>&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16188.%E2%80%85Histogram%E2%80%85Sequence/5edd9e18.png" data-original-src="https://upload.acmicpc.net/5bdbc7e9-2533-41bd-8d85-89df57773115/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><em><strong>Figure</strong>: This picture depicts a case when $N = 9$ and $H = [7,\ 4,\ 3,\ 5,\ 4,\ 2,\ 5,\ 1,\ 2]$</em>.</p>

<p style="text-align: center;">&nbsp;</p>

<p>One day, you wanted to find the area of the largest rectangle contained in the given histogram. What you did was to make a list of integers $A$ by the following procedure:</p>

<ul>
	<li>For each $1 \le i \le j \le N$, calculate the largest area of the rectangle contained in the histogram, where the rectangle&#39;s base line coincides with the base line of the $i,\ i+1,\ \cdots,\ j-1,\ j$-th bar. Add the area to the list $A$.</li>
</ul>

<p>&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16188.%E2%80%85Histogram%E2%80%85Sequence/2f390456.png" data-original-src="https://upload.acmicpc.net/21407dc0-d31f-4fab-8c3f-aa24d3bcbcd8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><em><strong>Figure</strong>: This picture depicts a case when $i = 3$ and $j = 5$. The area is 9.</em></p>

<p>&nbsp;</p>

<p>The length of the list $A$ is exactly $\frac{N(N+1)}{2}$ since you chose each pair $(i,\ j)$ exactly once. To make your life easier, you sorted the list $A$ in non-decreasing order. Now, to find the largest area of the rectangle contained in the histogram, you just need to read the last element of $A$, $A_{N(N+1)/2}$.</p>

<p>However, you are not satisfied with this at all, so I decided to let you compute some part of the list $A$. You have to write a program that, given two indices $L$ and $R$ ($L \le R$), calculate the values $A_{L\cdots R}$, i.e. $A_{L},\ A_{L+1},\ \cdots,\ A_{R-1},\ A_{R}$.</p>

### 입력

<p>The first line of the input contains an integer $N$ ($1 \le N \le 300,000$) which is the number of bars in the histogram.</p>

<p>The next line contains $N$ space-separated positive integers $H_1,\ H_2,\ \cdots,\ H_N$ ($1 \le H_i \le 10^9$), where $H_i$ is the height of the $i$-th bar.</p>

<p>The last line contains two integers $L$ and $R$ ($1 \le L \le R \le \frac{N(N+1)}{2}$, $R - L + 1 \le 300,000$).</p>

### 출력

<p>Print $R - L + 1$ integers. The $j$-th ($1 \le j \le R-L+1$) of them should be the $(L+j-1)$-th element of the list $A$, i.e. $A_{L+j-1}$.</p>