# [Gold III] Geometry?! Why Not?? - 13847

[문제 링크](https://www.acmicpc.net/problem/13847)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 53, 정답: 17, 맞힌 사람: 16, 정답 비율: 40.000%

### 분류

수학, 기하학

### 문제 설명

<p>Consider a 2D path drawn in the following manner: Starting at the origin point, we can move only up or right. The path will be described as a string made of zero or more {&lsquo;U&rsquo;, &lsquo;R&rsquo;} letters. For each &lsquo;U&rsquo; we&rsquo;ll move one unit up, while &lsquo;R&rsquo; moves one unit to the right. In the following figure, the path constructed by the string RRRURRUUURRRRRUUR is drawn in a thick line.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13847/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-12-27%20%EC%98%A4%ED%9B%84%205.10.28.png" style="height:245px; width:380px" /><br />
Figure 1: Sample 2D Path</p>

<p>Imagine now that we draw a straight line that connects the origin point to the last point in the path (the line that is drawn in dots in the figure above). We want to compute the total area that falls between the straight line and the path (the grayed area in the above figure).</p>

### 입력

<p>The input consists of one or more test cases. Each case is described on a separate line. The path of each test case is described as a string made of one or more letters, each of which is either &lsquo;U&rsquo; or &lsquo;R&rsquo;, followed by the letter &lsquo;S&rsquo;.</p>

<p>All paths in the input can be drawn on a grid of size 1000 &times; 1000.</p>

<p>The last line of the input is made of a single &lsquo;S&rsquo; character and is not part of the test cases.</p>

### 출력

<p>For each case, write the area on a line. The area may have an arbitrary number of decimal digits, but may not contain an error greater than 10<sup>&minus;3</sup> .</p>