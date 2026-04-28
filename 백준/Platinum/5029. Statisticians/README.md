# [Platinum IV] Statisticians - 5029

[문제 링크](https://www.acmicpc.net/problem/5029)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 54, 정답: 10, 맞힌 사람: 7, 정답 비율: 43.750%

### 분류

정렬, 애드 혹, 누적 합

### 문제 설명

<p>Statisticians like to create a lot of statistics. One simple measure is the mean value: the sum of all values divided by the number of values. Another is the median: the middle among all values when they have been sorted. If there are an even number of values, the mean of the two middle values will form the median.</p>

<p>These kinds of measures can be used for example to describe the population in a country or even some parts of the population in the country. Anne Jensen, Maria Virtanen, Jan Hansen, Erik Johansson and Jn rsson want to find a statistical measurement of how many statisticians there are in the Nordic countries. To be more precise, they want to find out how many statisticians there are per unit area. As the population in the Nordic countries are well spread out they will try the new measurement MAD, Median of All Densities. First put a square grid on the map. Then draw a rectangle aligned with the grid and calculate the density of statisticians in that area, i.e. the mean number of statisticians per area unit. After that, repeat the procedure until all possible rectangles have been covered. Finally the MAD is the median of all statistician densities.</p>

### 입력

<p>The first line of the input contains of two space separated numbers h and w describing the height and width of the square grid, where 1 &le; h &le; 140 and 1 &le; w &le; 120. The next line contains two space separated numbers a and b which are the lower and upper bound of the allowed rectangle areas, i.e. 1 &le; a &le; rectanglearea &le; b &le; w &times; h. Then there will follow h lines with w space separated numbers s describing the number of statisticians in each square of the map, 0 &le; s &le; 10000. There will always exist a rectangle which area is in [a, b].</p>

### 출력

<p>The output contains of one line with the MAD. The number should be printed in number of statisticians per square and contain three decimals. The absolute error must be &lt; 10<sup>&minus;3</sup>.</p>