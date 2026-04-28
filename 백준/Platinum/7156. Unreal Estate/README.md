# [Platinum IV] Unreal Estate - 7156

[문제 링크](https://www.acmicpc.net/problem/7156)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 128 MB

### 통계

제출: 87, 정답: 24, 맞힌 사람: 20, 정답 비율: 28.169%

### 분류

자료 구조, 세그먼트 트리, 스위핑

### 문제 설명

<p>A dishonest landowner is selling off plots of land. He&rsquo;s selling it in large, rectangular plots, but many of the plots overlap, so he&rsquo;s actually selling the same land multiple times! It&rsquo;s not real estate, it&rsquo;s unreal estate!</p>

<p>Given a description of the possibly overlapping rectangular plots of land that the dishonest landowner has sold, determine the total actual area of land covered by them.</p>

### 입력

<p>There will be several test cases in the input. Each test case will begin with a line with a single integer n (0&lt;n&le;5,000), indicating the number of plots of land sold. The next n lines will each have a description of a rectangular plot of land, consisting of four real numbers:</p>

<pre>
x1 y1 x2 y2</pre>

<p>where (x1,y1) is the southwest corner, and (x2,y2) is the northeast corner (-1,000&le;x1&lt;x2&le;1,000, -1,000&le;y1&lt;y2&le;1,000). Every plot will have an area of at least 1.</p>

<p>The input will end with a line with a single 0.</p>

### 출력

<p>For each test case, output a single real number, which represents the total actual area covered by all of the rectangular plots of land. Output this number with exactly two decimal places, rounded. Do not print any spaces. Do not print any blank lines between outputs.</p>