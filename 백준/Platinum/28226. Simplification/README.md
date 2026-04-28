# [Platinum IV] Simplification - 28226

[문제 링크](https://www.acmicpc.net/problem/28226)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 42, 정답: 24, 맞힌 사람: 18, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 기하학

### 문제 설명

<p>Amin records the price of his stock every now and then as a data point (t<sub>i</sub>, p<sub>i</sub>) in his notebook, where p<sub>i</sub> is the price of his stock at day t<sub>i</sub>. The sequence of these data points represents a piecewise-linear function F displaying the history of prices over a period of time. Indeed, F connects every pair of consecutive points by a straight line segment. If the price is not recorded for some day t, F(t) can be used as an estimate instead.</p>

<p>His collected data is getting larger and larger as he has been tracking the price of his stock over a long period of time. Therefore, he has decided to reduce his data by throwing away some of his recoded data points and constructing a new piecewise-linear function F&prime; with the remaining points. F&prime; is a so-called &ldquo;simplification&rdquo; of F. Amin wants to create the simplification in such a way that F&prime; is a good approximation for F. To this end, he has defined an error measure as follows.</p>

<p>Let F be defined over a strictly increasing sequence L = &lang;t<sub>1</sub>, ..., t<sub>n</sub>&rang; of days, and F&prime; be defined over a subsequence L&prime; = &lang;t&prime;<sub>1</sub> , ..., t&prime;<sub>m</sub>&rang; of L, where t&prime;<sub>1</sub> = t<sub>1</sub>, t&prime;<sub>m</sub> = t<sub>n</sub>, and F&prime;(t&prime;<sub>i</sub> ) = F(t&prime;<sub>i</sub> ) for 1 ⩽ i ⩽ m. (We call m the size of F&prime;.) The error of F&prime; is defined as the maximum of |F&prime;(t<sub>k</sub>) &minus; F(t<sub>k</sub>)| for all 1 ⩽ k ⩽ n. For example, in the following figure, we have 6 data points, labeled 1 through 6, whose coordinates are the same as those presented in the second sample input, and F&prime; is a simplification of F of size 3 with data points 1, 4 and 6. In this figure, F is depicted by solid lines, and F&prime; by dashed lines. The error measure for F&prime; is realized by the vertical distance of point 2 to F&prime; .</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28226.%E2%80%85Simplification/ffa840b3.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/28226.%E2%80%85Simplification/ffa840b3.png" data-original-src="https://upload.acmicpc.net/62bedd4c-7f52-40fc-a972-c17ba9f17543/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 423px; height: 196px;" /></p>

<p>Amin&rsquo;s goal is to minimize the size of F&prime;, while the error of F&prime; is bounded by a given value &delta;.</p>

### 입력

<p>The first line of input contains a positive integer n (2 ⩽ n ⩽ 2000) that shows the size of F. Each of the next n lines contains two integers t<sub>i</sub>, p<sub>i</sub> (1 ⩽ t<sub>i</sub>, p<sub>i</sub> ⩽ 10<sup>6</sup>), where p<sub>i</sub> is the price of the stock at day t<sub>i</sub>. The last line contains the error limit &delta; which is a non-negative integer at most 10<sup>6</sup>.</p>

### 출력

<p>In the output, print the minimum possible size of F&prime;.</p>