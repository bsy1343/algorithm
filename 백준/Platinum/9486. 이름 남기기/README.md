# [Platinum V] 이름 남기기 - 9486

[문제 링크](https://www.acmicpc.net/problem/9486)

### 성능 요약

시간 제한: 12 초, 메모리 제한: 128 MB

### 통계

제출: 96, 정답: 45, 맞힌 사람: 35, 정답 비율: 46.667%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>꿍이 자기가 좋아하는 게임에서 최고득점을 달성했다! 이제 이름만 입력하면 되는데 몇 가지 귀찮은 과정이 남아있다.</p>

<ul>
	<li>입력할 수 있는 글자는 A부터 Z까지 26개의 대문자밖에 없다. 숫자도, 공백도, 소문자도, 그 어떠한 다른 문자도 없다.</li>
	<li>UP과 DOWN을 누르면 입력하려는 문자가 바뀐다. 처음 문자는 A로 설정되어 있으며 A에서 DOWN을 누르면 Z로, Z에서 UP을 누르면 A로 바뀐다.&nbsp;</li>
	<li>LEFT와 RIGHT를 누르면 커서를 한 칸씩 움직일 수 있다. 커서가 한 쪽 끝에 있다면 커서는 그 방향으로는 더이상 움직일 수 없다.</li>
	<li>FIRE를 누르면 입력하려는 문자가 입력된다.</li>
</ul>

<p>예를 들어, &#39;ALMA&#39;라는 문자를 입력한다고 가정하자. 그렇다면 꿍은 다음과 같이 &#39;ALMA&#39;를 입력할 수 있다.</p>

<table class="table table-bordered" style="width:60%">
	<thead>
		<tr>
			<th style="width:15%">행동</th>
			<th style="width:15%">누른 횟수</th>
			<th style="width:15%">입력된 이름 (| = 커서)</th>
			<th style="width:15%">입력하려는 문자</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>FIRE</td>
			<td>1</td><td>A|</td>
			<td>A</td>
		</tr>
		<tr>
			<td>UP</td>
			<td>11</td>
			<td>A|</td>
			<td>L</td>
		</tr>
		<tr>
			<td>FIRE</td>
			<td>1</td>
			<td>AL|</td>
			<td>L</td>
		</tr>
		<tr>
			<td>UP</td>
			<td>1</td>
			<td>AL|</td>
			<td>M</td>
		</tr>
		<tr>
			<td>FIRE</td>
			<td>1</td>
			<td>ALM|</td>
			<td>M</td>
		</tr>
		<tr>
			<td>DOWN</td>
			<td>12</td>
			<td>ALM|</td>
			<td>A</td>
		</tr>
		<tr>
			<td>FIRE</td>
			<td>1</td>
			<td>ALMA|</td>
			<td>A</td>
		</tr>
	</tbody>
</table>

<p>이렇게 하면 28번을 눌러 이름을 입력할 수 있다. 하지만 다음과 같은 경우를 생각해보자.</p>

<table class="table table-bordered" style="width:60%">
	<thead>
		<tr>
			<th style="width:15%">행동</th>
			<th style="width:15%">누른 횟수</th>
			<th style="width:15%">입력된 이름 (| = 커서)</th>
			<th style="width:15%">입력하려는 문자</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>FIRE</td>
			<td>1</td>
			<td>A|</td>
			<td>A</td>
		</tr>
		<tr>
			<td>FIRE</td>
			<td>1</td>
			<td>AA|</td>
			<td>A</td>
		</tr>
		<tr>
			<td>LEFT</td>
			<td>1</td>
			<td>A|A</td>
			<td>A</td>
		</tr>
		<tr>
			<td>UP</td>
			<td>11</td>
			<td>A|A</td>
			<td>L</td>
		</tr>
		<tr>
			<td>FIRE</td>
			<td>1</td>
			<td>AL|A</td>
			<td>L</td>
		</tr>
		<tr>
			<td>UP</td>
			<td>1</td>
			<td>AL|A</td>
			<td>M</td>
		</tr>
		<tr>
			<td>FIRE</td>
			<td>1</td>
			<td>ALM|A</td>
			<td>M</td>
		</tr>
	</tbody>
</table>

<p>이렇게 하면 17번만 눌러도 이름을 입력할 수 있다. 다른 이름을 입력할 때, 가장 적게 버튼을 눌러서 이름을 입력하려면 몇 번을 눌러야 할까? 입력하려는 문자는 A로 시작하며, 이름을 다 입력했을 때 커서의 위치는 상관없다고 하자.</p>

### 입력

<p>각 테스트 케이스에 대해 길이가 1~18인 대문자로만 이루어진 한 줄의 이름이 주어진다. 입력의 마지막은 0 하나만 주어진다.</p>

### 출력

<p>각 테스트 케이스에 대해 각 줄에&nbsp;이름을 입력할 때 가장 적게 버튼을 누르는 횟수가 몇번인지 출력한다.</p>