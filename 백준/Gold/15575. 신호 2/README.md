# [Gold I] 신호 2 - 15575

[문제 링크](https://www.acmicpc.net/problem/15575)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 256 MB

### 통계

제출: 524, 정답: 190, 맞힌 사람: 146, 정답 비율: 36.318%

### 분류

다이나믹 프로그래밍, 기하학

### 문제 설명

<p>좌표평면 상에&nbsp;<em>N</em>개의 신호&nbsp;1,&thinsp;2,&thinsp;...,&thinsp;<em>N</em>이 있다.&nbsp;<em>i</em>번째 신호는&nbsp;(<em>x</em><sub><em>i</em></sub>,&thinsp;<em>y</em><sub><em>i</em></sub>)로 표현할 수 있다. 겹치는 신호는 존재하지 않는다. 신호들을 잇는 통신 시스템을 구축하려고 한다. 통신 시스템은&nbsp;<em>x</em>좌표가 증가하는 순서의 신호 몇 개를 순서대로 이어서 만든다. 멀리까지 전파할 수 있게 통신 시스템의 길이를 최대화하려고 한다. 이때 그 길이를 구하여라.</p>

### 입력

<p>첫 줄에&nbsp;<em>N</em>이 입력된다.&nbsp;(1&thinsp;&le;&thinsp;<em>N</em>&thinsp;&le;&thinsp;10<sup>6</sup>)</p>

<p>둘째 줄부터&nbsp;<em>N</em>개의 줄 동안&nbsp;<em>x</em><sub><em>i</em></sub>와&nbsp;<em>y</em><sub><em>i</em></sub>가 입력된다.&nbsp;(&thinsp;-&thinsp;10<sup>8</sup>&thinsp;&le;&thinsp;<em>x</em><sub><em>i</em></sub>,&thinsp;<em>y</em><sub><em>i</em></sub>&thinsp;&le;&thinsp;10<sup>8</sup>, <em>x<sub>i</sub></em>, <em>y<sub>i</sub></em>는 정수))</p>

### 출력

<p>가장 긴 통신 시스템의 거리를 출력한다. 상대 오차 또는 절대 오차가&nbsp;10<sup>&thinsp;-&thinsp;6</sup>&nbsp;이내이면 정답으로 인정된다.</p>