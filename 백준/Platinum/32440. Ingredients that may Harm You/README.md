# [Platinum IV] Ingredients that may Harm You - 32440

[문제 링크](https://www.acmicpc.net/problem/32440)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 77, 정답: 27, 맞힌 사람: 22, 정답 비율: 42.308%

### 분류

소수 판정, 수학, 에라토스테네스의 체, 정수론, 포함 배제의 원리

### 문제 설명

<p>In Nlogonia, foods are identified by numbers. Prime numbers identify the basic ingredients, and the number that identifies each food is given by the product of the numbers associated with the ingredients that compose it, respecting multiplicities. For example, a food with the number $12$ contains two units of the ingredient $2$, and one unit of the ingredient $3$, since $12 = 2 \cdot 2 \cdot 3$.</p>

<p>You live in Nlogonia, and you own a self-service restaurant, that is, where people assemble their own dishes with the food available in the restaurant. You are expecting to serve $Q$ people in your restaurant today.</p>

<p>Each person has a set of allergies, which are identified by an integer in the same way: each prime number that divides the person’s number indicates that he or she is allergic to the ingredient associated with that prime number.</p>

<p>Given the numbers associated with each food item in your restaurant, calculate, for each of the $Q$ people, how many different dishes she can assemble so that there is no ingredient in the dish to which she is allergic.</p>

### 입력

<p>The first line of the input contains an integer $N$ ($1 ≤ N ≤ 10^5$), the number of foods in your restaurant. The next line contains the numbers associated with each food $V_i$ ($1 ≤ V_i ≤ 10^6$). The next line contains an integer $Q$ ($1 ≤ Q ≤ 10^5$), the number of people who will eat at your restaurant. $Q$ lines follow; the $i$-th of them contains a number $X_i$ ($1 ≤ X_i ≤ 10^6$), the number representing the allergies of person $i$.</p>

### 출력

<p>For each of the $Q$ people, print a number: the number of dishes that can be assembled with the restaurant’s ingredients, so that none of the ingredients to which the person is allergic are present. Since the answer may be very large, print the remainder when dividing it by $10^9 + 7$.</p>