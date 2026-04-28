# [Bronze IV] Pokemon Buddy - 18691

[문제 링크](https://www.acmicpc.net/problem/18691)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 3013, 정답: 1195, 맞힌 사람: 1116, 정답 비율: 39.729%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Pokemon Go just released the Buddy update. It lets you select a Pokemon to appear alongside your trainer&rsquo;s avatar on your profile screen. As you walk with your buddy, it will find candy that can be used to evolve the Pokemon.</p>

<p>The Buddy system divides the Pokemons into 3 groups. Each group gives one candy upon walking for 1, 3, and 5 kilometers respectively</p>

<p>In this problem you will be given the Pokemon group G, the number of candies C you initially have, and the number of candies E required to evolve the Pokemon. You should calculate the number of Kilometers required to walk in order to evolve the Pokemon.</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T, the number of test cases (1 &le; T &le; 100).</p>

<p>Each test case consists of a line containing three space separated integers:</p>

<ul>
	<li>G: The group of the Pokemon (1 &le; G &le; 3)</li>
	<li>C: The initial candies you have (0 &le; C &le; 100)</li>
	<li>E: The candies required to evolve the Pokemon (1 &le; E &le; 100)</li>
</ul>

### 출력

<p>For each test case, print a single line containing the number of Kilometers of walking required to Evolve the Pokemon.</p>