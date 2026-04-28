# [Platinum IV] Balloon Warehouse - 15168

[문제 링크](https://www.acmicpc.net/problem/15168)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 512 MB

### 통계

제출: 108, 정답: 31, 맞힌 사람: 26, 정답 비율: 28.889%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15168.%E2%80%85Balloon%E2%80%85Warehouse/d748e12d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15168.%E2%80%85Balloon%E2%80%85Warehouse/d748e12d.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15168/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:109px; width:624px" /></p>

<p>Figure B.1: An infinitely long line of balloons</p>

<p>Darcy has taken over management of a balloon warehouse. Unfortunately, it stocks an infinite supply of balloons, so he has requested your help! At the start of today, the warehouse consists of an infinitely long line of white balloons. In this problem, we describe a coloured balloon by an integer whose value uniquely represents a particular colour, so initially (taking 0 to mean a white balloon) the contents of the line is given by</p>

<p style="text-align:center">0 0 0 . . .</p>

<p>Specific balloons are identified by their 0-indexed position in the line starting from the front of the line (0, 1, 2, . . . ).</p>

<p>Throughout the day, Darcy receives n deliveries of balloons from his supplier. The ith delivery consists of an infinite number of balloons of colour y and comes with the instruction (x, y). If there are any balloons of colour x in the line, then he should insert exactly one balloon of colour y into his infinitely long line immediately after each balloon of colour x already present in the line. Otherwise, he will send the balloons of colour y back.</p>

<p>After all the deliveries of the day are completed, Darcy receives one final instruction from his supplier to check if he has properly followed the instructions he was given: what colour are all the balloons in the positions between l (inclusive) and r (exclusive) in the line? You should help Darcy answer this question.</p>

<p>Consider an example day with four deliveries (0, 1),(1, 3),(0, 1),(1, 2) (for example, it may be that 1 means a blue balloon, 2 means a red balloon and 3 means a green balloon; 0 is white as above). At the end of the day, Darcy&rsquo;s line resembles the line of balloons in Figure B.1; we describe it by</p>

<p style="text-align:center">0 1 2 1 2 3 0 1 . . .</p>

<p>If he is asked for ℓ&nbsp;= 1 and r = 6, he should report the numbers 1 2 1 2 3 corresponding to blue, red, blue, red and green balloons in those positions in order.</p>

### 입력

<p>The first line of the input contains three integers n (1 &le; n &le; 200 000), which is the number of deliveries, ℓ&nbsp;and r (0 &le; ℓ &lt; r &le; 10<sup>6</sup> and r &minus; ℓ&nbsp;&le; 100 000), which are the positions between which to report the balloons&rsquo; colours at the end of the day.</p>

<p>The next n lines describe the deliveries. Each of these lines contain two distinct integers x (0 &le; x &lt; 200 000) and y (0 &le; y &lt; 200 000), which is the instruction for this delivery</p>

### 출력

<p>Display the colours of the balloons between positions ℓ&nbsp;(inclusive) and r (exclusive).</p>