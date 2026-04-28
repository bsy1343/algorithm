# [Gold IV] Cameron’s Crazy Circles - 26351

[문제 링크](https://www.acmicpc.net/problem/26351)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 30, 정답: 16, 맞힌 사람: 14, 정답 비율: 53.846%

### 분류

기하학, 수학

### 문제 설명

<p>Your cousin Cameron loves circles and has created a rather tantalizing geometry problem, involving an infinite number of circles. He also loves triangles, but he loves circles even more. His problem starts with inscribing a circle in a right triangle as shown below:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/19c0dbf5-b915-45fe-aa1b-e2cb5ae7f20a/-/preview/" style="width: 111px; height: 69px;" /></p>

<p>Most circle and triangle lovers would stop here, but Cameron is curious what happens if you inscribe a second circle in between the longer leg of the triangle, the hypotenuse and the previous circle (without circles overlapping each other):</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/7b3c0c92-a8f1-4635-854c-54cee879bec7/-/preview/" style="width: 111px; height: 69px;" /></p>

<p>In fact, it turns out that you could continue this process an infinitum, inscribing a new circle in between the longer leg, the hypotenuse and the previous circle.</p>

<p>Given the lengths of the two legs of the right triangle, determine the ratio of the area of all the (infinite number of) circles along the longer leg to the area of the original right triangle.</p>

### 입력

<p>The first input line contains a single positive integer, n, indicating the number of triangles to solve. Each of the following n input lines will contain one test case. Each input case will be two positive integers, L<sub>1</sub> and L<sub>2</sub>, separated by spaces, where L<sub>1</sub> &lt; L<sub>2</sub> &lt; 10000; these are the two legs of a right triangle.</p>

### 출력

<p>For each test case, first output &ldquo;Case #i:&rdquo; where i is the test case number, starting with 1. Then, output the correct ratio for the case, printed to 4 decimal places, rounded to the nearest tenthousandth (e.g., 0.00113 should round to 0.0011, 0.00115 should round to 0.0012, and 0.00117 should round to 0.0012). Answers will be judged as correct if they are within 0.0001 of the judge&rsquo;s answer.</p>

<p>Leave a blank line after the output for each test case. Follow the format illustrated in Sample Output.</p>