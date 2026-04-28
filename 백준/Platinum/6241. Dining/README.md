# [Platinum I] Dining - 6241

[문제 링크](https://www.acmicpc.net/problem/6241)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 642, 정답: 314, 맞힌 사람: 253, 정답 비율: 45.341%

### 분류

그래프 이론, 최대 유량

### 문제 설명

<p>Cows are such finicky eaters. Each cow has a preference for certain foods and drinks, and she will consume no others.</p>

<p>Farmer John has cooked fabulous meals for his cows, but he forgot to check his menu against their preferences. Although he might not be able to stuff everybody, he wants to give a complete meal of both food and drink to as many cows as possible.</p>

<p>Farmer John has cooked F (1 &lt;= F &lt;= 100) types of foods and prepared D (1 &lt;= D &lt;= 100) types of drinks. Each of his N (1 &lt;= N &lt;= 100) cows has decided whether she is willing to eat a particular food or drink a particular drink. Farmer John must assign a food type and a drink type to each cow to maximize the number of cows who get both.</p>

<p>Each dish or drink can only be consumed by one cow (i.e., once food type 2 is assigned to a cow, no other cow can be assigned food type 2).</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: N, F, and D</li>
	<li>Lines 2..N+1: Each line i starts with a two integers F_i and D_i, the number of dishes that cow i likes and the number of drinks that cow i likes. The next F_i integers &nbsp;denote the dishes that cow i will eat, and the D_i integers following that denote the drinks that cow i will drink</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that is the maximum number of cows that can be fed both food and drink that conform to their wishes</li>
</ul>