# [Platinum I] 장난감 정리 로봇 - 8875

[문제 링크](https://www.acmicpc.net/problem/8875)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 64 MB

### 통계

제출: 845, 정답: 242, 맞힌 사람: 173, 정답 비율: 26.575%

### 분류

자료 구조, 그리디 알고리즘, 이분 탐색, 우선순위 큐, 매개 변수 탐색

### 문제 설명

<p>마리타의 남동생은 모든 장난감을 거실 바닥에 어질러놓았다! 다행히도 마리타는 장난감을 정리하는 특별한 로봇들을 개발하였다. 마리타는 어떤 로봇이 어떤 장난감을 집어야 하는지 결정하도록 당신에게 도움을 청했다.</p>

<p>장난감은 총 T 개가 있으며, 각각은 정수 무게 W[i] 와 정수 크기 S[i] 를 가진다. 로봇들은 연약한 로봇과 작은 로봇 두 가지 종류가 있다.</p>

<p>연약한 로봇은 총 A 개가 있다. 각 연약한 로봇에는 무게 제한 X[i] 가 있어서, X[i] 미만의 무게를 가진 장난감만을 운반할 수 있다. 장난감의 크기는 상관없다.</p>

<p>작은 로봇은 총 B 개가 있다. 각 작은 로봇에는 크기 제한 Y[i] 가 있어서, Y[i] 미만의 크기를 가진 장난감만을 운반할 수 있다. 장난감의 무게는 상관없다.</p>

<p>마리타의 로봇들 각각은 하나의 장난감을 정리하는 데 1분이 걸린다. 여러 로봇들이 서로 다른 장난감들을 동시에 정리할 수 있다.</p>

<p>당신의 임무는 마리타의 로봇들이 모든 장난감들을 정리할 수 있는지 결정하고, 만약 가능하다면, 모든 장난감을 정리하는데 걸리는 가장 짧은 시간을 찾는 것이다.</p>

<p>첫 번째 예시로, 무게 제한 X = [6, 2, 9] 를 가진 A = 3 개의 연약한 로봇과 크기 제한 Y = [4, 7] 을 가진 B = 2 개의 작은 로봇이 있고, T = 10 개의 장난감이 아래와 같이 있다고 하자:</p>

<table class="table table-bordered" style="width:45%">
	<thead>
		<tr>
			<th style="width:15%">장난감 번호</th>
			<th style="width:3%">0</th>
			<th style="width:3%">1</th>
			<th style="width:3%">2</th>
			<th style="width:3%">3</th>
			<th style="width:3%">4</th>
			<th style="width:3%">5</th>
			<th style="width:3%">6</th>
			<th style="width:3%">7</th>
			<th style="width:3%">8</th>
			<th style="width:3%">9</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th>무게</th>
			<td>4</td>
			<td>8</td>
			<td>2</td>
			<td>7</td>
			<td>1</td>
			<td>5</td>
			<td>3</td>
			<td>8</td>
			<td>7</td>
			<td>10</td>
		</tr>
		<tr>
			<th>크기</th>
			<td>6</td>
			<td>5</td>
			<td>3</td>
			<td>9</td>
			<td>8</td>
			<td>1</td>
			<td>3</td>
			<td>7</td>
			<td>6</td>
			<td>5</td>
		</tr>
	</tbody>
</table>

<p>모든 장난감들을 정리하는 데 걸리는 가장 짧은 시간은 3분이다:</p>

<table class="table table-bordered" style="width:85%">
	<thead>
		<tr>
			<th style="width:10%">&nbsp;</th>
			<th style="width:15%">연약한 로봇 0</th>
			<th style="width:15%">연약한 로봇 1</th>
			<th style="width:15%">연약한 로봇 2</th>
			<th style="width:15%">작은 로봇 0</th>
			<th style="width:15%">작은 로봇 1</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th>1분째</th>
			<td>장난감 0</td>
			<td>장난감 4</td>
			<td>장난감 1</td>
			<td>장난감 6</td>
			<td>장난감 2</td>
		</tr>
		<tr>
			<th>2분째</th>
			<td>장난감 5</td>
			<td>&nbsp;</td>
			<td>장난감 3</td>
			<td>&nbsp;</td>
			<td>장난감 8</td>
		</tr>
		<tr>
			<th>3분째</th>
			<td>&nbsp;</td>
			<td>&nbsp;</td>
			<td>장난감 7</td>
			<td>&nbsp;</td>
			<td>장난감 9</td>
		</tr>
	</tbody>
</table>

<p>두 번째 예시로, 무게 제한 X = [2, 5] 를 가진 A = 2 개의 연약한 로봇과 크기 제한 Y = [2] 를 가진 B = 1 개의 작은 로봇이 있고, T = 3 개의 장난감이 아래와 같이 있다고 하자</p>

<table class="table table-bordered" style="width:24%">
	<thead>
		<tr>
			<th style="width:15%">장난감 번호</th>
			<th style="width:3%">0</th>
			<th style="width:3%">1</th>
			<th style="width:3%">2</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th>무게</th>
			<td>3</td>
			<td>5</td>
			<td>2</td>
		</tr>
		<tr>
			<th>크기</th>
			<td>1</td>
			<td>3</td>
			<td>2</td>
		</tr>
	</tbody>
</table>

<p>어떤 로봇도 무게 5, 크기 3짜리의 장난감을 정리할 수 없기 때문에, 모든 장난감들을 치우는 것은 불가능하다.</p>

### 입력

<p>첫째 줄에 연약한 로봇의 개수 A, 작은 로봇의 개수 B, 장난감의 개수 T가 주어진다.</p>

<p>둘째 줄에는 각 연약한 로봇의 무게 제한을 나타내는 길이가 A인 배열이 주어진다.</p>

<p>셋째 줄에는 각 작은 로봇의 크기 제한을 나타나는 길이가 B인 배열이 주어진다.</p>

<p>다음 T개 줄에는 각 장난감의 무게 W[i]와 크기 S[i]가 주어진다.</p>

### 출력

<p>모든 장난감을 정리하는데 걸리는 가장 짧은 시간(분)을 출력한다. 만약 정리하는 것이 불가능하다면, -1을 출력한다.</p>

### 제한

<ul>
	<li>1 &le; T &le; 1,000,000</li>
	<li>0 &le; A, B &le; 50,000, 1 &le; A+B</li>
	<li>1 &le; X[i], Y[i], W[i], S[i] &le; 2,000,000,000</li>
	<li>만약 A=0 또는 B=0이라면, 해당하는(두 번째 또는 세 번째)줄은 비어있다.</li>
</ul>