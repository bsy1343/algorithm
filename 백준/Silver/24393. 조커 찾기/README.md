# [Silver III] 조커 찾기 - 24393

[문제 링크](https://www.acmicpc.net/problem/24393)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 661, 정답: 332, 맞힌 사람: 238, 정답 비율: 53.968%

### 분류

구현, 자료 구조, 시뮬레이션

### 문제 설명

<p>중앙대학교에 다니는 수현이는 머신러닝을 공부하던 중 심심하여 트럼프 카드를 가지고 놀고 있다. 언젠가 유튜브에서 타짜 기술을 사용하는 영상을 보고 따라하고 싶어진 수현이는 카드 덱의 맨 위에 조커를 올려두고 카드를 섞어서 원하는 위치로 보내고자 한다.</p>

<p>카드는 일반 카드 26장, 조커 1장 총 27장을 사용한다. 맨 위쪽 카드를 1번, 맨 아래쪽 카드를 27번이라고 하자.&nbsp;</p>

<p>처음 상태에선 조커가 1번 위치에 있다.</p>

<p>카드 섞기를 <em>N</em>번 진행한다고 할 때 i번째로 카드를 섞는 방법을 <em>A<sub>i</sub></em>라고 한다면,</p>

<p><em>i</em>번째 새로운 덱은 다음과 같은 순서로 만들어진다.</p>

<ol>
	<li><em>i</em>-1번째 덱의 위에서부터 순서를 유지한 채로 13장을 왼쪽으로, 나머지 14장을 오른쪽으로 가져간다.</li>
	<li>오른쪽 덱의 맨 위에서 <em>A<sub>i1</sub></em>장을 가져와서 새로운 덱의 맨 위에 배치한다.</li>
	<li>왼쪽 덱의 맨 위에서 <em>A<sub>i2</sub></em>장을 가져와서 그 아래에 배치한다.</li>
	<li>다시 남은 오른쪽 덱의 맨 위에서<em> A<sub>i3</sub></em>장을&nbsp;가져와 3번에서 만든 덱 아래에 배치한다.&nbsp;</li>
	<li>3~4번과 같이 <em>A<sub>ij</sub></em>장씩을 교대로 가져와서 새로운 덱 아래에 배치한다. 단, <em>A<sub>i홀수</sub></em>의 합은 14, <em>A<sub>i짝수</sub></em>의 합은 13이다. 즉, <em>A<sub>i</sub></em>의 합은 27이다.</li>
</ol>

<p>이 기술을 사용할 줄 모르는 수현이를 위해 카드를 섞은 횟수와 섞일 때마다 카드가 어떻게 섞이는지 주어진다면, 카드 섞기를 마치고 난 후 조커의 위치는 위에서부터 몇 번째 카드인지 알려주자!</p>

### 입력

<p>첫 번째 줄에는 카드를 섞는 횟수 <em>N</em>이 주어진다. (1 &le;&nbsp;<em>N&nbsp;</em>&le; 10<sup>6</sup>)</p>

<p>두 번째 줄부터 <em>N</em>+1번째 줄까지 각 줄마다 <em>i</em>번째 새로운 덱을 만들기 위해&nbsp;수열 <em>A<sub>i</sub></em>가 주어진다. (1 &le; <em>i </em>&le;<em> N, 1&nbsp;</em>&le;<em>&nbsp;A<sub>ij</sub>​</em>)&nbsp;</p>

<p>입력되는 모든 정수의 개수는 10<sup>7&nbsp;</sup>+ 1개 이하이다.&nbsp;</p>

### 출력

<p>카드 섞기를 완료했을 때 조커가 덱의 맨 위에서 몇 번째에 있는지 출력한다.</p>

### 힌트

<p>이 문제는 매우 많은 입력을 요구합니다. 입력단에서 <span style="color:#fa7268;"><strong>시간 초과</strong></span>를 방지하기 위해 <a href="https://www.acmicpc.net/blog/view/56">여기</a>를 참고해주시길 바랍니다.&nbsp;</p>

<p>또한 주요 언어별&nbsp;빠른 입력은 아래의 코드를 활용하시면 됩니다.&nbsp;</p>

<ul>
	<li>C++:
	<ul>
		<li><code>cin.tie(NULL);</code></li>
		<li><code>cin.sync_with_stdio(false);</code></li>
	</ul>
	</li>
	<li>Java:&nbsp;
	<ul>
		<li><code>BufferedReader</code></li>
		<li><code>Integer.parseInt</code></li>
	</ul>
	</li>
	<li>Python:
	<ul>
		<li><code>sys.stdin.readline()&nbsp;</code></li>
	</ul>
	</li>
</ul>