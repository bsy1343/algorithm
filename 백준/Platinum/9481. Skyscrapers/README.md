# [Platinum III] Skyscrapers - 9481

[문제 링크](https://www.acmicpc.net/problem/9481)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 512 MB

### 통계

제출: 118, 정답: 41, 맞힌 사람: 32, 정답 비율: 38.095%

### 분류

조합론, 다이나믹 프로그래밍, 수학

### 문제 설명

<p>Skyscrapers is a pencil puzzle. It&rsquo;s played on a square nxn grid. Each cell of the grid has a building. Each row, and each column, of the grid must have exactly one building of height 1, height 2, height 3, and so on, up to height n. There may be numbers at the beginning and end of each row, and each column. They indicate how many buildings can be seen from that vantage point, where taller buildings obscure shorter buildings. In the game, you are given the numbers along the outside of the grid, and you must determine the heights of the buildings in each cell of the grid.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9481.%E2%80%85Skyscrapers/c7630f04.png" data-original-src="https://www.acmicpc.net/upload/images2/skyscrapper.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:245px; width:573px" /></p>

<p>Consider a single row of a puzzle of size nxn. If we know how many buildings can be seen from the left, and from the right, of the row, how many different ways are there of populating that row with buildings of heights 1..n?&nbsp;</p>

### 입력

<p>There will be several test cases in the input. Each test case consists of three integers n a single line: n (1&le;n&le;5,000), left (1&le;left&le;n), and right (1&le;right&le;n), where n is the size of the row, and left and right are the number of buildings that can be seen from the left and right, respectively. The Input will end with a line with three 0s.</p>

### 출력

<p>For each test case, print a single integer indicating the number of permutations which satisfy the constraints, modulo 1,000,000,007 (that&rsquo;s not a misprint, the last digit is a seven). Output no extra spaces, and do not separate answers with blank lines.</p>