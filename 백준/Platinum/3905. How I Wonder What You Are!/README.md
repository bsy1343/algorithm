# [Platinum V] How I Wonder What You Are! - 3905

[문제 링크](https://www.acmicpc.net/problem/3905)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 22, 맞힌 사람: 20, 정답 비율: 90.909%

### 분류

기하학, 3차원 기하학

### 문제 설명

<p>One of the questions children often ask is &quot;How many stars are there in the sky?&quot; Under ideal conditions, even with the naked eye, nearly eight thousands are observable in the northern hemisphere. With a decent telescope, you may find many more, but, as the sight field will be limited, you may find much less at a time.</p>

<p>Children may ask the same questions to there parents on a planet of some solar system billlions of light-years away from the Earth. Their telescopes are similar to ours with circular sight fields, but alien kids have many eyes and can look into different directions at a time through many telescopes.</p>

<p>Given an set of positions of stars, a set of telescopes and the directions they are looking to, your task is to count up how many stars can be seen through these telescopes.</p>

### 입력

<p>The input consists of one or more datasets. The number of datasets is less than 50. Each dataset describs stars and the parameters of the telescopes used.</p>

<p>The first line of a dataset contains a positive integer n not exceeding 500, meaning the number of stars. Each of the n lines following it contains three decimal fractions, s<sub>x</sub>, s<sub>y</sub>, and s<sub>z</sub>. They give the position (s<sub>x</sub>, s<sub>y</sub>, s<sub>z</sub>) of the star described in Euclidean coordinates. You many assume -1000 &le; s<sub>x</sub> &le; 1000, -1000 &le; s<sub>y</sub> &le; 1000, -1000 &le; s<sub>z</sub> &le; 1000 and (s<sub>x</sub>, s<sub>y</sub>, s<sub>z</sub>) &ne; (0, 0, 0)</p>

<p>Then comes a line containing a positive integer m not exceeding 50, meaning the number of telescopes. Each of the following m lines contains four decimal fractions, t<sub>x</sub>, t<sub>y</sub>, t<sub>z</sub>, and &psi;, describing a telescope.</p>

<p>The first three numbers represent the direction of the telescope. All the telescopes are at the origin of the coordinate system (0, 0, 0) (we ignore the size of the planet). The three numbers give the point (t<sub>x</sub>, t<sub>y</sub>, t<sub>z</sub>) which can be seen in the center of the sight through the telescope. You may assume -1000 &le; t<sub>x</sub> &le; 1000, -1000 &le; t<sub>y</sub> &le; 1000, -1000 &le; t<sub>z</sub> &le; 1000 and (t<sub>x</sub>, t<sub>y</sub>, t<sub>z</sub>) &ne; (0, 0, 0).</p>

<p>The fourth number &psi; (0 &le; &psi; &le; &pi;/2) gives the angular radius, in radians, of the sight filed of the telescope.</p>

<p>Let us define that &theta;<sub>i,j</sub> is the angle between the direction of the i-th star and the center direction of the j-th telescope and &psi;<sub>j</sub> is the angular radius of the sight filed of the j-th telescope. The i-th star is observable through the j-th telescope if and only if &theta;<sub>i,j</sub> is less than &psi;<sub>j</sub>. You may assume that |&theta;<sub>i,j</sub> - &psi;<sub>j</sub>| &gt; 0.00000001 for all pairs of i and j.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3905.%E2%80%85How%E2%80%85I%E2%80%85Wonder%E2%80%85What%E2%80%85You%E2%80%85Are!/fcb84d68.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/3905.%E2%80%85How%E2%80%85I%E2%80%85Wonder%E2%80%85What%E2%80%85You%E2%80%85Are!/fcb84d68.png" data-original-src="https://www.acmicpc.net/upload/imagesa/figureA1(1).png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:383px; opacity:0.9; width:499px" /></p>

<p style="text-align: center;">Figure 1: Direction and angular radius of a telescope</p>

<p>The end of the input is indicated with a line containing a single zero.</p>

### 출력

<p>For each dataset, one line containing an integer meaning the number of stars observable through the telescopes should be output. No other characters should be contained in the output. Note that stars that can be seen through more than one telescope should not be counted twice or more.</p>