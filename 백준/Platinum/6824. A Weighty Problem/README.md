# [Platinum V] A Weighty Problem - 6824

[문제 링크](https://www.acmicpc.net/problem/6824)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 22, 정답: 11, 맞힌 사람: 7, 정답 비율: 41.176%

### 분류

다이나믹 프로그래밍, 배낭 문제, 정렬

### 문제 설명

<p>You like to make purchases using coins, but you have a problem: you have so much change that it is too heavy in your pocket. You have devised a plan to reduce the weight of your change, and you need to write a program to help you execute it.</p>

<p>Here is your plan. The next purchase you make costs C (1 &le; C &le; 100, 000) cents, and you know how the store will pay back change if you pay extra. You want to select some of your coins that have total value at least C and make the purchase, such that you minimize the weight of the coins you did not spend added to the weight of the coins the store returns to you.</p>

<p>If the store owes you X cents, then it uses the following algorithm to pay you back. The store gives you the largest denomination coin that has value at most X, and repeats this until all X cents have been paid to you. You may assume the store has an unlimited amount of every denomination of coin.</p>

<p>There are D (1 &le; D &le; 100) denominations of coins. The i&rsquo;th denomination (1 &le; i &le; D) has integer value V<sub>i</sub> (1 &le; V<sub>i</sub> &le; 2000) in cents and real-valued weight W<sub>i</sub> (0 &lt; W<sub>i</sub> &lt; 10) in grams. You may assume that one of the denominations has value 1 and that no two denominations have the same value.</p>

<p>You have K (1 &le; K &le; 100) coins. The j&rsquo;th coin (1 &le; j &le; K) is of the denomination with index D<sub>j</sub> (1 &le; D<sub>j</sub> &le; D).</p>

### 입력

<p>The first line contains three integers: C, the cost of the purchase in cents; D, the number of denominations of coins; and K, the number of coins you have.</p>

<p>The next D lines contain an integer V<sub>i</sub>, the value of the i&rsquo;th denomination in cents, and a real number given to two decimal places, W<sub>i</sub>, the weight of the i&rsquo;th denomination in grams.</p>

<p>The next K lines contain an integer D<sub>j</sub>, the 1-based denomination of the j&rsquo;th coin you have.</p>

### 출력

<p>Output the minimum weight achievable rounded to two decimal places, if you can afford the purchase. If you cannot afford the purchase, print <code>too poor</code>.</p>

### 힌트

<p>You have seven 5-cent coins, and are making a purchase of 3 cents. The denominations are 1-cent, 5-cents, 10-cents, and 20-cents, with respective weights of 1 gram, 2 grams, 1 gram and 9 grams.</p>

<p>There are two optimal solutions. One is to spend three 5-cent coins, so that the store returns 12 cents to you, in the form of one 10-cent coin and two 1-cent coins. The other is to spend four 5-cent coins, so that the store returns 17 cents to you, in the form of one 10-cent coin, one 5-cent coin, and two 1-cent coins.</p>