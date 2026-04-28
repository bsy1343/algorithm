# [Gold IV] Painting - 9378

[문제 링크](https://www.acmicpc.net/problem/9378)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 4, 맞힌 사람: 4, 정답 비율: 50.000%

### 분류

그리디 알고리즘

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9378.%E2%80%85Painting/98df88b3.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9378/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:219px; width:219px" />Ethan wants to draw a painting on an m&times;n board. He can draw some strips on the board using a paintbrush of width one. In each step, he must choose a new color and paint a full column or a full row. He has a great image to be drawn on the board, but he doesn&rsquo;t know which color to use first. You must help him in finding out the order of colors.</p>

### 입력

<p>There are multiple test cases in the input. The first line of each test case contains two integers m and n, the size of the board (0&lt; m, n &lt;100). Following the first line, there are m lines with n integers denoting the color in each cell. All the colors are positive integer numbers less than 10000. The input is terminated with a single line containing two consecutive zeros.</p>

### 출력

<p>For each test case, write a single line containing the order of colors used to paint the board. If there are several answers, output the one which is lexicographically smallest (considering each number as a symbol).</p>