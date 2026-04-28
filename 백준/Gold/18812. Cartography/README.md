# [Gold IV] Cartography - 18812

[문제 링크](https://www.acmicpc.net/problem/18812)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 17, 정답: 9, 맞힌 사람: 7, 정답 비율: 58.333%

### 분류

그래프 이론, 그리디 알고리즘, 해 구성하기

### 문제 설명

<p>Cartography is the practice of creating maps. Abbey is a cartographer who wishes to draw a map of where every house is in a particular city. Unfortunately, she has never visited that city. She knows that the city is a rectangular grid with one house at each intersection. She does not know the dimensions of the grid, but knows that each dimension is at least 2.</p>

<p>Abbey has access to the census results from the previous year, where each household in that city wrote down who all of their neighbours were. Your neighbours are the houses that are exactly one intersection away from you in any of the four directions (north, east, south, west). This means that each house will have exactly 2, 3 or 4 neighbours (2 if you are a corner, 3 if you are on the edge, and 4 otherwise).</p>

<p>Unfortunately, some of the census results may be incorrect. For example, some households may have reported the wrong person as their neighbour, some may have not reported some neighbours, some may have reported extra neighbours and some may have even put themselves as their own neighbour!</p>

<p>Help Abbey draw a map of the city that is consistent with all of the census results if possible. The city map is consistent if every household wrote down exactly their neighbours.</p>

### 입력

<p>The first line contains a single integer n (4 &le; n &le; 200), which is the number of houses in the city.</p>

<p>The next n lines describe the census results in order from house 1 to house n. Each of these lines starts with an integer k (2 &le; k &le; 4), which is the number of neighbours of this house. Then follow k distinct integers between 1 and n inclusive, which are the house numbers of the neighbours.</p>

### 출력

<p>If there is no valid map that is consistent with the input, display &minus;1.</p>

<p>Otherwise, display a map of the city. The first line of a map is two integers r and c, which are dimensions of the map. Then display a grid of r &times;c integers. The numbers 1 to n should appear exactly once and the map should be consistent with the input.</p>

<p>If there are multiple correct solutions, any one will be accepted.</p>