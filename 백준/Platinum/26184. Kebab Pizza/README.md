# [Platinum II] Kebab Pizza - 26184

[문제 링크](https://www.acmicpc.net/problem/26184)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 209, 정답: 49, 맞힌 사람: 47, 정답 비율: 27.168%

### 분류

그래프 이론, 많은 조건 분기

### 문제 설명

<p>Alice loves pizza and plans to throw a pizza party for her birthday, where she will make one big, round pizza for all her guests. She knows that her friends are a bit special when it comes to pizza: Julie does not want any vegetables but loves kebab meat on her pizza. Katy would never eat pizza with cheese on top. Alice herself is a huge fan of pineapple on pizza, while Mickey absolutely hates it. Instead, he wants to put spaghetti on it, which everybody else finds weird. The list goes on and on. Briefly put, it is absolutely impossible to accommodate everybody.</p>

<p>As a compromise, Alice decides to let each person choose two toppings for their pizza slice in advance. Each person will be happy if their slice has exactly their two chosen toppings and none of the others. Note that a person may choose the same topping twice, in which case they just get twice the amount of that topping.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26184.%E2%80%85Kebab%E2%80%85Pizza/63bb9078.png" data-original-src="https://upload.acmicpc.net/129db56a-f3fb-4d9e-bdc1-3df01ca6d5de/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 300px;" /></p>

<p style="text-align: center;">Figure K.1: Illustration of Sample Input 1, with two toppings numbered on every slice in one possible solution. Note that each topping only occurs on a single range of pizza slices.</p>

<p>On the day of her party, Alice discovers that the rolled out pizza dough takes up so much space on her kitchen counter that she can only prepare one kind of topping at a time. To optimise the workflow and to make sure that the pizza is ready in time for her party, she wants to take out each chosen kind of topping only once and then add it on a consecutive range of pizza slices. Note that the whole pizza forms a consecutive range of pizza slices in a circular fashion. Determine whether it is possible to prepare the pizza in this way while satisfying all the chosen topping combinations. See Figure K.1 for an example.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $k$ ($3\leq n, k \leq 10^5$), the number of pizza slices and the number of possible toppings which are numbered from $1$ to $k$.</li>
	<li>$n$ lines, each with two integers $a$ and $b$ ($1\leq a, b \leq k$), describing the toppings chosen by the $i$th person.</li>
</ul>

### 출력

<p>Output &quot;<code>possible</code>&quot; if it is possible for Alice to select a consecutive range of pizza slices for each chosen topping such that the resulting pizza can be split into $n$ suitable slices. Otherwise, output &quot;<code>impossible</code>&quot;.</p>