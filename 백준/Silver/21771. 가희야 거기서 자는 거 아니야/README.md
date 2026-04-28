# [Silver V] 가희야 거기서 자는 거 아니야 - 21771

[문제 링크](https://www.acmicpc.net/problem/21771)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 1468, 정답: 711, 맞힌 사람: 601, 정답 비율: 50.675%

### 분류

구현, 문자열, 애드 혹

### 문제 설명

<p>베개와 가희가 방 안에 있습니다.&nbsp;가희가 베개&nbsp;위에서 자고 있는지 그렇지 않은지&nbsp;출력해 주세요.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/21771.%E2%80%85%EA%B0%80%ED%9D%AC%EC%95%BC%E2%80%85%EA%B1%B0%EA%B8%B0%EC%84%9C%E2%80%85%EC%9E%90%EB%8A%94%E2%80%85%EA%B1%B0%E2%80%85%EC%95%84%EB%8B%88%EC%95%BC/a9381ab4.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/21771.%E2%80%85%EA%B0%80%ED%9D%AC%EC%95%BC%E2%80%85%EA%B1%B0%EA%B8%B0%EC%84%9C%E2%80%85%EC%9E%90%EB%8A%94%E2%80%85%EA%B1%B0%E2%80%85%EC%95%84%EB%8B%88%EC%95%BC/a9381ab4.png" data-original-src="https://i.imgur.com/34mAd6i.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 324px; height: 204px;" /></p>

### 입력

<p>첫 번째 줄에 방의 세로 길이&nbsp;R, 가로 길이&nbsp;C가 주어집니다.</p>

<p>두 번째 줄에 가희의 세로 길이 R<sub>g</sub>, 가로 길이 C<sub>g</sub>, 베게의 세로 길이 R<sub>p</sub>, 가로 길이 C<sub>p</sub>가 주어집니다.</p>

<p>세 번째 줄부터, R+2번째 줄까지, 길이가 C인 문자열이 주어집니다.</p>

<p>주어지는 문자열에 있는 문자는&nbsp;가희를 나타내는 &#39;G&#39;, 베게를 나타내는 &#39;P&#39;, 빈 칸을 나타내는 &#39;.&#39; 중 하나입니다.</p>

### 출력

<p>가희가 베게 위에서 자고 있다면 1을, 그렇지 않으면 0을 출력합니다.</p>

<p>베개 중의 일부가&nbsp;가희에 의해서 가려진 상태라면, 가희는 베게 위에서 자고 있습니다.</p>

### 제한

<ul>
	<li>11 &le; <em>R, C</em> &le; 100</li>
	<li>1&nbsp;&le; <em>R<sub>g</sub>, R<sub>p</sub></em> &le; R</li>
	<li>1&nbsp;&le; <em>C<sub>g</sub>, C<sub>p</sub></em> &le; C</li>
	<li>가희와 베개는 맵 안에 하나만 있으며, 방과 방&nbsp;바깥에 <strong>걸쳐져 있지 않습니다.</strong></li>
	<li>가희나 베개가 완전히 가려진 경우는 주어지지 않습니다.</li>
	<li>가희와 베개는 직사각형 형태로 주어지며, 직사각형의 각 변은 가로, 세로와 평행합니다.</li>
	<li>가희는 베개 위에서 잘 수도 있고, 아래에서 잘 수도 있습니다.</li>
</ul>