# [Silver III] Windows - 4051

[문제 링크](https://www.acmicpc.net/problem/4051)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 18, 맞힌 사람: 15, 정답 비율: 93.750%

### 분류

구현

### 문제 설명

<p>Emma is not very tidy with the desktop of her computer. She has the habit of opening windows on the screen and then not closing the application that created them. The result, of course, is a very cluttered desktop with some windows just peeking out from behind others and some completely hidden. Given that Emma doesn&rsquo;t log off for days, this is a formidable mess. Your job is to determine which window (if any) gets selected when Emma clicks on a certain position of the screen.</p>

<p>Emma&rsquo;s screen has a resolution of 10<sup>6</sup> by 10<sup>6</sup>. When each window opens its position is given by the upper-left-hand corner, its width, and its height. (Assume position (0,0) is the location of the pixel in the upper-left-hand corner of her desktop. So, the lower-right-hand pixel has location (999999, 999999).)</p>

### 입력

<p>Input for each test case is a sequence of desktop descriptions. Each description consists of a line containing a positive integer n, the number of windows, followed by n lines, n &le; 100, describing windows in the order in which Emma opened them, followed by a line containing a positive integer m, the number of queries, followed by m lines, each describing a query. Each of the n window description lines contains four integers r, c, w, and h, where (r,c) is the row and column of the upper left pixel of the window, 0 &le; r,c &le; 999999, and w and h are the width and height of the window, in pixels, 1 &le; w,h. All windows will lie entirely on the desktop (i.e., no cropping). Each of the m query description lines contains two integers cr and cc, the row and column number of the location (which will be on the desktop). The last test case is followed by a line containing 0.</p>

### 출력

<p>Using the format shown in the sample, for each test case, print the desktop number, beginning with 1, followed by m lines, one per query. The i-th line should say either &ldquo;window k&rdquo;, where k is the number of the window clicked on, or &ldquo;background&rdquo; if the query hit none of the windows. We assume that windows are numbered consecutively in the order in which Emma opened them, beginning with 1. Note that querying a window does not bring that window to the foreground on the screen.</p>