# [Platinum V] 가희와 지하철역 저장 시스템 2 - 27882

[문제 링크](https://www.acmicpc.net/problem/27882)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 1024 MB

### 통계

제출: 87, 정답: 24, 맞힌 사람: 20, 정답 비율: 57.143%

### 분류

구현, 그래프 이론, 자료 구조, 집합과 맵, 최단 경로, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵, 플로이드–워셜

### 문제 설명

<p>가희는 멍멍철도공사에서 관리하는 <code>n</code>개의 지하철역 정보를 보기 위해, 지하철역 관리 시스템을 운영하고 있습니다. 이 시스템에서, <code>n<sub>1</sub></code>번 노드에서 <code>n<sub>2</sub></code>번 노드로 데이터를 보내는 전송 시간은 아래와 같이 계산됩니다.</p>

<ul>
	<li>데이터가 여러 회선을 통해 전송된 경우, 경로상에 있는 회선들의 전송 시간을 모두 더한 값이 됩니다.</li>
	<li><code>n<sub>1</sub></code>번 노드에서 <code>n<sub>2</sub></code>번 노드로 데이터를 보내는 전송 시간은 <code>n<sub>1</sub></code>번 노드에서 노드 <code>n<sub>2</sub></code>번 노드로 가는 경로 중 <strong>총 전송 시간이 가장 작은 값</strong>이 됩니다.</li>
</ul>

<p>[그림 1]은 4개의 노드로 이루어진 시스템을 나타냅니다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27882.%E2%80%85%EA%B0%80%ED%9D%AC%EC%99%80%E2%80%85%EC%A7%80%ED%95%98%EC%B2%A0%EC%97%AD%E2%80%85%EC%A0%80%EC%9E%A5%E2%80%85%EC%8B%9C%EC%8A%A4%ED%85%9C%E2%80%852/64c7075d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27882.%E2%80%85%EA%B0%80%ED%9D%AC%EC%99%80%E2%80%85%EC%A7%80%ED%95%98%EC%B2%A0%EC%97%AD%E2%80%85%EC%A0%80%EC%9E%A5%E2%80%85%EC%8B%9C%EC%8A%A4%ED%85%9C%E2%80%852/64c7075d.png" data-original-src="https://upload.acmicpc.net/91bb52ce-6b15-44f1-8a6b-2d5b1ca2aa04/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 334px; height: 90px;" /></p>

<p style="text-align: center;"><strong>[그림 1] 노드 4개로 이루어진 시스템</strong></p>

<p>[그림 1]에서 4번 노드에서 1번 노드로 데이터를 보내는 전송 시간은 4입니다. 4번 노드에서 1번 노드로 갈 때, 4번 노드와 3번 노드를 연결하는 회선, 3번 노드와 2번 노드를 연결하는 회선, 2번 노드와 1번 노드를 연결하는 회선의 전송 시간을 모두 더한 값이 4이기 때문입니다. [그림 2]는 [그림 1]의 시스템에서 4번 노드와 2번 노드를 연결하는 회선이 하나 추가된 것입니다. </p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27882.%E2%80%85%EA%B0%80%ED%9D%AC%EC%99%80%E2%80%85%EC%A7%80%ED%95%98%EC%B2%A0%EC%97%AD%E2%80%85%EC%A0%80%EC%9E%A5%E2%80%85%EC%8B%9C%EC%8A%A4%ED%85%9C%E2%80%852/5a9022b6.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27882.%E2%80%85%EA%B0%80%ED%9D%AC%EC%99%80%E2%80%85%EC%A7%80%ED%95%98%EC%B2%A0%EC%97%AD%E2%80%85%EC%A0%80%EC%9E%A5%E2%80%85%EC%8B%9C%EC%8A%A4%ED%85%9C%E2%80%852/5a9022b6.png" data-original-src="https://upload.acmicpc.net/8cd3aeda-a6ff-4bab-8842-8ecffa8f7b97/-/crop/497x325/0,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 248px; height: 162px;" /></p>

<p style="text-align: center;"><strong>[그림 2] 그림 1에서 연결 관계가 하나 추가된 시스템</strong></p>

<p>[그림 2]에서 4번 노드에서 1번 노드로 데이터를 보내는 전송 시간은 2입니다. 4번 노드에서 2번 노드를 연결하는 회선, 2번 노드에서 1번 노드를 연결하는 회선을 거치는 것이 총 전송 시간이 가장 적기 때문입니다. </p>

<p>지하철역 저장 시스템은 아래와 같이 동작합니다.</p>

<ul>
	<li><code>n</code>개의 지하철역에 대한 정보는 <strong>하나의 <code>bucket</code></strong> 노드에 저장되어 있습니다.</li>
	<li>지하철역 <code>s</code>의 정보를 출력해 달라는 요청이 요청 노드 <code>r</code>에서 들어온 경우
	<ul>
		<li><code>r</code>에서 <strong>전송 시간이 가장 적은 <code>cache</code> 노드</strong>를 찾습니다. 그러한 노드가 여러 개라면, <strong><code>id</code>가 가장 작은 <code>cache</code> 노드</strong>를 찾습니다.</li>
		<li>만약, 해당 <code>cache</code> 노드에 지하철역 <code>s</code>에 대한 정보가 있다면, <code>cache</code> 노드로부터 정보를 얻어와서 출력합니다.</li>
		<li>그렇지 않으면,
		<ul>
			<li><code>cache</code> 노드 <code>c</code>가 <code>bucket</code> 노드에서 지하철역 <code>s</code>에 대한 정보를 얻어옵니다.</li>
			<li><code>cache</code> 노드 <code>c</code>에 지하철역 <code>s</code>에 대한 정보를 저장합니다.</li>
		</ul>
		</li>
	</ul>
	</li>
</ul>

<p>지하철역 <code>s</code>에 대한 정보에 접근했다는 것은 <strong>둘 중 하나를 수행했다는 것을 의미합니다.</strong></p>

<ul>
	<li><code>cache</code> 노드 <code>c</code>에 지하철역 <code>s</code>에 대한 정보가 있어서, 해당 노드로부터 <code>s</code>에 대한 정보를 얻어왔습니다.</li>
	<li><code>cache</code> 노드 <code>c</code>에 지하철역 <code>s</code>에 대한 정보가 없어서
	<ul>
		<li><code>bucket</code> 노드에서 지하철역 <code>s</code>에 대한 정보를 얻어옵니다.</li>
		<li>이 정보를 <code>cache</code> 노드 <code>c</code>에 저장합니다.</li>
	</ul>
	</li>
</ul>

<p><strong><code><font face="monospace">h</font></code>개의 역을 저장할 수 있는 각각의 <code>cache</code> 노드</strong>는 더 이상 지하철역 <code>s</code>에 대한 정보를 저장할 수 없을 때, 아래와 같이 동작합니다.</p>

<ul>
	<li><code>cache</code> 노드 <code>c</code>가 지하철역 <code>s</code>에 대한 정보를 저장할 수 없다면, <strong>가장 오랫동안 접근하지 않은 지하철역 정보</strong>를 제거합니다.</li>
	<li><code>cache</code> 노드 <code>c</code>에 지하철역 <code>s</code>에 대한 정보를 저장합니다.</li>
</ul>

<p>예를 들어 지하철역 3개의 정보를 저장할 수 있는 <code>cache</code> 노드 <code>c<sub>1</sub></code>이 있다고 해 보겠습니다. 그리고 요청이 아래 [표 1]과 같이 들어왔다고 해 보겠습니다.</p>

<table class="table table-bordered table-center-50">
	<tbody>
		<tr>
			<td style="text-align: center;">시각</td>
			<td style="text-align: center;">요청이 들어온 역</td>
		</tr>
		<tr>
			<td style="text-align: center;">1</td>
			<td style="text-align: center;">OSAKA</td>
		</tr>
		<tr>
			<td style="text-align: center;">2</td>
			<td style="text-align: center;">OSAKA</td>
		</tr>
		<tr>
			<td style="text-align: center;">3</td>
			<td style="text-align: center;">LOOP</td>
		</tr>
		<tr>
			<td style="text-align: center;">4</td>
			<td style="text-align: center;">LINE</td>
		</tr>
		<tr>
			<td style="text-align: center;">5</td>
			<td style="text-align: center;">NOZOMI</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;"><strong>[표 1] <code>cache</code> 노드 <code>c<sub>1</sub></code>에 들어온 요청</strong></p>

<p>시각 4에, <code>LINE</code>역에 대한 요청을 수행하면 <code>cache</code> 노드 c<sub>1</sub>에는 <code>OSAKA</code>, <code>LOOP</code>, <code>LINE</code>역에 대한 정보가 저장되게 됩니다. 다음 시각 5에 <code>NOZOMI</code>역에 대한 요청을 수행할 때</p>

<ul>
	<li>지하철역 <code>NOZOMI</code>에 대한 정보가 <code>cache</code> 노드 <code>c<sub>1</sub></code>에 없습니다.</li>
	<li>따라서, <code>bucket</code> 노드로부터 <code>NOZOMI</code>역에 대한 정보를 얻어온 후, <code>cache</code> 노드 <code>c<sub>1</sub></code>에 저장합니다. 그런데
	<ul>
		<li>이미 <code>c<sub>1</sub></code>에는 지하철역 3개의 정보가 저장되어 있습니다.</li>
		<li>따라서, 가장 오랫동안 요청이 들어오지 않은 <code>OSAKA</code>역에 대한 정보를 <code>cache</code> 노드 <code>c<sub>1</sub></code>에서 제거합니다.</li>
	</ul>
	</li>
</ul>

<p>요청 노드 <code>r</code>번 노드에서 지하철역 <code>s</code>에 대한 정보를 출력해 달라는 요청이 수행되는 시간은 아래와 같이 구할 수 있습니다.</p>

<ul>
	<li><code>r</code>번 노드에서 전송 시간이 가장 적은 <code>cache</code> 노드를 찾습니다. 만약에 그러한 것이 여러 개라면, <code>id</code>가 가장 작은 <code>cache</code> 노드를 찾습니다. 이 노드를 <code>c<sub>1</sub></code>번 노드라 할 때

	<ul>
		<li><code>c<sub>1</sub></code>번 노드에 지하철역 <code>s</code>에 대한 정보가 있는 경우 2&times;(<code>r</code>번 노드에서 <code>c<sub>1</sub></code>번 노드로 데이터를 보내는 전송 시간)</li>
		<li>그렇지 않은 경우 2&times;(<code>r</code>번 노드에서 <code>c<sub>1</sub></code>번 노드로 데이터를 보내는 전송 시간 + <code>c<sub>1</sub></code>번 노드에서 <code>bucket</code> 노드로 데이터를 보내는 전송 시간)</li>
	</ul>
	</li>
</ul>

<p>지하철역에 대한 정보를 출력해 달라는 요청이 <code>Q</code>번 주어졌을 때, 각각의 요청이 수행되는 시간을 구해주세요.</p>

### 입력

<p>첫 번째 줄에 지하철역의 개수 <code>n</code>과 노드의 개수 <code>m</code>, 문제에서 설명한 <code>h</code>와 <code>Q</code>가 공백으로 구분되어 주어집니다.</p>

<p>다음 <code>n</code>개의 줄에는 한 줄에 하나씩 지하철역 이름이 주어집니다.</p>

<p>다음 <code>m</code>개의 줄에는 노드에 대한 정보가 아래 포맷으로 주어집니다.</p>

<p style="text-align: center;">{<code>node_id</code>} {<code>node_type</code>}</p>

<p>이때 <code>node_id</code>는 1 이상 10<sup>9</sup> 이하의 정수로 주어지며, <code>node_type</code>은 3개 중 하나로 주어집니다.</p>

<ul>
	<li><code>R</code>

	<ul>
		<li>요청 노드를 의미합니다.</li>
	</ul>
	</li>
	<li><code>C</code>
	<ul>
		<li><code>cache</code> 노드를 의미합니다.</li>
	</ul>
	</li>
	<li><code>B</code>
	<ul>
		<li><code>bucket</code> 노드를 의미합니다.</li>
	</ul>
	</li>
</ul>

<p>다음 줄에 노드와 노드의 연결 관계 수 <code>k</code>가 주어집니다.</p>

<p>다음 <code>k</code>개의 줄에 아래와 같은 포맷으로 노드와 노드를 연결하는 회선 정보가 주어집니다.</p>

<p style="text-align: center;">{<code>node<sub>1</sub></code>} {<code>node<sub>2</sub></code>} {<code>r<sub>t</sub></code>}</p>

<p>이는 <code>node<sub>1</sub></code>와 <code>node<sub>2</sub></code>를 연결하는 회선이 있고, 이 회선의 전송 시간이 <code>r<sub>t</sub></code>임을 의미합니다.</p>

<p>다음 <code>Q</code>개의 줄에 요청에 대한 정보가 아래와 같은 포맷으로 주어집니다.</p>

<p style="text-align: center;">{<code>node<sub>1</sub></code>} {<code>station_name</code>}</p>

<p>이는 <code>id</code>가 <code>node<sub>1</sub></code>인 노드에서 역 이름이 <code>station_name</code>인 역에 대한 정보를 출력해 달라는 요청을 했음을 의미합니다. 이때, <code>station_name</code>은 <strong>멍멍철도공사에서 관리하는 역 중 하나</strong>로 주어집니다.</p>

### 출력

<p>요청 하나가 들어올 때마다 각각의 요청이 처리되는 시간을 한 줄에 하나씩 출력해 주세요.</p>

### 제한

<ul>
	<li><code>1</code> &le; <code>n</code> &le; <code>2&times;10<sup>5</sup></code></li>
	<li><code>1</code> &le; <code>m</code> &le; <code>300</code></li>
	<li><code>1</code> &le; <code>h</code> &le; <code>n</code></li>
	<li><code>1</code> &le; <code>Q</code> &le; <code>2&times;10<sup>5</sup></code></li>
	<li><code>1</code> &le; <code>k</code> &le; <code><sub>m</sub>C<sub>2</sub></code></li>
	<li><code>1</code> &le; <code>r<sub>t</sub></code> &le; <code>300</code></li>
	<li>역 이름은 길이가 1 이상 10 이하이며, 대소문자와 숫자로만 이루어져 있습니다.</li>
	<li>멍멍철도공사에서 관리하는 <code>n</code>개의 역 이름이 중복되는 경우는 없습니다.</li>
	<li>역에 대한 정보를 출력하라는 요청은 <strong><code>cache</code> 노드나 <code>bucket</code> 노드에서 이루어지지 않습니다.</strong></li>
	<li><code>bucket</code> 노드는 하나만 있으며, <code>cache</code> 노드는 최소 하나 이상 있습니다.</li>
	<li>서로 다른 노드 번호를 가진 임의의 두 노드를 직접 연결하는 회선은 <strong>0개 또는 1개</strong>입니다.</li>
	<li><code>bucket</code> 노드로부터 <code>bucket</code> 노드가 아닌 다른 임의의 노드로 <strong>1개 이상의 회선</strong>을 거치면 갈 수 있습니다.</li>
</ul>