# [Platinum V] Taxi - 17377

[문제 링크](https://www.acmicpc.net/problem/17377)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 541, 정답: 56, 맞힌 사람: 44, 정답 비율: 21.256%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p>Taxi는 프로그래밍 언어로, 가상의 도시에서 택시가 이동하면서 승객을 태우는 과정으로 코드가 표현된다는 점이 특징이다. 이 도시의 지도는 다음과 같다.</p>

<p style="margin-top: 15px;"><img alt="taxi" src="https://upload.acmicpc.net/1d90baf8-833c-4dba-bf75-fe2fa605d4cb/-/preview/" style="display: block; margin-left: auto; margin-right: auto; width: 100%; max-width: 500px;" /></p>

<p style="margin-bottom: 15px; text-align: center;">(image from <a href="https://bigzaphod.github.io/Taxi/">https://bigzaphod.github.io/Taxi/</a>)</p>

<p>이 언어로 &quot;Hello, world!&quot;를 출력하는 프로그램을 작성하면 다음과 같다.</p>

<p><code>&quot;Hello, World!&quot; is waiting at the Writer&#39;s Depot.<br />
Go to Writer&#39;s Depot: west 1st left, 2nd right, 1st left, 2nd left.<br />
Pickup a passenger going to the Post Office.<br />
Go to the Post Office: north 1st right, 2nd right, 1st left.<br />
Go to the Taxi Garage: north 1st right, 1st left, 1st right.</code></p>

<p>택시는 항상 <code>Taxi Garage</code>에서 출발하고, 프로그램 종료 시에도 이곳에 있어야 하며 이때 타고 있는 승객이 없어야 한다. 택시는 연료 <em>A</em>갤런을 채울 수 있으며, 처음 출발할 때는 연료가 가득 찬 상태이다. 각 지점에서는 특정 목적지로 가려는 승객을 태울 수 있고, 이 승객은 택시가 목적지에 도착하면 즉시 내린다. 이때 승객은 택시를 타고 이동한 거리 당 <em>B</em>원을 지불한다. 또한 택시는 승차 정원이 있기 때문에 승객은 최대 세 명까지만 태울 수 있다.</p>

<p>(원래의 설정과는 다르지만) 계산의 편의를 위해 이 도시에는 1마일 간격으로 수평 및 수직 도로가 있으며, 모든 지점은 두 도로가 만나는 지점에만 있다고 가정하자. 그러면 모든 지점은 정수 좌표로 나타낼 수 있으며, 두 지점 간의 거리는 맨해튼 거리(Manhattan distance)로 계산할 수 있다. 즉, 두 지점의 좌표가 (<em>x<sub>1</sub></em>, <em>y<sub>1</sub></em>), (<em>x<sub>2</sub></em>, <em>y<sub>2</sub></em>)일 경우 거리는 |<em>x<sub>1</sub></em> - <em>x<sub>2</sub></em>| + |<em>y<sub>1</sub></em> - <em>y<sub>2</sub></em>|이다. 단, 택시가 주행 중 특정 지점을 지나더라도 그 지점이 목적지인 승객이 내릴 수는 없으며, 정확히 목적지에 도착해야만 승객이 내릴 수 있다.</p>

<p>택시는 1갤런당 <em>C</em>마일을 갈 수 있는데, 주행 도중 연료가 떨어지면 안 된다. 도시에는 주유소가 세 곳 있다. 따라서 주행을 계속하기 위해 연료가 0 미만이 되기 전에 주유소에서 연료를 충전해야 한다. 입력되는 지점 중 세 곳은 주유소로, 이곳에 도착하면 자동으로 연료를 채우며, 세 주유소의 연료 1갤런당 가격은 다를 수 있다. 연료를 가득 채울 만큼의 돈이 있다면 그만큼을 지불하고 연료를 가득 채우고, 그렇지 않다면 가지고 있는 모든 돈을 지불하여 연료를 채운다. 연료를 가득 채우기 위해 필요한 돈이 정수로 나누어떨어지지 않는 경우 소수점 이하는 절사한다. 즉, 연료를 가득 채우기 위해 1,234.567...원이 필요한데 현재 1,234원 이상이 있을 경우 1,234원을 지불하고 연료를 가득 채운다. 만약 주유소가 목적지인 승객이 있다면 승객이 먼저 내리면서 요금을 지불한 후 연료를 채운다.</p>

<p>이제 이 명세를 바탕으로, 도시의 정보와 택시의 이동 경로가 주어졌을 때 택시가 모든 규칙을 만족하면서 운행을 완료하는지를 판단하는 프로그램을 작성해보자.</p>

### 입력

<p>첫 줄에 정수 <em>A</em>, <em>B</em>, <em>C</em>가 입력되며, 각각 택시의 연료 용량, 승객이 1마일당 지불하는 돈, 1갤런당 갈 수 있는 거리이다. (1 &le; <em>A</em> &le; 100, 1 &le; <em>B</em> &le; 100, 1 &le; <em>C</em> &le; 100)</p>

<p>다음 줄에 지점의 개수 <em>N</em>이 입력된다. (4 &le; <em>N</em> &le; 100)</p>

<p>이후 <em>N</em>줄에 걸쳐 <em>i</em>번째 지점의 이름 <em>D<sub>i</sub></em>와 정수 좌표 <em>x<sub>i</sub></em>, <em>y<sub>i</sub></em>가 입력된다. (0 &le; <em>x<sub>i</sub></em>, <em>y<sub>i</sub></em> &le; 100) 이름에 들어갈 수 있는 문자는 알파벳과 아포스트로피(<code>&#39;</code>), 공백이다. 이름은 1글자 이상 30글자 이하로, 첫 글자와 마지막 글자는 공백이 될 수 없으며, 공백이 두 번 이상 연속한 경우도 없다. 모든 지점의 이름은 다르며, 이름이 <code>Taxi Garage</code>인 지점은 항상 존재한다. 이름에 들어가는 알파벳은 대소문자를 구분한다.</p>

<p>이후 세 줄에 걸쳐 주유소의 이름 <em>G<sub>i</sub></em>와 갤런당 가격 <em>P<sub>i</sub></em>가 입력된다. 세 주유소의 이름은 모두 다르며, 각각 앞에서 입력된 지점 중 하나이다. 갤런당 가격은 1 이상 100 이하의 정수이다. <code>Taxi Garage</code>는 주유소가 될 수 없다.</p>

<p>다음으로 문장의 개수 <em>K</em>가 입력된다. (1 &le; <em>K</em> &le; 10,000)</p>

<p>이후 <em>K</em>줄에 걸쳐 문장이 입력되며, 다음 두 형식 중 하나이다.</p>

<ul>
	<li><code>Go to (X).</code>: X로 이동한다. X는 입력된 지점 중 하나이다.</li>
	<li><code>Pickup a passenger going to (X).</code>: X로 이동하는 승객을 태운다. X는 입력된 지점 중 하나로, 택시가 현재 위치한 지점과 <code>Taxi Garage</code>는 목적지가 될 수 없다.</li>
</ul>

### 출력

<p>규칙에 맞게 운행을 완료한 경우, 최종적으로 번 돈의 액수를 출력한다.</p>

<p>운행에 실패한 경우, 다음 문자열 중 하나를 출력한다.</p>

<ul>
	<li><code>OUT OF GAS</code>: 이동 중 연료가 떨어졌을 때</li>
	<li><code>CAPACITY FULL</code>: 정원보다 많은 승객을 태우려고 할 때</li>
	<li><code>NOT IN GARAGE</code>: 마지막 지점이 <code>Taxi Garage</code>가 아닐 때</li>
	<li><code>REMAINING PASSENGER</code>: 마지막 지점이 <code>Taxi Garage</code>이지만 아직 내리지 못한 승객이 있을 때</li>
</ul>