# [Platinum V] Thirsty Professors - 25844

[문제 링크](https://www.acmicpc.net/problem/25844)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 6, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

기하학, 선분 교차 판정

### 문제 설명

<p>Dr. Orooji and Dr. Meade were lost in a desert and they were extremely thirsty. They each had a stick so they decided that they can form a shape (e.g., &ldquo;V&rdquo; shape, &ldquo;X&rdquo; shape, etc.) facing the skies and, when it rains, water would collect in the top part of the shape and then they can drink it; please see the picture on the next page.</p>

<p>Making the shape would be easier if one person holds both sticks but neither professor was willing to give up his stick. So, they tried to form the shape together, each holding one stick. And, we know how coordinated the professors can be!</p>

<p>Given two line segments, the first line with positive slope and the second line with negative slope, compute the area for water collection. When checking for intersecting (touching), if two points are within 10<sup>-6</sup> of each other, consider the points the same.</p>

### 입력

<p>There are two input lines, each describing a line segment. The first input line contains four integers (0 &lt; x1, y1, x2, y2 &lt; 1,000; x2 &gt; x1 and y2 &gt; y1), describing the first stick. The second input line contains four integers (0 &lt; x3, y3, x4, y4 &lt; 1,000; x4 &lt; x3 and y4 &gt; y3), describing the second stick. Note that neither line segment will be parallel to x-axis or parallel to y-axis.</p>

### 출력

<p>Print the area for water collection. Your output may have any number of digits after the decimal point; answers within 10<sup>-5</sup> absolute or relative of the judge output will be considered correct.</p>

<p>Note that, as illustrated in the second Sample Input/Output, if the two line segments do not intersect, it will not be possible for the water to collect and, as such, the output will be zero.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25844.%E2%80%85Thirsty%E2%80%85Professors/ec7f9ccf.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25844.%E2%80%85Thirsty%E2%80%85Professors/ec7f9ccf.png" data-original-src="https://upload.acmicpc.net/eaa8107b-8681-4a75-ab88-d368571e4c59/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 223px; height: 300px;" /></p>