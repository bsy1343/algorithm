# [Platinum I] Pipes - 29845

[문제 링크](https://www.acmicpc.net/problem/29845)

### 성능 요약

시간 제한: 0.3 초, 메모리 제한: 1024 MB

### 통계

제출: 32, 정답: 17, 맞힌 사람: 8, 정답 비율: 42.105%

### 분류

기하학, 볼록 껍질을 이용한 최적화, 피타고라스 정리

### 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/36566ce2-9712-4ac6-983f-58e79e1feedb/-/preview/" style="width: 307px; height: 206px; float: right;" />Valter is a fan of experiments. His latest experiment is depicted in the figure: he rolls several pipes down an inclined floor until they are stopped either by the wall perpendicular to the floor or by another pipe rolled earlier; after all the pipes have stopped, Valter measures the distance from the wall to the farthest point of the farthest pipe.</p>

<p>Now his classmate Vanessa pointed out that some pipes may have no impact on the result. For example, in the figure, neither pipe 1 nor pipe 3 impact the positions of the following pipes. In addition, the farthest point may be in a pipe that was not rolled last.</p>

<p>Write a program that gets the radii of the pipes and computes the distance from the wall to the farthest point among all the pipes.</p>

### 입력

<p>The first line contains $N$ ($1 \le N \le 10^5$), the number of pipes. Each of the following $N$ lines contains one real number, the radii $R_i$ ($0 &lt; R_i \le 10^9$) of the pipes, in the order in which the pipes are rolled. Each radius is given with at most two digits after the decimal point.</p>

### 출력

<p>Output a single real number: the distance from the wall to the farthest point among all the pipes. The answer $x$ will be accepted if $\frac{|x-x&#39;|}{1+x&#39;} &lt; 10^{-6}$, where $x&#39;$ is the jury&#39;s answer.</p>