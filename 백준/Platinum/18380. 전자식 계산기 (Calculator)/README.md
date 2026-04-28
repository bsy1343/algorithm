# [Platinum II] 전자식 계산기 (Calculator) - 18380

[문제 링크](https://www.acmicpc.net/problem/18380)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 128, 정답: 46, 맞힌 사람: 31, 정답 비율: 39.241%

### 분류

수학, 구현, 문자열, 애드 혹, 정수론, 해싱, 라빈–카프

### 문제 설명

<p>오늘 알고리즘 과목의 기말고사가 있는 메시는 시험을 위해 컴퓨터를 들고 오라는 말을 들었다. 메시는 &#39;계산기도 컴퓨터 아님?&#39;이라고 생각하여 시험 날 집에서 계산기 하나를 들고 시험장으로 향했다. 시험에는 단 한 문제가 출제되었는데, KMP 알고리즘을 구현하면 되는 문제였다. 그러나 메시는 사칙연산밖에 할 수 없는 계산기로 KMP를 짤 수 없어 절망에 빠져 있었다.</p>

<p>다행히도 이 시험은 주어진 입력에 대해서 답만 맞으면 정답 처리된다고 한다. 메시를 위해 계산기로 문자열 검색 프로그램을 만들어 주자.</p>

<p>메시의 계산기에서 사용하는 수는 998,244,353진법으로 한 자리 수이다. 이 계산기는 mem[0]부터 mem[10<sup>5</sup> - 1]까지 10<sup>5</sup>개의 저장소를 가지고 있으며, 주어진 프로그램에 적힌 명령어를 순차적으로 실행한다. 프로그램의 입력은 크기가 N인 수열 A와 크기가 M인 수열 B로, 저장소는 초기에 mem[1]부터 mem[N]까지는 수열 A가, mem[N + 1]부터 mem[N + M]까지는 수열 B가 저장되어 있고, 나머지 저장소는 0으로 되어있는 상태이다. 수열 A와 B을 이루는 수들은 모두 0&nbsp;이상 9&nbsp;이하의 정수이다. 프로그램이 끝났을 때 mem[0]에는 A[i...i + M - 1]=B[1...M]인 1 &le;&nbsp;i&nbsp;&le;&nbsp;N - M + 1의 개수가 저장되어 있어야 한다.</p>

### 입력

<p>1번째 줄에 수열 A의 크기&nbsp;N과 수열 B의 크기&nbsp;M이 공백으로 구분되어 주어진다.</p>

### 출력

<p>메시에게 필요한 프로그램을 출력한다. 프로그램은 다음과 같은 명령어를 최대 10<sup>6</sup>개 사용할 수 있다.</p>

<ul>
	<li>set a&nbsp;b&nbsp;: mem[a]를 b로 바꾼다. (0&nbsp;&le;&nbsp;a &lt; 10<sup>5</sup>, 0&nbsp;&le;&nbsp;b &lt; 998,244,353)</li>
	<li>add a&nbsp;b&nbsp;c&nbsp;: mem[a]를 mem[b] + mem[c]로 바꾼다. (0&nbsp;&le;&nbsp;a, b, c &lt; 10<sup>5</sup>)</li>
	<li>sub a&nbsp;b&nbsp;c&nbsp;: mem[a]를 mem[b] - mem[c]로 바꾼다. (0&nbsp;&le;&nbsp;a, b, c &lt; 10<sup>5</sup>)</li>
	<li>mul a&nbsp;b&nbsp;c&nbsp;: mem[a]를 mem[b] &times; mem[c]로 바꾼다. (0&nbsp;&le;&nbsp;a, b, c &lt; 10<sup>5</sup>)</li>
	<li>div a&nbsp;b&nbsp;c&nbsp;: mem[a]를 &lfloor;mem[b] / mem[c]&rfloor;로 바꾼다. (0 &le; a, b, c &lt; 10<sup>5</sup>)</li>
</ul>

<p>add, sub, mul 명령어에서 연산의 결과가 998,244,353&nbsp;이상이거나 0&nbsp;미만일 경우 998,244,353으로 나눈 나머지가 대신 저장되며, div 명령어에서 mem[c] = 0일 경우 오답 처리된다.</p>

### 제한

<ul>
	<li>1&nbsp;&le; M&nbsp;&le; N&nbsp;&le; 4,000</li>
	<li>채점에 사용되는 수열 A,&nbsp;B는 모든 제출에 대해 동일하다. 즉, 채점 과정은 적응적이지 않다.</li>
</ul>