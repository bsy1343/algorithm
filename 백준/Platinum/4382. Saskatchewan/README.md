# [Platinum III] Saskatchewan - 4382

[문제 링크](https://www.acmicpc.net/problem/4382)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 5, 맞힌 사람: 5, 정답 비율: 50.000%

### 분류

기하학, 스위핑

### 문제 설명

<p>The province of Saskatchewan is surveyed in sections. A section is a square mile of land. Grid roads delimit sections; there is one north-south and one east-west road exactly every mile. (Complications arise because of the curvature of the earth but you can disregard these and assume that the province is a plane.) The provincial border is a polygon whose vertices correspond to the intersections of grid roads. However, the edges do not necessarily follow grid roads; some sections are cut by the border. Your job is to compute how many sections are completely within a province like Saskatchewan.</p>

### 입력

<p>Standard input contains a series of no more than 100 coordinate pairs, one pair per line. These coordinates give the vertices of the perimeter of the province; the border is formed by connecting them in order. All coordinates are in the first quadrant; they range from 0 to 100,000.</p>

### 출력

<p>Your output should be a single integer: the number of sections (i.e. unit squares with corners at integer coordinates) fully contained within the province.</p>