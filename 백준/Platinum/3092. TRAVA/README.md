# [Platinum I] TRAVA - 3092

[문제 링크](https://www.acmicpc.net/problem/3092)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 38, 정답: 9, 맞힌 사람: 9, 정답 비율: 31.034%

### 분류

자료 구조, 덱, 구현, 시뮬레이션

### 문제 설명

<p>Edo spends most of his time in garden lately. There he cultivates, is mowing, irrigates, fertilizes and extents his grass and happily watches how it grow.</p>

<p>He is mowing the grass by specific rules every few days. On the other side, grass grows every day for the same length, but has limit of H millimeters in height (at this point every plant consumes too much food and cannot grow no more). When the time for fertilizing arrives, Edo has to calculate what the necessary amount of compost is. Optimal amount of compost depends on the amount of grass.</p>

<p>Precisely, his garden can be represented as one-dimensional array of exactly N plants of grass with height equal to zero at the beginning. It is necessary to write a program which calculates the sum of height of all grass plants whenever it is needed for Edo.</p>

<p>Write a program which reads and evaluates M operations on Edo&rsquo;s garden. Every operation is one of the following:</p>

<ul>
	<li>N X &ndash; every plant of grass grows for exactly X millimeters. If plant&rsquo;s height would exceed limit H it stops at exactly height H.</li>
	<li>L X &ndash; Edo completely mows first X plants of grass from the left. After this operation height of first X plants is equal to 0.</li>
	<li>D X &ndash; Edo completely mows first X plants of grass from the right. After this operation height of first X plants is equal to 0.</li>
	<li>S X &ndash; Edo sets the lawnmower height of mowing to X and mows whole garden with it. Height of every plant higher than X is set to X while height of other plants remains the same.</li>
	<li>Z &ndash; Edo wants to know sum of heights of all grass plants.</li>
</ul>

### 입력

<p>First line of input contains three positive integer numbers N, H and M (1 &le; N &le; 10<sup>9</sup>, 1 &le; H &le; 10<sup>6</sup>, 1 &le; M &le; 10<sup>6</sup>) &ndash; number of grass plants, maximal height of plants and number of operations. Next M lines of input contain description of one operation. Every operation is one of five previously described operations and is made of one capital letter and integer number (if necessary &ndash; operations N, L, D, S) X separated with one space. In operations L and D number X will be in interval 1 &le; X &le; N, and in case of operations N and S number X will be in interval 1 &le; X &le; H.</p>

### 출력

<p>For every operation Z it is necessary to write one line with one integer &ndash; sum of heights of all grass plants. Of course, order of responses has to be the same as the order of Z operations in input.</p>

<p>Note: sum of heights can be larger than 2<sup>32</sup>.</p>