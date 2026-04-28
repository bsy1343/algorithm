# [Gold III] Rabbit House - 23001

[문제 링크](https://www.acmicpc.net/problem/23001)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 118, 정답: 59, 맞힌 사람: 51, 정답 비율: 48.113%

### 분류

너비 우선 탐색, 자료 구조, 그래프 이론, 그래프 탐색, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>Barbara got really good grades in school last year, so her parents decided to gift her with a pet rabbit. She was so excited that she built a house for the rabbit, which can be seen as a 2D grid with R rows and C columns.</p>

<p>Rabbits love to jump, so Barbara stacked several boxes on several cells of the grid. Each box is a cube with equal dimensions, which match exactly the dimensions of a cell of the grid.</p>

<p>However, Barbara soon realizes that it may be dangerous for the rabbit to make jumps of height greater than 1 box, so she decides to avoid that by making some adjustments to the house. For every pair of adjacent cells, Barbara would like that their absolute difference in height be at most 1 box. Two cells are considered adjacent if they share a common side.</p>

<p>As all the boxes are superglued, Barbara cannot remove any boxes that are there initially, however she can add boxes on top of them. She can add as many boxes as she wants, to as many cells as she wants (which may be zero). Help hew determine what is the minimum total number of boxes to be added so that the rabbit&#39;s house is safe.</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T test cases follow.</p>

<p>Each test case begins with a line containing two integers R and C.</p>

<p>Then, R lines follow, each with C integers. The j-th integer on i-th line, Gi,j, represents how many boxes are there initially on the cell located at the i-th row and j-th column of the grid.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where x&nbsp;is the test case number (starting from 1) and y&nbsp;is the minimum number of boxes to be added so that the rabbit&#39;s house is safe.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
	<li>0 &le; G<sub>i,j</sub> &le; 2&sdot;10<sup>6</sup>, for all i, j.</li>
</ul>

### 힌트

<p>In Sample Case #1, the absolute difference in height for every pair of adjacent cells is already at most 1 box, so there is no need to add any extra boxes.</p>

<p>In Sample Case #2, the absolute difference in height of the left-most cell and the middle cell is 3 boxes. To fix that, we can add 2 boxes to the middle cell. But then, the absolute difference of the middle cell and the right-most cell will be 2 boxes, so Barbara can fix that by adding 1 box to the right-most cell. After adding these 3 boxes, the safety condition is satisfied.</p>

<p>In Sample Case #3, the cell in the middle of the grid has an absolute difference in height of 2 boxes with all of its four adjacent cells. One solution is to add exactly 1 box to all of the middle&#39;s adjacent cells, so that the absolute difference between any pair of adjacent cells will be at most 1 box. That requires 4 boxes in total.</p>