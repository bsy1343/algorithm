# [Gold IV] Drawing - 11324

[문제 링크](https://www.acmicpc.net/problem/11324)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 66, 정답: 38, 맞힌 사람: 33, 정답 비율: 63.462%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 집합과 맵, 오일러 경로

### 문제 설명

<p>One day, the Artful Coder saw an interesting shape. He immediately started wondering if it would be possible to draw it on a piece of paper using a pencil via one continuous line. After trying for several minutes, he eventually gave up and started writing a program to automate the procedure.</p>

<p>Now, despite his name, the Artful Coder really isn&#39;t that good a programmer. He doesn&#39;t know if his own program produces correct output, so he&#39;s looking for a second opinion. Given a description of a shape, determine if it can be drawn in one continuous motion of a pencil, without backtracking over any already-drawn line segments. The shape will be given as a collection of straight line segments, in no particular order, that can only touch at their endpoints.</p>

### 입력

<p>The input consists of multiple shapes. Each shape begins with a single number 0 &lt;&nbsp;<strong>N</strong>&nbsp;&lt; 1000, which is the number of line segments in the shape. There are then&nbsp;<strong>N</strong>&nbsp;lines following, each with four integers&nbsp;<strong>a</strong>,&nbsp;<strong>b</strong>,&nbsp;<strong>c</strong>, and&nbsp;<strong>d</strong>, describing a line from&nbsp;<strong>(a, b)</strong>&nbsp;to&nbsp;<strong>(c, d)</strong>. You may assume that at most one of&nbsp;<strong>a = c</strong>&nbsp;or&nbsp;<strong>b = d</strong>&nbsp;will be true, and that -1000 &lt;&nbsp;<strong>a</strong>,<strong>b</strong>,<strong>c</strong>,<strong>d</strong>&nbsp;&lt; 1000.</p>

<p>The input will be terminated with a shape that has&nbsp;<strong>N = 0</strong>, which should not be processed.</p>

### 출력

<p>Output one line for each input shape, containing either &quot;Impossible&quot; or &quot;Possible&quot; (without quotes).</p>