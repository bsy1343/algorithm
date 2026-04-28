# [Silver IV] Circular Barn (Bronze) - 12000

[문제 링크](https://www.acmicpc.net/problem/12000)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 1284, 정답: 696, 맞힌 사람: 629, 정답 비율: 54.459%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Being a fan of contemporary architecture, Farmer John has built a new barn in the shape of a perfect circle. Inside, the barn consists of a ring of \(n\) rooms, numbered clockwise from \(1 \ldots n\) around the perimeter of the barn (\(3 \leq n \leq 1,000\)). Each room has doors to its two neighboring rooms, and also a door opening to the exterior of the barn.</p>

<p>Farmer John wants exactly \(r_i\) cows to end up in each room \(i\) (\(1 \leq r_i \leq 100\)). To herd the cows into the barn in an orderly fashion, he plans to unlock the exterior door of a single room, allowing the cows to enter through that door. Each cow then walks clockwise through the rooms until she reaches a suitable destination. Farmer John wants to unlock the exterior door that will cause his cows to collectively walk a minimum total amount of distance. Please determine the minimum total distance his cows will need to walk, if he chooses the best such door to unlock. The distance walked by a single cow is the number of interior doors through which she passes.</p>

### 입력

<p>The first line of input contains \(n\). Each of the remaining \(n\) lines contain \(r_1 \ldots r_n\).</p>

### 출력

<p>Please write out the minimum total amount of distance the cows collectively need to travel.</p>

### 힌트

<p>In this example, the best solution is to let the cows enter through the door of the room that requires 7 cows.</p>