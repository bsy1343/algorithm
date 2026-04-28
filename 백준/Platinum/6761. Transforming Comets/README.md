# [Platinum III] Transforming Comets - 6761

[문제 링크](https://www.acmicpc.net/problem/6761)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 8, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

문자열, 기하학, 해싱, KMP, 불변량 찾기

### 문제 설명

<p>While traveling from Earth to Krypton, Superman was caught in a wormhole and transported instantly to some unknown location. Superman remembers seeing periodic comets from Earth, and he can see some periodic comets from his current location. He would like to use these comets to find his bearings, but first he has to match up which one is which.</p>

<p>The specific comets Superman sees are periodic Gaussian hyper-comets. A periodic Gaussian hyper-comet is a sequence (p<sub>1</sub>, p<sub>2</sub>, . . . , p<sub>n</sub>) where each p<sub>i</sub> is a 2-dimensional point (x<sub>i</sub>, y<sub>i</sub>) with integer coordinates. The comet visits some point p<sub>i</sub> and then it visits point p<sub>i+1</sub>. The sequence is periodic: after visiting p<sub>n</sub> the comet visits p<sub>1</sub> next (so the indices are interpreted modulo n), Gaussian hyper-comets also have the special property that p<sub>i</sub> &ne; p<sub>i+1</sub> for each i and p<sub>1</sub> &ne; p<sub>n</sub>.</p>

<p>Superman was disoriented in both space and time. In terms of space this means a comet that he saw before might now have its whole set of points <em>rotated</em>, <em>both axes scaled by the same positive factor</em>, and/or <em>translated</em>. Furthermore, since he was disoriented in time, the first point of a comet he used to know might not be the first point any more.</p>

<p>For example, the right-triangular hyper-comet ((0, 0), (1, 0), (0, 1)) from earth might look like ((40, 40), (20, 20), (60, 20)) or ((20, 20), (60, 20), (40, 40)). Note that reversing time or space is not an allowed transformation, e.g. it&rsquo;s <strong>not</strong> possible for this hyper-comet to appear as ((0, 1), (1, 0), (0, 0)).</p>

<p>Your goal is: given a periodic sequence of points corresponding to a Gaussian hyper-comet Superman saw from earth, and a Gaussian hyper-comet Superman sees now, determine if they could be the same comet.</p>

### 입력

<p>The first line contains 1 &le; t &le; 10, the number of test cases to follow.</p>

<p>Each test case begins with an integer n where 2 &le; n &le; 500 000. The following n lines, for i from 1 to n, each contain a space-separated pair of integers x<sub>i</sub> y<sub>i</sub>. These lines denote the points for a sequence viewed from Earth. Then, similarly, there are n more lines each containing a pair of integers x&#39;<sub>i</sub> y&#39;<sub>i</sub>; these lines denote the points for a sequence viewed Superman&rsquo;s current location.</p>

<p>It is guaranteed that all of the coordinates are integers between 0 and 30 000 (inclusive).</p>

### 출력

<p>For each test case, if the two sequences could represent the same hyper-comet under this disorientation process, print out the smallest positive integer s so that x<sub>1</sub> y<sub>1</sub> could correspond to x&#39;<sub>s</sub> y&#39;<sub>s</sub> . If there is no such s, print 0.</p>