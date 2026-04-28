# [Gold V] Trapezoid Walkway - 10486

[문제 링크](https://www.acmicpc.net/problem/10486)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 68, 정답: 42, 맞힌 사람: 41, 정답 비율: 61.194%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>You are planning to place a small, prefabricated gazebo in your back yard, with a paved walkway connecting it to your back porch. You&rsquo;ll build the walkway out of paving stones purchased at your local home improvement store. The paving stones come in a variety of sizes, but they are all shaped like isosceles trapezoids. As illustrated on the left of Figure 1, an isosceles trapezoid is what you get if you take an isosceles triangle and cut off a corner with a line that is parallel to the base. We can describe such a paving stone with three parameters: the length of one of its parallel edges, a, the length of the other parallel edge, b, and the perpendicular distance, h, between these edges.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10486.%E2%80%85Trapezoid%E2%80%85Walkway/cf9c7026.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/10486.%E2%80%85Trapezoid%E2%80%85Walkway/cf9c7026.png" data-original-src="https://www.acmicpc.net/upload/images2/trape.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:186px; width:475px" /></p>

<p style="text-align: center;">Figure 1: Isosceles trapezoid shape (left), walkway example (center) and join requirements (right)</p>

<p>You&rsquo;re going to build your walkway by joining the parallel edges of the paving stones, with one parallel edge meeting the back porch at the start and another meeting the gazebo at the end. You want your walkway to look nice, so you won&rsquo;t permit any of the situations illustrated on the right of Figure 1. Where two paving stones meet, their edges must be exactly the same length. Likewise, where a paving stone meets the back porch or the gazebo, its edge must be exactly the same length. Fortunately, your home improvement store has a wide selection of different trapezoid-shaped paving stones, so you are confident you can build a walkway that satisfies these requirements.</p>

<p>Paving stones are priced at two cents per square centimeter of surface area. You have a big back yard, so you don&rsquo;t care how long your walkway is. You just want the one that&rsquo;s the least expensive.</p>

### 입력

<p>Input will consist of multiple test cases. Each test case will start with a positive integer, n, the number of different types of paving stones available. The value, n, will be at least 1 and no greater than 1000. The next n lines each describe a type of stone by giving the lengths of its sides, a, b then h. These three values will be positive integers, measured in centimeters and not greater than 1000. No two types of stones are identical, but your home improvement store has a large stock of paving stones, so you can buy as many of each type as you need. The last line of each test case gives the width of the back porch, where the walkway will start, followed by the width of the edge of the gazebo where the walkway will end. A value of zero for n will mark the end of all test cases.</p>

### 출력

<p>For each test case, print the total cost, in dollars, for the least expensive walkway that meets your requirements. It will always be possible to build such a walkway.</p>