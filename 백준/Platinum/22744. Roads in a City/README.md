# [Platinum II] Roads in a City - 22744

[문제 링크](https://www.acmicpc.net/problem/22744)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 36, 정답: 4, 맞힌 사람: 1, 정답 비율: 4.000%

### 분류

수학, 기하학, 스위핑, 수치해석

### 문제 설명

<p>Roads in a city play important roles in development of the city. Once a road is built, people start their living around the road. A broader road has a bigger capacity, that is, people can live on a wider area around the road.</p>

<p>Interstellar Conglomerate of Plantation and Colonization (ICPC) is now planning to develop roads on a new territory. The new territory is a square and is completely clear. ICPC has already made several plans, but there are some difficulties in judging which plan is the best.</p>

<p>Therefore, ICPC has collected several great programmers including you, and asked them to write programs that compute several metrics for each plan. Fortunately your task is a rather simple one. You are asked to compute the area where people can live from the given information about the locations and the capacities of the roads.</p>

<p>The following figure shows the first plan given as the sample input.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22744.%E2%80%85Roads%E2%80%85in%E2%80%85a%E2%80%85City/c1e12c4b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22744.%E2%80%85Roads%E2%80%85in%E2%80%85a%E2%80%85City/c1e12c4b.png" data-original-src="https://upload.acmicpc.net/14ee2547-5431-486d-950a-ef458f9243eb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 123px; height: 123px;" /></p>

<p style="text-align: center;">Figure 1: The first plan given as the sample input</p>

### 입력

<p>The input consists of a number of plans. The first line of each plan denotes the number&nbsp;<i>n</i>&nbsp;of roads (<i>n</i>&nbsp;&le; 50), and the following&nbsp;<i>n</i>&nbsp;lines provide five integers&nbsp;<i>x</i><sub>1</sub>,&nbsp;<i>y</i><sub>1</sub>,&nbsp;<i>x</i><sub>2</sub>,&nbsp;<i>y</i><sub>2</sub>, and&nbsp;<i>r</i>, separated by a space. (<i>x</i><sub>1</sub>,&nbsp;<i>y</i><sub>1</sub>&nbsp;) and (<i>x</i><sub>2</sub>,&nbsp;<i>y</i><sub>2</sub>) denote the two endpoints of a road (-15 &le;&nbsp;<i>x</i><sub>1</sub>,&nbsp;<i>y</i><sub>1</sub>,&nbsp;<i>x</i><sub>2</sub>,&nbsp;<i>y</i><sub>2</sub>&nbsp;&le; 15), and the value&nbsp;<i>r</i>&nbsp;denotes the capacity that is represented by the maximum distance from the road where people can live (<i>r</i>&nbsp;&le; 10).</p>

<p>The end of the input is indicated by a line that contains only a single zero.</p>

<p>The territory is located at -5 &le;&nbsp;<i>x</i>,&nbsp;<i>y</i>&nbsp;&le; 5. You may assume that each road forms a straight line segment and that any lines do not degenerate.</p>

### 출력

<p>Print the area where people can live in one line for each plan. You may print an arbitrary number of digits after the decimal points, provided that difference from the exact answer is not greater than 0.01.</p>