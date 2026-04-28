# [Bronze II] Pizza - 20660

[문제 링크](https://www.acmicpc.net/problem/20660)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 282, 정답: 223, 맞힌 사람: 192, 정답 비율: 83.478%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>After a long day and miserable at work, Mirko decided to order a pizza for dinner to cheer himself up. In a big pile of papers on his desk, he found a flyer of a nearby pizza restarant.</p>

<p>The restarant offers m different pizzas. Pizza toppings are labeled with positive integers. i-th pizza has k<sub>i</sub> toppings, with labels b<sub>i,1</sub>, b<sub>i,2</sub>, . . . , b<sub>i,k<sub>i</sub></sub>.</p>

<p>Mirko is very picky when it comes to food. He doesn&rsquo;t like n toppings, those with labels a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub>, so he wants to order a pizza that doesn&rsquo;t contain any of those toppings. Determine the number of pizzas that Mirko can order.</p>

### 입력

<p>The first line contains an integer n (1 &le; n &le; 100), the number of toppings, followed by n distinct integers a<sub>i</sub> (1 &le; a<sub>i</sub> &le; 100), the labels of toppings Mirko dislikes.</p>

<p>The second line contains an integer m (1 &le; m &le; 100), the number of pizzas.</p>

<p>The following m lines describe the pizzas. The i-th line contains an integer k<sub>i</sub> (1 &le; k<sub>i</sub> &le; 100), the numer of toppings, followed by k<sub>i</sub> distinct integers b<sub>i,j</sub> (1 &le; b<sub>i,j</sub> &le; 100), the labels of toppings on the i-th pizza.</p>

<p>The pizzas, i.e. the sets of toppings, will be distinct.</p>

### 출력

<p>Output the number of pizzas that Mirko can order.</p>