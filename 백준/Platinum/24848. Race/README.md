# [Platinum III] Race - 24848

[문제 링크](https://www.acmicpc.net/problem/24848)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

자료 구조, 브루트포스 알고리즘, 기하학, 집합과 맵, 해시를 사용한 집합과 맵, 스위핑

### 문제 설명

<p>The race for $n$ sportsmen is organized at a stadium. The sportsmen are running along $n$ linear tracks of the stadium. Let us consider each track to be a horizontal line, the $i$-th track is a line $y = i$.</p>

<p>The sportsman $i$ starts running at a point $(s_i, i)$ and runs to the right with the speed of $v_i$. The race is long, so let us consider that it never ends, and the sportsmen never stop.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f941bf3d-f0ec-46a4-9236-ac534f8c7cb5/-/preview/" style="width: 386px; height: 160px;" /></p>

<p>Young photographer Daniel is watching the race. He wonders what is the maximum number of sportsmen that would at some moment be on the same straight line. Help him find that out!</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/4399e811-69ec-4e3e-9e8d-3971db645644/-/preview/" style="width: 386px; height: 167px;" /></p>

### 입력

<p>Tha first line of input contains an integer $n$ --- the number of race participants ($1 \le n \le 300$).</p>

<p>The following $n$ lines describe sportsmen, the $i$-th of them contains two integers $s_i$ and $v_i$ --- the initial $x$-coordinate of the $i$-th sportsman and her speed ($-10^6 \le s_i \le 10^6$; $1 \le v_i \le 10^6$).</p>

### 출력

<p>Output one integer --- the maximum number of sportsmen that would be on the same straight line during the race.</p>