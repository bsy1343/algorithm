# [Platinum I] Traveling Merchant - 17596

[문제 링크](https://www.acmicpc.net/problem/17596)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 65, 정답: 31, 맞힌 사람: 28, 정답 비율: 53.846%

### 분류

구현, 자료 구조, 세그먼트 트리, 제곱근 분할법

### 문제 설명

<p>There is a long east-west road which has <em>n</em> towns situated along it, numbered 1 to <em>n</em> from west to east. All towns buy and sell the same kind of goodie. The value of a goodie fluctuates according to a weekly schedule. A town buys and sells a goodie at its value in that town on that particular day. At town <em>i</em>, the value of a goodie changes by <em>d<sub>i</sub></em> every day in the first half of a week, and changes by &minus;<em>d<sub>i</sub></em> every day in the second half of a week. In other words, the value of a goodie at town <em>i</em> is <em>v<sub>i</sub></em> on Mondays and Sundays, <em>v<sub>i</sub></em> + <em>d<sub>i</sub></em> on Tuesdays and Saturdays, <em>v<sub>i</sub></em> + 2<em>d<sub>i</sub></em> on Wednesdays and Fridays, and <em>v<sub>i</sub></em> + 3<em>d<sub>i</sub></em> on Thursdays.</p>

<p>A merchant is making a business travel plan. His trip begins at a starting town <em>s</em> and ends at a destination town <em>t</em>, visiting each town from <em>s</em> to <em>t</em> (inclusive) exactly once. The merchant starts the trip on a Monday. It takes him exactly one day to travel between adjacent towns and every day he travels to the next town on the path to the destination. He may buy exactly one goodie at a town along the trip and sell that goodie at a town he visits later. He can only buy once and sell once. The merchant would like to know the maximum possible profit of <em>q</em> travel plans with different choices of town <em>s</em> and town <em>t</em>.</p>

### 입력

<p>The first line of the input has a single integer <em>n</em> (2 &le; <em>n</em> &le; 10<sup>5</sup>). The next n lines each have two integers. The <em>i</em>th line has <em>v<sub>i</sub></em> (1 &le; <em>v<sub>i</sub></em> &le; 10<sup>9</sup>) and <em>d<sub>i</sub></em> (1 &le; <em>v<sub>i</sub></em> + 3<em>d<sub>i</sub></em> &le; 10<sup>9</sup>). The next line has a single integer <em>q</em> (1 &le; <em>q</em> &le; 10<sup>5</sup>). The following <em>q</em> lines each give a pair of integers <em>s</em> and <em>t</em> (1 &le; <em>s</em>, <em>t</em> &le; <em>n</em>, <em>s</em>&nbsp;&ne;&nbsp;<em>t</em>), representing one travel plan from town <em>s</em> to town <em>t</em>. If <em>s</em> &lt; <em>t</em> the merchant travels west to east, otherwise he travels east to west.</p>

### 출력

<p>For each travel plan, output the maximum profit the merchant can make on a single line. If the merchant cannot make any profit, output 0.</p>