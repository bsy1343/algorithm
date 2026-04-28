# [Gold I] How Big Is It? - 4135

[문제 링크](https://www.acmicpc.net/problem/4135)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 179, 정답: 57, 맞힌 사람: 37, 정답 비율: 38.947%

### 분류

수학, 브루트포스 알고리즘, 기하학, 피타고라스 정리

### 문제 설명

<p>Ian&#39;s going to California, and he has to pack his things, including his collection of circles. Given a set of circles, your program must find the smallest rectangular box in whih they fit.</p>

<p>All circles must touch the bottom of the box. The figure below shows an acceptable packing for a set of circles (although this may not be the optimal packing for these particular circles). Note that in an ideal paking, each circle should touch at least one other circle (but you probably figured that out).</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4135.%E2%80%85How%E2%80%85Big%E2%80%85Is%E2%80%85It%3F/dc82916b.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4135/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:197px; width:347px" /></p>

### 입력

<p>The first line of input contains a single positive decimal integer n, n &le;&nbsp;100. This indicates the number of lines which follow. The subsequent n lines each contain a series of numbers separated by spaces. The first number on each fo these lines is a positive integer m, m &le; 8, which indicates how many other numbers appear on that line. The next m numbers on the line are the radii of the circles which must be packed in a single box. These numbers need not be integers.</p>

### 출력

<p>For each data line of input, excluding the first line of input containing n, your program must output the size of the smallest rectangle which can pack the circles. Each case should be output on a separate line by itself, with three places after the decimal point. Do not output leading zeroes unless the number is less than 1, e.g. 0.543.</p>