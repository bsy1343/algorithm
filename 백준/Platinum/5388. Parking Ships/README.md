# [Platinum III] Parking Ships - 5388

[문제 링크](https://www.acmicpc.net/problem/5388)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 52, 정답: 20, 맞힌 사람: 15, 정답 비율: 48.387%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>Life on the great oceans has been good for captain Blackbeard and his fellow pirates. They have gathered so many treasures, that each of them is able to buy a house on their favorite island. The houses on this island are all placed in a long row along the beach line of the island. Next to a house, every pirate is also able to buy his own ship to do their own bit of plundering. However, this causes a whole new kind of problem.</p>

<p>Along the beach line there is a long pier where every pirate can park his ship. Although there is enough space along the pier for all the ships, not every pirate will be able to park in front of his house. A pirate is happy with his parking space if some part of the parking space is in front of the center of his house. Captain Blackbeard has been given the difficult task of assigning the parking spaces to the pirates. A parking space for a pirate i is a range [a<sub>i</sub>, b<sub>i</sub>] (a<sub>i</sub>, b<sub>i</sub> &isin; R) along the pier such that l<sub>i</sub> &le; b<sub>i</sub>&minus;a<sub>i</sub>, where l<sub>i</sub> is the length of the ship of pirate i. Thus, pirate i is happy if a<sub>i</sub> &le; x<sub>i</sub> &le; b<sub>i</sub>, where x<sub>i</sub> is the center of the house of pirate i. Clearly, parking spaces of different pirates must be interior disjoint (the ends of ranges can coincide).</p>

<p>Above all, the captain wants a good parking space for himself, so he gives himself the parking space such that the center of his ship is aligned with the center of his house. Next to that, he wants to make as many pirates happy as possible. Can you help him out?</p>

### 입력

<p>The first line of the input contains a single number: the number of test cases to follow. Each test case has the following format:</p>

<ul>
	<li>One line with one integer n (1 &le; n &le; 1,000): the number of pirates including the captain.</li>
	<li>n lines with on each line two integers x<sub>i</sub> (-10<sup>9</sup> &le; x<sub>i</sub> &le; 10<sup>9</sup>) and l<sub>i</sub> (1 &le; l<sub>i</sub> &le; 10<sup>9</sup>): the center of the house of the i<sup>th</sup> pirate and the total length of his ship, respectively. The first pirate in the input is always the captain.</li>
</ul>

### 출력

<p>For every test case in the input, the output should contain one integer on a single line: the maximum number of happy pirates using an optimal assignment of the parking spaces. This number includes the captain himself. You can assume that the space along the pier is unbounded in both directions.</p>