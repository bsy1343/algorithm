# [Platinum IV] Making Server - 17416

[문제 링크](https://www.acmicpc.net/problem/17416)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 256 MB

### 통계

제출: 89, 정답: 9, 맞힌 사람: 5, 정답 비율: 9.434%

### 분류

자료 구조, 분리 집합, 해시를 사용한 집합과 맵, 구현, 집합과 맵

### 문제 설명

<p>오늘도 무슨 장난을 칠지 고민하던 교준이는 새로운 DNS 서버를 만들어서 학교 내 GSHS2와 GSHS5에 접속하는 모든 사람들이 송죽에 접속하려고 하면, 다른 사이트에 접속하게 하려고 한다. 하지만 서버를 만드는 건 매우 귀찮은 일이기에 뭔가 부려먹기 쉬운 강민이를 데려다가 서버를 만들려고 한다. 교준이의 성공적인 장난을 도와주려는 강민이를 위해 서버를 만드는 작업을 도와주자.</p>

<p>서버를 만들기 위해 필요한 것은 <strong>Domain</strong>과 <strong>IP</strong>다. <strong>Domain</strong>은 <em>www.acmicpc.net</em>과 같이 문자열로 이루어져 있고, <strong>IP</strong>는 <em>192.168.0.1</em>과 같이 0 이상 2<sup>31</sup>-1&nbsp;이하의 정수 4개와 점 3개로 이루어져 있다. 그리고 <strong>올바른 IP</strong>는 0 이상 255 이하의 수를 사용한다. 우리가 쓰는 <strong>Domain</strong>&nbsp;주소는 모두 <strong>IP</strong>로 변환되어 데이터를 받아온다. <strong>IP</strong>로 <em>0.0.0.0</em>는 쓰지 않는다. 입력에서 주어지는 <strong>Domain</strong>은 영어 알파벳으로 시작하고 알파벳과 숫자 및 마침표로 이루어진 공백이 없는 길이 50이하의 문자열이다.</p>

### 입력

<p>첫 번째 줄에 쿼리의 개수를 의미하는 정수 <em>Q</em>가 주어진다.</p>

<p>두번째 줄부터 <em>Q</em>개의 줄에 걸쳐, 다음 네 가지 중 한 가지의 쿼리가 들어온다.</p>

<ul>
	<li>
	<p><strong>URL</strong> <em>D</em>&nbsp;<em>I</em>&nbsp;: <em>D</em>라는 <strong>Domain</strong>의 <strong>IP</strong>는 <em>I</em>다. (<em>I</em>는 <strong>올바른 IP</strong>, <em>I</em> &ne;&nbsp;<em>0.0.0.0</em>)</p>

	<p>(<strong>URL</strong>&nbsp;<em>www.acmicpc.net</em>&nbsp;<em>104.26.10.18</em>&nbsp;: <em>www.acmicpc.net</em>의 <strong>IP</strong>&nbsp;= <em>104.26.10.18</em>)</p>
	</li>
	<li>
	<p><strong>IP</strong>&nbsp;<em>I</em>&nbsp;<em>S</em>&nbsp;: <em>I</em>라는 <strong>IP</strong>를 가진 곳에는 <em>S</em>라는 데이터가 있다. (<em>I</em>는 <strong>REDIRECT</strong>되지 않은 <strong>올바른 IP</strong>, <em>S</em>는 영어 알파벳과 숫자로 이루어진 공백 없는 길이 10 이하의 문자열)</p>

	<p>(<strong>IP</strong>&nbsp;<em>104.26.10.18</em>&nbsp;<em>MINJE</em>&nbsp;: <em>104.26.10.18</em>의 데이터 = <em>MINJE</em>)</p>
	</li>
	<li>
	<p><strong>REDIRECT</strong> <em>I</em><sub>1</sub>&nbsp;<em>I</em><sub>2</sub>&nbsp;: <em>I</em><sub>1</sub>의 <strong>IP</strong>를 가진 곳은 이제부터 <em>I</em><sub>2</sub>에 연결된다. 이때, <em>I</em><sub>1</sub>를 <strong>REDIRECT</strong>된 <strong>IP</strong>, <em>I</em><sub>2</sub>를 <strong>REDIRECT</strong>한 <strong>IP</strong>라고 한다. <em>I</em><sub>1</sub>는 <strong>REDIRECT</strong>되지 않은 <strong>IP</strong>다. <em>I</em><sub>2</sub>의 데이터는 <em>I</em><sub>1</sub>의 데이터로 갱신된다. (<em>I</em><sub>1</sub>과 <em>I</em><sub>2</sub>는 <strong>올바른 IP</strong>, <em>I</em><sub>1</sub> &ne; <em>0.0.0.0</em>, <em>I</em><sub>2</sub> &ne;&nbsp;<em>0.0.0.0</em>)</p>

	<p>(<strong>REDIRECT</strong>&nbsp;<em>104.26.10.18</em>&nbsp;<em>104.26.10.19</em>&nbsp;: 앞으로 <em>104.26.10.18</em>로 들어오는 요청은 <em>104.26.10.19</em>에 연결된다.)</p>
	</li>
	<li>
	<p><strong>HTTP</strong> <em>I</em> (<em>D</em>)&nbsp;: <em>D</em>라는 <strong>Domain</strong>&nbsp;또는 <em>I</em>라는 <strong>IP</strong>를 가진 곳의 데이터를 다음 세 가지 경우로 나누어서 출력한다.</p>

	<ul>
		<li>
		<p>입력 : <strong>HTTP</strong>&nbsp;<em>www.acmicpc.net</em>&nbsp;(정상적인 경우)</p>

		<p>출력 :</p>

		<p>HTTP 200 OK</p>

		<p>Requested Data : MINJE (<strong>IP</strong>&nbsp;쿼리에 의해 주어진 데이터)</p>
		</li>
		<li>
		<p>입력 : <strong>HTTP</strong>&nbsp;<em>19222.222.222.222</em>&nbsp;(<strong>IP</strong>의 수가 0 이상 255 이하가 아닌 경우)</p>

		<p>출력 :</p>

		<p>HTTP 400 Bad Request</p>
		</li>
		<li>
		<p>입력 : <strong>HTTP</strong>&nbsp;<em>www.acmicpcccc.net</em>&nbsp;(<strong>Domain</strong>이나 <strong>IP</strong>가 없는 경우, 또는 데이터가 없는 경우)</p>

		<p>출력 :</p>

		<p>HTTP 404 Not Found</p>
		</li>
	</ul>
	</li>
</ul>

### 출력

<p><strong>HTTP</strong>&nbsp;쿼리에 대한 값을 출력한다.</p>

### 제한

<p>모든 입력 데이터는 다음 조건을 만족한다.</p>

<ul>
	<li>
	<p>1 &le; Q &le; 5&times;10<sup>4</sup></p>
	</li>
</ul>