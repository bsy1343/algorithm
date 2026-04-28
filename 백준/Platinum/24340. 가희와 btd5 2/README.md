# [Platinum II] 가희와 btd5 2 - 24340

[문제 링크](https://www.acmicpc.net/problem/24340)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1000 MB

### 통계

제출: 82, 정답: 7, 맞힌 사람: 6, 정답 비율: 7.792%

### 분류

자료 구조, 구현, 시뮬레이션

### 문제 설명

<p>가희는 하나의&nbsp;라운드를 클리어하려고 합니다. 라운드를 클리어하기 위해 가희는 맵 내에 등장하는 풍선들을 막아야 합니다. [표 1]은 맵 내에 등장하는 풍선들을 나타냅니다.</p>

<table align="center" border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 700px;">
	<tbody>
		<tr>
			<td style="text-align: center;">레벨</td>
			<td style="text-align: center;">풍선 한글 이름</td>
			<td style="text-align: center;">풍선 영어 이름</td>
			<td style="text-align: center;">데미지를 입지 않는 속성</td>
		</tr>
		<tr>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">빨간 풍선</td>
			<td style="text-align: center;">Red Balloon</td>
			<td style="text-align: center;">-</td>
		</tr>
		<tr>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">은신 빨간 풍선</td>
			<td style="text-align: center;">Camo Red Balloon</td>
			<td style="text-align: center;">-</td>
		</tr>
		<tr>
			<td style="text-align: center;">3</td>
			<td style="text-align: center;">납이 씌워진 빨간 풍선</td>
			<td style="text-align: center;">Lead Balloon</td>
			<td style="text-align: center;">날카로운, 뾰족한</td>
		</tr>
		<tr>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">은신 납이 씌워진 은신 빨간 풍선</td>
			<td style="text-align: center;">Camo Lead Balloon</td>
			<td style="text-align: center;">날카로운, 뾰족한</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center; "><strong>[표 1] 스테이지에 나오는 풍선의 레벨과 특성</strong></p>

<p>[표 1]에 등장하는 풍선의 종류는 네 종류입니다.&nbsp;이 중, 레벨 1의 풍선과 레벨 2의 풍선은 데미지를 입으면&nbsp;맵에서 사라집니다. 레벨 3의 풍선은 데미지를 입으면 빨간 풍선에 씌워진 납이 사라집니다. 레벨 4의&nbsp;풍선은 데미지를 입으면 은신 빨간 풍선에 씌워진 은신 납이 사라집니다. 레벨이 2인 풍선과 4인&nbsp;풍선은 은신 속성을 가집니다.&nbsp;</p>

<p>가희는 저격수 원숭이만 이용해서 스테이지를 클리어하려고 합니다. 저격수 원숭이는 <strong>은신 속성이 있는 풍선을&nbsp;제외한 모든 풍선을</strong>&nbsp;볼 수 있으며,&nbsp;<strong>날카로운 속성의 공격</strong>을 합니다. 그리고 공격할 때 하나의 풍선만 공격합니다. 저격수 원숭이가 배울 수 있는 스킬은 L1, R1 2가지가 있습니다. 스킬 L1, R1을 배웠을 때 얻을 수 있는 능력은 아래와 같습니다.</p>

<table class="table table-bordered table-center-50">
	<tbody>
		<tr>
			<td style="text-align: center;">스킬 이름</td>
			<td style="text-align: center;">설명</td>
		</tr>
		<tr>
			<td style="text-align: center;">L1</td>
			<td style="text-align: center;"><strong>은신 속성</strong>이 붙어 있는 풍선을&nbsp;<strong>볼 수 있게 됩니다.</strong></td>
		</tr>
		<tr>
			<td style="text-align: center;">R1</td>
			<td style="text-align: center;">공격 속성을 뜨거운 속성으로 바꿉니다.</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;"><strong>[표 2] 저격 원숭이가 배울 수 있는 스킬의 효과</strong></p>

<p>예를 들어, L1과 R1 모두 배우지 않은 저격 원숭이는 날카로운 속성의 공격을 하므로 납이 씌워진 빨간 풍선을 공격해도 납이 없어지지 않습니다. 날카로운 속성은 납이 씌워진 빨간 풍선에&nbsp;데미지를 입힐 수 없기 때문입니다. 반면 R1 스킬을 배운 저격 원숭이는 납이 씌워진 빨간 풍선에&nbsp;데미지를 입혀서 납을 제거할 수 있습니다. 뜨거운 속성의 공격은 납이 씌워진 빨간 풍선에 데미지를 입힐 수 있기 때문입니다.</p>

<p>맵에는 물체들이 갈 수 있는 경로가 있습니다. 경로에 풍선들이&nbsp;나오면,&nbsp;경로의&nbsp;입구부터 일련의 지점들을 거쳐&nbsp;출구까지 가게 됩니다.&nbsp;경로의 길이가 <code>r_len</code>이라면, 해당 경로의 지점 번호는 1번부터 <code>r_len</code>번까지 있습니다. 풍선이 <em>x</em>번 지점에 나타난 시간을 게임&nbsp;시간&nbsp;<em>t<sub>x</sub></em>초라고 하겠습니다.&nbsp;</p>

<ul>
	<li>x가 <code>r_len</code>인 경우 게임 시간&nbsp;<code>t<sub>x</sub> + 0.1</code>초에 풍선이 맵에서 사라지게 됩니다.</li>
	<li>그렇지 않으면 게임 시간&nbsp;<code>t<sub>x</sub> + 0.1</code>초에 풍선이&nbsp;<em>x</em>번 지점에서 사라지고 <em>x+1</em>번 지점에 나타나게 됩니다.</li>
</ul>

<p>예를 들어 풍선이&nbsp;(0, 1)에서 들어와서&nbsp;(0, 2), (0, 3), (1, 3), (1, 2)를 거쳐 다시 (0, 2)로 간 다음에 경로가 끝난다고&nbsp;생각해 보겠습니다. [표 3]은&nbsp;이 경로의 지점 번호와&nbsp;좌표를 나타냅니다.</p>

<table class="table table-bordered table-center-50">
	<tbody>
		<tr>
			<td style="text-align: center;">지점 번호</td>
			<td style="text-align: center;">좌표</td>
			<td style="text-align: center;">특이 사항</td>
		</tr>
		<tr>
			<td style="text-align: right;">1</td>
			<td style="text-align: center;">(0,1)</td>
			<td style="text-align: center;">경로의 입구</td>
		</tr>
		<tr>
			<td style="text-align: right;">2</td>
			<td style="text-align: center;">(0,2)</td>
			<td style="text-align: center;">&nbsp;</td>
		</tr>
		<tr>
			<td style="text-align: right;">3</td>
			<td style="text-align: center;">(0,3)</td>
			<td style="text-align: center;">&nbsp;</td>
		</tr>
		<tr>
			<td style="text-align: right;">4</td>
			<td style="text-align: center;">(1,3)</td>
			<td style="text-align: center;">&nbsp;</td>
		</tr>
		<tr>
			<td style="text-align: right;">5</td>
			<td style="text-align: center;">(1,2)</td>
			<td style="text-align: center;">&nbsp;</td>
		</tr>
		<tr>
			<td style="text-align: right;">6</td>
			<td style="text-align: center;">(0,2)</td>
			<td style="text-align: center;">경로의 출구이며, 풍선이 <strong>다음 지점으로 이동하면 사라짐</strong></td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;"><strong>[표 3] 문제에서 설명하는 경로와 경로의 지점 번호</strong></p>

<p>이 경로에 빨간 풍선이 게임 시간&nbsp;0.100초에 나타났다고 해 보겠습니다. 시간대별로 빨간 풍선의 위치는 [표 4]와 같습니다.</p>

<table align="center" border="1" cellpadding="1" cellspacing="1" class="table table-bordered" style="width: 500px;">
	<tbody>
		<tr>
			<td style="text-align: center;">지점 번호</td>
			<td style="text-align: center;">나타난 시간</td>
			<td style="text-align: center;">다음 지점에 나타난 시간</td>
			<td style="text-align: center;">특이 사항</td>
		</tr>
		<tr>
			<td style="text-align: right;">1</td>
			<td style="text-align: right;">0.100</td>
			<td style="text-align: right;">0.200</td>
			<td style="text-align: center;">경로의 입구</td>
		</tr>
		<tr>
			<td style="text-align: right;">2</td>
			<td style="text-align: right;">0.200</td>
			<td style="text-align: right;">0.300</td>
			<td style="text-align: center;">&nbsp;</td>
		</tr>
		<tr>
			<td style="text-align: right;">3</td>
			<td style="text-align: right;">0.300</td>
			<td style="text-align: right;">0.400</td>
			<td style="text-align: center;">&nbsp;</td>
		</tr>
		<tr>
			<td style="text-align: right;">4</td>
			<td style="text-align: right;">0.400</td>
			<td style="text-align: right;">0.500</td>
			<td style="text-align: center;">&nbsp;</td>
		</tr>
		<tr>
			<td style="text-align: right;">5</td>
			<td style="text-align: right;">0.500</td>
			<td style="text-align: right;">0.600</td>
			<td style="text-align: center;">&nbsp;</td>
		</tr>
		<tr>
			<td style="text-align: right;">6</td>
			<td style="text-align: right;">0.600</td>
			<td style="text-align: center;">-</td>
			<td style="text-align: center;">경로의 출구</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;"><strong>[표 4] 빨간 풍선이 각 지점에 있는 시간대</strong></p>

<p>게임 시간&nbsp;0.100초에 빨간 풍선이 경로에 나왔으므로, 1번 지점에 나타난 시간은 0.100초입니다. 6번 지점은 경로의 출구입니다. 따라서 게임 시간 0.700초에 빨간 풍선은 사라지게 됩니다.</p>

<p>경로의 길이가 <em>r_len</em>인 경로의 <em>x</em>번 지점에 id가 <em>balloon_id</em>인 풍선이 있을 때, 이 풍선의 출구로부터의 거리는 <code>r_len-x</code>이고, 입구로부터의 거리는 <code>x-1</code>입니다.</p>

<p>각각의 저격 원숭이들은 선택&nbsp;우선순위가&nbsp;있습니다. 선택&nbsp;우선순위는&nbsp;FIRST, LAST, STRONG&nbsp;셋 중 하나입니다.</p>

<ul>
	<li>FIRST인&nbsp;경우, 자신이 볼 수 있는 풍선&nbsp;중&nbsp;출구에서부터 거리가 가장 짧은&nbsp;풍선을 선택합니다. 그러한 것이 여러 개라면, 현재 풍선이 있는 지점에 가장 많은 시간 동안&nbsp;있었던 풍선을 선택합니다. 그러한 것이 여러 개라면 <code>balloon_id</code>가 가장 작은 것을 선택합니다.</li>
	<li>LAST인&nbsp;경우, 자신이 볼 수 있는 풍선&nbsp;중&nbsp;입구에서부터 거리가 가장 짧은&nbsp;풍선을 선택합니다. 그러한 것이 여러 개라면, 현재 풍선이 있는 지점에 가장 적은 시간 동안 있었던 풍선을 선택합니다. 그러한 것이 여러 개라면 <code>balloon_id</code>가 가장 작은 것을 선택합니다.</li>
	<li>STRONG인&nbsp;경우, 자신이 볼 수 있는 풍선&nbsp;중 레벨이 가장 높은 풍선을 선택&nbsp;합니다. 그러한 것이 여러 개라면 <code>balloon_id</code>가 가장 작은 것을 선택합니다.</li>
</ul>

<p>예를 들어 1번 경로가 (0,1)에서 출발하여, (0,2), (0,1), (0,2), (0,1)를&nbsp;거쳐 (1,1)에서 끝나고, 2번 경로가 (2,1)에서 출발하여 (2,2), (2,3), (2,4), (2,5)를 거쳐 (2,6)에서 끝난다고 해 보겠습니다. 1번 경로와 2번 경로는 각각 6개의 지점을 거치게 됩니다. id가 2인 풍선이 2번 경로에 게임 시간&nbsp;0.110초에 나타나고, id가 1인 풍선이 1번 경로에 게임 시간이&nbsp;0.120초일 때&nbsp;나타난다고 하겠습니다.</p>

<p>게임 시간이&nbsp;0.550초일 때, id가 1인 풍선과 id가 2인 풍선은 각각 경로 1번의 5번 지점, 경로 2번의 5번 지점에 있게 됩니다. 이때, 선택&nbsp;우선순위가 FIRST인 원숭이가 풍선을 선택하는 과정은 아래와 같습니다.</p>

<ul>
	<li>경로 1번의 5번 지점으로부터 출구까지&nbsp;거리는 1, 경로 2번의 5번 지점에서 출구까지 거리는 1입니다. 즉 두 풍선은 출구로부터 거리가 같습니다.</li>
	<li>1번 풍선은 경로 1번의 5번 지점에 0.030초 동안, 2번 풍선은 경로 2번의 5번 지점에 0.040초 동안 있었습니다.</li>
	<li>현 위치에 더 오래 있었던 풍선은 id가 2번인 풍선이므로 선택&nbsp;우선순위가 FIRST인 원숭이는 id가 2인 풍선을 선택합니다.</li>
</ul>

<p>이때, 1번 풍선이 경로 1번의 5번 지점에 있었던 시간에는&nbsp;<strong>경로 1번의 1번, 3번 지점에 있었던 시간을 합산하지 않습니다.</strong></p>

<p>스테이지가 시작되면 게임 시스템은 아래와 같이 동작합니다.</p>

<ul>
	<li>풍선이 맵에 등장하는 이벤트와&nbsp;공격 명령이 동시에 주어지면, 풍선이 맵에 등장하는 이벤트가 먼저 실행됩니다.</li>
	<li>게임 시간&nbsp;<code>monkey_id &times; 0.001</code>초에 id가 <code>monkey_id</code>인 저격 원숭이에게 처음 공격 명령을 내리게 됩니다.
	<ul>
		<li>id가 <code>monkey_id</code>인 저격 원숭이가 있다면, 그 원숭이는 <strong>풍선을 선택하고, 선택한 풍선을 즉시 공격</strong>합니다.</li>
		<li>id가 <code>monkey_id</code>인 저격 원숭이가 없다면 해당 명령은 무시됩니다.</li>
	</ul>
	</li>
	<li>id가 <code>monkey_id</code>인 저격 원숭이에게 공격하라는 명령은 1초 간격으로 이루어지게 됩니다.</li>
</ul>

<p>예를 들어 id가 500인 저격 원숭이에게 공격하라는 명령은 <strong>게임&nbsp;시간&nbsp;0.500초, 1.500초, 2.500초, ... 후에 발동</strong>되게 됩니다.</p>

<p>가희는 풍선이 데미지를 입았을 때,&nbsp;어느 저격 원숭이가 데미지를 주었는지&nbsp;알고 싶어 합니다. 가희를 도와주세요.</p>

### 입력

<p>첫 줄에 경로의 개수 <em>R</em>과 스테이지 시작 전에 있었던 저격 원숭이의 수 <em>U</em>가 공백으로 구분되어 주어집니다. 경로의 개수는 1개 이상 10개 이하이고, 스테이지 시작 전에 저격 원숭이의 수는&nbsp;1마리보다 많거나 같고,&nbsp;10<sup>3</sup>마리보다 작거나 같습니다.</p>

<p>두 번째 줄에는&nbsp;<em>R</em>개의 정수가 공백을 구분으로 해서 주어집니다. 이때 <i>x</i>번째 정수는 id가&nbsp;<em>x</em>인 경로가 몇 개의 지점을 거치는지를 나타냅니다.</p>

<p>다음&nbsp;<em>R</em>개의 줄에 걸쳐 <code>route_id</code>가 1인 경로부터 <code>route_id</code>가&nbsp;<em>R</em>인 경로까지 경로에 대한 정보가&nbsp;한 줄에 하나씩 차례대로&nbsp;주어집니다.</p>

<p><em>x</em>번째 경로가 지점 <em>r<sub>x</sub></em>개를 거쳐 간다면, 1번 지점부터&nbsp;<em>r<sub>x</sub></em>번 지점까지 순서대로 공백으로 구분되어 주어지며, 지점 정보는 아래와 같은 포맷으로 주어집니다.</p>

<p style="text-align: center;">(정수,정수)</p>

<p>각 경로는 5개 이상 500개 이하의 지점을 거치게 되며, 맵에 등장하는 지점 개수는 3&times;10<sup>3</sup>개 이하입니다. 모든 지점의 x 좌표와 y 좌표는 0 이상 10<sup>3</sup>이하의 정수입니다.</p>

<p>다음 <em>U</em>개의 줄에는 저격 원숭이에 대한 정보인 <code>monkey_id</code>, <code>upgrade_status</code>, <code>select_priority</code>가 공백으로 구분되어 주어집니다. <code>monkey_id</code>는 저격 원숭이의 id, <code>upgrade_status</code>는 저격 원숭이가 어떤 스킬들을 배웠는지, <code>select_priority</code>는 설정된 선택&nbsp;우선순위를 의미합니다.&nbsp;<code>upgrade_status</code>는 <code>-</code>, <code>L1</code>, <code>R1</code>, <code>L1R1</code>중 하나이며, 각각 아무 스킬도 배우지 않은 상태, L1 스킬만 배운 상태, R1 스킬을 배운 상태, L1과 R1 스킬을 모두 배운 상태를 의미합니다.</p>

<p>그다음 줄에는 이벤트 개수&nbsp;<em>E</em>가 주어집니다. 이벤트 개수는 1개 이상 5&times;10<sup>5</sup>개&nbsp;이하입니다.</p>

<p>다음 <em>E</em>개의 줄에는 발생한 이벤트 목록이 시간 순서대로 주어집니다. 이벤트 목록에 대한 형식은 아래와 같습니다.</p>

<ul>
	<li>s.T&nbsp;ADD <code>monkey_id</code>

	<ul>
		<li>게임 시간&nbsp;s.T초에 id가 <code>monkey_id</code>이고 <strong>아무런 스킬도 배우지 않은</strong>&nbsp;저격 원숭이를 추가합니다. 이때 선택&nbsp;우선순위는 FIRST로 설정됩니다.</li>
	</ul>
	</li>
	<li>s.T&nbsp;UPGRADE <code>monkey_id</code> <code>skill_name</code>
	<ul>
		<li>게임 시간&nbsp;s.T초에&nbsp;id가 <code>monkey_id</code>인 저격 원숭이는 스킬 이름이 <code>skill_name</code>인 스킬을 배웁니다. <code>skill_name</code>은 <code>L1</code>, <code>R1</code>&nbsp;중 하나로 주어집니다.</li>
	</ul>
	</li>
	<li>s.T&nbsp;REMOVE <code>monkey_id</code>
	<ul>
		<li>게임 시간&nbsp;s.T초에 id가 <code>monkey_id</code>인 저격 원숭이는 제거됩니다.</li>
	</ul>
	</li>
	<li>s.T CHANGEPRIORITY <code>monkey_id</code> <code>select_priority</code>
	<ul>
		<li>게임 시간&nbsp;s.T초에 id가 <code>monkey_id</code>인 저격 원숭이의 선택&nbsp;우선 순위를&nbsp;<code>select_priority</code>로 설정합니다. <code>select_priority</code>는 <code>FIRST</code>, <code>LAST</code>, <code>STRONG </code>중 하나로 주어집니다.</li>
	</ul>
	</li>
	<li>s.T BALLOON <code>balloon_name balloon_id route_id</code>
	<ul>
		<li>게임 시간&nbsp;s.T초에 id가 <code>balloon_id</code>이고 영어 이름이 <code>balloon_name</code>인&nbsp;풍선이 id가 <code>route_id</code>인 경로에 나옵니다.</li>
	</ul>
	</li>
</ul>

<p>풍선은&nbsp;게임 시각 180.000초 이후에 나오지 않으며, 300.000초 이후의 이벤트는 주어지지 않습니다.</p>

<p>s.T&nbsp;포맷에서 s는 0 이상의 정수로 주어지며, T는 0 이상 999 이하의 정수로 주어집니다. 이때&nbsp;T가 두 자릿수라면 T&nbsp;앞에 0 이, 한 자릿수라면 T 앞에 00 이 붙습니다. 이는, 게임 시간&nbsp;s+T&times;10<sup>-3</sup>초를&nbsp;의미합니다.</p>

### 출력

<p>풍선이&nbsp;데미지를 입을 때마다 풍선의 id와 데미지를 준&nbsp;저격 원숭이의 id를 공백으로 구분해서 출력해 주세요. 이때 발생한 시간순으로 출력해 주세요.</p>

### 제한

<ul>
	<li>맵 안에 있는 저격 원숭이의 id는 1 이상 10<sup>3</sup> 이하의 정수이며, 게임이 진행되는 도중에 id가 같은 둘 이상의 저격 원숭이가 존재하지 않습니다.</li>
	<li>맵에 등장하는 풍선 id는 1 이상 10<sup>6</sup> 이하의 정수로 주어지며, 같은 id의 풍선이 두 번 이상 나오지 않습니다.</li>
	<li>id가 <code>monkey_id</code>인 저격 원숭이가 없을 때, id가 <code>monkey_id</code>인 저격 원숭이를 업그레이드하거나, 제거하거나, 선택&nbsp;우선순위를 바꾸는 이벤트는 주어지지 않습니다.</li>
	<li>id가 <code>monkey_id</code>인 저격 원숭이가 있을 때, id가 <code>monkey_id</code>인 저격 원숭이를 추가하는 이벤트는 주어지지 않습니다.</li>
	<li>이미 배운 스킬을 또 배우는 이벤트는 주어지지 않습니다.</li>
	<li>다음 이벤트는 같은 시각에 주어지지 않습니다.
	<ul>
		<li>id가 <code>monkey_id</code>인 저격 원숭이에 대한 이벤트와&nbsp;id가 <code>monkey_id</code>인 저격 원숭이에게 공격 명령이 떨어지는 이벤트</li>
		<li>id가 <code>monkey_id</code>인 저격 원숭이에 대한 둘 이상의 이벤트</li>
	</ul>
	</li>
	<li>같은 경로에 나오는 풍선들의 생성 시각은 모두 다릅니다.</li>
	<li>게임이 진행되는 동안&nbsp;데미지를 입는 풍선이&nbsp;하나 이상 있습니다.</li>
</ul>

### 힌트

<p><em>R&nbsp;</em>제한이&nbsp;10인 이유는 crypt keeper의 경로 수가 10이기 때문입니다. 해당 맵은 정방향 한정 잠수함이 패치되기 전까지 <strong>제일 어려운 맵 중 하나였습니다.</strong></p>