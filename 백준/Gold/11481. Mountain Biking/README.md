# [Gold V] Mountain Biking - 11481

[문제 링크](https://www.acmicpc.net/problem/11481)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 132, 정답: 71, 맞힌 사람: 63, 정답 비율: 54.310%

### 분류

수학, 미적분학, 물리학

### 문제 설명

<p>Mount Snowdon, the tallest place in Wales, is a major attraction for mountain bikers far and wide. To take advantage of the popularity of this thrilling sport, an enterprising new venture plans to open several new bike repair shops throughout the rolling foothills.</p>

<p>The cunning small business owner&rsquo;s financial success relates directly to the velocity of the average biker: the faster a biker is going at the foot of the hill the more likely they are to encounter a problem and have to walk &mdash; or sometimes limp &mdash; into the shop.</p>

<p>Snowdon, like most mountains, has a very angular sort of shape. In fact, the profile of the mountain can be represented as N connected line segments pointing downward at various angles, each starting where the last left off. Given this highly scientific representation of the landscape, we need to find the likely speeds of bikers given that they may start off from the top of any of the N segments.</p>

<p>As we all know, a biker on a &theta;-degree slope from the vertical will accelerate at a rate of precisely g &times; cos(&theta;) ms<sup>&minus;2</sup> along the slope.</p>

### 입력

<ul>
	<li>One line containing a positive integer N (1 &le; N &le; 4), the number of line segments making up the mountain, followed by a space and then a real number g (1 &le; g &le; 100), the coefficient of acceleration due to gravity.</li>
	<li>N more lines each containing two integers D<sub>i</sub> and then &theta;<sub>i</sub> (1 &le; D &le; 10<sup>4</sup>; 1 &le; &theta; &le; 89): the sloped distance in metres and absolute angle in degrees of this line segment from the vertical respectively. The segments are ordered from the top of the hill to its bottom.</li>
</ul>

### 출력

<p>Each of the N lines of output should contain one real number: the velocity of a biker starting at the ith-most segment from the top and finishing at the foot of the mountain.</p>

<p>Answers will be judged as correct if they are printed to within an absolute or relative difference of 10<sup>&minus;6</sup> from their exact values.</p>