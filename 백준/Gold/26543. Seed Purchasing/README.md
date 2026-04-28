# [Gold III] Seed Purchasing - 26543

[문제 링크](https://www.acmicpc.net/problem/26543)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>The new season has begun, and it is time to purchase all new seeds. But there are so many choices! And so many variables. Every bag of seeds costs a certain amount, and each bag also produces a certain number of crops, which each sells for a certain amount of money. It&rsquo;s awful to keep track of, and you simply can&rsquo;t do all the math in your head. Create a program to determine the maximum amount of money you can earn on crops this year given the amount you have available to spend on seeds.</p>

### 입력

<p>The first line will contain a single integer n that indicates the number of data sets that follow. Each data set will start with a single integer x denoting how many different seed choices there are, followed by a floating point number y denoting how much you have to spend. The next x lines will consist of a floating point number c, an integer m, and a floating point number p, representing the cost of each bag, the number of crops it produces, and the selling price of each crop the bag produces. The store has an unlimited supply of each variety of seeds.</p>

### 출력

<p>For each test case, output the maximum amount of money you can make selling crops this season. Do not include the change from your seed purchases in the answer.</p>