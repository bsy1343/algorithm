# [Platinum IV] Aquarium Tank - 10415

[문제 링크](https://www.acmicpc.net/problem/10415)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 56, 정답: 33, 맞힌 사람: 28, 정답 비율: 54.902%

### 분류

기하학, 이분 탐색, 다각형의 넓이

### 문제 설명

<p>You just bought an &ldquo;artistic&rdquo; aquarium tank that has an interesting shape, and you poured L litres of water into the tank. How high is the water in the tank?</p>

<p>When you look at this tank from one side, it has the shape of a convex polygon. This polygon has exactly two vertices on the table (y-coordinates are 0), and all other vertices have positive y-coordinates. There are also exactly two vertices with maximum y-coordinates, and water is poured into the opening between these two vertices. This aquarium tank has a depth of D centimetres. The tank is glued to the table, so no matter what shape it has, it keeps its position and does not tip over.</p>

<p>All coordinates and lengths in this problem are given in centimetres. It should be noted that each cubic metre is equivalent to 1 000 litres.</p>

<p>An illustration showing the configuration of the tank of the first sample input is given below:</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10415.%E2%80%85Aquarium%E2%80%85Tank/43a1858f.png" data-original-src="https://www.acmicpc.net/upload/images2/aqua.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:174px; width:313px" /></p>

### 입력

<p>The input consists of a single test case. The first line contains an integer N (4 &le; N &le; 100) giving the number of vertices in the polygon. The next line contains two integers D and L, where 1 &le; D &le; 1 000 is the depth of the aquarium tank and 0 &le; L &le; 2 000 is the number of litres of water to pour into the tank. The next N lines each contains two integers, giving the (x, y) coordinates of the vertices of the convex polygon in counterclockwise order. The absolute values of x and y are at most 1 000. You may assume that the tank has a positive capacity, and you never pour more water than the tank can hold.</p>

### 출력

<p>Print the height of the water (in centimetres) in the aquarium tank on a line to 2 decimal places.</p>