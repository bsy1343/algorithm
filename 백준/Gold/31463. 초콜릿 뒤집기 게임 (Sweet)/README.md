# [Gold I] 초콜릿 뒤집기 게임 (Sweet) - 31463

[문제 링크](https://www.acmicpc.net/problem/31463)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 188, 정답: 107, 맞힌 사람: 88, 정답 비율: 60.274%

### 분류

수학, 정수론, 조합론, 게임 이론, 모듈로 곱셈 역원

### 문제 설명

<p>코코는 심심할 때면 초콜릿 뒤집기 게임을 즐겨 한다. 초콜릿 뒤집기 게임은 앞뒤가 서로 다른 동전 모양의 초콜릿을 가지고 하는 $1$인용 게임으로, 다음과 같이 진행된다.</p>

<ol>
	<li>초콜릿을 앞면이나 뒷면이 보이도록 일렬로 늘어놓는다. 이 상태를 초기 상태라고 하자.</li>
	<li>앞면이 보이는 초콜릿을 하나 집어 먹고, 그 초콜릿과 왼쪽이나 오른쪽으로 이웃한 초콜릿을 뒤집는다. 앞면이었던 초콜릿을 뒤집으면 뒷면이 되고, 뒷면이었다면 앞면이 된다. 이웃한 초콜릿은 $2$개, $1$개, $0$개일 수 있다. 이웃이 $2$개일 경우, <strong>초콜릿을 집어 먹은 후에도 그 둘은 서로 이웃하지 않는다.</strong></li>
	<li>2번 과정을 반복하여 초콜릿을 모두 먹으면 승리한다. $1$개 이상의 초콜릿이 남아있는 상태에서 2번 과정을 수행할 수 없으면 패배한다.</li>
</ol>

<p style="display: flex; flex-direction: row; justify-content: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31463.%E2%80%85%EC%B4%88%EC%BD%9C%EB%A6%BF%E2%80%85%EB%92%A4%EC%A7%91%EA%B8%B0%E2%80%85%EA%B2%8C%EC%9E%84%E2%80%85(Sweet)/9fd47c45.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/31463.%E2%80%85%EC%B4%88%EC%BD%9C%EB%A6%BF%E2%80%85%EB%92%A4%EC%A7%91%EA%B8%B0%E2%80%85%EA%B2%8C%EC%9E%84%E2%80%85(Sweet)/9fd47c45.png" data-original-src="https://upload.acmicpc.net/c68eba2f-a05e-402c-bf66-adb9e0743fd3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-height: 95px; max-width: 100%" /></p>

<p>코코가 이 게임을 하는 것을 본 한별이는 아래와 같은 문제를 냈다. 코코를 도와 이 문제를 해결해 주자.</p>

<ul>
	<li>주어진 초기 상태에서 몇 개의 초콜릿을 원하는 대로 뒤집을 수 있을 때, 초콜릿 뒤집기 게임에서 승리하는 방법이 있는 초기 상태의 수는 몇 가지일까?</li>
</ul>

### 입력

<p>첫 번째 줄에는 테스트 케이스의 개수 $T$가 주어진다. $(1\le T\le 1\, 000)$</p>

<p>각 테스트 케이스에 대해, 초콜릿의 상태를 나타내는 길이 $N$의 문자열이 공백 없이 한 줄에 주어진다. $(1\le N\le 100\, 000)$ 이 문자열은 <span style="color:#e74c3c;"><code>H</code></span>, <span style="color:#e74c3c;"><code>T</code></span>, <span style="color:#e74c3c;"><code>?</code></span>의 $3$가지 문자로만 이루어져 있으며, <span style="color:#e74c3c;"><code>H</code></span>는 앞면, <span style="color:#e74c3c;"><code>T</code></span>는 뒷면, <span style="color:#e74c3c;"><code>?</code></span>는 원하는 대로 뒤집을 수 있는 초콜릿을 뜻한다.</p>

<p>모든 테스트 케이스의 $N$의 합은 $1\, 000\, 000$을 초과하지 않는다.</p>

### 출력

<p>각 테스트 케이스에 대해, 문제의 정답을 $1\, 000\, 000\, 007$($=10^9+7$)로 나눈 나머지를 한 줄에 출력한다.</p>