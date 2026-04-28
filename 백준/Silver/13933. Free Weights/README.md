# [Silver I] Free Weights - 13933

[문제 링크](https://www.acmicpc.net/problem/13933)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 214, 정답: 85, 맞힌 사람: 79, 정답 비율: 43.889%

### 분류

이분 탐색, 집합과 맵, 매개 변수 탐색

### 문제 설명

<p>The city of Bath is a noted olympic training ground&mdash;bringing local, national, and even international teams to practice. However, even the finest gymnasium falls victim to the cardinal sin. . .Weights put back in the wrong spots.</p>

<p>All of the pairs of dumbbells sit in no particular order on the two racks, possibly even with some of them split between rows. Initially each row has an equal number of dumbbells, however, this being a well-funded professional gym, there is infinite space at either end of each to hold any additional weights.</p>

<p>To move a dumbbell, you may either roll it to a free neighbouring space on the same row with almost no effort, or you may pick up and lift it to another free spot; this takes strength proportional to its weight. For each pair of dumbbells, both have the same unique weight.</p>

<p>What is the heaviest of the weights that you need to be able to lift in order to put identical weights next to each other? Note that you may end up with different numbers of weights on each row after rearranging; this is fine.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line containing the integer n (1 &le; n &le; 10<sup>6</sup> ), the number of pairs;</li>
	<li>two lines, each containing n integers w<sub>1</sub> . . . w<sub>n</sub> (1 &le; w<sub>i </sub>&le; 10<sup>9</sup> for each i), where wi is the mass of the weight i-th from the left along this row.</li>
</ul>

<p>Every weight in the input appears exactly twice.</p>

### 출력

<p>Output the weight of the heaviest dumbbell that must be moved, in order that all items can be paired up while lifting the smallest possible maximum weight.</p>