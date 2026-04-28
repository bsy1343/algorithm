# [Gold III] Building Snowmen - 7012

[문제 링크](https://www.acmicpc.net/problem/7012)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

이분 탐색, 그리디 알고리즘, 매개 변수 탐색

### 문제 설명

<p>You are trying to build an army of snowmen. To do so, you have gathered a bunch of snowballs of varying sizes. You want to build each snowman by stacking three snowballs on top of each other. You will do this by choosing a snowball to be the base. Then you will choose a smaller snowball to be the middle. Then an even smaller snowball will be the top. Each snowball has a diameter d. When evaluating a snowman, suppose the diameter of the bottom snowball is d<sub>b</sub>, the diameter of the middle snowball is d<sub>m</sub>, and of the top snowball d<sub>t</sub>. Then you want the following inequalities to hold:</p>

<ul>
	<li>2d<sub>b</sub> &ge; 3d<sub>m</sub></li>
	<li>2d<sub>m</sub> &ge; 3d<sub>t</sub></li>
</ul>

<p>Calculate the maximum number of snowmen that can be built from the available snowballs and according to the criteria.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line of each data set contains the number of snowballs N, where 3 &le; N &le; 1000. This followed by a line containing N integers each at least 1 and at most 1000. The ith integer is the diameter of the ith snowball.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output the maximum number of proper snowmen that can be completed. Each data set should be followed by a blank line.</p>