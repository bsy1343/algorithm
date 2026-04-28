# [Platinum II] Handing out Balloons - 23725

[문제 링크](https://www.acmicpc.net/problem/23725)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 66, 정답: 23, 맞힌 사람: 15, 정답 비율: 40.541%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23725.%E2%80%85Handing%E2%80%85out%E2%80%85Balloons/731f2341.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/23725.%E2%80%85Handing%E2%80%85out%E2%80%85Balloons/731f2341.png" data-original-src="https://upload.acmicpc.net/0f699c95-45a3-4d7d-b40d-f624380f1758/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 324px; height: 500px; float: right;" />Each time an ICPC participant team has successfully solved a problem at the competition site, a balloon of a color specific to that problem is delivered to that team. You had thus prepared enough number of balloons of various colors for the case when all the teams solved all the problems, but many problems have been solved by few teams. You thus decided to give away the remaining balloons to the kids in the neighborhood.</p>

<p>You are preparing poles, each tied down with one or more balloons of the same color. You are lining up these poles from left to right. Whenever a kid comes up, you give three balloons of different colors to the kid picking up one from each of the three leftmost poles. Poles that run out of the balloons are removed, and when the poles remaining are two or less, you finish giving balloons away.</p>

<p>The number of kids you can give the balloons depends on the order of the poles. Find the maximum possible number of kids you can give the balloons by arranging the order of poles appropriately.</p>

<p>The figure on the right depicts the consequences of different arrangements of five poles with 1, 2, 3, 4 and 5 balloons. When poles are lined up in the order of 1, 2, 3, 4 and 5 balloons, you can give to only three kids; when they are in the order of 5, 4, 3, 2 and 1 balloons, you can give to five kids.</p>

### 입력

<p>The input consists of multiple datasets, each in the following format.</p>

<pre>
<i>n</i>
<i>b</i><sub>1</sub> <i>b</i><sub>2</sub> &hellip; <i>b<sub>n</sub></i></pre>

<p><i>n</i>&nbsp;is the number of poles.&nbsp;<i>n</i>&nbsp;is an integer between 3 and 50, inclusive.&nbsp;<i>b</i><sub>1</sub>&nbsp;through&nbsp;<i>b<sub>n</sub></i>&nbsp;are the numbers of the balloons on the poles. Each&nbsp;<i>b<sub>i</sub></i>&nbsp;is a positive integer not exceeding 50.</p>

<p>The end of the input is indicated by a line containing a zero. The number of datasets does not exceed 50.</p>

### 출력

<p>For each dataset, output a single line containing the maximum number of kids you can give the balloons to.</p>