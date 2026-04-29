# [Platinum III] 가희와 신칸센 1 - 32784

[문제 링크](https://www.acmicpc.net/problem/32784)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 11, 맞힌 사람: 4, 정답 비율: 28.571%

### 분류

구현, 누적 합, 수학

### 문제 설명

<p><strong>실제 도카이도 신칸센의 요금과 다름에 주의하세요.</strong></p>

<p>도카이도 신칸센은 Tokyo 역에서부터 Shin-Osaka 역까지 $500km$가 넘는 구간을 이어주는 노선입니다. Shin-Osaka 역에서 산요 신칸센과 직결됩니다. 해당 노선에는 등급이 낮은 순서대로 <span style="color:#e74c3c;"><code>kodama</code></span>, <span style="color:#e74c3c;"><code>hikari</code></span>, <span style="color:#e74c3c;"><code>nozomi</code></span>가 운행합니다. <span style="color:#e74c3c;"><code>kodama</code></span>는 시발역부터 종착역까지 거치는 모든 역에 정차하며, 상위 등급의 <span style="color:#e74c3c;"><code>nozomi</code></span>와 <span style="color:#e74c3c;"><code>hikari</code></span>는 통과하는 역이 있습니다.</p>

<table class="table table-bordered td-center td-middle">
	<tbody>
		<tr>
			<td>역명</td>
			<td>hikari</td>
			<td>nozomi</td>
			<td>위치</td>
			<td>운임 거리</td>
			<td>실 거리</td>
		</tr>
		<tr>
			<td>Tokyo</td>
			<td>O</td>
			<td>O</td>
			<td>도쿄도 치요다구</td>
			<td>0</td>
			<td>0</td>
		</tr>
		<tr>
			<td>Shinagawa</td>
			<td>O</td>
			<td>O</td>
			<td>도쿄도 미나토구</td>
			<td>6.8</td>
			<td>6.8</td>
		</tr>
		<tr>
			<td>Shin-Yokohama</td>
			<td>O</td>
			<td>O</td>
			<td>가나가와현 요코하마시 코호쿠구</td>
			<td>28.8</td>
			<td>25.5</td>
		</tr>
		<tr>
			<td>Odawara</td>
			<td>△</td>
			<td> </td>
			<td>가나가와현 오다와라시</td>
			<td>83.9</td>
			<td>76.7</td>
		</tr>
		<tr>
			<td>Atami</td>
			<td>△</td>
			<td> </td>
			<td>시즈오카현 아타미시</td>
			<td>104.6</td>
			<td>95.4</td>
		</tr>
		<tr>
			<td>Mishima</td>
			<td>△</td>
			<td> </td>
			<td>시즈오카현 미시마시</td>
			<td>120.7</td>
			<td>111.3</td>
		</tr>
		<tr>
			<td>Shin-Fuji</td>
			<td> </td>
			<td> </td>
			<td>시즈오카현 후지시</td>
			<td>146.2</td>
			<td>135.0</td>
		</tr>
		<tr>
			<td>Shizuoka</td>
			<td>△</td>
			<td> </td>
			<td>시즈오카현 시즈오카시 아오이구</td>
			<td>180.2</td>
			<td>167.4</td>
		</tr>
		<tr>
			<td>Kakegawa</td>
			<td> </td>
			<td> </td>
			<td>시즈오카현 카케가와시</td>
			<td>229.3</td>
			<td>211.3</td>
		</tr>
		<tr>
			<td>Hamamatsu</td>
			<td>△</td>
			<td> </td>
			<td>시즈오카현 하마마츠시 주오구</td>
			<td>257.1</td>
			<td>238.9</td>
		</tr>
		<tr>
			<td>Toyohashi</td>
			<td>△</td>
			<td> </td>
			<td>아이치현 토요하시시</td>
			<td>293.6</td>
			<td>274.2</td>
		</tr>
		<tr>
			<td>Mikawa-Anjo</td>
			<td> </td>
			<td> </td>
			<td>아이치현 안조시</td>
			<td>336.3</td>
			<td>312.8</td>
		</tr>
		<tr>
			<td>Nagoya</td>
			<td>O</td>
			<td>O</td>
			<td>아이치현 나고야시 나카무라구</td>
			<td>366.0</td>
			<td>342.0</td>
		</tr>
		<tr>
			<td>Gifu-Hashima</td>
			<td>△</td>
			<td> </td>
			<td>기후현 하시마시</td>
			<td>396.3</td>
			<td>367.1</td>
		</tr>
		<tr>
			<td>Maibara</td>
			<td>△</td>
			<td> </td>
			<td>시가현 마이바라시</td>
			<td>445.9</td>
			<td>408.2</td>
		</tr>
		<tr>
			<td>Kyoto</td>
			<td>O</td>
			<td>O</td>
			<td>교토부 교토시 시모교구</td>
			<td>513.6</td>
			<td>476.3</td>
		</tr>
		<tr>
			<td>Shin-Osaka</td>
			<td>O</td>
			<td>O</td>
			<td>오사카부 오사카시 요도가와구</td>
			<td>552.6</td>
			<td>515.4</td>
		</tr>
		<tr>
			<td colspan="6">이후 산요 신칸센과 직결</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;"><strong>[표 1]</strong> 도카이도 신칸센 역 정보</p>

<p>[표 1]은 도카이도 신칸센 노선에 있는 역 정보를 의미합니다. Nagoya 역을 기준으로 Tokyo 역 방면으로 운행하면 동행, Shin-Osaka 방면으로 운행하면 서행으로 운행한다고 합니다. <span style="color:#e74c3c;"><code>nozomi</code></span> 열과 <span style="color:#e74c3c;"><code>hikari</code></span> 열은 해당 등급 열차의 정차 정보를 의미합니다. O는 전부 정차를 의미하며, △는 선택 정차, 공백은 모두 통과를 의미합니다.</p>

<p>운임 거리란 운임 계산을 하기 위해 쓰이는 거리이고, 실거리는 실제 열차가 운행한 거리를 의미합니다. 이 두 거리가 [표 1]의 맨 끝 두 열에 있는데, 이는 Tokyo 역으로부터 누적 운임 거리와 누적 실거리를 나타내며, 단위는 $km$입니다. 도카이도 신칸센의 운임은 아래와 같이 계산됩니다.</p>

<ul>
	<li>Tokyo ~ Shinagawa 구간의 경우 일반선 요금이 적용됩니다.</li>
	<li>그 외의 경우 고속선 요금이 적용됩니다.
	<ul>
		<li>단, Shin-Yokohama ~ Shinagawa 구간의 경우, 모든 등급이 kodama 등급의 요금으로 계산됩니다.</li>
	</ul>
	</li>
</ul>

<p>등급별 고속선과 일반선 요율은 [표 2]와 같습니다.</p>

<table class="table table-bordered td-center td-middle table-center-50">
	<tbody>
		<tr>
			<td>등급</td>
			<td>고속선 요율</td>
			<td>일반선 요율</td>
		</tr>
		<tr>
			<td>kodama</td>
			<td>300원/km</td>
			<td colspan="1" rowspan="3">200원/km</td>
		</tr>
		<tr>
			<td>hikari</td>
			<td>kodama 등급의 1.1배</td>
		</tr>
		<tr>
			<td>nozomi</td>
			<td>kodama 등급의 1.2배</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;"><strong>[표 2]</strong> 도카이도 신칸센의 등급별 요금</p>

<p>큰 도시로 출퇴근하는 사람들을 위해 일부 역에 시발하거나, 종착하는 경우가 있습니다. 아래 [표 3]은 시발, 종착, 혹은 둘 다 할 수 있는 역을 나타냅니다. 비고에 시발이 적혀 있는 경우 시발만 가능하며, 종착이 적혀 있는 경우 종착만 가능합니다. 없는 경우, 둘 다 가능한 역입니다.</p>

<table class="table table-bordered td-center td-middle table-center-30">
	<tbody>
		<tr>
			<td>역명</td>
			<td>비고</td>
		</tr>
		<tr>
			<td>Tokyo</td>
			<td> </td>
		</tr>
		<tr>
			<td>Shinagawa</td>
			<td>시발</td>
		</tr>
		<tr>
			<td>Shin-Yokohama</td>
			<td>시발</td>
		</tr>
		<tr>
			<td>Mishima</td>
			<td>시발</td>
		</tr>
		<tr>
			<td>Shizuoka</td>
			<td> </td>
		</tr>
		<tr>
			<td>Hamamatsu</td>
			<td> </td>
		</tr>
		<tr>
			<td>Nagoya</td>
			<td> </td>
		</tr>
		<tr>
			<td>Shin-Osaka</td>
			<td> </td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;"><strong>[표 3]</strong> 시발하거나 종착이 가능한 역 목록들</p>

<p>[표 3]에 등장하는 역들에서는, <strong>항상 정차하는 등급의 열차들만</strong> 시발하거나 종착합니다. Mishima 역에서 출발하는 열차는 동행으로만 운행하며, Nagoya 역에 시발하거나 종착하는 열차는 아래 조건을 만족합니다.</p>

<ul>
	<li>Shin-Osaka 역에 시발하지도 않고, 종착하지도 않습니다.</li>
</ul>

<p><span style="color:#e74c3c;"><code>hikari</code></span> 등급의 정차 패턴은 Shin-Yokohama ~ Nagoya 구간 (1구간)과 Nagoya ~ Kyoto 구간 (2구간), 즉 두 구간의 정차 패턴을 가지고 알 수 있습니다. 먼저 $1$구간의 <strong>Rapid 패턴</strong>은 다음 세 조건 중 하나 이상을 만족합니다.</p>

<ul>
	<li>구간의 시작 역과 끝 역을 제외하고, $2$개 이하의 역에 정차합니다.</li>
	<li>무정차 거리가 $200km$ 이상입니다.</li>
	<li>시즈오카시에 있는 역에 정차하지 않습니다.</li>
</ul>

<p>그렇지 않으면 1구간에서 <strong>Normal 패턴</strong>입니다. 2구간에서 <strong>Rapid 패턴</strong>은 다음 조건을 만족합니다.</p>

<ul>
	<li>2구간에서 nozomi 등급의 열차와 정차 패턴이 같습니다.</li>
</ul>

<p>그렇지 않으면 2구간에서 <strong>Normal 패턴</strong>입니다.</p>

<p>또한, 해당 구간을 운행하는 모든 <span style="color:#e74c3c;"><code>hikari</code></span> 등급의 열차는 아래 조건을 추가로 만족합니다.</p>

<ul>
	<li>Maibara 역에 정차하지 않으면, Gifu-Hashima 역에 정차하지 않습니다.</li>
</ul>

<p><span style="color:#e74c3c;"><code>hikari</code></span> 등급의 열차가 정차할 수 있는 패턴은 [표 4]와 같습니다.</p>

<table class="table table-bordered td-center td-middle table-center-50">
	<tbody>
		<tr>
			<td>패턴</td>
			<td>1구간</td>
			<td>2구간</td>
			<td>비고</td>
		</tr>
		<tr>
			<td>1</td>
			<td>Rapid</td>
			<td>Normal</td>
			<td>type 1 hikari</td>
		</tr>
		<tr>
			<td>2</td>
			<td>Normal</td>
			<td>Rapid</td>
			<td>type 2 hikari</td>
		</tr>
		<tr>
			<td>3</td>
			<td>Normal</td>
			<td>Normal</td>
			<td>변칙 hikari</td>
		</tr>
		<tr>
			<td>4</td>
			<td colspan="2" rowspan="1">그 외의 경우</td>
			<td>나올 수 없음</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;"><strong>[표 4]</strong> 2개의 구간에서 hikari 등급의 정차 패턴</p>

<p>또한, 2구간을 운행하지 않는 경우, 1구간에서 Rapid 패턴으로 운행하지 않습니다. 또한 모든 열차는 다음 조건을 만족합니다.</p>

<ul>
	<li>시발역에서 종착역까지 운임이 $5\,000$원 이상입니다. 고속선 요금이 적용되는 구간에서만 운행하는 경우, 시발역에서 종착역으로 이동하는 데 드는 비용은 $33\,000$원 이상입니다.</li>
	<li>시발역에서 종착역까지 하위 등급의 열차와 정차역 패턴이 같지 않습니다.</li>
</ul>

<p>가희는 신칸센을 $Q$번 탔습니다. 각각에 대해 운행 정보가 주어졌을 때, 어느 등급을 탔는지 알려주세요.</p>

### 입력

<p>첫 번째 줄에 $Q$가 주어집니다.</p>

<p>다음에 $Q$개의 운행 정보가 주어집니다. 각 운행 정보는 아래와 같이 주어집니다.</p>

<ul>
	<li>첫 번째 줄에 정차한 역의 수 $n$이 주어집니다.</li>
	<li>다음 $n$개의 줄에 정차한 역의 정보가 주어집니다. $i$번째로 주어진 역은, $i$번째로 정차한 역임을 의미합니다. 역의 정보는 두 형식 중 하나로 주어집니다.
	<ul>
		<li>{<code>station_name</code>}</li>
		<li>{<code>station_name</code>} <code>station</code></li>
	</ul>
	</li>
</ul>

<p>또한 운행 정보는 다음을 만족합니다. 정차한 역의 수가 $n$이고, $i$번째로 정차한 역 $s_{i}$와 $i+1$번째로 정차한 역 $s_{i+1}$에 대해 ($1 ≤ i &lt; n$)</p>

<ul>
	<li>두 역이 서로 다른 역이라면, $s_{i}$번 역을 출발하여 $s_{i+1}$번째 역에 도착할 때까지 어떠한 곳에도 정차하지 않으며, 진행 방향을 바꾸지 않습니다.</li>
	<li>두 역이 도카이도 신칸센 노선에 있으면, $s_{i}$번 역을 출발하여 $s_{i+1}$번째 역에 도착할 때까지 도카이도 신칸센 외 다른 노선을 경유하지 않습니다.</li>
</ul>

### 출력

<p>$Q$개의 줄에 걸쳐, 아래와 같이 출력해 주세요.</p>

<ul>
	<li>주어진 데이터에 오류가 있다면 아래 포맷으로 출력해 주세요. <code>error_id</code>는 [표 5]의 케이스에 대응되며, 오류가 발생하는 케이스가 여러 개인 경우 가장 작은 $id$ 값을 출력해 주세요.

	<ul>
		<li><code>ERROR</code> {<code>error_id</code>}</li>
	</ul>
	</li>
	<li>그렇지 않으면, 운행 정보에 맞는 열차 등급을 출력해 주세요. 열차 등급은 <span style="color:#e74c3c;"><code>kodama</code></span>, <span style="color:#e74c3c;"><code>hikari</code></span>, <span style="color:#e74c3c;"><code>nozomi</code></span> 중 하나입니다.</li>
</ul>

<table class="table table-bordered td-center table-center-50">
	<tbody>
		<tr>
			<td>id</td>
			<td>케이스</td>
		</tr>
		<tr>
			<td>200</td>
			<td>도카이도 신칸센 노선에 없는 역이 나온 경우</td>
		</tr>
		<tr>
			<td>300</td>
			<td>같은 역을 2번 이상 방문한 경우</td>
		</tr>
		<tr>
			<td>400</td>
			<td>시발역에서 종착역으로 가는 도중 열차의 진행 방향이 1번 이상 바뀐 경우</td>
		</tr>
		<tr>
			<td>500</td>
			<td>나올 수 없는 운행 패턴인 경우</td>
		</tr>
		<tr>
			<td>600</td>
			<td>둘 이상의 등급이 해당 운행 패턴으로 운행할 수 있는 경우</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;"><strong>[표 5]</strong> 에러 코드</p>

<p>역 이름이 동일하면 같은 역으로 취급합니다. 또한 역 이름은 대소문자를 구별합니다.</p>

### 제한

<ul>
	<li>$1 ≤ Q ≤ 500$</li>
	<li>$2 ≤ n ≤ 50$</li>
	<li>{<code>station_name</code>}은 알파벳 대소문자와 공백, 숫자로만 이루어져 있으며, 길이는 $50$을 넘지 않습니다.</li>
	<li>{<code>station_name</code>}은 문자열 <span style="color:#e74c3c;"><code>station</code></span>으로 끝나지 않습니다.</li>
</ul>