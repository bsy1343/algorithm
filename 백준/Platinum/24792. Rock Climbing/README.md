# [Platinum V] Rock Climbing - 24792

[문제 링크](https://www.acmicpc.net/problem/24792)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 8, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

벨만–포드, 플로이드–워셜, 그래프 이론, 최단 경로

### 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/221e48b1-968b-4db4-be64-926dffa1b3af/-/preview/" style="width: 300px; height: 225px; float: right;" />Peter is attempting to deep-water solo a rock climbing cliff over the ocean. Deep-water soloing (DWS) is a form of solo rock climbing that relies solely upon the presence of water at the base of the climb to protect against injury from falling.</p>

<p>Rock climbing is very exhausting and takes lots of energy. Since Peter is not very flexible, he can only move $1$ unit in any of the four directions: Up, Down, Left, and Right. &nbsp;Traveling to a different square will decrease Peter&#39;s energy by the amount on that square. &nbsp;Note that the amount of energy on a square can be negative. In this case, Peter will gain energy.</p>

<p>If Peter&#39;s energy is negative, he will fall into the water.</p>

<p>Peter doesn&#39;t want to get wet, so he asks you how much energy he needs to complete the climb, assuming he takes the best route.</p>

### 입력

<p>The first line of the input will contain two integers, $R$, $C$ $(1 \leq R, C \leq 15)$. &nbsp;The second line of input will consist of a row of $C$ <code>E</code> characters, separated by spaces, representing the top of the cliff. These take $0$ units of energy to enter. &nbsp;Peter can choose any of them.</p>

<p>Next, there will be $R$ rows of $C$ columns of numbers $X_{r,c}$, where $(-9 \leq X_{r,c} \leq 9)$, the energy required to enter that section of cliff. The final line of input will consist of a row of $C$ <code>S</code> characters, representing the possible start points of the climb. These take $0$ units of energy to enter. &nbsp;Returning to a starting position is allowed.</p>

### 출력

<p>Output a single integer, the amount of energy necessary to complete the climb without falling.</p>