# [Platinum III] House construction - 7162

[문제 링크](https://www.acmicpc.net/problem/7162)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 3, 맞힌 사람: 3, 정답 비율: 25.000%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>A construction company on the Misfortune island has received an order to build L identical houses. There are X wooden planks and a unit area required to build each house on the island. For the completion of the order an area of precisely L unit areas has been allocated for the construction works.</p>

<p>The company already has 10 wooden plank factories located in another region on the island. For faster completion of the order, there may be a necessity for additional factories. There are Y wooden planks and a unit area required to build a factory. As the government of the island is not willing to provide additional land for factory construction, the only possibility is to use the land given for completion of the order for the construction of temporary factories and later raze these factories as necessary.</p>

<p>Each factory produces 10 planks per Day. The planks created by all the factories are identical.</p>

<p>The planks, which are not used in any specific Day for construction, are destroyed &ndash; eaten by little green plank eaters during the night. Due to this reason, also the planks from the razed factories cannot be recycled.</p>

<p>During one Day the workers of the company can carry out only one of the following actions:</p>

<ul>
	<li>Build any number of factories, as long as the working factories produce sufficient number of planks that Day and the non-utilized area is sufficient.</li>
	<li>Build any number of houses, as long as the working factories produce sufficient number of planks that Day and the non-utilized area is sufficient.</li>
	<li>Raze any number of factories.</li>
</ul>

<p>The newly-built factories can start producing planks (10 per Day), beginning with the following Day after being constructed.</p>

<p>Your task is to write a program that determines the minimum possible number of Day required for fullfillment of the order.&nbsp;</p>

### 입력

<p>The first line of the standard input contains a positive integer L (L&le;2500), which is the ordered number of houses. The second line contains a positive integer X (X&le;255) &ndash; the number of planks required to build one house. The third line contains a positive integer Y (Y&le;255) &ndash; the number of planks required to build one factory.&nbsp;</p>

### 출력

<p>The only line of the standard output must contain a positive integer &ndash; the minimum number of Days, during which the order could be fulfilled. If it is not possible to fulfill the order with the given input data, the number 0 must be output to the only line of the file.&nbsp;</p>

### 힌트

<p>One of the possible ways to fulfill the order within 12 Days is the following:</p>

<ul>
	<li>At the beginning [houses:0, factories:10, non-utilized area:50]</li>
	<li>Day 1: Construct 10 factories [0,20,40]</li>
	<li>Day 2: Construct 10 factories [0,30,30]</li>
	<li>Day 3: Construct 10 houses [10,30,20]</li>
	<li>Day 4: Construct 10 houses [20,30,10]</li>
	<li>Day 5: Construct 10 houses [30,30,0]</li>
	<li>Day 6: Raze 15 factories [30,15,15]</li>
	<li>Day 7: Construct 5 houses [35,15,10]</li>
	<li>Day 8: Construct 5 houses [40,15,5]</li>
	<li>Day 9: Construct 5 houses [45,15,0]</li>
	<li>Day 10: Raze 5 factories [45,10,5]</li>
	<li>Day 11: Construct 3 houses [48,10,2]</li>
	<li>Day 12: Construct 2 houses [50,10,0]</li>
</ul>