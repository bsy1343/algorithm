# [Gold V] Password - 18338

[문제 링크](https://www.acmicpc.net/problem/18338)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 59, 정답: 29, 맞힌 사람: 27, 정답 비율: 51.923%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>After working for several months at Cafebazaar, Farhad became rich enough to buy a house in the valley of the rich. There he met Shirin several times. Now, he is considering proposing to her whether she would marry him. To surprise her, he wants to install an application on her phone that pops up at the exact right time and asks if she would marry him.</p>

<p>However, to install the application secretly, he needs her password which he unfortunately does not have. He knows her password is a poly-line consisting of vertical or horizontal line segments. Each line segment connects the center of two cells in a 3 &times; 3 grid. Looking at her hand while she unlocked her phone, Farhad learned the direction of each line segment. However, he was too distracted to also learn the length of each segment. He also knows that her phone&rsquo;s operating system does not allow the poly-line to intersect with itself even in one point.</p>

<p>Farhad wants to distract Shirin long enough to try all possible patterns given what he already knows. Unfortunately, he has no idea how long that will take. That is why, he has now turned to you for help. Help him by writing a program that calculates the total number of possible password patterns given the direction of the line segments. The following figure depicts two valid and one invalid patterns given the line segments were directed towards right, down, left, and up in order.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18338.%E2%80%85Password/d37863be.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/18338.%E2%80%85Password/d37863be.png" data-original-src="https://upload.acmicpc.net/14d5e671-5698-45c1-84bc-6e62d8b2151b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 468px; height: 201px;" /></p>

### 입력

<p>In the only line of the input, a single string is given consisting of characters R, U, L, and D which represent a line segment toward right, up, left, and down, respectively. The length of this string is at most 10. Every two consecutive characters is guaranteed to be different.</p>

### 출력

<p>In the only line of the output, print the number of patterns satisfying Farhad&rsquo;s knowledge of the password. Note that this number might be zero.</p>