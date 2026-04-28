# [Gold II] Bulletproof Car Testing - 10616

[문제 링크](https://www.acmicpc.net/problem/10616)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Your boss&rsquo; life is in danger and he ordered bulletproof glass windows for his car. However, he is really skeptical if the window glass is bulletproof. He fired a shot at it from F feet away and it did not break but he is not sure if it will break when fired at a closer range. He now wants to know the minimum distance in feet from where you can fire at the glass from and it will still not break. The bulletproof glass and bullets are both costly items and he wants to minimize the total cost of testing.</p>

<p>The boss knows that he can fire at the glass every feet starting from F-1 feet down to 0 feet and find it out by just consuming one glass. However, by using more glasses he can save the number of bullets needed to find the distance in feet. This might result in a better budget.</p>

<p>Your task is to help your boss find the minimum budget needed to conduct the testing.</p>

### 입력

<p>The input consists of multiple test cases. The first line of input is the number of test cases N (1&le;N&le;100). Each of the following N lines contains three integers F (1&le;F&le;1000), the furthest point from where the glass does not break, G (1&le;G&le;1000), the cost of glass, and B (1&le;B&le;100), the cost of bullet.</p>

### 출력

<p>For each test configuration in the input first, output &ldquo;Case #n: &rdquo; where n is the test configuration number, followed by the total budget you need to conduct the testing.</p>