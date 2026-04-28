# [Gold II] Array - 26044

[문제 링크](https://www.acmicpc.net/problem/26044)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 42, 정답: 17, 맞힌 사람: 17, 정답 비율: 44.737%

### 분류

수학, 자료 구조, 집합과 맵, 조합론, 해시를 사용한 집합과 맵

### 문제 설명

<p>In his backyard, Cimrman had created a breakthrough bionic solar array installment.</p>

<p>The array is made of separate cells arranged in a triangular layout. The layout consists of parallel rows, the first row contains one cell, and then the number of cells in each row is always one more than the number of cells in the immediately preceding row. The distances between adjacent cells in each row are the same and they are the same in all rows, and the distances between the consecutive rows are the same. The layout is also symmetrical along the axis perpendicular to the rows and going through the middle of the cell in the first row.</p>

<p>The cells at both ends of all rows and also the cell in the first row are the so-called elementary cells and they are all labelled by 1.</p>

<p>The labelling scheme for the remaining cells is more intricate. Each of the remaining cells in a particular row is connected to exactly two cells in the previous row. These two cells are the closest ones in the previous row to the given cell. The label of the given cell is equal to the sum of the labels of the cells in the previous row to which it is connected.</p>

<p>The cells are maintained by an automated pentacopter. When a cell needs a maintenance it sends out a request containing its label. The pentacopter has to locate the row of the cell when it is given only the label of the cell.</p>

### 입력

<p>The first input line contains one integer Q (1 &le; Q &le; 10<sup>5</sup>), the number of maintenance requests. Each of the next Q lines contains an integer N(1 &le; N &le; 10<sup>9</sup>), the label of a cell producing the request.</p>

### 출력

<p>Output Q lines, for each request print the smallest possible number of a row in the array on which the cell requesting a maintenance is located.</p>