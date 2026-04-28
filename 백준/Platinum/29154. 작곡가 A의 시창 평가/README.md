# [Platinum III] 작곡가 A의 시창 평가 - 29154

[문제 링크](https://www.acmicpc.net/problem/29154)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 206, 정답: 82, 맞힌 사람: 77, 정답 비율: 49.045%

### 분류

문자열, 게임 이론, 스프라그–그런디 정리, KMP

### 문제 설명

<p>유명 작곡가 A는 현재 본인의 작곡을 도와줄 절대음감인 사람을 찾고 있다. 절대음감은 기준이 되는 다른 소리의 도움 없이 소리의 높이를 음이름으로 파악할 수 있는 능력이다. 절대음감이 발달한 사람은 어떠한 악보를 보고 그 음의 높이를 그대로 낼 수 있는 시창에 유리하다는 장점을 가지고 있다. 따라서 작곡가 A는 간단한 시창 평가를 통해 같이 작곡할 의향이 있다고 밝힌 수민이와 예원이 중 한 명을 뽑아 같이 작업을 하려고 한다.</p>

<p>작곡가 A는 시창 평가에 사용되는 악보 하나인 $s$를 가져와 이를 이용하여 본인이 좋아하는 멜로디 $l$을 부르도록 하여 평가를 진행한다. 작곡가 A는 끝음 처리를 중요하게 여기는 사람이라 멜로디의 끝부분을 악보에서 모두 찾아 음을 색칠하려고 한다. 즉, 좋아하는 멜로디가 $l_1, l_2, l_3, \cdots , l_M$일 때, $1 \leq x \leq M$인 모든 $x$에 대하여 $l_x, l_{x+1}, \cdots , l_M$가 악보 $S$의 연속된 부분에 등장하는 경우 해당하는 음들을 모두 색칠하였다.</p>

<p>예를 들어 악보 &ldquo;1 2 3 1 2 3 1 2 1 3&rdquo;에서 멜로디 &ldquo;1 2 3 1&rdquo;를 가지고 색칠하면 &ldquo;1 2 3 1&rdquo;, &ldquo;2 3 1&rdquo;, &ldquo;3 1&rdquo;, &ldquo;1&rdquo;을 모두 찾아 색칠하면 된다.</p>

<ul>
	<li>&ldquo;1 2 3 1&rdquo;: &ldquo;<u>1 2 3 1</u> 2 3 1 2 1 3&rdquo; &ldquo;1 2 3 <u>1 2 3 1</u> 2 1 3&rdquo;</li>
	<li>&ldquo;2 3 1&rdquo;: &ldquo;1 <u>2 3 1</u> 2 3 1 2 1 3&rdquo; &ldquo;1 2 3 1 <u>2 3 1</u> 2 1 3&rdquo;</li>
	<li>&ldquo;3 1&rdquo;: &ldquo;1 2 <u>3 1</u> 2 3 1 2 1 3&rdquo; &ldquo;1 2 3 1 2 <u>3 1</u> 2 1 3&rdquo;</li>
	<li>&ldquo;1&rdquo;: &ldquo;<u>1</u> 2 3 1 2 3 1 2 1 3&rdquo; &ldquo;1 2 3 <u>1</u> 2 3 1 2 1 3&rdquo; &ldquo;1 2 3 1 2 3 <u>1</u> 2 1 3&rdquo; &ldquo;1 2 3 1 2 3 1 2 <u>1</u> 3&rdquo;</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29154.%E2%80%85%EC%9E%91%EA%B3%A1%EA%B0%80%E2%80%85A%EC%9D%98%E2%80%85%EC%8B%9C%EC%B0%BD%E2%80%85%ED%8F%89%EA%B0%80/9e57cb07.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/29154.%E2%80%85%EC%9E%91%EA%B3%A1%EA%B0%80%E2%80%85A%EC%9D%98%E2%80%85%EC%8B%9C%EC%B0%BD%E2%80%85%ED%8F%89%EA%B0%80/9e57cb07.png" data-original-src="https://upload.acmicpc.net/63f12c67-c4f7-4de5-8d89-e88e0b1804f2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 50%;" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29154.%E2%80%85%EC%9E%91%EA%B3%A1%EA%B0%80%E2%80%85A%EC%9D%98%E2%80%85%EC%8B%9C%EC%B0%BD%E2%80%85%ED%8F%89%EA%B0%80/f48f06ab.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/29154.%E2%80%85%EC%9E%91%EA%B3%A1%EA%B0%80%E2%80%85A%EC%9D%98%E2%80%85%EC%8B%9C%EC%B0%BD%E2%80%85%ED%8F%89%EA%B0%80/f48f06ab.png" data-original-src="https://upload.acmicpc.net/61fd8182-d241-49c3-8c7a-16a313cbb922/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 50%;" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29154.%E2%80%85%EC%9E%91%EA%B3%A1%EA%B0%80%E2%80%85A%EC%9D%98%E2%80%85%EC%8B%9C%EC%B0%BD%E2%80%85%ED%8F%89%EA%B0%80/75ae5447.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/29154.%E2%80%85%EC%9E%91%EA%B3%A1%EA%B0%80%E2%80%85A%EC%9D%98%E2%80%85%EC%8B%9C%EC%B0%BD%E2%80%85%ED%8F%89%EA%B0%80/75ae5447.png" data-original-src="https://upload.acmicpc.net/47929f90-09de-482a-aa59-109ae82d5155/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 50%;" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29154.%E2%80%85%EC%9E%91%EA%B3%A1%EA%B0%80%E2%80%85A%EC%9D%98%E2%80%85%EC%8B%9C%EC%B0%BD%E2%80%85%ED%8F%89%EA%B0%80/a796fdeb.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/29154.%E2%80%85%EC%9E%91%EA%B3%A1%EA%B0%80%E2%80%85A%EC%9D%98%E2%80%85%EC%8B%9C%EC%B0%BD%E2%80%85%ED%8F%89%EA%B0%80/a796fdeb.png" data-original-src="https://upload.acmicpc.net/8d6ca39e-34ef-43bc-adf2-8362f2567532/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 50%;" /></p>

<p>총 색칠된 구간은 &ldquo;<u>1 2 3 1 2 3 1</u> 2 <u>1</u> 3&rdquo;이 된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29154.%E2%80%85%EC%9E%91%EA%B3%A1%EA%B0%80%E2%80%85A%EC%9D%98%E2%80%85%EC%8B%9C%EC%B0%BD%E2%80%85%ED%8F%89%EA%B0%80/e79705b6.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/29154.%E2%80%85%EC%9E%91%EA%B3%A1%EA%B0%80%E2%80%85A%EC%9D%98%E2%80%85%EC%8B%9C%EC%B0%BD%E2%80%85%ED%8F%89%EA%B0%80/e79705b6.png" data-original-src="https://upload.acmicpc.net/5d306275-3d57-4b53-8df5-dbb7f1e7c3dd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 50%;" /></p>

<p>작곡가 A는 시창 평가의 시험 범위를 악보에서 색칠된 부분으로 정하기로 하였고 이 악보는 두 참가자 모두에게 공유된다.</p>

<p>평가 방식은 다음과 같다.</p>

<ul>
	<li>처음에 색칠된 부분은 모두 빨간색으로 색칠되어 있다.</li>
	<li>두 참가자는 번갈아가며 진행한다.</li>
	<li>악보에서 연속된 구간을 고른다. 선택한 구간의 음들은 모두 빨간색으로 색칠되어 있어야 한다.</li>
	<li>고른 구간의 모든 음들을 부르고 부른 음들을 초록색으로 다시 색칠한다.</li>
	<li>만약 빨간색으로 색칠된 연속된 구간을 고를 수 없다면 그 사람은 탈락하게 된다.</li>
</ul>

<p>예원이의 선택에 상관없이 수민이가 항상 이길 수 있는 순서를 찾아보자. 첫 번째 순서를 골라야 하면 &ldquo;<span style="color:#e74c3c;"><code>First</code></span>&rdquo;, 두 번째 순서를 골라야 하면 &ldquo;<span style="color:#e74c3c;"><code>Second</code></span>&rdquo;를 출력한다.</p>

### 입력

<p>첫째 줄에 악보 $s$의 길이 $N$과 멜로디 $l$의 길이 $M$이 공백으로 구분되어 주어진다. $(1 \leq N \leq 1\,000\,000;$ $1 \leq M \leq 1\,000\,000)$</p>

<p>둘째 줄에 악보 $s_i$가 공백으로 구분되어 주어진다. $(1 \leq s_i \leq 20;$ $1 \leq i \leq N)$</p>

<p>셋째 줄에 멜로디 $l_i$가 공백으로 구분되어 주어진다. $(1 \leq l_i \leq 20;$ $1 \leq i \leq M)$</p>

<p>입력으로 주어지는 수는 모두 정수이다.</p>

### 출력

<p>수민이가 골라야 하는 순서를 &ldquo;<span style="color:#e74c3c;"><code>First</code></span>&rdquo;, &ldquo;<span style="color:#e74c3c;"><code>Second</code></span>&rdquo;로 출력한다.</p>