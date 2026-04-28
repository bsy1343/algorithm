# [Platinum IV] Fences - 15470

[문제 링크](https://www.acmicpc.net/problem/15470)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 56, 정답: 8, 맞힌 사람: 4, 정답 비율: 11.111%

### 분류

많은 조건 분기, 기하학, 수학, 매개 변수 탐색

### 문제 설명

<p>Your friend, Donald, has a villa surrounded by two tiers of fences, and he wants to calculate the area of land between them. He can measure the length of any fence, but Donald has no idea on calculating the area. Watson, one of Donald&rsquo;s friends, notices that the fences are probably built by a computer scientist mastering the knowledge of computational geometry, because the following facts are no coincidence.</p>

<ul>
	<li>The shape of the land inside the outer tier is a perfect circle C. Let B denote the set of points on the boundary of C.</li>
	<li>The shape of the land inside the inner tier is a non-self-intersecting polygon P of n vertices. I.e., two edges do not intersect if they don&rsquo;t share a common vertex. Let V denote the set of vertices of P.</li>
	<li>All vertices of P have identical minimum distances to C. In other words, for distinct vertices (x<sub>u</sub>, y<sub>u</sub>),(x<sub>v</sub>, y<sub>v</sub>) &isin; V , we have</li>
</ul>

<p>\[\min_{(x,y) \in B}{\sqrt{\left(x-x_u\right)^2 + \left(y-y_u\right)^2}} = \min_{(x,y) \in B}{\sqrt{\left(x-x_v\right)^2 + \left(y-y_v\right)^2}}\]</p>

<p>Suddenly, you know how to calculate the area of land between the two tiers of fences from the total length c of outer tier and the lengths ℓ<sub>1</sub>, . . . , ℓ<sub>n</sub> of the n edges of P. Note that Donald can measure these length. Could you help him to calculate the area?</p>

### 입력

<p>The first line of the input contains a positive integer T indicating the number of test cases. Each test case consists of two lines. The first line contains two numbers c and n separated by a space. c is the total length of the outer tier, i.e., c is the perimeter of C. n is the number of vertices of P. The second line contains n positive integers ℓ1, . . . , ℓ<sub>n</sub> indicating the lengths of edges of P.</p>

<p>You may assume:</p>

<ul>
	<li>1 &le; T &le; 100</li>
	<li>3 &le; n &le; 10</li>
	<li>10 &le; c &le; 1000</li>
	<li>ℓ<sub>1</sub>, . . . , ℓ<sub>n</sub> &gt; 0</li>
	<li>P must be inside the circle C.</li>
</ul>

### 출력

<p>For each case, output the area between the two tiers of fences. Your answer will be accepted if the absolute error or the relative error is less than 10<sup>&minus;6</sup>.</p>