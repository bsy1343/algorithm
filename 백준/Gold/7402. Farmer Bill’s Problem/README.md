# [Gold V] Farmer Bill’s Problem - 7402

[문제 링크](https://www.acmicpc.net/problem/7402)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 11, 맞힌 사람: 11, 정답 비율: 31.429%

### 분류

브루트포스 알고리즘, 기하학

### 문제 설명

<p>It is rumored that the planet Earth is often visited by Unidentified Flying Objects (UFOs). Sometimes UFOs land and leave burned out regions. Observations show that these regions have the form of circles.</p>

<p>Recently farmer Bill has found such circles on his nice rectangular wheat field. Bill likes all mysterious things very much, so he has decided to keep these circles on the field. However, although being an ufolog, first of all Bill is the farmer, so he needs to harvest his wheat. Therefore he has decided to keep some regions containing circles intact, and harvest the rest of the field.</p>

<p>All regions that Bill keeps unharvested must be rectangles that neither touch nor overlap each other. The sides of the rectangles must be parallel to the sides of the field. All circles left by UFOs must be inside these regions. The total area of the regions must be minimal possible, so that Bill could harvest the maximal possible part of his field.</p>

<p>Now Bill wants to know the total area of the field that he will be able to harvest. Help him!</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7402.%E2%80%85Farmer%E2%80%85Bill%E2%80%99s%E2%80%85Problem/07ce44d6.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/7402.%E2%80%85Farmer%E2%80%85Bill%E2%80%99s%E2%80%85Problem/07ce44d6.png" data-original-src="https://upload.acmicpc.net/42165772-3933-493c-8b43-561d52d8608d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 206px; height: 169px;" /></p>

### 입력

<p>The first line of the input file contains two integer numbers $x$ and $y$ --- the dimensions of Bill&#39;s field ($1 \le x, y \le 1000$). Let Bill&#39;s field be positioned on the plane in such a way that its corners are located in points with coordinates $(0, 0)$, $(x, 0)$, $(x, y)$ and $(0, y)$.</p>

<p>The second line of the input file contains $N$ --- the number of circles left by UFOs on Bill&#39;s field ($0 \le N \le 100$). Next $N$ lines describe circles: each line contains three positive integer numbers $x_i$, $y_i$ and $r_i$ --- coordinates of the center and radius of the circle. Circles may touch, overlap or contain each other. All circles are completely located within the field bounds.</p>

### 출력

<p>Output a single integer number --- the area of the part of the field that Bill will be able to harvest.</p>