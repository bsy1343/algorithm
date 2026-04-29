# [Platinum III] Game with Segment Tree - 34158

[문제 링크](https://www.acmicpc.net/problem/34158)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 95, 정답: 38, 맞힌 사람: 37, 정답 비율: 41.573%

### 분류

게임 이론, 스프라그–그런디 정리

### 문제 설명

<p>승원이는 수열과 쿼리 998244353을 풀던 도중 도저히 풀이가 떠오르지 않아 옆자리에 있던 민재와 게임을 하려고 한다. 게임의 규칙은 아래와 같다.</p>

<ul>
	<li>게임은 높이가 $K$인 포화 이진 트리에서 진행된다. 포화 이진 트리의 각 리프 노드에는 아래 그림과 같이 번호가 $1, \, 2, \, \cdots, 2^{K - 1}$로 연속적으로 부여되어 있다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34158.%E2%80%85Game%E2%80%85with%E2%80%85Segment%E2%80%85Tree/1b110ca8.png" data-original-src="https://boja.mercury.kr/assets/problem/34158-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; max-width: 100%; height: 202px;"></p>

<ul>
	<li>게임은 승원이부터 시작하며, 자신의 차례에서 노드를 하나 선택해 그 노드의 서브 트리를 모두 가져간다. 단, 이때 선택한 서브 트리의 리프 노드의 번호는 $[a, \, b]$에 속해야 하며, 일부라도 가져간 부분이 있으면 가져갈 수 없다.</li>
	<li>자신의 차례에서 더 이상 선택할 수 있는 노드가 남아있지 않다면 <strong>패배</strong>한다.</li>
</ul>

<p>승원이와 민재는 이 게임의 달인이므로 최선의 전략으로 게임을 한다. 그 때 누가 게임을 이기는지 구하라.</p>

### 입력

<p>첫 번째 줄에 높이 $K$와 게임의 개수 $G$가 공백으로 구분되어 주어진다. $(1\le K\le60$, $1\le G\le 200 000)$</p>

<p>두 번째 줄부터 $G$개의 줄에 걸쳐 한 줄에 하나씩 각 게임의 범위의 시작 $a$와 범위의 끝 $b$가 공백으로 구분되어 주어진다. $(1\le a\le b\le 2^{K-1})$</p>

### 출력

<p>$G$개의 줄에 걸쳐, 각 게임에서 승원이가 이기는 경우 "<span style="color:#e74c3c;"><code>swlee0202</code></span>"를, 민재가 이기는 경우 "<span style="color:#e74c3c;"><code>mj1000j</code></span>"를 한 줄에 하나씩 출력하라.</p>

### 힌트

<p>입출력의 양이 많으므로, 빠른 입출력을 사용하는 것을 권장합니다. 다음은 대표적인 언어에서 빠른 입출력을 이용하는 방법입니다.</p>

<ul>
	<li>C++: <code>cin</code>, <code>cout</code>을 사용한다면 <code>main</code> 함수 첫 줄에 <code>std::cin.tie(nullptr); std::cout.tie(nullptr); std::ios_base::sync_with_stdio(false);</code>를 추가하고, 줄바꿈 시 <code>std::endl</code> 대신 <code>'\n'</code>을 출력해주세요. 이 경우 <code>scanf</code>를 비롯한 C의 입출력 함수는 사용할 수 없음에 유의해 주세요.

	<ul>
		<li><code>scanf</code>/<code>printf</code>는 충분히 빠르므로 별도의 처리를 하지 않아도 괜찮습니다.</li>
	</ul>
	</li>
	<li>Java: <code>Scanner</code>와 <code>System.out.println</code> 대신 <code>BufferedReader</code>와 <code>BufferedWriter</code>를 사용해 주세요.</li>
	<li>Python3, PyPy3: <code>input()</code> 대신 <code>sys.stdin.readline().rstrip()</code>을 사용해 주세요.</li>
</ul>