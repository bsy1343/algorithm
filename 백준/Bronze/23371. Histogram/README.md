# [Bronze I] Histogram - 23371

[문제 링크](https://www.acmicpc.net/problem/23371)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 160, 정답: 124, 맞힌 사람: 117, 정답 비율: 76.974%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>The term &quot;histogram&quot; was first introduced in 1895 by Karl Pearson. This is also the year that the portable electric drill was invented. It may not be a coincidence that we speak about &quot;data drilling&quot; today. Most things back then were not electric however, and histograms were still hand crafted. Nowadays, we like things electric and automated. The Bureaucratic Affiliation for Printing Charts needs to create a lot of histograms for a lot of data points, so they come to you for help to automate the printing of histograms.</p>

<p>Given a list of data points, print a histogram.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing three integers $n$, $s$, and $k$ ($1 \leq n, s, k \leq 1000$), the number of bins, the size per bin, and the number of data points, respectively.</li>
	<li>One line containing $k$ integer data points $x$ ($1 \leq x \leq n \cdot s$).</li>
</ul>

### 출력

<p>Output the histogram. That is, write a rectangle of characters. The rectangle should be as wide as the number of bins. Each column of the rectangle should have&nbsp;</p>

<ul>
	<li>a &quot;<code>-</code>&quot; at the bottom;</li>
	<li>on top of that, as many &quot;<code>#</code>&quot; as there are items in the bin;</li>
	<li>on top of that, as many &quot;<code>.</code>&quot; as are needed to fill out the rectangle.</li>
</ul>

<p>The rectangle should be just high enough to display a &quot;<code>#</code>&quot; for each element in every bin, but no higher.</p>