# [Platinum V] Everything Has Changed - 18561

[문제 링크](https://www.acmicpc.net/problem/18561)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 25, 맞힌 사람: 15, 정답 비율: 65.217%

### 분류

기하학

### 문제 설명

<p>Edward is a worker for Aluminum Cyclic Machinery. His work is operating mechanical arms to cut out designed models. Here is a brief introduction to his work.</p>

<p>Assume the operating plane as a two-dimensional coordinate system. At first, there is a disc with center coordinates (0, 0) and radius R. Then, m mechanical arms will cut and erase everything within its area of influence simultaneously, the i-th area of which is a circle with center coordinates (x<sub>i</sub>, y<sub>i</sub>) and radius r<sub>i</sub> (i = 1, 2, . . . , m). In order to obtain considerable models, it is guaranteed that every two cutting areas have no intersection and no cutting area contains the whole disc.</p>

<p>Your task is to determine the perimeter of the remaining area of the disc excluding internal perimeter.</p>

<p>Here is an illustration of the sample, in which the red curve is counted but the green curve is not.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f56a4c1e-42b7-4fba-a476-4a8985f8db15/-/preview/" style="width: 300px; height: 250px;" /></p>

### 입력

<p>The first line contains one integer T, indicating the number of test cases.</p>

<p>The following lines describe all the test cases. For each test case:</p>

<p>The first line contains two integers m and R.</p>

<p>The i-th line of the following m lines contains three integers x<sub>i</sub>, y<sub>i</sub> and r<sub>i</sub>, indicating a cutting area.</p>

<p>1 &le; T &le; 1000, 1 &le; m &le; 100, &minus;1000 &le; x<sub>i</sub>, y<sub>i</sub> &le; 1000, 1 &le; R, r<sub>i</sub> &le; 1000 (i = 1, 2, . . . , m).</p>

### 출력

<p>For each test case, print the perimeter of the remaining area in one line. Your answer is considered correct if its absolute or relative error does not exceed 10<sup>&minus;6</sup>.</p>

<p>Formally, let your answer be a and the jury&rsquo;s answer be b. Your answer is considered correct if |a&minus;b|/max(1,|b|) &le; 10<sup>&minus;6</sup>.</p>