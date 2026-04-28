# [Gold II] Tom and Jerry - 11792

[문제 링크](https://www.acmicpc.net/problem/11792)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 205, 정답: 116, 맞힌 사람: 83, 정답 비율: 58.451%

### 분류

수학, 미적분학

### 문제 설명

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11792/1.png" style="float:left; height:236px; width:222px" />Tom and Jerry are very fond of cat and mice games, which might be rather obvious to you. Today they are playing a very complicated game. The goals are simple as usual though, Jerry would be running and Tom would have to catch Jerry.</p>

<p>However, today Jerry is running on a perfect circular path with radius R meters, at a constant speed of V m/s. Initially Tom is sitting at the very center of the circle. He wants to catch Jerry as soon as possible, but we all know, Tom is not very intelligent. Instead of calculating an optimal direction to catch Jerry, he is just running towards Jerry.</p>

<p>As Jerry is also moving, the path Tom has taken start to look like a curve (see picture above). At any given moment, Tom&rsquo;s position is between Jerry&rsquo;s current position and the center of the circle. Tom is also moving at a constant speed of V m/s, same speed as Jerry. Find the time (in seconds) Tom would need to catch Jerry.&nbsp;</p>

### 입력

<p>Input file has T (T &lt;= 10000) test cases, each case consists of two integer R and V. Here, 0 &lt; R, V &lt;= 10000.&nbsp;</p>

### 출력

<p>For each test case, print the case number and the time Tom will need to catch Jerry. Floating point rounding error lower than 1e-5 will be ignored by the judge.&nbsp;</p>