# [Platinum V] Calculating Taxes - 13762

[문제 링크](https://www.acmicpc.net/problem/13762)

### 성능 요약

시간 제한: 8 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 12, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

다이나믹 프로그래밍, 자료 구조, 트리, 집합과 맵, 트리에서의 다이나믹 프로그래밍, 값 / 좌표 압축

### 문제 설명

<p>The Jones family is a very wealthy family who has lived in an area of the country for many generations. In this area of the country, houses are scattered around with dirt roads connecting them. Two houses are called neighbours if there is a dirt road connecting them. Using the dirt roads, there is exactly one way to get from any house to any other house without walking on some road at least twice. There is a new king in the country and he has decided that he will be taking taxes in a rather weird way.</p>

<p>Each household is to pick some divisor of their income from the last year (this value could be their full income if they wish). If any neighbours pick a number whose greatest common divisor is larger than 1, then the king will take every dollar from every person in the country. On the other hand, if each pair of neighbours pick numbers whose greatest common divisor is 1, then each household may keep whatever number they chose.</p>

<p>Obviously, one option is for each household to take \$1 each, but that is not very profitable. Can you help them maximize the total amount of money that they can keep?</p>

### 입력

<p>The input will contain a single test case.</p>

<p>The first line will contain one integer n (2 &le; n &le; 250) denoting the number of houses. The next n lines contain the information about each household. The first line will contain information about house 1, the second line will contain information about house 2, etc.</p>

<p>Each of these lines will begin with two integers, I<sub>k</sub> (1 &le; I<sub>k</sub> &le; 200 000 000) and m<sub>k</sub> (1 &le; m<sub>k</sub> &le; n &minus; 1), denoting the income of the kth household and the number of neighbours of the kth household. Then follow m<sub>k</sub> distinct integers denoting the neighbours of the kth household (each will be between 1 and n, inclusive, and none of these will be k).</p>

<p>Each road is bidirectional and will be listed twice in the input (once for each endpoint of the road).</p>

### 출력

<p>Output one integer, the maximum total amount of money that the households can keep.</p>