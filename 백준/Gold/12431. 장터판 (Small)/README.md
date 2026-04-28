# [Gold III] 장터판 (Small) - 12431

[문제 링크](https://www.acmicpc.net/problem/12431)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 7, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

수학, 구현, 브루트포스 알고리즘, 확률론, 통계학

### 문제 설명

<p>당신은 지리산 등반 도중 장이 열리는 장터를 발견하였다. 많은 사람들이 모여있는 와중에, 어떤 사람이 게임을 주최하고 있었다.</p>

<p>이 게임에서는 탁자 위에&nbsp;<strong>N</strong>줄&nbsp;<strong>M</strong>열의 격자가 있는 게임판을 이용한다. 격자의 각 칸에 하나씩&nbsp;<strong>K</strong>면 다면체가 있다.</p>

<p>게임은 다음과 같이 진행된다. 게임 주최자는 다면체 중 일부를 특정 면이 보이도록 고정시켜놓고, 일부는 자유로이 움직일 수 있도록 한다. 그후, 이 게임판을 흔드는데, 그러면 고정되지 않은 다면체들(이들을&nbsp;<strong>&#39;자유로운 다면체&#39;</strong>라고 한다)은 흔들리다가&nbsp;<strong>K</strong>면 중 한 면이 선택되어 보이게 된다. 이때,&nbsp;<strong>K</strong>면 중 어떤 면이 보일 확률은 모든 면에 대해서 같으며 각각의 다면체에 대해 독립적이다.</p>

<p>게임판이 멈추면 각 칸에 대해 점수를 매기게 된다.</p>

<p>1) 이 칸의 다면체를 포함하여 가로/세로/대각선 으로 연속해서 4개가 같은 면을 가리키는 경우가 존재 -&nbsp;<strong>S<sub>4</sub></strong>점<br />
2) 1)에 해당하지 않고 연속한 3개에 대해서는 이런 경우가 존재 -&nbsp;<strong>S<sub>3</sub></strong>점<br />
3) 2)에 해당하지 않고 연속한 2개에 대해서는 이런 경우가 존재 -&nbsp;<strong>S<sub>2</sub></strong>점</p>

<p>각 다면체에 대해 나온 점수를 모두 합하면 그 게임의 점수가 된다.</p>

<p>어떤 게임 도중, 다면체를 고정시키는 작업이 완성되었고 이제 게임판을 흔드는 차례가 되었다.</p>

<p>당신은 이 게임의 결과가 궁금해졌다. 이 게임판을 흔들었을 때 얻을 수 있는 점수의 기댓값은 몇 점일까?</p>

### 입력

<p>입력의 첫 줄에는 테스트 케이스의 숫자&nbsp;<strong>T</strong>가 주어진다.</p>

<p>각 테스트 케이스는 다음과 같이 주어진다.</p>

<pre>
N M K S<sub>4</sub> S<sub>3</sub> S<sub>2</sub>

F<sub>1,1</sub> F<sub>1,2</sub> ... F<sub>1,M</sub>

F<sub>2,1</sub> F<sub>2,2</sub> ... F<sub>2,M</sub>

...

F<sub>N,1</sub> F<sub>N,2</sub> ... F<sub>N,M</sub>

</pre>

<p>각 케이스의 첫 줄에는 다음과 같이 정수 6개가 주어진다:&nbsp;<strong>N</strong>은 게임판의 행 수,&nbsp;<strong>M</strong>은 열 수를 나타내며,&nbsp;<strong>K</strong>는 다면체의 면의 수이다.&nbsp;<strong>S<sub>4</sub></strong>,&nbsp;<strong>S<sub>3</sub></strong>,&nbsp;<strong>S<sub>2</sub></strong>는 문제에 설명된 해당 점수이다.</p>

<p>두 번째 줄부터&nbsp;<strong>N</strong>개의 줄은 순서대로 게임판의 가장 위부터 게임판의 각 행에 존재하는 다면체들의 상태를 나타낸다. 각 줄은&nbsp;<strong>M</strong>개의 숫자로 이루어져 있으며, 그 행의 왼쪽부터의 다면체의 상태를 나타낸다. 고정된 다면체는 보여지는 면의 숫자 1부터&nbsp;<strong>K</strong>까지의 한 자리 숫자로 나타내어지고, 자유로운 다면체는 &#39;?&#39;로 나타내어진다.</p>

<h3>제한</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 50.</li>
	<li>2 &le;&nbsp;<strong>K</strong>&nbsp;&le; 9.</li>
	<li>0 &le;&nbsp;<strong>S<sub>2</sub></strong>&nbsp;&le;&nbsp;<strong>S<sub>3</sub></strong>&nbsp;&le;&nbsp;<strong>S<sub>4</sub></strong>&nbsp;&le; 100.</li>
	<li>2 &le;&nbsp;<strong>N</strong>&nbsp;&le; 8, 2 &le;&nbsp;<strong>M</strong>&nbsp;&le; 8.</li>
	<li>각 입력 게임판에서, 자유로운 다면체의 수는 0개 이상 4개 이하이다.</li>
</ul>

### 출력

<p>각 테스트 케이스에 대한 출력은 &quot;Case #x: y&quot; 형태로 이루어져야 한다. x는 1부터 시작되는 케이스 번호이고, y는 주어진 케이스에 대한 점수 기댓값이다.&nbsp;10<sup>-6</sup>&nbsp;범위의 절대/상대오차는 정답으로 간주된다.&nbsp;</p>