# [Gold I] Cheating a Boolean Tree - 12900

[문제 링크](https://www.acmicpc.net/problem/12900)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 122, 정답: 77, 맞힌 사람: 74, 정답 비율: 63.793%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Boolean Tree는 Binary tree의 일종이다. 이 tree는 1~M번의 번호가 붙여진 홀수 개의 노드로 이루어져 있다. 1~(M-1)/2번 node는 internal node로, i번째 node는 2*i번 node와 2*i+1번 node를 자식으로 갖는다. (M+1)/2~M번 node는 leaf node이다.</p>

<p>또한, Boolean tree의 node들은 다음과 같은 값을 갖는다. Leaf node의 경우 0이나 1의 값을 갖는다. Internal node는 AND gate, 또는 OR gate의 값을 갖는다. 아래의 그림이 Boolean Tree의 예시를 보여주고 있다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12900.%E2%80%85Cheating%E2%80%85a%E2%80%85Boolean%E2%80%85Tree/5e7c3313.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/12900/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:187px; width:329px" /></p>

<p>이와 같이 Boolean Tree가 정의된다면, Subtree의 값을 직관적으로 정의할 수 있다. 만약 subtree의 root가 leaf node였다면, 그 경우에는 그 leaf node의 값이 답이 된다. 만약 subtree의 root가 internal node였다면, 해당 internal node의 gate를 이용해 left subtree와 right subtree의 값을 합친 것이 해당 tree의 값이 된다. 예를 들어, 위 그림에서 2번 node를 root로 갖는 subtree의 값은 다음과 같다.</p>

<p style="text-align:center">Val[2] = Val[4] AND Val[5] = (Val[8] OR Val[9]) AND 1 = (0 OR 1) AND 1 = 1</p>

<p>우리는 전체 tree의 값(= Val[1])이 V가 되기를 원한다. (V는 입력으로 주어지는 0 또는 1이다.) 하지만, 현재 tree의 값이 1이 아닐 수도 있기 때문에, tree에서 몇몇 internal node의 값을 바꾸는 것이 허용되어 있다. 즉, AND gate를 OR gate로, OR gate를 AND gate로 바꾸는 것이 가능하다. 위의 그림에서 파란색으로 표시된 노드들이 그에 해당한다.</p>

<p>입력으로 Boolean Tree와 바꿀 수 있는 internal node가 주어질 때, 최소한의 internal node들만을 바꿔서 전체 tree의 값을 V로 만드는 방법을 구하시오.</p>

### 입력

<p>첫 번째 줄에는 Test Case의 개수 T (1 &le; T &le; 20)이 입력으로 주어진다.</p>

<p>각 Test Case는 다음과 같은 구성으로 이루어져 있다.</p>

<ul>
	<li>첫 번째 줄에는 M과 V가 주어진다. M은 Boolean tree의 노드 개수, V는 전체 tree의 값으로 만들고 싶은 값이다. (1 &le; M &le; 10,000; V = 0 or 1)</li>
	<li>다음 (M-1)/2개의 줄에는 internal node의 정보를 나타내는 a<sub>i</sub>, b<sub>i</sub>가 주어진다. a<sub>i</sub>는 해당 node의 Gate가 무엇인지를 의미한다. 0은 OR gate, 1은 AND gate를 의미한다. b<sub>i</sub>는 해당 node의 Gate를 바꿀 수 있는지의 여부를 의미한다. b<sub>i</sub>가 1이라면 해당 Gate를 바꿀 수 있음을, 아니라면 불가능함을 의미한다.</li>
	<li>다음 (M+1)/2개의 줄에는 leaf node의 정보를 나타내는 a<sub>i</sub>가 주어진다. a<sub>i</sub>는 해당 node의 값을 의미한다.</li>
</ul>

### 출력

<p>각 Test case에 대해, &ldquo;Case #c: x&rdquo;의 형식으로 각 줄에 정답을 출력한다. c는 Test Case의 번호이다. (1부터 매겨진다.) x는 전체 tree의 값을 V로 만들기 위해 바꾸어야 하는 gate의 최소 개수이다. 만약 어떻게 gate들을 바꾸어도 전체 tree의 값을 V로 만드는 것이 불가능하다면, 대신 &ldquo;Case #c: IMPOSSIBLE&rdquo;을 출력한다.</p>