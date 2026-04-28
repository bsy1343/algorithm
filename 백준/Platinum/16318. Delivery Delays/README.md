# [Platinum I] Delivery Delays - 16318

[문제 링크](https://www.acmicpc.net/problem/16318)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 124, 정답: 55, 맞힌 사람: 42, 정답 비율: 46.667%

### 분류

다이나믹 프로그래밍, 그래프 이론, 이분 탐색, 최단 경로, 데이크스트라, 매개 변수 탐색

### 문제 설명

<p>Hannah recently discovered her passion for baking pizzas, and decided to open a pizzeria in downtown Stockholm. She did this with the help of her sister, Holly, who was tasked with delivering the pizzas. Their pizzeria is an instant hit with the locals, but, sadly, the pizzeria keeps losing money. Hannah blames the guarantee they put forth when they advertised the pizzeria:</p>

<blockquote>
<p>Do you have a craving for a delicious pizza? Do you want one right now? Order at Hannah&rsquo;s pizzeria and we will deliver the pizza to your door. If more than 20 minutes elapse from the time you place your order until you receive your Hannah&rsquo;s pizza, the pizza will be free of charge!</p>
</blockquote>

<p>Even though Holly&rsquo;s delivery car can hold an arbitrary number of pizzas, she has not been able to keep up with the large number of orders placed, meaning they have had to give away a number of pizzas due to late deliveries.</p>

<p>Hannah provides you with a map of the roads and road intersections of Stockholm. She also gives you the list of yesterday&rsquo;s orders: order i was placed at time s<sub>i</sub> from road intersection u<sub>i</sub>, and the pizza for this order was out of the oven and ready to be picked up for delivery at time t<sub>i</sub>. Hannah is very strict about following the &ldquo;first come, first served&rdquo; principle: if order i was placed before order j (i.e. s<sub>i</sub> &lt; s<sub>j</sub>), then the pizza for order i will be out of the oven before the pizza for order j (i.e. t<sub>i</sub> &lt; t<sub>j</sub>), and the pizza for order i must be delivered before the pizza for order j.</p>

### 입력

<p>The first line of input contains two integers n and m (2 &le; n &le; 1 000, 1 &le; m &le; 5 000), where n is the number of road intersections in Stockholm and m is the number of roads. Then follow m lines, the i&rsquo;th of which contains three integers u<sub>i</sub>, v<sub>i</sub> and d<sub>i</sub> denoting that there is a bidirectional road between intersections u<sub>i</sub> and v<sub>i</sub> (1 &le; u<sub>i</sub>, v<sub>i</sub> &le; n, u<sub>i</sub> &ne; v<sub>i</sub>), and it takes Holly&rsquo;s delivery car d<sub>i</sub> time units to cross this road in either direction (0 &le; d<sub>i</sub> &le; 10<sup>8</sup>). There is at most one road between any pair of intersections.</p>

<p>Then follows a line containing an integer k, the number of orders (1 &le; k &le; 1 000). Then follow k lines, the i&rsquo;th of which contains three integers s<sub>i</sub>, u<sub>i</sub>, t<sub>i</sub> denoting that an order was made at time s<sub>i</sub> from road intersection u<sub>i</sub> (2 &le; u<sub>i</sub> &le; n), and that the order is ready for delivery at time t<sub>i</sub> (0 &le; s<sub>i</sub> &le; t<sub>i</sub> &le; 10<sup>8</sup>). The orders are given in increasing order of when they were placed, i.e. s<sub>i</sub> &lt; s<sub>j</sub> and t<sub>i</sub> &lt; t<sub>j</sub> for all 1 &le; i &lt; j &le; k.</p>

<p>Hannah&rsquo;s pizzeria is located at road intersection 1, and Holly and her delivery car are stationed at the pizzeria at time 0. It is possible to reach any road intersection from the pizzeria.</p>

### 출력

<p>Output a single integer denoting the longest time a customer has to wait from the time they place their order until the order is delivered, assuming that Holly uses a delivery schedule minimizing this value.</p>