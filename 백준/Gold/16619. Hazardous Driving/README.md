# [Gold III] Hazardous Driving - 16619

[문제 링크](https://www.acmicpc.net/problem/16619)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 50, 정답: 22, 맞힌 사람: 19, 정답 비율: 61.290%

### 분류

(분류 없음)

### 문제 설명

<p>When driving a hire car in the UK in winter, it has sometimes struck me that the navigation system&rsquo;s option of avoiding major roads is almost the opposite of what I want. Major roads tend to be less hazardous, being more likely to be cleared of snow in cold winters and less likely to be flooded in warm winters.</p>

<p>I need to get to Hazel&rsquo;s house for afternoon tea. Given my emphasis on safety, each road will have a hazard rating and a length. I want a route that minimises the maximum hazard rating encountered on the route. Out of all the routes that minimise the maximum hazard rating encountered, I want one that minimises the total length of the route. Each road is two-way. There is at least one route from my house to Hazel&rsquo;s house. What is an optimal route to get from my house to Hazel&rsquo;s house?</p>

### 입력

<p>The first line contains 4 integers N (2 &le; N &le; 200 000), which is the number of locations, M (1 &le; M &le; 200 000), which is the number of roads, S (1 &le; S &le; N), which is the location of my house, and E (1 &le; E &le; N), which is the location of Hazel&rsquo;s house (and is not equal to S).</p>

<p>The next M lines describe the roads. Each of these lines contains 4 integers A (1 &le; A &le; N), which is one endpoint of the road, B (1 &le; B &le; N, A 6= B), which is the other endpoint of the road, H (1 &le; H &le; 10<sup>8</sup>), which is the hazard rating of the road, and L (1 &le; L &le; 10<sup>8</sup>), which is the length of the road.</p>

### 출력

<p>Display the maximum hazard rating of an optimal route and its total length.</p>