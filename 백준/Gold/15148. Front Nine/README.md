# [Gold II] Front Nine - 15148

[문제 링크](https://www.acmicpc.net/problem/15148)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 512 MB

### 통계

제출: 42, 정답: 21, 맞힌 사람: 21, 정답 비율: 58.333%

### 분류

조합론, 다이나믹 프로그래밍, 기하학, 구현, 수학, 확률론

### 문제 설명

<p>Andrew is building a 2D golf course called the Front Nine where each hole will be exactly n units long. In order to generate many (hopefully) unique holes, he will do it with a randomised algorithm. A single hole is defined by a function y : [0, n] &rarr; [0, h] which for each x-coordinate in the range [0, n] gives the height of the hole&rsquo;s terrain (between 0 and h) at that point.</p>

<p>Andrew&rsquo;s randomised algorithm for generating a single hole is as follows:</p>

<p><strong>Step 1</strong> Set y(0) = a.</p>

<p><strong>Step 2</strong> For each i = 1, 2, . . . , n, let</p>

<p style="text-align:center">y(i) = fix(y(i &minus; 1) + r(i))</p>

<p>where r(i) is a random integer chosen from the set {&minus;1, 0, 1} with probabilities P<sub>&minus;1</sub>, P<sub>0</sub> and P<sub>1</sub> percent, respectively (P<sub>&minus;1</sub> + P<sub>0</sub> + P<sub>1</sub> = 100). And fix is a function defined by</p>

<p style="text-align:center">fix(y) = 0 (if y &lt; 0), y (if 0 &le; y &le; h), h (if h &lt; y)</p>

<p>which clamps (restricts) its output to the range [0, h].</p>

<p><strong>Step 3</strong> Once we have y(i) for each i = 0, 1, ..., n we fill in each interval (i, i + 1) of the function with the straight line that joins the points (i, y(i)) and (i + 1, y(i + 1)).</p>

<p><strong>Step 4</strong> All of the area under y is filled in with dirt.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15148/1.png" style="height:214px; width:328px" /></p>

<p>Figure F.1: An example with n = 9, h = 6, a = 3. The area of dirt is 42.5. One possible function r: r(1) = 1, r(2) = 1, r(3) = &minus;1, r(4) = 0, r(5) = 1, r(6) = 1, r(7) = 1, r(8) = &minus;1, r(9) = &minus;1.</p>

<p>Since Andrew wants to build many holes, he needs to know how much dirt he will need. Help him by determining the expected area under the terrain for each hole.</p>

### 입력

<p>The input consists of a single line containing six integers n (1 &le; n &le; 100 000), which is the length of the hole, h (0 &le; h &le; 100), which is the maximum height of the hole, a (0 &le; a &le; h), which is the height at x = 0,&nbsp;P<sub>&minus;1</sub> (0 &le; P<sub>&minus;1</sub> &le; 100), P<sub>0</sub> (0 &le; P<sub>0</sub> &le; 100) and P<sub>1</sub> (0 &le; P<sub>1</sub> &le; 100), which are the probability of r being &minus;1, 0 and 1, respectively. In addition, P<sub>&minus;1</sub> + P<sub>0</sub> + P<sub>1</sub> = 100.</p>

### 출력

<p>Display the expected area under the terrain. Your answer should have an absolute or relative error of less than 10<sup>&minus;6</sup>.</p>