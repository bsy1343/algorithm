# [Platinum II] 뤼 신 - 23637

[문제 링크](https://www.acmicpc.net/problem/23637)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 10, 맞힌 사람: 10, 정답 비율: 37.037%

### 분류

자료 구조, 기하학, 다차원 세그먼트 트리, 세그먼트 트리

### 문제 설명

<p>뤼 신은 모든 것을 간파하여 보기 위해 눈에 안대를 감았다.</p>

<p>하지만, 아직&nbsp;정확하게 앞을 볼 수 없어서 항상 좌표 평면의&nbsp;$(0,0)$의 위치에서 주변을 바라보며 자신을 수련하고 있다. 뤼 신은 수련 중에 두 가지 행동을 할 수 있다.</p>

<ol>
	<li>물체를 $(y, x)$ 위치에 추가하는 일</li>
	<li>안대를 쓰고 본인의 시야에&nbsp;있는 물체의 개수를 파악하는 일. 단, 시야의 가장자리에 있는 물체도 포함한다.</li>
</ol>

<p>뤼 신은 2번 행동을 할 때 자신이 파악한 물체의 개수가 정확한지 알 수 없다. 뤼 신이 파악한 물체의 개수가 옳은지 알려주는&nbsp;프로그램을 작성해서 수련을 도와주자.</p>

### 입력

<p>첫 번째 줄에 초기에 주어지는 물체의 개수를 나타내는 정수&nbsp;$N$과 뤼 신이 행동한 횟수를 나타내는 정수 $Q$가 주어진다.</p>

<p>다음 $N$개의 줄에는 물체의 위치를 나타내는 정수 쌍 $y~x$가 주어진다. 이후 $Q$개의 줄에는 뤼 신의 행동이 다음 중 하나의&nbsp;형태로 주어진다.</p>

<ul>
	<li><code>1 y x</code> : $(y, x)$ 위치에 물체를 추가한다.</li>
	<li><code>2 L&nbsp;a b r c</code> :&nbsp;뤼 신이&nbsp;$a^\circ$ 방향에서부터&nbsp;<strong>반시계 방향</strong>으로 $b^\circ$ 만큼 보고 있으며 가시 거리가 $r$일 때, 파악한 물체의 개수가&nbsp;$c$ 이다.</li>
	<li><code>2 R a b r c</code> :&nbsp;뤼 신이&nbsp;$a^\circ$ 방향에서부터&nbsp;<strong>시계 방향</strong>으로 $b^\circ$&nbsp;만큼 보고 있으며&nbsp;가시 거리가 $r$일&nbsp;때,&nbsp;파악한&nbsp;물체의 개수가 $c$ 이다.
	<ul>
		<li>$a^\circ$ 방향이란, 원점에서부터&nbsp;$x$축의 양의 방향으로 뻗은 반직선을 기준으로 반시계 방향으로&nbsp;$a^\circ$ 꺾은 방향을 말한다.</li>
	</ul>
	</li>
</ul>

<p>$N, Q, y, x, a, b, r, c$는 모두 정수이며, 값의 범위는 다음과 같다.</p>

<ul>
	<li>$1 \leq&nbsp;N,&nbsp;Q \leq&nbsp;100,000$</li>
	<li>$-1,000 \leq&nbsp;y, x \leq&nbsp;1,000 \ (x \neq 0&nbsp;\lor y&nbsp;\neq 0)$</li>
	<li>$0 \leq&nbsp;a, b \leq&nbsp;360$</li>
	<li>$1 \leq&nbsp;r \leq&nbsp;1,000$</li>
	<li>$0 \leq&nbsp;c \leq&nbsp;200,000$</li>
</ul>

### 출력

<p>뤼 신의 2번 행동에&nbsp;대해&nbsp;각각 한 줄에 하나씩&nbsp;정답을 다음 중 하나의&nbsp;형태로 출력한다.</p>

<ul>
	<li><code>YES</code> - 뤼 신이 파악한 물체의 개수가&nbsp;시야에 존재하는 물체의 개수와 같다면 <code>YES</code>를 출력한다.</li>
	<li><code>NO X</code> - 그렇지 않다면, <code>NO</code>와 함께 시야에 존재하는&nbsp;물체의 개수 <code>X</code>를&nbsp;출력한다.</li>
</ul>