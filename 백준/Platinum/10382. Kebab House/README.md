# [Platinum III] Kebab House - 10382

[문제 링크](https://www.acmicpc.net/problem/10382)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 70, 정답: 22, 맞힌 사람: 21, 정답 비율: 33.333%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>The young man Vahtang Bumerang makes kebabs at the world-famous fast-food chain Kebab House. Each kebab contains many ingredients.</p>

<p>This morning Vahtang has received an order to make n kebabs. At first, he should put q<sub>1</sub> ingredients to the first kebab, then q<sub>2</sub> ingredients in the second one and so on. Vahtang spends one second to put one ingredient to a kebab, so it takes q<sub>i</sub> seconds to make the i-th kebab. When he finishes the kebab he immediately proceeds to the next one.</p>

<p>Vahtang often dreams about his lovely boomerang while making kebabs. Each dream takes exactly one second and Vahtang forgets to put one ingredient to kebab during this second. Fortunately, he never dreams twice in any consecutive (t + 1) seconds.</p>

<p>Due to dreams about boomerang, some kebabs may have lesser than the desired number of ingredients, but customers are still happy if the i-th kebab has at least x<sub>i</sub> ingredients in it.</p>

<p>Vahtang wants to calculate the number of ways to have dream seconds during his work while keeping all customers happy. Can you help him? The real answer may be very huge, so you have to calculate it modulo 10<sup>9</sup> + 7.</p>

### 입력

<p>The first line of the input file contains two integers n and t &mdash; the number of kebabs and minimal possible time between dream seconds (1 &le; n &le; 1000; 0 &le; t &le; 100).</p>

<p>Each of the next n lines contains two integers q<sub>i</sub>, x<sub>i</sub> &mdash; the number of ingredients in the i-th kebab and the minimum number of ingredients to make the i-th customer happy (1 &le; q<sub>i</sub> &le; 250; 0 &le; x<sub>i</sub> &le; q<sub>i</sub>).</p>

### 출력

<p>The only line of the output file must contain one integer &mdash; the number of ways to distribute dream seconds modulo 10<sup>9</sup> + 7.</p>