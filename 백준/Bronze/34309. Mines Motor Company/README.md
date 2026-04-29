# [Bronze II] Mines Motor Company - 34309

[문제 링크](https://www.acmicpc.net/problem/34309)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 61, 정답: 52, 맞힌 사람: 49, 정답 비율: 89.091%

### 분류

구현, 문자열, 사칙연산, 수학

### 문제 설명

<p>A group of highly successful Mines Computer Science and Mechanical Engineering graduates decided to create an electric car company called Mines Motor Company. The company has been very successful and recently opened their production plant. In the production plant, there are multiple workstations in a grid layout. The rows and columns of the grid are both labeled using uppercase letters (A-Z for rows from top to bottom, and A-Z for columns from left to right). Figure $1$ shows this grid. Travel between two workstations can only occur via the horizontal and vertical paths, and each workstation is exactly $1$ unit away from its four cardinally-adjacent workstations (above, below, right, and left). For instance to go from AA to BB a product must first visit either AB or BA before proceeding on to BB, resulting in a distance of $2$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/34309.%E2%80%85Mines%E2%80%85Motor%E2%80%85Company/6c11035f.png" data-original-src="https://boja.mercury.kr/assets/problem/34309-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 397px;"></p>

<p style="text-align: center;"><strong>Figure 1</strong>: The production plant grid layout.</p>

<p>In the current layout, the engineers noticed that products must travel a long distance through the plant to be completed. To optimize the location of the workstations, the company wants to track a single product's travel within the plant. As a start for our tracking software, we need to program an algorithm that answers the following question:</p>

<p>Given the order of workstations that a product has to visit, what is the total distance traveled?</p>

### 입력

<p>The first line of input is $ \leq N \leq 100\,000$, the number of workstations that have to be visited. The remaining $N$ lines are the locations of the workstations in the format <code>[ROW][COLUMN]</code> where <code>[ROW]</code> and <code>[COLUMN]</code> are both single uppercase letters indicating the row and column of the workstation. You can assume that the product is already at the first workstation and will stay at the last workstation.</p>

### 출력

<p>Output an integer representing the total distance traveled to complete that path. </p>