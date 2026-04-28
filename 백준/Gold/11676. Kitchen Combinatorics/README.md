# [Gold II] Kitchen Combinatorics - 11676

[문제 링크](https://www.acmicpc.net/problem/11676)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 256 MB

### 통계

제출: 254, 정답: 73, 맞힌 사람: 64, 정답 비율: 37.870%

### 분류

수학, 브루트포스 알고리즘, 조합론

### 문제 설명

<p>The world-renowned Swedish Chef is planning a gourmet three-course dinner for some muppets: a starter course, a main course, and a dessert. His famous Swedish cook-book offers a wide variety of choices for each of these three courses, though some of them do not go well together (for instance, you of course cannot serve chocolate moose and sooted shreemp at the same dinner).</p>

<p>Each potential dish has a list of ingredients. Each ingredient is in turn available from a few different brands. Each brand is of course unique in its own special way, so using a particular brand of an ingredient will always result in a completely different dinner experience than using another brand of the same ingredient.</p>

<p>Some common ingredients such as p&oslash;l&aring;rber may appear in two of the three chosen dishes, or in all three of them. When an ingredient is used in more than one of the three selected dishes, Swedish Chef will use the same brand of the ingredient in all of them.</p>

<p>While waiting for the meecaroo, Swedish Chef starts wondering: how many different dinner experiences are there that he could make, by different choices of dishes and brands for the ingredients?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line containing five integers r, s, m, d, n, where 1 &le; r &le; 1 000 is the number of different ingredients that exist, 1 &le; s, m, d &le; 25 are the number of available starter dishes, main dishes, and desserts, respectively, and 0 &le; n &le; 2 000 is the number of pairs of dishes that do not go well together.</li>
	<li>one line containing r integers b<sub>1</sub>, . . . , b<sub>r</sub>, where 1 &le; b<sub>i</sub> &le; 100 is the number of different brands of ingredient i.</li>
	<li>s + m + d lines describing the s starter dishes, then the m main dishes, then the d desserts. Each such line starts with an integer 1 &le; k &le; 20 denoting the number of ingredients of the dish, and is followed by k distinct integers i<sub>1</sub>, . . . , i<sub>k</sub>, where for each 1 &le; j &le; k, 1 &le; i<sub>j</sub> &le; r is an ingredient.</li>
	<li>n lines each containing two incompatible dishes. Each dish is identified by an integer 1 &le; j &le; s + m + d, referring to the j&rsquo;th dish given in the input (so 1 &le; j &le; s refers to the starter dishes, s &lt; j &le; s + m refers to the main dishes, and s + m &lt; j &le; s + m + d refers to the desserts).</li>
</ul>

<p>Each pair of incompatible dishes in the input consists of two dishes of different types, and any one pair of dishes is listed at most once.</p>

### 출력

<p>If the number of different dinner experiences Swedish Chef can make is at most 10<sup>18</sup>, then output that number. Otherwise, output &ldquo;too many&rdquo;.</p>