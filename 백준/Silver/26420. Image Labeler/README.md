# [Silver IV] Image Labeler - 26420

[문제 링크](https://www.acmicpc.net/problem/26420)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 99, 정답: 64, 맞힌 사람: 40, 정답 비율: 67.797%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Crowdsource is organizing a campaign for <a href="https://goo.gle/crowdsource-ks-imagelabeler" target="_blank">Image Labeler task </a>with participants across $\mathbf{N}$ regions. The number of participants from each of these regions are represented by $\mathbf{A_1}, \mathbf{A_2}, \dots, \mathbf{A_N}$.</p>

<p>In the Image Labeler task, there are $\mathbf{M}$ categories. Crowdsource assigns participants to these categories in such a way that all participants from a region are assigned to the same category, and each category has <i>at least</i> one region assigned to it. The success metric of the campaign is measured by the sum of <a href="https://en.wikipedia.org/wiki/Median" target="_blank">medians </a>of the number of participants in each category. (Let us remind you here that the median of a list of integers is the &quot;middle&quot; number when those numbers are sorted from smallest to largest. When the number of integers in a list is even, we have two &quot;middle&quot; numbers, therefore the median is defined as the arithmetic mean (average) of the two middle values.)</p>

<p>For example, imagine that we have $\mathbf{N}=3$ regions with $\mathbf{A_1}=5$, $\mathbf{A_2}=8$, and $\mathbf{A_3}=9$ participants respectively and we want to assign them to $\mathbf{M}=2$ categories. If we assign regions $2$ and $3$ to category $1$ and region $1$ to category $2$, then the success metric would be median of $\{A_2=8, A_3=9\}\ + $ median of $\{A_1=5\} = \frac{8 + 9}{2} + 5 = 8.5 + 5 = 13.5$. We can also assign regions $1$ and $2$ to category $1$ and region $3$ to category $2$. Then the success metric would be equal to the sum of the median of $\{A_1=5, A_2=8\}$ and the median of $\{A_3=9\}$, which is $\frac{5+8}{2} + 9 = 6.5 + 9 = 15.5$.</p>

<p>Your task is to find the maximum possible value of the success metric that can be obtained by assigning participants in regions to the categories.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow.</p>

<p>The first line of each test case contains two integers $\mathbf{N}$ and $\mathbf{M}$: the number of regions, and the number of categories respectively.</p>

<p>The next line contains $\mathbf{N}$ integers $\mathbf{A_1}, \mathbf{A_2}, \dots, \mathbf{A_N}$.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the maximum possible value of the success metric.</p>

<p>$y$ will be considered correct if it is within an absolute or relative error of $10^{-6}$ of the correct answer. See the <a href="https://codingcompetitions.withgoogle.com/kickstart/faq#competing">FAQ</a> for an explanation of what that means, and what formats of real numbers we accept.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$1 \le \mathbf{N} \le 10^4$.</li>
	<li>$1 \le \mathbf{M} \le 10^4$.</li>
	<li>$1 \le \mathbf{M} \le \mathbf{N}$.</li>
	<li>$1 \le \mathbf{A_i} \le 10^5$, for all $i$.</li>
</ul>