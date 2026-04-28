# [Platinum IV] Cutting Cheese - 10787

[문제 링크](https://www.acmicpc.net/problem/10787)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 129, 정답: 79, 맞힌 사람: 47, 정답 비율: 64.384%

### 분류

수학, 기하학, 이분 탐색, 미적분학, 3차원 기하학

### 문제 설명

<p>Of course you have all heard of the International Cheese Processing Company. Their machine for cutting a piece of cheese into slices of exactly the same thickness is a classic. Recently they produced a machine able to cut a spherical cheese (such as Edam) into slices &ndash; no, not all of the same thickness, but all of the same weight! But new challenges lie ahead: cutting Swiss cheese.</p>

<p>Swiss cheese such as Emmentaler has holes in it, and the holes may have different sizes. A slice with holes contains less cheese and has a lower weight than a slice without holes. So here is the challenge: cut a cheese with holes in it into slices of equal weight.</p>

<p>By smart sonar techniques (the same techniques used to scan unborn babies and oil fields), it is possible to locate the holes in the cheese up to micrometer precision. For the present problem you may assume that the holes are perfect spheres.</p>

<p>Each uncut block has size 100&times;100&times;100 where each dimension is measured in millimeters. Your task is to cut it into s slices of equal weight. The slices will be 100 mm wide and 100 mm high, and your job is to determine the thickness of each slice.</p>

### 입력

<p>The first line of the input contains two integers n and s, where 0 &le; n &le; 10 000 is the number of holes in the cheese, and 1 &le; s &le; 100 is the number of slices to cut. The next n lines each contain four positive integers r, x, y, and z that describe a hole, where r is the radius and x, y, and z are the coordinates of the center, all in micrometers.</p>

<p>The cheese block occupies the points (x, y, z) where 0 &le; x, y, z &le; 100 000, except for the points that are part of some hole. The cuts are made perpendicular to the z axis.</p>

<p>You may assume that holes do not overlap but may touch, and that the holes are fully contained in the cheese but may touch its boundary.</p>

### 출력

<p>Display the s slice thicknesses in millimeters, starting from the end of the cheese with z = 0. Your output should have an absolute or relative error of at most 10<sup>&minus;6</sup>.</p>