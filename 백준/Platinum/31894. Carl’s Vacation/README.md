# [Platinum II] Carl’s Vacation - 31894

[문제 링크](https://www.acmicpc.net/problem/31894)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 39, 맞힌 사람: 31, 정답 비율: 52.542%

### 분류

기하학, 3차원 기하학, 삼분 탐색, 피타고라스 정리

### 문제 설명

<p>Carl the ant is back! After traversing meandering paths (Problem A, 2004 World Finals) and wandering over octahedrons (Problem C, 2009 World Finals) it is time for a little vacation &mdash; time to see the sights! And where better to see the sights than at the tips of tall structures like, say, pyramids!! And where better to see tall pyramids but Egypt!!! (This is so exciting!!!!!)</p>

<p>After taking in the view from the tip of one pyramid, Carl would like to go to the tip of another. Since ants do not do particularly well in the hot sun, he wants to find the minimum distance to travel between the tips of these two pyramids, assuming he can only walk on the surfaces of the pyramids and the plane which the pyramids sit upon. The pyramids are, geometrically, right square pyramids, meaning the apex of the pyramid lies directly above the center of a square base.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/31661832-742e-45ba-9b18-81e3a9723a25/-/preview/" style="width: 343px; height: 300px;" /></p>

<p style="text-align: center;"><b>Figure 1</b>: Illustration of two pyramids corresponding to Sample Input 1. The black line shows the shortest path between their apexes.</p>

### 입력

<p>The first line of input contains five integers $x_1,y_1,x_2,y_2,h$ where $x_1,y_1,x_2,y_2$ ($-10^5&le;x_1,y_1,x_2,y_2&le;10^5$ and $(x_1,y_1) \ne (x_2,y_2)$) define an edge of the first pyramid, with the body of the pyramid lying to the left of the directed vector from $(x_1,y_1)$ to $(x_2,y_2)$, and $h$ ($1&le;h&le;10^5$) is the height of the pyramid. The second line of input describes the second pyramid in the same format. The intersection of the bases of the two pyramids has $0$ area.</p>

### 출력

<p>Output the minimum distance Carl travels between the tips of the two pyramids. Your answer should have an absolute or relative error of at most $10^{-6}$.</p>