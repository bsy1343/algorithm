# [Gold III] B Road Band - 30525

[문제 링크](https://www.acmicpc.net/problem/30525)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 16, 맞힌 사람: 14, 정답 비율: 63.636%

### 분류

다이나믹 프로그래밍, 기하학, 수학

### 문제 설명

<p>All the residents of the rural community of Axes Point live on one of two parallel streets separated by a band of green park land. Recently, the local board of supervisors received a grant to (finally) bring wireless service to the town. The grant provides enough money for them to install $k$ access points, and the supervisors have decided to place them in a straight line on County Road &quot;B,&quot; which lies in the wooded band midway between the two residential streets. They want to place them in a way that minimizes the distance between users and their nearest access point. Specifically, they want to minimize the sum of the squares of the distances of each user from their nearest access point. For instance, Figure \ref{samplefig} shows two streets with eight customers and their locations along the streets (this is the first sample input). The streets are $3$ units apart, and two access points have been placed at points midway between the two streets so that the sum of the eight squared distances is minimized.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30525.%E2%80%85B%E2%80%85Road%E2%80%85Band/f9b51df9.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/30525.%E2%80%85B%E2%80%85Road%E2%80%85Band/f9b51df9.png" data-original-src="https://upload.acmicpc.net/825b9474-4a87-4e47-a74a-fd30e44f1bdf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 163px;" /></p>

<p style="text-align: center;">Figure B.1: Sample Input 1 showing placement of access points</p>

<p>Given the locations of all customers along each of the two streets, the distance between the streets, and the number of access points, help the local government determine the minimum sum of squared distances that can be achieved.</p>

### 입력

<p>There are three lines of input. The first line contains four integers $m$, $n$, $k$, $s$, where $m$ and $n$ ($1 \leq m,n \leq 1\,000$) are the number of customers along each of the two roads, $k$ ($1 \leq k \leq \min(\max(m,n),100)$) is the number of access points to be placed, and $s$ ($1 \leq s \leq 50$) is the distance separating the two roads. The second line contains $m$ floating-point values $x_1, x_2, \cdots, x_m$ ($0 \leq x_i \leq 1\,000$) giving the locations of the $m$ customers along the first road. The third line is similar, containing $n$ floating-point locations of customers along the second road. All values on each of the second and third lines will be distinct (but some values may appear in both lines). Customer locations will have no more than four decimal places.</p>

### 출력

<p>Output a single floating-point value equal to the minimum sum of squared distances for each customer from the closest of the $k$ access points. Answers should be correct to within an absolute or relative error of $10^{-5}$.</p>