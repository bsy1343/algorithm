# [Platinum III] Gotta Catch 'Em All - 18687

[문제 링크](https://www.acmicpc.net/problem/18687)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 50, 정답: 9, 맞힌 사람: 6, 정답 비율: 17.143%

### 분류

이분 탐색, 슬라이딩 윈도우

### 문제 설명

<p>Ash Ketchum is a Pokemon trainer who is on a mission to catch all Pokemons in the world. Fortunately, he has caught most of them and he needs to collect K more different types of Pokemons to complete his set.</p>

<p>As you may already know, Ash lives in a 2D grid world. Pokemons spawn at integer coordinates on this grid. In this world there can be multiple Pokemons of the same type. Remember, Ash needs to catch K more different types of Pokemons not any K Pokemons.</p>

<p>Ash decided to catch those Pokemons by throwing a big squared net from the sky. A Pokemon is considered to be caught if the Pokemon lies within the boundaries of the net or even on one of its edges. Ash wants to find a square that contains those Pokemons where each side of the square is either parallel to the x-axis or to the y-axis.</p>

<p>Can you help Ash find the minimum side of the square that contains K different types of Pokemons so that he can buy an appropriate sized net to catch &rsquo;em all? Since nets need to always have a positive area, the side of the square needs to be positive.</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T, the number of test cases (1 &le; T &le; 100).</p>

<p>Each test case starts with a line that contains two space separated integers:</p>

<ul>
	<li>N: Number of Pokemons in the world (2 &le; N &le; 1000)</li>
	<li>K: Number of types of Pokemons (2 &le; K &le; 100)</li>
</ul>

<p>Followed by N lines each containing 3 space separated integers:</p>

<ul>
	<li>X: The x-coordinate of the Pokemon(&minus;1, 00, 000, 000 &le; X &le; 1, 00, 000, 000)</li>
	<li>&nbsp;Y : The y-coordinate of the Pokemon (&minus;1, 00, 000, 000 &le; Y &le; 1, 00, 000, 000)</li>
	<li>Z: The type of the Pokemon (1 &le; Z &le; K)</li>
</ul>

### 출력

<p>For each test case, print a single line containing the minimum side of a square that contains K different types of Pokemons.</p>