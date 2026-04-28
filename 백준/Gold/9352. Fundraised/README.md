# [Gold IV] Fundraised - 9352

[문제 링크](https://www.acmicpc.net/problem/9352)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 53, 정답: 29, 맞힌 사람: 27, 정답 비율: 60.000%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Guess what?! Dalia won the money (an amount X), and now it&rsquo;s time to spend it. Mohamed Fouad is the deputy regional contest director and he wants to spend the money but he doesn&rsquo;t know what to spend it on. There are N items that he can buy like name-tags, T-shirts, helium balloons, trophies, etc. each having a different importance value and a cost to buy one unit from (you can buy as much units of any item as you want as long as you don&#39;t exceed the budget).</p>

<p>Mohamed wants your help; tell him the maximum importance value he can get after he chooses optimally to buy any number of items without exceeding his budget.</p>

### 입력

<p>The first line of input contains an integer T, the number of test cases. T test cases follow, the first line of each test case contains two integers (1 &le; N &le; 100), (1 &le; X &le; 10000). The second line of the test case contains N space separated integers I<sub>i</sub> (1 &le; I<sub>i</sub> &le; 400000), each representing the importance value Fouad earns from item i (0 &le; i &lt; N). The following line contains N space separated integers C<sub>i</sub> (1 &le; C<sub>i</sub> &le; 1000), each representing the cost of an item i (0 &le; i &lt; N).</p>

### 출력

<p>For each test case, on a separate line, output the maximum importance value Fouad can get.</p>