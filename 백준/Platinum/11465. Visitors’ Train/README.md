# [Platinum III] Visitors’ Train - 11465

[문제 링크](https://www.acmicpc.net/problem/11465)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 10, 정답: 2, 맞힌 사람: 2, 정답 비율: 20.000%

### 분류

정렬, 기하학, 많은 조건 분기, 선분 교차 판정

### 문제 설명

<p>An aviary or a flight cage is a big cage for birds. An usual ZOO aviary typically measures tens of meters in diameter. In the aviaries, the birds can fly around and live in conditions imitating the conditions in the wild as closely as possible. At least in theory. There is one main big and spectacular aviary in the ZOO and some other less important ones.</p>

<p>The ZOO is planning to build a short straight electric train track to help visitors to move easily from one part of the ZOO to another. It has to be decided which of the free areas of the ZOO will the track run through. The director had noticed during his trips to other ZOOs that the visitors are more happy when they can take more photos of important ZOO structures. Now he wants to measure the quality of the planned railway by this parameter. The most important structure in the vicinity of the track will be the main aviary. The director worries that the main aviary might be obscured by the less important aviaries along the track and the visitors might be less happy. Help the director to assess the quality of the planned track.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11465.%E2%80%85Visitors%E2%80%99%E2%80%85Train/17c2ab25.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11465/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:280px; width:267px" /></p>

<p>You are given the coordinates of all aviaries. Also, you are given the coordinates of the start and the end of the planned railway track. Find the total length of the segments on the track from which the main aviary is visible and is not obscured, even not partially, by any other aviary. We suppose that the visitors can look out from the train in any direction.</p>

### 입력

<p>There are more test cases. Each case occupies more lines. The first line contains number N (1 &le; N &le; 100) of the aviaries. Next line contains the coordinates of the planned railway track in the format x<sub>1</sub> y<sub>1</sub> x<sub>2</sub> y<sub>2</sub> where [x<sub>1</sub>, y<sub>1</sub>] and [x<sub>2</sub>, y<sub>2</sub>] are the coordinates of the start and the end of the track. The track is considered to be infinitely thin in this representation. Next, there are N lines specifying the aviaries, each aviary is represented as a rectangle with nonzero area. Each of these lines specifies the coordinates of an aviary in the form x<sub>1</sub> y<sub>1</sub> x<sub>2</sub> y<sub>2</sub> x<sub>3</sub> y<sub>3</sub> x<sub>4</sub> y<sub>4</sub>, where [x<sub>1</sub>, y<sub>1</sub>], [x<sub>2</sub>, y<sub>2</sub>], [x<sub>3</sub>, y<sub>3</sub>], and [x<sub>4</sub>, y<sub>4</sub>] are the coordinates of the aviary corners. The corners are presented in clockwise or anti-clockwise order. The main aviary is listed first. All coordinates are integers, their absolute value is less than 10 000. You may assume that no aviary intersects or touches the track or another aviary. There is no blank line between consecutive test cases. The input is terminated by a line with one zero.</p>

### 출력

<p>For each test case print on a separate line the total length L of all segments of the planned track from which the main aviary is visible and it is not obscured, even not partially, by any other aviary. Your answer should not differ from the correct answer by more than 10<sup>&minus;4</sup>.</p>

<p>As shown in the third Sample Input, the main aviary is not considered obscured if only its corners/edges are hidden.</p>