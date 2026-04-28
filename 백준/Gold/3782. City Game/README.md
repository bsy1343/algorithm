# [Gold III] City Game - 3782

[문제 링크](https://www.acmicpc.net/problem/3782)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 50, 정답: 16, 맞힌 사람: 7, 정답 비율: 21.875%

### 분류

브루트포스 알고리즘, 누적 합

### 문제 설명

<p>Bob is a strategy game programming specialist. In his new city building game the gaming environment is as follows: a city is built up by areas, in which there are streets, trees, factories and buildings. There is still some space in the area that is unoccupied. The strategic task of his game is to win as much rent money from these free spaces. To win rent money you must erect buildings, that can only be rectangular, as long and wide as you can. Bob is trying to find a way to build the biggest possible building in each area. But he comes across some problems &ndash; he is not allowed to destroy already existing buildings, trees, factories and streets in the area he is building in.</p>

<p>Each area has its width and length. The area is divided into a grid of equal square units. The rent paid for each unit on which you&#39;re building stands is 3\$.</p>

<p>Your task is to help Bob solve this problem. The whole city is divided into K areas. Each one of the areas is rectangular and has a different grid size with its own length M and width N. The existing occupied units are marked with the symbol R. The unoccupied units are marked with the symbol F.</p>

### 입력

<p>The first line of the input file contains an integer K &ndash; determining the number of datasets. Next lines contain the area descriptions. One description is defined in the following way: The first line contains two integers-area length M&lt;=1000 and width N&lt;=1000, separated by a blank space. The next M lines contain N symbols that mark the reserved or free grid units, separated by a blank space. The symbols used are:</p>

<ul>
	<li>R &ndash; reserved unit</li>
	<li>F &ndash; free unit</li>
</ul>

<p>In the end of each area description there is a separating line.</p>

### 출력

<p>For each data set in the input file print on a separate line, on the standard output, the integer that represents the profit obtained by erecting the largest building in the area encoded by the data set. Sample input and output:</p>