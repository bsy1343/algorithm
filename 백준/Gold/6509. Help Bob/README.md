# [Gold I] Help Bob - 6509

[문제 링크](https://www.acmicpc.net/problem/6509)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 9, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Bob loves Pizza but is always out of money. One day he reads in the newspapers that his favorite pizza restaurant, Alfredo&#39;s Pizza Restaurant, is running a competition: they will donate a big pizza to the first person who will tell them the lowest price per area that can be achieved by buying any of the pizzas at most once. &quot;That task is easy!&quot;, thinks Bob, &quot;For each pizza I just calculate the average price and the lowest quotient will be the answer.&quot;.</p>

<p>Unfortunately the problem is a bit more complicated: with some pizzas Alberto gives out discount coupons for getting another pizza cheaper and even worse, those coupons can be combined. The pizzas have to be bought one after the other, and it is not possible to use a coupon to get a discount retrospectively for a pizza which has already been bought. Can you help Bob to become the first to solve this task and to get a pizza for free?</p>

### 입력

<p>The input file contains several test cases. Each test case starts with a number <em>m</em>, the number of pizzas Alfredo offers. Input is terminated by <em>m=0</em>. Otherwise, <em>1 &le; m &le; 15</em>. Then follow <em>m</em> lines describing the pizzas. Each of those following lines describes pizza <em>i</em> (<em>1 &le; i &le; m</em>) and starts with 3 integer numbers <em>p<sub>i</sub></em>, <em>a<sub>i</sub></em> and <em>n<sub>i</sub></em> specifying the price of the pizza, its area and the number of discount coupons you get when buying it, <em>1 &le; p<sub>i</sub> &le; 10000</em>, <em>1 &le; a<sub>i</sub> &le; 10000</em> and <em>0 &le; n<sub>i</sub> &lt; m</em>. Then follow <em>n<sub>i</sub></em> pairs of integer numbers <em>x<sub>i,j</sub></em> and <em>y<sub>i,j</sub></em> specifying the index <em>x<sub>i,j</sub></em> (<em>1 &le; x<sub>i,j</sub> &le; m, x<sub>i,j</sub> &ne; i</em>) of the pizza you get a discount coupon for and the discount in percentage terms <em>y<sub>i,j</sub></em> (<em>1 &le; y<sub>i,j</sub> &le; 50</em>) you get when buying pizza <em>x<sub>i,j</sub></em>. You may assume that for each <em>i</em> the values <em>x<sub>i,j</sub></em> are pairwise distinct.</p>

### 출력

<p>For each test case print one line containing the lowest price per area that can be achieved by buying any of the pizzas at most once. Round this number to 4 places after the decimal point. Note that you can combine an arbitrary number of discount coupons: for a pizza with price 10 and two rabatt coupons for that pizza with a 50 and a 20 on it, you would only have to pay 10 * 0.8 * 0.5 = 4 monetary units.</p>