# [Platinum I] The Closest Circle - 22734

[문제 링크](https://www.acmicpc.net/problem/22734)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 206, 정답: 49, 맞힌 사람: 25, 정답 비율: 16.340%

### 분류

기하학, 이분 탐색, 집합과 맵, 분할 정복

### 문제 설명

<p>You are given&nbsp;<i>N</i>&nbsp;non-overlapping circles in xy-plane. The radius of each circle varies, but the radius of the largest circle is not double longer than that of the smallest.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22734.%E2%80%85The%E2%80%85Closest%E2%80%85Circle/fa53d560.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22734.%E2%80%85The%E2%80%85Closest%E2%80%85Circle/fa53d560.png" data-original-src="https://upload.acmicpc.net/adc4d493-fcfa-4b43-8265-ffb340740106/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 251px; height: 226px;" /></p>

<p style="text-align: center;">Figure 1: The Sample Input</p>

<p>The distance between two circles&nbsp;<i>C</i><sub>1</sub>&nbsp;and&nbsp;<i>C</i><sub>2</sub>&nbsp;is given by the usual formula</p>

<p>$$\sqrt{(x_1 - x_2)^2 + (y_1 - y_2)^2} - r_1 - r_2$$</p>

<p>where (<i>x<sub>i</sub></i>,&nbsp;<i>y<sub>i</sub></i>) is the coordinates of the center of the circle&nbsp;<i>C<sub>i</sub></i>, and&nbsp;<i>r<sub>i</sub></i>&nbsp;is the radius of&nbsp;<i>C<sub>i</sub></i>, for&nbsp;<i>i</i>&nbsp;= 1, 2.</p>

<p>Your task is to write a program that finds the closest pair of circles and print their distance.</p>

### 입력

<p>The input consists of a series of test cases, followed by a single line only containing a single zero, which indicates the end of input.</p>

<p>Each test case begins with a line containing an integer&nbsp;<i>N</i>&nbsp;(2 &le;&nbsp;<i>N</i>&nbsp;&le; 100000), which indicates the number of circles in the test case.&nbsp;<i>N</i>&nbsp;lines describing the circles follow. Each of the&nbsp;<i>N</i>&nbsp;lines has three decimal numbers&nbsp;<i>R</i>,&nbsp;<i>X</i>, and&nbsp;<i>Y</i>. R represents the radius of the circle.&nbsp;<i>X</i>&nbsp;and&nbsp;<i>Y</i>&nbsp;represent the&nbsp;<i>x</i>- and&nbsp;<i>y</i>-coordinates of the center of the circle, respectively.</p>

### 출력

<p>For each test case, print the distance between the closest circles. You may print any number of digits after the decimal point, but the error must not exceed 0.00001.</p>