# [Platinum II] Great GDP - 17986

[문제 링크](https://www.acmicpc.net/problem/17986)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 44, 정답: 14, 맞힌 사람: 12, 정답 비율: 38.710%

### 분류

자료 구조, 분리 집합, 그리디 알고리즘, 매개 변수 탐색, 우선순위 큐, 트리

### 문제 설명

<p>In your beloved homeland Treetopia, there is exactly one way of travelling between any pair of cites. In the loathful Cyclostan, on the other hand, there are exactly two ways of travelling between every pair of cities.</p>

<p>A delegation from Cyclostan is coming to visit Treetopia, and you realize that this is your big chance of persuading them to adopt the benefits of a tree-like society! Your friend &Oslash;yvind will decide on a travel plan for the Cyclostan delegation. In order to impress the delegation as much as possible, you persuade &Oslash;yvind to take them to parts of the country such that the GDP per capita is maximized across the visited cities. The trip can include visiting cities on several branches in the country, and it is not possible to travel through a city without visiting it.</p>

<p>The one and only airport in Treetopia is in the capital Treetopolis, and this is where the delegation from Cyclostan will arrive.</p>

### 입력

<p>The first line of input contains an integer n (1 &le; n &le; 100 000), the number of cities in Treetopia. Then follows a line with n non-negative integers c<sub>1</sub>, c<sub>2</sub>, . . . c<sub>n</sub> (0 &le; c<sub>i</sub> &le; 1 000 000 for each i &isin; {1, 2, . . . , n}), the GDP of each city. Then follows a line with n positive integers k<sub>1</sub>, k<sub>2</sub>, . . . , k<sub>n</sub> (1 &le; k<sub>i</sub> &le; 1 000 000 for each i &isin; {1, 2, . . . , n}), the population of each city in Treetopia. Then follows n &minus; 1 lines, the j<sup>th</sup> of which with two distinct integers u<sub>j</sub> and v<sub>j</sub> (1 &le; u<sub>j</sub>, v<sub>j</sub> &le; n), indicating that there is a road between cities u<sub>j</sub> and v<sub>j</sub>. Treetopolis is city number 1.</p>

### 출력

<p>The highest possible GDP per capita of a connected region of Treetopia that contains Treetopolis. Any answer within an absolute or relative error of 10<sup>-6</sup> will be accepted as a correct answer.</p>