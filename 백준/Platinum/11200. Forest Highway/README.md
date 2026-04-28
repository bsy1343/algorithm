# [Platinum I] Forest Highway - 11200

[문제 링크](https://www.acmicpc.net/problem/11200)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 43, 정답: 34, 맞힌 사람: 11, 정답 비율: 61.111%

### 분류

미적분학, 많은 조건 분기, 기하학, 그린 정리, 선분 교차 판정, 수학, 다각형의 넓이

### 문제 설명

<p>The Slovak Government is building a highway from Bratislava to Ko&scaron;ice. The highway will pass through a forest where a lot of animals live. Frog Gizela, the queen of the animals, wants to calculate the impact of the highway on their lives. Since the highway will be noisy, animals don&rsquo;t want to live within distance d from the highway. Gizela wants to know how large the inhabitable area will be. If the total inhabitable area of the forest is too small, Gizela will have to find a new forest for her kingdom.</p>

<p>You are given a description of the forest and the highway. The forest is a simple polygon, i.e. its sides do not cross, and the highway can be considered a straight line of width zero. You are also given d, the safe distance from the highway. Calculate the size of the inhabitable area of the forest.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11200.%E2%80%85Forest%E2%80%85Highway/473f80ce.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11200/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:223px; width:283px" /></p>

<p style="text-align: center;">Figure G.1: Drawing of the sample input</p>

### 입력

<p>The first line of the input contains one integer N (3 &le; N &le; 250 000) denoting the number of vertices of the polygon. N lines follow with two floating point numbers x<sub>i</sub> and y<sub>i</sub>, denoting that the i-th point of the polygon is (x<sub>i</sub>, y<sub>i</sub>).</p>

<p>Next line contains 4 floating point numbers x<sub>a</sub>, y<sub>a</sub>, x<sub>b</sub>, y<sub>b</sub>, denoting that the highway passes through points (x<sub>a</sub>, y<sub>a</sub>) and (x<sub>b</sub>, y<sub>b</sub>). The last line of the input contains one positive floating point number d, the safe distance from the highway.</p>

<p>All floating point numbers will be at most 100 000 in absolute value and will have at most 4 digits after the decimal point.</p>

### 출력

<p>Output one line with one number &ndash; the size of the inhabitable area of the forest. Results with relative or absolute error 10<sup>&minus;7</sup> will be considered correct.</p>