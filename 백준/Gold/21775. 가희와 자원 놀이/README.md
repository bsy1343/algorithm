# [Gold V] 가희와 자원 놀이 - 21775

[문제 링크](https://www.acmicpc.net/problem/21775)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 539, 정답: 270, 맞힌 사람: 180, 정답 비율: 46.512%

### 분류

구현, 자료 구조, 집합과 맵, 시뮬레이션, 트리를 사용한 집합과 맵

### 문제 설명

<p>가희와 친구들은 자원&nbsp;놀이를 하고 있습니다.</p>

<p>이 놀이는 <em>T</em>개의 연산 카드와, 1 부터&nbsp;2&times;10<sup>9</sup>&nbsp;이하의 자연수가 한 장에 하나씩 순서대로 적혀져 있는 2&times;10<sup>9</sup>개의 자원 카드를 이용합니다.</p>

<p>자원 놀이에서 사용하는 연산 카드의 종류는 3가지입니다.</p>

<ul>
	<li>next
	<ul>
		<li>아무 일도 일어나지 않고 이 카드를&nbsp;버립니다.</li>
	</ul>
	</li>
	<li>acquire <em>n</em>
	<ul>
		<li>자연수 <em>n</em>이 적혀진 자원 카드를 획득하려고 시도합니다.<br />
		만약 자연수 n이 적혀진 자원 카드가 공용 공간에 있다면 자신의 공간으로 자원 카드를 가져온 다음에, acquire n 카드를 버립니다.<br />
		그렇지 않고, 자원 카드가 다른 누군가의 공간에 있는 경우에는 이 카드를 버리지 않고 돌아오는 자신의 다음 차례에 재사용합니다.</li>
	</ul>
	</li>
	<li>release <em>n</em>
	<ul>
		<li>자연수 <i>n</i>이 적혀진 자원 카드를 공용 공간에 반납하고, 이 카드를 버립니다.</li>
	</ul>
	</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21775.%E2%80%85%EA%B0%80%ED%9D%AC%EC%99%80%E2%80%85%EC%9E%90%EC%9B%90%E2%80%85%EB%86%80%EC%9D%B4/ed5993b5.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/21775.%E2%80%85%EA%B0%80%ED%9D%AC%EC%99%80%E2%80%85%EC%9E%90%EC%9B%90%E2%80%85%EB%86%80%EC%9D%B4/ed5993b5.png" data-original-src="https://upload.acmicpc.net/43755b39-8d58-4132-a673-e2b1887af875/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><strong>[그림 1]</strong> 자원 게임의 초기 상태</p>

<p style="text-align: center;">모든 유저들은 자원 카드와 연산 카드를 들고 있지 않습니다.</p>

<p>게임의 규칙은 아래와 같습니다.</p>

<ul>
	<li>처음에 <strong>모든 자원 카드들과 연산 카드들은&nbsp;공용 공간에 놓여져 있습니다.</strong></li>
	<li>각 턴을 수행하는 사람은 1명입니다.</li>
	<li>자신의 턴이 돌아오면 다음의 행동을 수행합니다.
	<ul>
		<li>연산 카드를 들고 있지 않은 경우
		<ul>
			<li>더미의 맨 위에 있는 연산 카드를 뽑고, 해당 카드에 있는 연산을 즉시 수행합니다.</li>
		</ul>
		</li>
		<li>연산 카드를 들고 있는 경우
		<ul>
			<li>들고 있는 연산 카드에 있는 연산을 즉시 수행합니다.</li>
		</ul>
		</li>
	</ul>
	</li>
</ul>

<p>처음 연산 카드 더미에 있던 연산 카드가 <i>T</i>개 주어지고, <em>T</em> 턴동안 각 턴을 수행한 사람의 번호가 주어집니다.</p>

<p><em>T&nbsp;</em>턴동안 수행된 연산 카드의 <em>id</em>를&nbsp;알려주세요. <strong>처음 더미에 있는 연산 카드의 갯수와 턴 수는&nbsp;같습니다.</strong></p>

### 입력

<p>첫 번째 줄에 자원 놀이에 참가하는 사람&nbsp;수 <em>N</em>과 턴 수&nbsp;<em>T</em>가 주어집니다.</p>

<p>두 번째 줄에 각&nbsp;턴을&nbsp;수행한 사람 번호가 <em>T</em>개 주어집니다.</p>

<p>세 번째 줄 부터 <em>2+T</em>번째 줄까지, 더미의 맨 위에 있는 카드부터, 더미에 있는 연산 카드의 <em>id</em>와 연산 카드에 적혀져 있는 연산이&nbsp;공백으로 구분되어 주어집니다.</p>

### 출력

<p><em>T</em>턴에 걸쳐서, 각 턴에 수행된 연산 카드의 <em>id</em>를 한 줄에 하나씩 출력해 주세요.</p>

### 제한

<ul>
	<li>1 &le; <em>N</em> &le;&nbsp;<em>T&nbsp;</em>&le; 5&times;10<sup>5</sup></li>
	<li>1 &le; 턴을 수행하는 사람의 번호 &le; <em>N</em></li>
	<li>1 &le; acquire나 release 연산에서 등장하는 수 &le; 2&times;10<sup>9</sup></li>
	<li>자원 카드 <em>n</em>을 획득한 사람이 다시 acquire <em>n</em>을 수행하는 경우는 주어지지 않습니다.</li>
	<li>획득하지 않은 자원 카드를&nbsp;release 하는 경우는 주어지지 않습니다.</li>
	<li>1 &le; 더미에 있는&nbsp;연산 카드의 id &le;&nbsp;5&times;10<sup>5</sup></li>
	<li>더미에 있는 연산 카드의 <em>id</em>는 모두 다릅니다.</li>
</ul>