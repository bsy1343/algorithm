# [Bronze I] Rectangle and Squares - 13035

[문제 링크](https://www.acmicpc.net/problem/13035)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 362, 정답: 104, 맞힌 사람: 97, 정답 비율: 29.573%

### 분류

수학, 사칙연산

### 문제 설명

<p>Elijah came to visit his friend Phil and noticed that Phil owns an incredibly beautiful rectangle with sides A and B. Elijah realized that he had always dreamed about a rectangle of such area.</p>

<p>After returning to his home Elijah has found out that he has a lot of squares of size C &times; C. He would like to construct a rectangle out of such squares that would have area as close as possible to the area of the Phil&#39;s rectangle. Namely, he wants to minimize the absolute difference between Phil&#39;s rectangle&#39;s area and his rectangle&#39;s area.</p>

<p>Elijah would put squares with sides parallel to each other without gaps and overlapping. He would use at least one square.</p>

<p>For example, if Phil has 4 &times; 5 rectangle and Elijah has 3 &times; 3 squares, the rectangle with the closest area to Phil&#39;s one that Elijah can construct is 3 &times; 6.</p>

### 입력

<p>Input data contains several test cases. The first line contains the number of test cases t (1 &le; t &le; 10000).</p>

<p>Each test case is described with three integers in one line: A, B and C (1 &le; A, B, C &le; 10<sup>9</sup>).</p>

### 출력

<p>For each test print one line: the area of the rectangle that Elijah would construct out of his squares, that has the closest possible area to the Phil&#39;s rectangle.</p>

<p>If there are several possible optimal answers, output any one.</p>