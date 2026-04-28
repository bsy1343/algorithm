# [Platinum IV] Running Routes - 17592

[문제 링크](https://www.acmicpc.net/problem/17592)

### 성능 요약

시간 제한: 12 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 152, 정답: 53, 맞힌 사람: 42, 정답 비율: 32.812%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The administrators at Polygonal School want to increase enrollment, but they are unsure if their gym can support having more students. Unlike a normal, boring, rectangular gym, the gym floor at Polygonal is a regular <em>n</em>-sided polygon! They affectionately refer to the polygon as <em>P</em>.</p>

<p>The coach has drawn several running paths on the floor of the gym. Each running path is a straight line segment connecting two distinct vertices of <em>P</em>. During gym class, the coach assigns each student a different running path, and the student then runs back and forth along their assigned path throughout the class period. The coach does not wan&nbsp;&nbsp;students to collide, so each student&rsquo;s path must not intersect any other student&rsquo;s path. Two paths intersect if they share a common point (including an endpoint).</p>

<p>Given a description of the running paths in <em>P</em>, compute the maximum number of students that can run in gym class simultaneously</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17592.%E2%80%85Running%E2%80%85Routes/bf68d152.png" data-original-src="https://upload.acmicpc.net/e36bed23-4d37-4d61-8983-6aaa7d69d9b8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 256px;" /></p>

<p style="text-align: center;">Figure H.1: Illustrations of the two sample inputs, with possible solutions highlighted in thick red lines. Solid black lines represent running paths that are not assigned to a student, and dashed black lines are used to show the boundary of <em>P</em> in places where no running path exists.</p>

### 입력

<p>The first line contains an integer <em>n</em> (3 &le; <em>n</em> &le; 500), the number of vertices in <em>P</em>. (The vertices are numbered in increasing order around <em>P</em>.) Then follows <em>n</em> lines of <em>n</em> integers each, representing a <em>n</em> &times; <em>n</em> symmetric binary matrix which we&rsquo;ll call <em>M</em>. The <em>j</em><sup>th</sup> integer on the <em>i</em><sup>th</sup> line <em>M<sub>ij</sub></em> is 1 if a running path exists between vertices <em>i</em> and <em>j</em> of the polygon, and 0 otherwise. It is guaranteed that for all 1 &le; <em>i</em>, <em>j</em> &le; <em>n</em>, <em>M<sub>ij</sub></em> = <em>M<sub>ji</sub></em> and <em>M<sub>ii</sub></em> = 0.</p>

### 출력

<p>Print the maximum number of students that can be assigned to run simultaneously on the running paths, given the above constraints.</p>