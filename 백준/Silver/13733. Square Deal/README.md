# [Silver IV] Square Deal - 13733

[문제 링크](https://www.acmicpc.net/problem/13733)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 127, 정답: 89, 맞힌 사람: 85, 정답 비율: 72.034%

### 분류

구현, 브루트포스 알고리즘, 기하학, 많은 조건 분기

### 문제 설명

<p>Given the dimensions of three rectangles, determine if all three can be glued together, touching just on the edges, to form a square. You may rotate the rectangles. For example, Figure C.1 shows successful constructions for the first two sample inputs.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/13733.%E2%80%85Square%E2%80%85Deal/0fc0ed0c.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13733/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-12-06%20%EC%98%A4%ED%9B%84%208.18.28.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:148px; width:250px" /></p>

<p>Figure C.1: Constructions for the first two examples</p>

### 입력

<p>The input consists of three lines, with line j containing integers H<sub>j</sub> and W<sub>j</sub> , designating the height and width of a rectangle, such that 100 &ge; H<sub>j</sub> &ge; W<sub>j </sub>&ge; 1, and such that H<sub>1 </sub>&ge; H<sub>2</sub> &ge; H<sub>3</sub>.</p>

### 출력

<p>Output a line saying YES if they can be glued together to form a square. Output NO otherwise.</p>