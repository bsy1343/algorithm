# [Platinum III] Jurassic Park - 32617

[문제 링크](https://www.acmicpc.net/problem/32617)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 10, 맞힌 사람: 5, 정답 비율: 12.821%

### 분류

기하학, 무작위화, 브루트포스 알고리즘, 수학, 정렬, 확률론

### 문제 설명

<p>Having just watched the famous Spielberg film, you are determined to build your own dinosaur amusement park here in the Netherlands. However, you first need to build the enclosure for the dinosaurs.</p>

<p>The land you bought for the amusement park already contains a number of fence posts. The Fence Post Committee does not allow you to move them, so you'll have to build your enclosure using the fence posts you get. The committee does not disclose their reasoning behind the placement of the fence posts, but they appear to be <em>uniformly randomly</em> distributed across the park. The Netherlands are quite flat, so you can view the fence posts as points in the 2D plane.</p>

<p>Since you are on a budget, your goal is to use the least amount of fence possible to build a proper enclosure, to not let the dinosaurs escape. A proper enclosure is a closed loop of some fences, spanning between fence posts, and has a nonzero area. Furthermore, fences are not able to intersect.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($3\leq n\leq 10\,000$), the number of fence posts on your plot of land.</li>
	<li>$n$ lines, each containing two numbers $x$ and $y$ ($-1000 \leq x,y \leq 1000$), the $x$- and $y$-coordinates of a fencepost.</li>
</ul>

<p>It is guaranteed that there are exactly $60$ testcases, and the coordinates of the fence posts are uniformly randomly generated for each testcase. The samples are for illustration only.</p>

<p>Each of your submissions will be run on new random test cases.</p>

### 출력

<p>Output the perimeter of the smallest possible proper enclosure.</p>

<p>Your answer should have an absolute or relative error of at most $10^{-6}$.</p>