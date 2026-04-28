# [Platinum V] Naboj - 25041

[문제 링크](https://www.acmicpc.net/problem/25041)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 7, 맞힌 사람: 7, 정답 비율: 46.667%

### 분류

해 구성하기, 방향 비순환 그래프, 그래프 이론, 위상 정렬

### 문제 설명

<p>Mr. &Scaron;ikić, a chemistry teacher, is playing around with $n$ metal balls and $m$ copper wires. He joined together some pairs of balls with a wire so that all the balls are (directly or indirectly) linked to each other. He wants to teach his students about electric charge so he&rsquo;ll demonstrate it by charging the metal balls in a sequence.</p>

<p>Mr &Scaron;ikić can either charge each of the balls positively or negatively. When a ball is charged negatively, the electrons in all the wires connected to the ball are repulsed to the other ball connected to that wire. Conversely, if a ball is positively charged, the electrons from all the wires connected to that ball are pulled towards it. Charging the balls has the same effect on the wires irrespective of the wire&rsquo;s previous state.</p>

<p>At the beginning of the class all the balls hold no charge and the electrons in all the wires are still. For every wire Mr. &Scaron;ikić has a specific direction of the electron flow in mind. Help him find a sequence of ball chargings that results in the desired electron flows.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($1 &le; n &le; 200\,000$, $1 &le; m &le; 500\,000$) from the task statement.</p>

<p>The following $m$ lines contain integers $a_i$ and $b_i$ ($1 &le; a_i , b_i &le; n$, $a_i \ne b_i$) denoting that the balls $a_i$ and $b_i$ are connected by a wire and the electrons in the wire should be closer to $a_i$, and not $b_i$. There is at most one wire between a pair of balls. All the balls are directly or indirectly connected by wires.</p>

### 출력

<p>If it is impossible to direct the flow of electrons according to Mr. &Scaron;ikić&rsquo;s wishes print $-1$. Otherwise print $k$, the required number of ball chargings. $k$ must be less than or equal $200\,000$.</p>

<p>In the following $k$ lines print integers $c_i$ and $d_i$ ($1 &le; c_i &le; n$, $0 &le; d_i &le; 1$), the number of the ball Mr. &Scaron;ikić should charge in $i$-th step and whether it should be charged positively (denoted by $d_i = 1$) or negatively ($d_i = 0$). If there are multiple solutions, print any one of them.</p>

### 힌트

<p>Clarification of the first example:</p>

<p>First, we give the ball 2 a positive charge. The electrons on wires between balls 1 and 2, and balls 2 and 3 are now closer to the ball 2. The wire connecting balls 1 and 3 remains neutral.</p>

<p>Now we give ball 3 a negative change. The arrangement of electrons between wires 2 and 3 remains unchanged, while the electrons on the wire between 1 and 3 are closer to the ball 1.</p>

<p>Finally we give ball 1 a positive charge. The wire between 1 and 3 remains unchanged, but on the wire between balls 1 i 2 electrons are now closer to the ball 1 and the desired arrangement is achieved.</p>