# [Platinum IV] Historical Maths - 18061

[문제 링크](https://www.acmicpc.net/problem/18061)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 36, 정답: 13, 맞힌 사람: 12, 정답 비율: 52.174%

### 분류

이분 탐색, 수학, 정수론

### 문제 설명

<p>The history of Numeristan is quite remarkable. As we all know the maharajahs of Numeristan were a superstitious bunch. Every year they consulted their chief magicians about their lucky number and all calculations during this year had to be done in a positional numeral system<sup>1</sup> with this lucky number as the base. Naturally this lead to a lot of confusion throughout the years. On the flip side it makes determining the year of ancient documents really easy for historians.</p>

<p>Recently an old manuscript was discovered which only features a simple multiplication of two numbers. As there are no other clues about the year of origin, some historians have asked you for help to determine the base of the system the calculation was performed in.</p>

<p><sup>1</sup>A positional numeral system of base b only contains the digits 0, 1, . . . , b &minus; 1. An integer n has one or more digits d<sub>i</sub>. Each digit contributes to the total value of n with its position i and its own value, according to the formula n = &Sigma;d<sub>i</sub> &middot; b<sup>i</sup>&nbsp;(i = 0 to &infin;). Leading digits of value 0 are usually omitted. For instance, the integer 512 in base 13 has the total value of 5 &middot; 13<sup>2</sup> + 1 &middot; 13<sup>1</sup> + 2 &middot; 13<sup>0</sup>. Well known and used positional numeral systems are the binary system (which is also the positional numeral system with the smallest valid base), the decimal system as well as the hexadecimal system.</p>

### 입력

<p>The input consists of three lines, each describing a positive integer with no leading zeroes. Each line consists of:</p>

<ul>
	<li>One integer n (1 &le; n &le; 1 000), the number of digits of the currently described integer.</li>
	<li>n integers d<sub>n&minus;1</sub>, . . . , d<sub>0</sub> (0 &le; d<sub>i</sub> &le; 2<sup>30</sup> for each i, d<sub>n&minus;1</sub> &ne; 0), the digits of the integer. The most significant digit is d<sub>n&minus;1</sub>, the least significant digit is d<sub>0</sub>.</li>
</ul>

<p>The first two lines correspond to the factors, the third line to the product of the multiplication.</p>

### 출력

<p>Output a possible base the multiplication was performed in. If there are multiple possible bases, you may output any of them. If no possible base exists, output impossible.</p>