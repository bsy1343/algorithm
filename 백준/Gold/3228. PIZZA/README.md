# [Gold V] PIZZA - 3228

[문제 링크](https://www.acmicpc.net/problem/3228)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 87, 정답: 58, 맞힌 사람: 52, 정답 비율: 71.233%

### 분류

브루트포스 알고리즘, 비트마스킹, 백트래킹

### 문제 설명

<p>Our friend Picko is very reach and he wants to open lots of restaurants with delivery. Tha main food will be, of course, pizza.</p>

<p>He has certain number of potential locations for the restaurants, and he knows the locations of the solitairs with lots of people which will often be his customers.</p>

<p>Delivery of each restaurant will cover all the solitairs in given radius. Picko can open only limited number of restaurants, and he wants that restaurants on the locations which will cover maximal number of people in solitairs.</p>

<p>Write a program that will calculate maximal number of people which we can cover with delivery.&nbsp;</p>

### 입력

<p>In the first line of the input file there are two integers K and R, separated with space, number of restaurants and radius of delivery, 1 &le; K &le; 10, 1 &le; R &le; 500.</p>

<p>In the second line there is integer M, number of locations, K &le; M &le; 20.</p>

<p>In each of the next M lines there are two integer X and Y, separated with space, coordinates of each location, -1000 &le; X,Y &le; 1000.</p>

<p>In the next line there is integerN, number of solitairs, 1 &le; N &le; 100.</p>

<p>In each of the next N lines there are three integers X, Y and S, separated with space, X and Y are coordinates of each solitaire, and S is number of people in that solitaire, -1000 &le; X,Y &le; 1000, 1 &le; S &le; 100. We consider that solitaire is in radius of some restaurant if distance between them is less or equal to R.</p>

<p>There are no two locations of restaurants on the same place.&nbsp;</p>

### 출력

<p>In only line of the output file we have to write maximal number from the text above.&nbsp;</p>