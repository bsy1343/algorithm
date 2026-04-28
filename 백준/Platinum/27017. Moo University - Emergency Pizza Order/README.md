# [Platinum III] Moo University - Emergency Pizza Order - 27017

[문제 링크](https://www.acmicpc.net/problem/27017)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 3, 맞힌 사람: 3, 정답 비율: 16.667%

### 분류

이분 매칭

### 문제 설명

<p>Moo U&#39;s cafeteria has run out of hay and so must order pizzas for the C (1 &le; C &le; 1,000) calves attending Moo U. Conveniently, a large pizza from the local pizzeria, Pizza Farm, serves exactly one calf.</p>

<p>Pizza Farm is willing to make a pizza for each calf, but, due to the size of the order, has three constraints on the order:</p>

<ul>
	<li>Although Pizza Farm has long list of T (1 &le; T &le; 30) vegetarian toppings, each of the pizzas must have exactly K (1 &le; K &le;T) toppings</li>
	<li>No topping on a pizza can be duplicated (a pizza cannot have onions and onions, for example).</li>
	<li>No two pizzas in the order can have the same set of toppings.For example, if pizza 1 has onions, green peppers, pineapples, and wheat grass, then it can be the only pizza with that exact set of toppings, although pizza 2 might have onions, green peppers, pineapples, and also olives.For ordering purposes, the toppings are numbered 1..T.</li>
</ul>

<p>The calves at Moo U are very picky when it comes to their pizza toppings. Some calves might not like all of the toppings available. A calf will eat a pizza only she likes every single one of the toppings on that pizza. Determine the maximum number of calves that can be fed.</p>

### 입력

<ul>
	<li>Line 1: Three integers: C, T, and K.</li>
	<li>Lines 2..C+1: Each line of space-separated integers describes which toppings one of the calves likes. The first integer on a line is the number of topping the calf likes. The remaining integers on the line are the toppings that the calf likes.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer, the maximum number of calves that can be fed.</li>
</ul>