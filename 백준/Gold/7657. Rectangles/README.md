# [Gold II] Rectangles - 7657

[문제 링크](https://www.acmicpc.net/problem/7657)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 63, 정답: 23, 맞힌 사람: 15, 정답 비율: 32.609%

### 분류

다이나믹 프로그래밍, 정렬

### 문제 설명

<p>A rectangle in the Cartesian plane is specified by a pair of coordinates (\(x_1\), \(y_1\)) and (\(x_2\), \(y_2\)) indicating its lower-left and upper-right corners, respectively (where \(x_1\) &le; \(x_2\) and \(y_1\) &le; \(y_2\)). Given a pair of rectangles, \(A\) = ((\(x_1^A\), \(y_1^A\)), (\(x_2^A\), \(y_2^A\))) and \(B\) = ((\(x_1^B\), \(y_1^B\)), (\(x_2^B\), \(y_2^B\))), we write \(A\) ⪯ \(B\) (i.e., \(A\) &quot;precedes&quot; \(B\)), if</p>

<p style="text-align: center;">\(x_2^A\) &lt; \(x_1^B\) and \(y_2^A\) &lt; \(y_1^B\).</p>

<p>In this problem, you are given a collection of rectangles located in the two-dimension Euclidean plane. Find the length L of the longest sequence of rectangles (\(A_1\), \(A_2\), ..., \(A_L\)) from this collection such that</p>

<p style="text-align: center;">\(A_1\) ⪯ \(A_2\) ⪯ ... ⪯ \(A_L\).</p>

### 입력

<p>The input file will contain multiple test cases. Each test case will begin with a line containing a single integer \(n\) (where 1 &le; \(n\) &le; 1000), indicating the number of input rectangles. The next \(n\) lines each contain four integers \(x_1^i\) \(y_1^i\) \(x_2^i\) \(y_2^i\) (where &minus;1000000 &le; \(x_1^i\) &le; \(x_2^i\) &le; 1000000, &minus;1000000 &le; \(y_1^i\) &le; \(y_2^i\) &le; 1000000, and 1 &le; \(i\) &le; \(n\)), indicating the lower left and upper right corners of a rectangle. The end-of-file is denoted by a single line containing the integer 0.</p>

### 출력

<p>For each input test case, print a single integer indicating the length of the longest chain.</p>