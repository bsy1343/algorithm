# [Gold III] Finding Rectangles - 4671

[문제 링크](https://www.acmicpc.net/problem/4671)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 12, 맞힌 사람: 11, 정답 비율: 73.333%

### 분류

브루트포스 알고리즘, 기하학

### 문제 설명

<p>Consider the point sets in figures 1a, 2a, and 3a. Using only those points as vertices, figures 1b, 2b, and 3b show all the rectangles that can be formed with horizontal and vertical sides. No rectangles can be formed from the points in figure 4.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4671.%E2%80%85Finding%E2%80%85Rectangles/3b8a1878.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4671/rect.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:632px; width:751px" /></p>

<p>Your task is to write a program that can find all rectangles that can be formed from a given set of points. The example input and output given below correspond to the figures above.</p>

### 입력

<p>The input file contains one or more point sets, followed by a line containing the number 0 that signals the end of the file. Each point set begins with a line containing n, the number of points, and is followed by n lines that describe the points. Each point description contains a capital letter that is the label of the point, then a space, the horizontal coordinate, a space, and the vertical coordinate. Within each set, points labels occur in alphabetical order. Note that since each point is labelled with a capital letter there can be at most 26 points. All coordinates are nonnegative integers less than 50. Points within a set are unique.</p>

### 출력

<p>The output for each point set starts with &quot;Point set &quot;, followed by the number of the point set and a colon. If there are no rectangles, &quot; No rectangles&quot; appears after the colon. If there are rectangles, they are listed starting on the next line. A blank precedes each rectangle. Each rectangle is given by its vertex labels, in clockwise order from the upper left, so the order is upper left, upper right, lower right, lower left. The rectangles are listed ten per line, except for the last line, where there may be as few as one. The rectangles are listed in alphabetical order.</p>