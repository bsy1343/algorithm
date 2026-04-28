# [Platinum III] Life Transfer - 17959

[문제 링크](https://www.acmicpc.net/problem/17959)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 77, 정답: 32, 맞힌 사람: 26, 정답 비율: 40.000%

### 분류

그리디 알고리즘, 두 포인터

### 문제 설명

<p><em>Note: &ldquo;feli&rdquo; is the local currency.</em></p>

<p>In the great city of Nekoresti, there are n people for which we know their ages: a<sub>i</sub> is the age of the i-th person. Currently, they are on vacation, so they decided to go on a trip to Pisiev to visit a Koshkseum, a famous museum. They can go either by car or by motorcycle:</p>

<ul>
	<li>a <strong>car</strong> can transport k people (one driver which has to be at least l<sub>c</sub> years old and k &minus; 1 passengers). The cost to rent a car is p<sub>c</sub> feli.</li>
	<li>a <strong>motorcycle</strong> can transport only one person (which has to be at least l<sub>m</sub> years old). The cost to rent a motorcycle is p<sub>m</sub> feli.</li>
</ul>

<p>Unfortunately, people have money issues, so they decided to consult Mewlin, the great local magician from the city. Using a formidable spell called Mucadabra, Mewlin can transfer age from one person to another. Formally, he can reduce the age x of a person and increase the age y of another person by the same amount (so the sum of ages is constant). The cost to transfer 1 unit of age is t feli. For magic medical reasons, the age of a person cannot be changed by more than d years (if the initial age is x, his age must be at least x &minus; d and at most x + d at all times). Also, the age cannot go below 1 year old.</p>

<p>Help the people from Nekoresti to spend as little money as possible, so they can arrive in Pisiev.</p>

### 입력

<p>The first line contains two integers n and k (1 &le; n, k &le; 10<sup>5</sup>) &mdash; the number of people and the maximum number of people that can be in one car.</p>

<p>The second line contains four integers l<sub>c</sub>, p<sub>c</sub>, l<sub>m</sub> and p<sub>m</sub> (1 &le; l<sub>m</sub> &lt; l<sub>c</sub> &le; 10<sup>5</sup>, 1 &le; p<sub>m</sub> &lt; p<sub>c</sub> &le; 10<sup>5</sup>) &mdash; the minimum needed age to drive a car; the price of renting one car; the minimum needed age to drive a motorcycle and the price of renting one motorcycle.</p>

<p>The third line contains two integers t and d (0 &le; t, d &le; 10<sup>5</sup>) &mdash; the price of transferring one year and the maximum number of times the spells can be applied per each person.</p>

<p>The fourth line contains n integers a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> (1 &le; a<sub>i</sub> &le; 10<sup>5</sup>) &mdash; the age of the i-th person.</p>

### 출력

<p>Print one number, the smallest amount of feli the people need to spend in order for them to reach their destination. If there is no such solution, print &minus;1.</p>