# [Gold II] Lunch Menu - 11461

[문제 링크](https://www.acmicpc.net/problem/11461)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 82, 정답: 31, 맞힌 사람: 26, 정답 비율: 41.270%

### 분류

정렬, 이분 탐색, 두 포인터, 분할 정복, 중간에서 만나기

### 문제 설명

<p>Willy is the youngest zookeper employed in the ZOO. His income is not exactly a billionaire&rsquo;s one and he obviously has to plan his regular expenses carefully. Take for example his daily visit to the ZOO cantine. From the very beginning of his service in the ZOO, Willy decided that his daily lunch expense will not exceed a fixed limit L. And while his budget is limited he still wants to have a complete lunch: A soup, a main dish, a dessert, and a beverage. Moreover, to keep himself amused, he wants to enjoy each day a different menu, different from all other menus he had eaten in the previous days. Now, he wonders how many days will it take until he is forced to eat a lunch which is an exact copy of another lunch he had already eaten before.</p>

<p>You are given Willy&rsquo;s lunch price limit L and the prices of all soups, main dishes, desserts, and beverages in the cantine. Determine how many different lunches can be assembled provided that two lunches are different if they differ in at least one of the four given parts.</p>

### 입력

<p>There are more test cases. Each case starts with a line containing five integers L, S,M, D, B N (1 &le; L &le; 10<sup>8</sup>, 1 &le; S,M, D, B &le; 5 000) representing (in this order) the lunch price upper limit, the number of soups, the number of main dishes, the number of desserts and the number of beverages in the cantine. Each of the next four lines contains a list of prices. The first line contains the soups price list, the second line contains the main dishes price list, the third line contains the desserts price list, and the fourth line contains the beverages price list. All items in all lists are positive integers not exceeding 10<sup>8</sup>. There is one empty line after each test case. The input is terminated by a line with five zeros.</p>

### 출력

<p>For each test case print on a separate line the number of different lunches which can be assembled from the cantine offer and have price not exceeding L. Please note that the value of the solution might not fit into 32-bit integer.</p>