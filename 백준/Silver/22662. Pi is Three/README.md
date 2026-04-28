# [Silver IV] Pi is Three - 22662

[문제 링크](https://www.acmicpc.net/problem/22662)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 77, 정답: 61, 맞힌 사람: 43, 정답 비율: 76.786%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p><i>&pi;</i>&nbsp;(spelled pi in English) is a mathematical constant representing the circumference of a circle whose di- ameter is one unit length. The name&nbsp;<i>&pi;</i>&nbsp;is said to come from the first letter of the Greek words &pi;&epsilon;&rho;&iota;&phi;έ&rho;&epsilon;&iota;&alpha; (meaning periphery) and &pi;&epsilon;&rho;ί&mu;&epsilon;&tau;&rho;&omicron;&sigmaf; (perimeter).</p>

<p>Recently, the government of some country decided to allow use of 3, rather than 3.14, as the approximate value of &pi; in school (although the decision was eventually withdrawn probably due to the blame of many people). This decision is very surprising, since this approximation is far less accurate than those obtained before the common era.</p>

<p>Ancient mathematicians tried to approximate the value of&nbsp;<i>&pi;</i>&nbsp;without calculators. A typical method was to calculate the perimeter of inscribed and circumscribed regular polygons of the circle. For example, Archimedes (287&ndash;212 B.C.) proved that 223/71 &lt;&nbsp;<i>&pi;</i>&nbsp;&lt; 22/7 using 96-sided polygons, where 223/71 and 22/7 were both accurate to two fractional digits (3.14). The resultant approximation would be more accurate as the number of vertices of the regular polygons increased.</p>

<p>As you see in the previous paragraph,&nbsp;<i>&pi;</i>&nbsp;was approximated by fractions rather than decimal numbers in the older ages. In this problem, you are requested to represent&nbsp;<i>&pi;</i>&nbsp;as a fraction with the smallest possible denominator such that the representing value is not different by more than the given allowed error. If more than one fraction meets this criterion, the fraction giving better approximation is preferred.</p>

### 입력

<p>The input consists of multiple datasets. Each dataset has a real number&nbsp;<i>R</i>&nbsp;(0 &lt;&nbsp;<i>R</i>&nbsp;&le; 1) representing the allowed difference between the fraction and&nbsp;<i>&pi;</i>. The value may have up to seven digits after the decimal point. The input is terminated by a line containing 0.0, which must not be processed.</p>

### 출력

<p>For each dataset, output the fraction which meets the criteria in a line. The numerator and denominator of the fraction should be separated by a slash as shown in the sample output, and those numbers must be integers.</p>