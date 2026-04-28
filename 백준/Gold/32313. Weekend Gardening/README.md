# [Gold III] Weekend Gardening - 32313

[문제 링크](https://www.acmicpc.net/problem/32313)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 10, 맞힌 사람: 7, 정답 비율: 43.750%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Your roommate is planning some weekend projects to make your yard look better. The plan is to buy some plants. Your roommate wants to spend at least L dollars and at most H dollars. There are three different types of plants: cheap, normal, and expensive. Unfortunately, you cannot tell the difference by just looking at a plant. You know that each type has a different cost, and you know how many of each type your local nursery has in stock.</p>

<p>Now you are spending your time walking through the nursery aisles, picking out a plant, bringing it over to be rung up by the clerk, and praying that you stay within your desired total cost (your allotted budget). If you are not within your desired total cost (i.e., if your total cost is too low or too high), your roommate will get frustrated.</p>

<p>Given the cost and number of each plant type along with your desired budget range, determine the probability that you can buy plants one at a time and staying within your total cost range.</p>

### 입력

<p>The first input line contains two integers: L and H (1 &le; L &le; H &le; 10<sup>9</sup>), representing the low and high end of the budget, respectively.</p>

<p>The second input line contains three integers: C, N, and E (1 &le; C &lt; N &lt; E &le; 10<sup>9</sup>), representing the cost of the cheap, normal, and expensive plants, respectively.</p>

<p>The third input line contains three integers: c, n, and e (1 &le; c, n, e &le; 100), representing the number of cheap, normal, and expensive plants, respectively.</p>

### 출력

<p>Print the probability that you will successfully complete the purchase within the desired budget by choosing plants one at a time. Your answer will be accepted if it is within 10<sup>-6</sup> of the correct answer.</p>