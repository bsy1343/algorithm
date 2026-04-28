# [Gold IV] 월드컵 조별리그 - 27742

[문제 링크](https://www.acmicpc.net/problem/27742)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 228, 정답: 78, 맞힌 사람: 66, 정답 비율: 33.503%

### 분류

이분 탐색, 구현, 매개 변수 탐색

### 문제 설명

<p>FIFA의 주관 하에서 4년마다 월드컵이 개최된다. 2022년 카타르 월드컵을 기준으로, 참가팀들은 $4$팀씩 조에 편성되어 서로 한 번씩 경기해 오로지 $1$, $2$등만 토너먼트 진출 자격을 획득할 수 있다. 조별리그 순위 결정에 있어서 우선순위는 다음과 같다.</p>

<ol>
	<li><strong>승점</strong> : 승점이 큰 팀. 승점은 경기 결과에 따라 결정된다. 승리 시 $3$점, 무승부 시 $1$점, 패배 시 $0$점이다.</li>
	<li><strong>골득실</strong> : (득점 - 실점)이 큰 팀</li>
	<li><strong>다득점</strong> : 가장 많은 득점을 한 팀</li>
	<li><strong>상대 전적 </strong>: 편성된 조에서 상대 전적 순위가 더 높은 팀</li>
</ol>

<p>조별리그 순위는 먼저 승점으로 결정하며, 승점이 동률인 경우 골득실을, 골득실이 동률인 경우 다득점을, 다득점이 동률인 경우 상대 전적을 따진다.</p>

<p>A, B, C, D 팀이 월드컵 한 조로 편성되었다. 상대 전적 순위는 항상 A팀이 $1$위, B팀이 $2$위, C팀이 $3$위, D팀이 $4$위이다. 모든 경기를 치른 후, 팀이 각 경기에서 얼마나 득점했는지 알려주는 득점표가 주어진다.</p>

<table class="table table-bordered table-center-50 th-center td-center" summary="행은 득점한 팀, 열은 실점한 팀">
	<thead>
		<tr>
			<th scope="row">득점표</th>
			<th scope="col">(A팀)</th>
			<th scope="col">(B팀)</th>
			<th scope="col">(C팀)</th>
			<th scope="col">(D팀)</th>
		</tr>
		<tr>
			<th scope="row">A팀</th>
			<td>-</td>
			<td>$W_{AB}$</td>
			<td>$W_{AC}$</td>
			<td>$W_{AD}$</td>
		</tr>
		<tr>
			<th scope="row">B팀</th>
			<td>$W_{BA}$</td>
			<td>-</td>
			<td>$W_{BC}$</td>
			<td>$W_{BD}$</td>
		</tr>
		<tr>
			<th scope="row">C팀</th>
			<td>$W_{CA}$</td>
			<td>$W_{CB}$</td>
			<td>-</td>
			<td>$W_{CD}$</td>
		</tr>
		<tr>
			<th scope="row">D팀</th>
			<td>$W_{DA}$</td>
			<td>$W_{DB}$</td>
			<td>$W_{DC}$</td>
			<td>-</td>
		</tr>
	</thead>
</table>

<p style="text-align: center;">&lt;득점표&gt;</p>

<p>득점표에서 $W_{ij}$는 $i$팀이 $j$팀 상대로 득점한 값을 의미한다. 반대로 말해서 $W_{ij}$는 $j$팀이 $i$팀 상대로 실점한 값을 의미한다.</p>

<table class="table table-bordered table-center-50 th-center td-center" summary="행은 득점한 팀, 열은 실점한 팀">
	<thead>
		<tr>
			<th scope="row">득점표</th>
			<th scope="col">(A팀)</th>
			<th scope="col">(B팀)</th>
			<th scope="col">(C팀)</th>
			<th scope="col">(D팀)</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th scope="row">A팀</th>
			<td>0</td>
			<td>2</td>
			<td>3</td>
			<td>1</td>
		</tr>
		<tr>
			<th scope="row">B팀</th>
			<td>0</td>
			<td>0</td>
			<td>2</td>
			<td>0</td>
		</tr>
		<tr>
			<th scope="row">C팀</th>
			<td>2</td>
			<td>0</td>
			<td>0</td>
			<td>3</td>
		</tr>
		<tr>
			<th scope="row">D팀</th>
			<td><span style="color:#e74c3c;">$?$</span></td>
			<td>0</td>
			<td>2</td>
			<td>0</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">&lt;표 1&gt;</p>

<p>&lt;표 1&gt;의 득점표를 통해 경기 결과를 알 수 있다. 만약에 A팀과 B팀의 경기 결과를 알고 싶다면, &quot;A팀&quot; 행에서 &quot;(B팀)&quot; 열을 찾고 &quot;B팀&quot; 행에서 &quot;(A팀)&quot; 열을 찾으면 된다. 경기 결과는 $2:0$으로 A팀이 이긴 것을 알 수 있다.</p>

<p>A팀과 D팀의 경기 중 D팀의 득점이 누락되어서 <span style="color:#e74c3c;">$?$</span>로 처리되었다. D팀은 A팀 상대로 최소 $2$점을 득점해야 토너먼트 진출 자격을 획득할 수 있다.</p>

<p>이처럼 팀 $T$의 득점이 하나 누락된 득점표를 입력받아 팀 $T$가 진출 자격을 획득할 수 있는 득점 <span style="color:#e74c3c;">$?$</span>의 최솟값을 구하시오. 단, $T$가 득점 <span style="color:#e74c3c;">$?$</span>값과 상관없이 진출 자격을 획득할 수 없으면 <code><span style="color:#e74c3c;">-1</span></code>을 출력한다.</p>

### 입력

<p>첫 번째 줄에 팀 $T$의 상대 전적 순위와 양의 정수 $K$가 공백으로 구분되어 주어진다.</p>

<p>두 번째 줄부터 $4$개의 줄에 걸쳐 득점표가 주어진다. 각 줄에는 득점 $W_{ij}$가 공백으로 구분되어 주어진다.</p>

<ul>
	<li>$i=j$ 인 경우 <span style="color:#e74c3c;"><code>0</code></span>으로 주어진다.</li>
	<li>$i \neq j$ 인 경우
	<ul>
		<li>$W_{ij}$가 누락되지 않은 득점일 경우 음이 아닌 정수로 주어진다.</li>
		<li>$W_{ij}$가 누락된 득점 <span style="color:#e74c3c;">$?$</span>일 경우 <span style="color:#e74c3c;"><code>-1</code></span>로 주어진다.</li>
	</ul>
	</li>
</ul>

<p>두 번째 줄은 A팀의 득점, 세 번째 줄은 B팀의 득점, 네 번째 줄은 C팀의 득점, 다섯 번째 줄은 D팀의 득점이다.</p>

<p>주어지는 득점표는 누락된 득점이 항상 $1$개이며, 팀 $T$은 항상 한 경기에 대해 득점이 누락되어 있다.</p>

### 출력

<p>팀 $T$가 진출 자격을 획득할 수 있는 득점 <span style="color:#e74c3c;">$?$</span>의 최솟값을 출력한다.</p>

<p>단, <strong>최솟값이 $K$보다 크거나</strong> 득점 <span style="color:#e74c3c;">$?$</span>값과 상관없이 진출 자격을 획득할 수 없으면 <span style="color:#e74c3c;"><code>-1</code></span>을 출력한다.</p>

### 제한

<ul>
	<li>$1\,000 \le K \le 10^{12}$</li>
	<li>$0 \le W_{ij} \le K$</li>
</ul>