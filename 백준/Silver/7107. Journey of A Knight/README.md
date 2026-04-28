# [Silver II] Journey of A Knight - 7107

[문제 링크](https://www.acmicpc.net/problem/7107)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 181, 정답: 103, 맞힌 사람: 89, 정답 비율: 57.419%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>The size of a right-angled cell board is n*m cells. The chess knight is located in the left bottom cell of the board (coordinates 1;1), as shown in pic.1.</p>

<p>The chess knight can move according to the chess rules - during each turn it can move according to the chess rules- either one cell in the vertical direction and one in horizontal or vice versa.</p>

<p>Thus, for example, if n=4 and m=3 and the knight is located in the cell (2;1) (see pic.2), then with the next turn it can move in any of the following cells : (1;3),(3;3) or (4;2).</p>

<p>For the given natural numbers n,m,i,j (n&lt;=100,m&lt;=100,i&lt;=n,j&lt;=m) given in the input your task is to determine and output, which is the least possible number of moves for the knight to reach the cell (i;j), starting from the cell (1;1).</p>

<p>If it is not possible to reach this cell, output one single word &quot;NEVAR&quot;.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/7107.%E2%80%85Journey%E2%80%85of%E2%80%85A%E2%80%85Knight/0cd54216.png" data-original-src="https://upload.acmicpc.net/1d8044ee-8da9-46b4-9a37-bc3780f0a31e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Pic. 1</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/7107.%E2%80%85Journey%E2%80%85of%E2%80%85A%E2%80%85Knight/12cf8133.png" data-original-src="https://upload.acmicpc.net/c4250cff-282e-4b68-b587-266c73ee0f82/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Pic. 2</p>

### 입력



### 출력

