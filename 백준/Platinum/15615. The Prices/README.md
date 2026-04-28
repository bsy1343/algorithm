# [Platinum V] The Prices - 15615

[문제 링크](https://www.acmicpc.net/problem/15615)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 26, 맞힌 사람: 10, 정답 비율: 58.824%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Byteasar works as a Purchasing Manager at one of Byteotian restaurants. Every evening he receives a shopping list from his manager. Food products must be purchased the next day, in the morning. Byteasar should buy exactly one piece of each product from the list. Manager is always pressing that the total costs are as little as possible.</p>

<p>Byteasar sits down in the evening with his computer and checks the prices of all needed products at local grocery wholesalers. He also knows the cost of the trips from the restaurant to each wholesale and back. Now Byteasar must decide which products are to be purchased at each of the warehouses.</p>

<p>For each wholesale, where Byteasar decided to buy some products, he does as follows. He would go from the restaurant to the warehouse, will do the shopping and immediately bring the purchased products back to the restaurant. Luckily, the boot of his car is big enough that it eliminates the need to visit any of the warehouses more than once, as all the purchased goods can be delivered in one go. Food products are highly perishable, so during one trip Byteasar can make purchases only at one warehouse.</p>

<p>Write a program that will help Byteasar to calculate the cheapest way of making all the purchases.</p>

### 입력

<p>The first line of input contains two integers n and m (1 &le; n &le; 100, 1 &le; m &le; 16) denoting the number of wholesalers and the number of products that Byteasar should buy. Next n lines contain descriptions of the prices at individual wholesalers.</p>

<p>The first number in the i-th of these lines, d<sub>i</sub> (1 &le; d<sub>i</sub> &le; 1,000,000), describes the trip cost from the restaurant to the i-th warehouse (including the return cost). It is followed by a sequence of m integers c<sub>i,1</sub>, c<sub>i,2</sub>, ..., c<sub>i,m</sub> (1 &le; c<sub>i,j</sub> &le; 1,000,000): number c<sub>i,j</sub> denotes the price of j-th product in the i-th warehouse.</p>

### 출력

<p>Your program should output a single line containing a single integer denoting the sum of the product prices and the cost of the trips to warehouses selected by Byteasar in the cheapest possible purchase plan.</p>

### 힌트

<p>Byteasar buys the product number 2 in the first warehouse, and all the other products in the second one. So he does not have to visit the third warehouse.</p>