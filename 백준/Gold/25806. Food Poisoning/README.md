# [Gold I] Food Poisoning - 25806

[문제 링크](https://www.acmicpc.net/problem/25806)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 92, 정답: 21, 맞힌 사람: 15, 정답 비율: 19.231%

### 분류

다이나믹 프로그래밍, 수학

### 문제 설명

<p>Your friend, Mikey, has had issues recently; every week he gets food poisoning. Mikey is pretty sure that the food poisoning is from <u><em>exactly one</em></u> restaurant; he doesn&rsquo;t know which one though. Mikey wants to devise a strategy to find out. He wants to find out as quickly as possible (least number of weeks).</p>

<p>Mikey is willing to eat at a subset of his usual restaurants each week to find the bad restaurant (the subset can be as small or as large as needed). However, Mikey doesn&rsquo;t want to get food poisoning too many times, so he wants to find the bad restaurant while getting poisoned <u><em>at most k times</em></u>.</p>

<p>Note that if Mikey eats at a subset of restaurants in a given week and gets food poisoning, then the bad restaurant is in that subset; if he doesn&rsquo;t get food poisoning, then the bad restaurant is not in that subset. Note also that the subset of restaurants for different weeks do not have to be the same size.</p>

<p>Given the number of restaurants and the maximum allowable number of times to get food poisoning, determine (in the worst case) the least number of weeks needed to find out which restaurant is giving Mikey food poisoning.</p>

### 입력

<p>There is only one input line; it contains two integers: n (1 &le; n &le; 100,000), indicating the number of restaurants, and p (1 &le; p &le; 10,000), indicating the maximum number of times Mikey is willing to get food poisoning.</p>

### 출력

<p>Print the least number of weeks Mikey will need to eat before definitively determining which restaurant is giving him food poisoning, given an optimum strategy, but worst luck. Note that there will always be an answer.</p>

### 힌트

<p>Explanation of the First Sample Input/Output: Mikey can eat in one restaurant each week; that will tell him if that restaurant is causing the food poisoning. After at most 7 weeks, he will know the bad restaurant since there are only 8 restaurants.</p>