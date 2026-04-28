# [Gold I] Hungry Fox - 14032

[문제 링크](https://www.acmicpc.net/problem/14032)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 12, 맞힌 사람: 11, 정답 비율: 39.286%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>It&rsquo;s dinner time for your pet fox! His meal consists of N crackers, with the ith cracker having a temperature of T<sub>i</sub> degrees Celsius. He also has a large dish of water, which has a temperature of W degrees Celsius.</p>

<p>After taking an initial sip of water, your fox begins his meal. Every time he eats a cracker, its tastiness is equal to the absolute difference between its temperature, and the temperature of the last thing he ate or drank (be it the previous cracker he ate, or a sip of water, whichever he consumed most recently). He can drink some water whenever he wants, and can eat the crackers in any order.</p>

<p>Depending on the order in which your fox eats and drinks, the total tastiness of the crackers consumed may vary. What are the minimum and maximum values it can have?</p>

### 입력

<p>The first line contains two integers, N (1 &le; N &le; 100 000) and W (0 &le; W &le; 10<sup>9</sup>), representing the number of crackers and the water&rsquo;s temperature. On the next N lines, there is one integer, T<sub>i</sub> (0 &le; T<sub>i</sub> &le; 10<sup>9</sup> for 1 &le; i &le; N), representing the temperature of the ith cracker.</p>

### 출력

<p>The output is one line containing two integers: the minimum and maximum total tastiness your fox can experience during his meal, respectively.</p>