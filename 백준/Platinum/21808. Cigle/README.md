# [Platinum I] Cigle - 21808

[문제 링크](https://www.acmicpc.net/problem/21808)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 56, 정답: 21, 맞힌 사람: 17, 정답 비율: 33.333%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>In an alternate reality <em>Earth 616</em> young Stjepan lives a totally different life. Currently he is enrolled in a brick-crafting course at School of Arts and Design. As every child there, he is obsessed with patterns. For example, his homework requires him to build a brick wall using $N$ bricks. But he will not start building until he is satisfied with his two-dimensional sketch.</p>

<p>On the sketch, every brick can be represented as a rectangle with unit size height and width of size $d_i$. He chooses the order of bricks beforehand and starts sketching from the bottom-most row.</p>

<p>In the first row he will place some number of bricks going from left to right. In the second row he will be placing bricks from right to left and the first brick in the second row will align with the last brick in the first row (their right edges will align). Next, in the third row he will be placing the bricks again from left to right. The first brick in the third row will align with the last from the second row but this time the left edges. He continues this process until there are no bricks left. He may choose to build wall with arbitrary number of rows.</p>

<p>Stjepan uses super cement so a brick may be placed in the wall so that there is no other brick directly underneath. <strong>Beauty of the wall</strong> is a number of places where 4 bricks touch</p>

<p>For a <strong>given order</strong> of bricks and their respective sizes help find the largest possible beauty of the wall.</p>

### 입력

<p>First line contains an integer $N$ from the task description.</p>

<p>Second line contains $N$ integers $d_i$ from the task description.</p>

### 출력

<p>Print the largest possible beauty of any wall that can be built.</p>

### 제한

<p>Let M be width of the largest brick. 1 &le; M &le; 5 000 will hold unless otherwise specified.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/21808.%E2%80%85Cigle/ba66cf4c.png" data-original-src="https://upload.acmicpc.net/6b3a5736-4d30-4817-9693-639eea2fea17/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 601px; height: 94px;" /></p>

<p style="text-align: center;">Wall with beauty 4 for the third example.</p>