# [Platinum I] The Darkness - 13523

[문제 링크](https://www.acmicpc.net/problem/13523)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 16, 맞힌 사람: 12, 정답 비율: 66.667%

### 분류

최대 유량, 최대 유량 최소 컷 정리, 그래프 이론

### 문제 설명

<p>Night clubs aren&rsquo;t what they used to be. Our benevolent state has decided that, for health and&nbsp;safety reasons, every club must now meet a minimum lighting standard. They have moved to&nbsp;verify standards by dividing each club up into 1m<sup>2&nbsp;</sup>cells and measuring the light levels on the&nbsp;floor with probes in the centre of each cell.</p>

<p>Club owners aren&rsquo;t happy about this; they will comply with the letter of the law, but don&rsquo;t want&nbsp;to spend a penny more than they have to on electricity. Instead of upgrading their lighting, they&nbsp;will fence off the offending parts of the club to deal with later.</p>

<p>You will be given a grid representing a map of the lights in a club. Each cell of the grid (r, c)&nbsp;will have a light directly above its centre with a bulb of strength s, (0 &le; s &le; 9).</p>

<p>The ceiling is flat&mdash;its height is constant. Each light will affect every nearby cell, increasing the&nbsp;light level at distance (x, y, z) by:</p>

<pre>
s / (x<sup>2</sup> + y<sup>2</sup> + z<sup>2</sup>)</pre>

<p>Building a section of transparent fencing between any two cells usually costs &pound;11. However, if&nbsp;the cells on both sides meet the minimum lighting standard, the price per length of fencing rises&nbsp;steeply to &pound;43, as builders find it hard to work under the pulsating night club lights and demand&nbsp;extra compensation.</p>

<p>How much will you have to spend on fencing out the dark spots?</p>

### 입력

<ul>
	<li>One line containing an integer B (0 &lt; B &le; 9), the minimum required light level.</li>
	<li>One line containing an integer H (0 &lt; H &le; 5), the height of the ceiling in the club.</li>
	<li>One line containing two integers R and C (0 &lt; R, C &le; 30), the length and width of the club.</li>
	<li>R further lines, each containing a string of C digits, representing the strength of lights at each cell of the club.</li>
</ul>

<p>It is guaranteed that the 2(R + C) &minus; 4 cells along the borders of the club are sufficiently lit.</p>

### 출력

<ul>
	<li>One line containing one integer: the total number of pounds that must be spent on fencing.</li>
</ul>