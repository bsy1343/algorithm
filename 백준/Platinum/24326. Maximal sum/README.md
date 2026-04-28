# [Platinum V] Maximal sum - 24326

[문제 링크](https://www.acmicpc.net/problem/24326)

### 성능 요약

시간 제한: 0.2 초, 메모리 제한: 1024 MB

### 통계

제출: 462, 정답: 66, 맞힌 사람: 35, 정답 비율: 10.086%

### 분류

수학, 정렬, 정수론, 소수 판정, 런타임 전의 전처리, 에라토스테네스의 체

### 문제 설명

<p>A group of n bunnies found a garden with n carrots, arranged in a row. Both the bunnies and the carrots are numbered with integers from 1 to n. The bunnies have made preliminary evaluation for the sweetness of the carrots, which are expressed with the integers a<sub>1</sub>, ..., a<sub>n</sub> (some carrots may be spoiled and can have negative number for sweetness). The soil under only one carrot p is fertilized and this changes the sweetness of this carrot by an integer s. More precisely, the real sweetness of carrot p is a<sub>p</sub> + s.</p>

<p>Unfortunately, p and s are unknown to rabbits. However, they have massumptions about the pair of values (p, s).</p>

<p>Bunny number k makes jumps of length k, i.e. collects the carrots in positions that are multiples of k.</p>

<p>For each assumption j, they look for the maximum amount t<sub>j</sub> of the total real sweetness of the carrots that can be collected by a bunny. Help them by writing program maxs that finds the sum of the values of t<sub>j</sub> for all assumptions.</p>

### 입력

<p>From the first line of the standard input, your program reads an integer n - the number of carrots (and bunnies). From the next line read n integers a<sub>1</sub>, ..., a<sub>n</sub> - the preliminary evaluation of the sweetness of the carrots. From the next line read an integer m-the number of assumptions. From each of the next mlines, read two integers p and s &ndash; carrot&#39;s index and its&rsquo; sweetness change for the corresponding assumption.</p>

### 출력

<p>On one line of the standard output, print a number equal to t<sub>1</sub> + ... + t<sub>m</sub>, where t<sub>j</sub> is the maximum sum of carrots&#39; sweetness under the j-th assumption.</p>

### 제한

<ul>
	<li>1 &le; n &le; 5&times;10<sup>4</sup></li>
	<li>1 &le; m &le; 5&times;10<sup>5</sup></li>
	<li>&minus;10<sup>8</sup> &le; a<sub>i</sub> &le; 10<sup>8</sup></li>
	<li>1 &le; p &le; n for each carrot&#39;s index p</li>
	<li>&minus;10<sup>13</sup> &le; s &le; 10<sup>13</sup> for any change in sweetness s</li>
</ul>

### 힌트

<p>According to the first assumption, carrots have sweetness 2, -5, -1, 2, -1, 4.</p>

<p>Bunny 1 collects total sweetness 2 + (-5) + (-1) + 2 + (-1) + 4 = 1.</p>

<p>Bunny 2 collects total sweetness (-5) + 2 + 4 = 1.</p>

<p>Bunny 3 collects total sweetness (-1) + 4 = 3.</p>

<p>Bunny 4 collects total sweetness 2.</p>

<p>Bunny 5 collects total sweetness of -1.</p>

<p>Bunny 6 collects total sweetness 4.</p>

<p>Therefore t<sub>1</sub> = 4.</p>

<p>According to the second assumption, carrots have sweetness 2, -2, 3, 2, -1, 4. Bunnies collect sweetness 8, 4, 7, 2, -1, 4, respectively.</p>

<p>Therefore t<sub>2</sub> = 8.</p>

<p>The final answer is 4 + 8 = 12.</p>