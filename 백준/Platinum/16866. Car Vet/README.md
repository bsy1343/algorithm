# [Platinum IV] Car Vet - 16866

[문제 링크](https://www.acmicpc.net/problem/16866)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 19, 맞힌 사람: 17, 정답 비율: 45.946%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Bob Roberts is the self proclaimed &ldquo;Car Vet&rdquo; who owns several junk car lots where people can come and search for spare parts for their (ailing) cars. The cars in each lot are parked in a fenced-in m &times; n grid lot, where each car takes up two grid squares. Each lot also has zero or more grid locations devoted to piles of parts (fenders, 8-track tape players, wheel covers, fuzzy dice, etc.); these locations are effectively blocked. Business has been so good that each of Bob&rsquo;s lots has only one empty grid space left.</p>

<p>From time to time, Bob or one of his lot attendants drops a part on the ground and it rolls underneath one of the cars. The only way to retrieve it is to move the car out of the way. Depending on the location of the empty grid space, it may be necessary to move several cars in order to achieve this. Cars can only move forward or backward, and car movement is also constrained by the fence, which prevents any car from moving off the lot, and by the blocked grid locations containing piles of parts.</p>

<p>Figure A.1 shows an example. An ambihelical hexnut has rolled under car number 3 in row 3, column 3 of the grid (shaded dark gray). The space in row 1, column 3 is empty and the space in row 3, column 4 is blocked. The only way to retrieve the part is to move car 8, then car 4, then car 3. Note that if the locations of the empty grid cell and the blocked grid cell were reversed, it would not be possible to retrieve the part.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/d81d3985-1714-4e54-9b44-5b6d35b46f54/-/preview/" style="width: 165px; height: 165px;" /></p>

<p>Figure A.1: Sample lot. Cars 8, 4, and 3 must be moved, in that order, to uncover the grid location in row 3, column 3. This corresponds to Sample Input 1.</p>

<p>The problem here should be obvious: For a given location Bob would like to know how to move cars around to uncover that location, or if it is even possible to uncover it.</p>

### 입력

<p>Input starts with a line containing two positive integers m n (m, n &le; 250) indicating number of rows and columns of the junk car lot. Following this are m lines each containing n integers; the j<sup>th</sup> value on the i<sup>th</sup> line indicates the contents of the grid square at row i, column j. All values v are in the range &minus;2 &le; v &le; 62 500. Each non-negative value indicates that half of a junk car is in that location. Every non-negative value appears exactly twice and these two occurrences are horizontally or vertically adjacent to each other. A value of &minus;1 indicates the empty grid location and a value of &minus;2 indicates a blocked location. There is always exactly one empty location and at least one car, but there may be zero or more blocked locations. Following these m lines is a single line containing two integers r c (1 &le; r, c &le; 250) indicating the row and column number of the desired location to be uncovered. This will always correspond to the location of a junk car.</p>

### 출력

<p>Display, on a single line separated by spaces, the numbers of the cars that must be moved to make the given location empty. They should appear in the order in which they must be moved. If there is more than one sequence of possible moves, display the sequence of shortest length. If there is still a tie, display the sequence that comes lexicographically first according to the car numbers in the sequence. If it is not possible to uncover the desired location, display impossible.</p>